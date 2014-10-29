package com.ls.service.impl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

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
import com.ls.grab.HtmlParserUtilPlanB;
import com.ls.service.AuthanAutomationService;
import com.ls.vo.Orders;
@Service("authanService")
public class AuthanAutomationServiceImpl implements AuthanAutomationService {

	public List<Orders> grabOrders(String start, String end) {
		
		List<Orders> ordersList = Lists.newArrayList();
		
		try {
			String url = "https://auchan.chinab2bi.com/security/login.hlt";

			final WebClient webClient = new WebClient(BrowserVersion.CHROME);
			webClient.getOptions().setJavaScriptEnabled(false);
			// Get the first page
			final HtmlPage page1 = webClient.getPage(url);

			// Get the form that we are dealing with and within that form,
			// find the submit button and the field that we want to change.
			final List<HtmlForm> forms = page1.getForms();

			HtmlForm form = null;
			for (HtmlForm singleForm : forms) {
				if (singleForm.getAttribute("id").equals("loginForm")) {
					form = singleForm;
				}
			}

			final HtmlSubmitInput button = form.getInputByName("Submit");
			final HtmlTextInput textField = form.getInputByName("j_username");
			final HtmlPasswordInput passwordField = form.getInputByName("j_password");

			// Change the value of the text field
			textField.setValueAttribute("AC1356");
			passwordField.setValueAttribute("shyf1356");

			button.click();

			final HtmlPage orderResultPage = webClient.getPage(makeParametersToSearchOrderList(start, end));
			
			String ordersListHtml = orderResultPage.getWebResponse().getContentAsString();
			
			List<String> orderIdList = HtmlParserUtilPlanB.findOrderList(ordersListHtml);
			
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ElementNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ordersList;
	}

	private String makeParametersToSearchOrderList(String start, String end) {
		String basicTemplate = "https://auchan.chinab2bi.com/auchan/sellOrderMainQry/query.hlt?accountModel.vendorNo=1356&accountModel.dateType=0&accountModel.dateStart=" + start + "&accountModel.dateEnd=" + end + "&page.pageSize=10&page.pageNo=1&page.totalPages=-1";
		
		return basicTemplate;
	}

	public Orders grabSingleOrders(String start, String end) {

		// TODO Auto-generated method stub
		return null;
	}

}
