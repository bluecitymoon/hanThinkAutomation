package com.ls.service.impl;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.htmlparser.util.ParserException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlPasswordInput;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;
import com.google.common.collect.Lists;
import com.ls.constants.AuthanConstants;
import com.ls.entity.AutomaticJob;
import com.ls.exception.ConfigurationException;
import com.ls.grab.HtmlParserUtilPlanB;
import com.ls.repository.AutomaticJobRepository;
import com.ls.service.AuthanAutomationService;
import com.ls.vo.Orders;
import com.ls.vo.ResponseVo;

import freemarker.template.Template;
import freemarker.template.TemplateException;

@Service("authanService")
public class AuthanAutomationServiceImpl implements AuthanAutomationService {

	private Logger logger = LoggerFactory.getLogger(AuthanAutomationServiceImpl.class);

	@Autowired
	AutomaticJobRepository automaticJobRepository;

	public List<Orders> grabOrders(String start, String end, AutomaticJob authanJob) throws ConfigurationException {

		List<Orders> ordersList = Lists.newArrayList();

		if (null == authanJob) {
			logger.error("configuration for job authan is not good.");
			throw new ConfigurationException();
		}

		Date now = new Date();
		authanJob.setLastGrabStart(AuthanConstants.HANTHINK_TIME_FORMATTER.format(now));

		try {
			String url = "https://auchan.chinab2bi.com/security/login.hlt";

			final WebClient webClient = new WebClient(BrowserVersion.CHROME);
			webClient.getOptions().setJavaScriptEnabled(false);
			// Get the first page
			final HtmlPage loginPage = webClient.getPage(url);

			// Get the form that we are dealing with and within that form,
			// find the submit button and the field that we want to change.
			final List<HtmlForm> forms = loginPage.getForms();

			HtmlForm form = null;
			for (HtmlForm singleForm : forms) {
				if (singleForm.getAttribute("id").equals("loginForm")) {
					form = singleForm;
				}
			}

			final HtmlSubmitInput loginButton = form.getInputByName("Submit");
			final HtmlTextInput textField = form.getInputByName("j_username");
			final HtmlPasswordInput passwordField = form.getInputByName("j_password");

			// Change the value of the text field
			textField.setValueAttribute(authanJob.getUsername());
			passwordField.setValueAttribute(authanJob.getPassword());

			// click login button
			loginButton.click();

			final HtmlPage orderResultPage = webClient.getPage(makeParametersToSearchOrderList(start, end, null));
		
			String ordersListHtml = orderResultPage.getWebResponse().getContentAsString();

			if (ordersListHtml.contains("j_username") && ordersListHtml.contains("j_password")) {
				throw new ConfigurationException("配置的用户名密码无法登陆欧尚系统！");
			}

			List<String> orderIdList = HtmlParserUtilPlanB.findOrderList(ordersListHtml);

			Integer totalPageCount = getTotalPageCount(ordersListHtml);

			if (totalPageCount > 1) {
				for (int i = 2; i < totalPageCount + 1; i++) {
					String nextPageUrl = makeParametersToSearchOrderList(start, end, i);

					final HtmlPage nextOrderResultPage = webClient.getPage(nextPageUrl);
					String nextOrdersListHtml = nextOrderResultPage.getWebResponse().getContentAsString();
					List<String> nextPageOrderIdList = HtmlParserUtilPlanB.findOrderList(nextOrdersListHtml);

					if (null != nextPageOrderIdList && nextPageOrderIdList.size() > 0) {
						orderIdList.addAll(nextPageOrderIdList);
					}
				}
			}

			String orderDetailUrl = "https://auchan.chinab2bi.com/auchan/buyGrnQry/detail.hlt?grnid=";
			for (String orderId : orderIdList) {

				String singleOrderDetail = orderDetailUrl + orderId;
				final HtmlPage singleOrderDetailPage = webClient.getPage(singleOrderDetail);

				String singleOrderHtml = singleOrderDetailPage.getWebResponse().getContentAsString();

				Orders singleOrder = null;
				try {
					singleOrder = HtmlParserUtilPlanB.parseOrder(singleOrderHtml, orderId);
					singleOrder.getOrderTitleMap().put("id", orderId);

					ordersList.add(singleOrder);

				} catch (ParserException e) {
					logger.error("parse error for order id " + orderId + ", " + singleOrderDetail);
				}
			}

			webClient.closeAllWindows();

		} catch (FailingHttpStatusCodeException e) {
			loggerError(e, start, end);
		} catch (MalformedURLException e) {
			loggerError(e, start, end);
		} catch (ElementNotFoundException e) {
			loggerError(e, start, end);
		} catch (IOException e) {
			loggerError(e, start, end);
		} catch (Exception e) {
			logger.error("grab order failed for start : " + start + " end : " + end + ", meets unexpected exception!! error message is -> " + e.getMessage());
		}

		Date endTime = new Date();
		authanJob.setLastGrabEnd(AuthanConstants.HANTHINK_TIME_FORMATTER.format(endTime));

		automaticJobRepository.saveAndFlush(authanJob);

		return ordersList;
	}

