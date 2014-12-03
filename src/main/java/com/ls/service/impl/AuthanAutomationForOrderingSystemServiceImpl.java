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
import com.gargoylesoftware.htmlunit.html.HtmlImage;
import com.gargoylesoftware.htmlunit.html.HtmlImageInput;
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

@Service("authanOrderSystemService")
public class AuthanAutomationForOrderingSystemServiceImpl implements AuthanAutomationService {

	private Logger logger = LoggerFactory.getLogger(AuthanAutomationForOrderingSystemServiceImpl.class);

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
			String url = "http://logistics.auchan.com.cn:8000/logi/";

			final WebClient webClient = new WebClient(BrowserVersion.CHROME);
			webClient.getOptions().setCssEnabled(false);
			webClient.getOptions().setThrowExceptionOnScriptError(false);
			
			final HtmlPage loginPage = webClient.getPage(url);

			final List<HtmlForm> forms = loginPage.getForms();

			HtmlForm form = null;
			for (HtmlForm singleForm : forms) {
				if (singleForm.getAttribute("id").equals("form1")) {
					form = singleForm;
				}
			}

			HtmlImage logInput = (HtmlImage) form.getHtmlElementsByTagName("img").get(0);
			
			final HtmlTextInput textField = form.getInputByName("userName");
			final HtmlPasswordInput passwordField = form.getInputByName("userPwd");

			// Change the value of the text field
			textField.setValueAttribute(authanJob.getUsername());
			passwordField.setValueAttribute(authanJob.getPassword());

			// click login button
			logInput.click();

			String vendorNo = authanJob.getUsername().substring(2);
			final HtmlPage orderResultPage = webClient.getPage(makeParametersToSearchOrderList(start, end, null, vendorNo));
		
			String ordersListHtml = orderResultPage.getWebResponse().getContentAsString();

			//urls
			List<String> orderIdList = HtmlParserUtilPlanB.findOrderListInOrderSystem(ordersListHtml);
			
			if (orderIdList.size() == 0) {
				return null;
			}
			
			if (orderIdList.size() > 100000) {
				logger.error("data is too big");
			}

			String orderDetailUrl = "http://logistics.auchan.com.cn:8000";
			for (String orderId : orderIdList) {

				String singleOrderDetail = orderDetailUrl + orderId;
				final HtmlPage singleOrderDetailPage = webClient.getPage(singleOrderDetail);

				String singleOrderHtml = singleOrderDetailPage.getWebResponse().getContentAsString();

				Orders singleOrder = null;
				try {
					singleOrder = HtmlParserUtilPlanB.parseOrderInOrderSystem(singleOrderHtml);
					
					String childTableId = singleOrder.getOrderTitleMap().get("订单号：");
					List<Map<String, String>> detailsMaps = singleOrder.getOrdersItemList();
					for (Map<String, String> map : detailsMaps) {
						map.put("订单号：", childTableId);
					}
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

	public String compositeOrderToXml(List<Orders> orders, AutomaticJob automaticJob) throws IOException, TemplateException {
		
	Template template = AuthanConstants.getAnchanConfiguration().getTemplate("auchan-request-soap-for-order-system.ftl");
		
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

	private String makeParametersToSearchOrderList(String start, String end, Integer currentPageNumber, String vendorNo) {

		if (null == currentPageNumber) {
			currentPageNumber = 1;
		}
		String basicTemplate = "http://logistics.auchan.com.cn:8000/logi/sup.do?method=supper_search&appStatus=&ec_crd=100000" +
			"&ec_i=ec&ec_p=1&ec_rd=15&ec_rd=15&endDate="+ end + "objNo=&rcvNo=&rcvType=&sectionNo=&startDate=" + start + "&status=&stype=1&supNo=" + vendorNo ;

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
		
		String url = job.getClientIp() + job.getClientEnd();
		
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
		
		if (response.getStatusLine().getStatusCode() == 200) {
			responseVo.setType(ResponseVo.MessageType.SUCCESS.name());
			responseVo.setMessage(data);
		} else {
			responseVo = ResponseVo.newFailMessage("Sending data to web service fail : " + response.getStatusLine().getReasonPhrase() + "\n" + data);
		}
		
		
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
