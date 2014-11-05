package com.ls.service.impl;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.Date;
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

@Service("authanService")
public class AuthanAutomationServiceImpl implements AuthanAutomationService {

	private Logger logger = LoggerFactory.getLogger(AuthanAutomationServiceImpl.class);
	
	@Autowired
	AutomaticJobRepository automaticJobRepository;
	
	public List<Orders> grabOrders(String start, String end) throws  ConfigurationException{
		
		List<Orders> ordersList = Lists.newArrayList();
		AutomaticJob authanJob = automaticJobRepository.findByType(AuthanConstants.AUTHAN);
		
		if (null == authanJob) {
			logger.error("configuration for job authan is not good.");
			throw new ConfigurationException();
		}
		
		authanJob.setStatus("正在导入数据");
		authanJob.setLocked(true);
		
		automaticJobRepository.saveAndFlush(authanJob);
		
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

			//click login button
			loginButton.click();

			final HtmlPage orderResultPage = webClient.getPage(makeParametersToSearchOrderList(start, end, null));
			
			String ordersListHtml = orderResultPage.getWebResponse().getContentAsString();
			String userNameNotExists = "用户不存在,请重试";
			String passwordWrong = "密码错误,请重试";
			
			if (ordersListHtml.contains(passwordWrong)) {
				throw new ConfigurationException("配置的密码不正确!");
			}
			
			if (ordersListHtml.contains(userNameNotExists)) {
				throw new ConfigurationException("配置的用户名不存在!");
			}
			
			List<String> orderIdList = HtmlParserUtilPlanB.findOrderList(ordersListHtml);
			
			Integer totalPageCount = getTotalPageCount(ordersListHtml);
			
			if (totalPageCount > 1) {
				for(int i = 2; i < totalPageCount + 1; i++) {
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
					singleOrder = HtmlParserUtilPlanB.parseOrder(singleOrderHtml);
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
			logger.error("grab order failed for start : "+ start +" end : " + end + ", meets unexpected exception!! error message is -> " + e.getMessage());
		}
		
		Date endTime = new Date();
		authanJob.setLastGrabEnd(AuthanConstants.HANTHINK_TIME_FORMATTER.format(endTime));
		authanJob.setStatus("任务空闲中");
		authanJob.setLocked(false);
		
		automaticJobRepository.saveAndFlush(authanJob);
		
		return ordersList;
	}

	private String compositeOrderToXml(List<Orders> orders) {
		
		StringBuilder stringBuilder = new StringBuilder();
		
		for (Orders singleOrder : orders) {
			Map<String, String> titleMap = singleOrder.getOrderTitleMap();
			
			String maintableTemplate = new String(AuthanConstants.getMainTable());
			
			String orderNumber = StringUtils.isEmpty(titleMap.get("订单号："))? "" : titleMap.get("订单号：");
			String id = StringUtils.isEmpty(titleMap.get("id"))? "" : titleMap.get("id");
			String date = StringUtils.isEmpty(titleMap.get("订单日期："))? "" : titleMap.get("订单日期：");
			String arriveDate = StringUtils.isEmpty(titleMap.get("预计收货日期："))? "" : titleMap.get("预计收货日期：");
			
			maintableTemplate = maintableTemplate.replaceAll("@orderNumber@", orderNumber);
			maintableTemplate = maintableTemplate.replaceAll("@id@", id);
			maintableTemplate = maintableTemplate.replaceAll("@date@", date);
			maintableTemplate = maintableTemplate.replaceAll("@arriveDate@", arriveDate);
			stringBuilder.append(maintableTemplate);
			
			List<Map<String, String>> productsMap = singleOrder.getOrdersItemList();
			
			for (Map<String, String> product : productsMap) {
				String zibiaoTemplate = new String(AuthanConstants.getChildTable());
				
				String productNumber = getStringByKeyOrNull("商品号", product);
				String description = getStringByKeyOrNull("商品名称", product);
				String count = getStringByKeyOrNull("订单数量", product);
				String price = getStringByKeyOrNull("单价", product);
				String total = getStringByKeyOrNull("金额", product);
				String taxRate = getStringByKeyOrNull("税率", product);
				
				zibiaoTemplate = zibiaoTemplate.replaceAll("@id@", id);
				zibiaoTemplate = zibiaoTemplate.replaceAll("@productNumber@", productNumber);
				zibiaoTemplate = zibiaoTemplate.replaceAll("@description@", description);
				zibiaoTemplate = zibiaoTemplate.replaceAll("@price@", price);
				zibiaoTemplate = zibiaoTemplate.replaceAll("@total@", total);
				zibiaoTemplate = zibiaoTemplate.replaceAll("@count@", count);
				zibiaoTemplate = zibiaoTemplate.replaceAll("@taxRate@", taxRate);
				
				stringBuilder.append(zibiaoTemplate);
			}
		}
		
		return stringBuilder.toString();
	}
	
	private String getStringByKeyOrNull(String key, Map<String, String> titleMap) {
		return StringUtils.isEmpty(titleMap.get(key))? "" : titleMap.get(key);
	}
	private void loggerError(Exception e, String start, String end) {
		logger.error("grab order failed for start : "+ start +" end : " + end + " error message is -> " + e.getMessage());
	}
	
	private String makeParametersToSearchOrderList(String start, String end, Integer currentPageNumber) {
		if (null == currentPageNumber) {
			currentPageNumber = 1;
		}
		
		String basicTemplate = "https://auchan.chinab2bi.com/auchan/sellOrderMainQry/query.hlt?accountModel.vendorNo=1356&accountModel.dateType=0&accountModel.dateStart=" + start + "&accountModel.dateEnd=" + end + "&page.pageSize=10&page.pageNo="+ currentPageNumber +"&page.totalPages=-1";
		
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

	@Override
	public String postDataToWebService(String start, String end) throws ConfigurationException, UnsupportedEncodingException, ClientProtocolException, IOException {
		List<Orders> orders = grabOrders(start, end);
		
		String data =  compositeOrderToXml(orders);
		System.out.println(data);
		String bigView = new String(AuthanConstants.getBigView());
		
		bigView = bigView.replaceAll("@dataForYou@", data);
		
		HttpClient httpClient = HttpClientBuilder.create().build();

		byte[] b = bigView.getBytes("utf-8");
		
		InputStream is = new ByteArrayInputStream(b, 0, b.length);

		HttpPost request = new HttpPost("http://hanthink.gnway.org:88/hanthinkserver/service1.asmx");
		request.setHeader("Content-Type", " text/xml; charset=utf-8");
		request.setEntity(new InputStreamEntity(is));

		HttpResponse response = httpClient.execute(request);

		System.out.println(response.toString());
		System.out.println(response.getStatusLine().getStatusCode());
		
		return "" + response.getStatusLine().getStatusCode();
	}

}
