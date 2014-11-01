package com.ls.service.impl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
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

	@Autowired
	AutomaticJobRepository automaticJobRepository;
	
	public List<Orders> grabOrders(String start, String end) throws  ConfigurationException{
		
		List<Orders> ordersList = Lists.newArrayList();
		AutomaticJob authanJob = automaticJobRepository.findByType(AuthanConstants.AUTHAN);
		
		if (null == authanJob) {
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
				
				Orders singleOrder = HtmlParserUtilPlanB.parseOrder(singleOrderHtml);
				
				ordersList.add(singleOrder);
			}

			webClient.closeAllWindows();
			
		} catch (FailingHttpStatusCodeException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ElementNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		Date endTime = new Date();
		authanJob.setLastGrabEnd(AuthanConstants.HANTHINK_TIME_FORMATTER.format(endTime));
		authanJob.setStatus("任务空闲中");
		authanJob.setLocked(false);
		
		automaticJobRepository.saveAndFlush(authanJob);
		
		return ordersList;
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

		// TODO Auto-generated method stub
		return null;
	}

}