	private String compositeOrderToXml(List<Orders> orders, AutomaticJob automaticJob) throws IOException, TemplateException {
		
		Template template = AuthanConstants.getAnchanConfiguration().getTemplate("auchan-request-soap.ftl");
		
		Map<String, Object> data = new HashMap<String, Object>();
		
		data.put("htUsername", automaticJob.getDbUsernname());
		data.put("htPassword", automaticJob.getDbPassword());
		data.put("htDbName", automaticJob.getDbName());
		data.put("orders", orders);
		
		return FreeMarkerTemplateUtils.processTemplateIntoString(template, data);
		
	}

	private void loggerError(Exception e, String start, String end) {

		logger.error("grab order failed for start : " + start + " end : " + end + " error message is -> " + e.getMessage());
	}

	private String makeParametersToSearchOrderList(String start, String end, Integer currentPageNumber) {

		if (null == currentPageNumber) {
			currentPageNumber = 1;
		}

		String basicTemplate = "https://auchan.chinab2bi.com/auchan/sellOrderMainQry/query.hlt?accountModel.vendorNo=1356&accountModel.dateType=0&accountModel.dateStart=" + start + "&accountModel.dateEnd=" + end + "&page.pageSize=10&page.pageNo=" + currentPageNumber + "&page.totalPages=-1";

		return basicTemplate;
	}

	private int getTotalCount(String html) {

		String regex = "[^共\r\n]*?共[^\\d\r\n]*?(\\d+)[^\r\n]*";

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(html);

		String result = "";
		while (m.find()) {
			result = m.group(1);
		}
		if (StringUtils.isNotBlank(result)) {

			return Integer.valueOf(result);
		}
		return 1;
	}

	private int getTotalPageCount(String html) {

		String regex = "[^页, 共\r\n]*?页, 共[^\\d\r\n]*?(\\d+)[^\r\n]*";

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(html);

		String result = "";
		while (m.find()) {
			result = m.group(1);
		}
		if (StringUtils.isNotBlank(result)) {

			return Integer.valueOf(result);
		}
		return 1;
	}

	public Orders grabSingleOrders(String start, String end) {

		return null;
	}

	public ResponseVo postDataToWebService(String start, String end, AutomaticJob job) {

		ResponseVo responseVo = ResponseVo.newResponse();
		
		List<Orders> orders;
		try {
			orders = grabOrders(start, end, job);
			
		} catch (ConfigurationException e) {
			
			responseVo.setType(ResponseVo.MessageType.FAIL.name());
			responseVo.setMessage("任务配置出现了问题：" + e.getMessage());
			
			logger.error("postDataToWebService error" + responseVo.toString());
			
			return responseVo;
			
		} catch (Exception e) {
			responseVo.setType(ResponseVo.MessageType.FAIL.name());
			responseVo.setMessage("获取元数据时候出错了：" + e.getMessage());
			
			logger.error("postDataToWebService error" + responseVo.toString());
			
			return responseVo;
		}

		String data;
		try {
			data = compositeOrderToXml(orders, job);
		} catch (IOException e) {
			responseVo.setType(ResponseVo.MessageType.FAIL.name());
			responseVo.setMessage("封装模板时候出现IO异常：" + e.getMessage());
			logger.error("postDataToWebService error" + responseVo.toString());
			return responseVo;
		} catch (TemplateException e) {
			responseVo.setType(ResponseVo.MessageType.FAIL.name());
			responseVo.setMessage("封装模板时候出现异常：" + e.getMessage());
			logger.error("postDataToWebService error" + responseVo.toString());
			return responseVo;
		} catch (Exception e) {
			responseVo.setType(ResponseVo.MessageType.FAIL.name());
			responseVo.setMessage("封装模板时候出现异常：" + e.getMessage());
			logger.error("postDataToWebService error" + responseVo.toString());
			return responseVo;
		}
		
		String url = job.getClientIp();
		
		HttpResponse response = null;
		try {
			response = postWebService(url, data);
			
		} catch (ClientProtocolException e) {
			responseVo.setType(ResponseVo.MessageType.FAIL.name());
			responseVo.setMessage("发送web service时发生了错误：" + e.getMessage());
			logger.error("postDataToWebService error" + responseVo.toString());
			return responseVo;
		} catch (IOException e) {
			responseVo.setType(ResponseVo.MessageType.FAIL.name());
			responseVo.setMessage("发送web service时发生了错误：" + e.getMessage());
			logger.error("postDataToWebService error" + responseVo.toString());
			return responseVo;
		} catch (Exception e) {
			responseVo.setType(ResponseVo.MessageType.FAIL.name());
			responseVo.setMessage("发送web service时发生了错误：" + e.getMessage());
			logger.error("postDataToWebService error" + responseVo.toString());
			return responseVo;
		}
		responseVo.setType(ResponseVo.MessageType.SUCCESS.name());
		responseVo.setMessage(data);
		
		return responseVo;
	}

	public HttpResponse postWebService(String url, String xmlData) throws ClientProtocolException, IOException {
		
		HttpResponse response = null;
		HttpClient httpClient = HttpClientBuilder.create().build();

		byte[] b = xmlData.getBytes("utf-8");

		InputStream is = new ByteArrayInputStream(b, 0, b.length);

		HttpPost request = new HttpPost(url);
		
		request.setHeader("Content-Type", " text/xml; charset=UTF-8");
		request.setEntity(new InputStreamEntity(is));

		response = httpClient.execute(request);
		
		return response;
	}
	
}
