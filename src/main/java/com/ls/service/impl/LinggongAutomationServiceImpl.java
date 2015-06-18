package com.ls.service.impl;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.util.EntityUtils;
import org.htmlparser.Parser;
import org.htmlparser.util.ParserException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlBold;
import com.gargoylesoftware.htmlunit.html.HtmlButton;
import com.gargoylesoftware.htmlunit.html.HtmlButtonInput;
import com.gargoylesoftware.htmlunit.html.HtmlImage;
import com.gargoylesoftware.htmlunit.html.HtmlImageInput;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlPasswordInput;
import com.gargoylesoftware.htmlunit.html.HtmlTable;
import com.gargoylesoftware.htmlunit.html.HtmlTableCell;
import com.gargoylesoftware.htmlunit.html.HtmlTableRow;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;
import com.google.common.io.Files;
import com.ls.constants.AuthanConstants;
import com.ls.constants.HanthinkProperties;
import com.ls.entity.AutomaticJob;
import com.ls.entity.Order;
import com.ls.entity.ProductDetail;
import com.ls.exception.ConfigurationException;
import com.ls.repository.AutomaticJobRepository;
import com.ls.repository.OrderRepository;
import com.ls.repository.ProductDetailRepository;
import com.ls.service.impl.vistor.RTMarketDetailParser;
import com.ls.util.HanthinkUtil;
import com.ls.vo.Orders;
import com.ls.vo.ResponseVo;

import freemarker.template.Template;
import freemarker.template.TemplateException;

@Service("LinggongAutomationService")
@Scope("prototype")
public class LinggongAutomationServiceImpl extends AbstractAuthanAutomationService {

	private Logger logger = LoggerFactory.getLogger(LinggongAutomationServiceImpl.class);

	private static final String LINGGONG_ROOT_URL = "http://scm.sgcs.com.cn/";
	@Autowired
	AutomaticJobRepository automaticJobRepository;

	@Autowired
	OrderRepository orderRepository;

	@Autowired
	ProductDetailRepository productDetailRepository;

	private boolean checkIfOrderNotGrabed(String orderNumber, Integer jobId) {

		List<Order> existedOrder = orderRepository.findByOrderNumberAndJobId(orderNumber, jobId);

		return existedOrder == null || existedOrder.isEmpty();
	}

	public List<Orders> grabOrders(String start, String end, AutomaticJob authanJob) throws ConfigurationException, FailingHttpStatusCodeException, MalformedURLException, IOException, URISyntaxException, InterruptedException {

		List<Orders> ordersList = new ArrayList<Orders>();

		if (null == authanJob) {
			logger.error("configuration for job authan is not good.");
			throw new ConfigurationException("未知的任务.");
		}

		Date now = new Date();

		authanJob.setLastGrabStart(AuthanConstants.HANTHINK_TIME_FORMATTER.format(now));

		final WebClient webClient = new WebClient(BrowserVersion.FIREFOX_24);
		webClient.getOptions().setCssEnabled(false);
		webClient.getOptions().setThrowExceptionOnScriptError(false);

		tryToLogin(webClient, authanJob);

		

		System.out.println(ordersList);

		return ordersList;
	}

	private void mergeBarCodeAndProductName(Orders orders, List<String> columns) {
		
		List<Map<String, String>> detailMapList = orders.getOrdersItemList();
		for (Map<String, String> detailMap : detailMapList) {
			String productNumber = detailMap.get("productNumber");
			if (StringUtils.isNotBlank(productNumber)) {
				for(int i=0; i < columns.size(); i++) {
					if(productNumber.equals(columns.get(i))) {
						detailMap.put("barCode", columns.get(i - 1));
						detailMap.put("description",  columns.get(i + 1));
					}
				}
			}
		}
	}

	private void extractProductNumberAndCount(HtmlTable singleTable, Orders orders) {

		List<HtmlTableRow> rows = singleTable.getRows();

		for (int i = 2; i < rows.size(); i++) {

			List<HtmlTableCell> cells = rows.get(i).getCells();
			Map<String, String> singleMap = new HashMap<String, String>();
			orders.getOrdersItemList().add(singleMap);
			
			singleMap.put("uuid", orders.getOrderTitleMap().get("uuid"));
			
			for (int j = 0; j < cells.size(); j++) {

				HtmlTableCell currentCell = cells.get(j);
				switch (j) {
				case 1:
					singleMap.put("productNumber", currentCell.asText());
					break;
				case 5:

					String text = currentCell.asText();
					if (text.contains(",")) {
						text = text.replace(",", "");
					}
					singleMap.put("count", text);

					break;
				default:
					break;
				}
			}
		}
	}

	private String toEmpty(String input) {

		String inputString = StringUtils.trimToEmpty(input);

		if (inputString.toLowerCase().equals("null")) {
			inputString = "";
		}

		return inputString;
	}

	public void tryToLogin(WebClient webClient, AutomaticJob automaticJob) throws FailingHttpStatusCodeException, MalformedURLException, IOException, URISyntaxException, InterruptedException {

		System.out.println("Trying to login......");

		webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
		URL url = new URL(LINGGONG_ROOT_URL);

		final HtmlPage loginPage = webClient.getPage(url);
		HtmlTextInput usernameHtmlTextInput = HanthinkUtil.getFirstElementByXPath(loginPage, "//*[@id=\"loginName\"]");
		HtmlPasswordInput passwordHtmlTextInput = HanthinkUtil.getFirstElementByXPath(loginPage, "//*[@id=\"loginPwd\"]");
		HtmlTextInput checkstrHtmlPasswordInput = HanthinkUtil.getFirstElementByXPath(loginPage, "//*[@id=\"random\"]");

		HtmlImage validationCodeImage = HanthinkUtil.getFirstElementByXPath(loginPage, "//*[@id=\"codeId\"]");;

		String fileName = HanthinkProperties.getString("tessertOcrInstallPath") + System.currentTimeMillis() + ".jpg";
		validationCodeImage.saveAs(new File(fileName));
		
		HanthinkUtil.changeImageToBlackAndWhite(fileName);
		
		Thread.sleep(1000);
		usernameHtmlTextInput.setValueAttribute(automaticJob.getUsername());
		passwordHtmlTextInput.setValueAttribute(automaticJob.getPassword());

		String ocrInstallPath = HanthinkProperties.getString("tessertOcrInstallPath");
		String command = ocrInstallPath + "tesseract.exe " + fileName + " " + fileName;

		Process process = Runtime.getRuntime().exec(command);
		process.waitFor();
		Thread.sleep(1000);
		String code = Files.readFirstLine(new File(fileName + ".txt"), Charset.defaultCharset());

		System.out.println(code);

		if (code != null) {
			
			checkstrHtmlPasswordInput.setValueAttribute(code);

			HtmlButtonInput loginButton = HanthinkUtil.getFirstElementByXPath(loginPage, "//*[@id=\"denglu\"]");
			HtmlPage loginResultPage = (HtmlPage) loginButton.click();

			String callbackUrl = loginResultPage.getUrl().toString();

			System.out.println(callbackUrl);
			if (callbackUrl.equals("https://supplier.rt-mart.com.cn/php/scm_main.php")) {
				
				System.out.println("RT-Market login successfully!");
				cleanUpValidationCodeFiles();
				return;
			} else {
				tryToLogin(webClient, automaticJob);
			}
			
		} else {
			tryToLogin(webClient, automaticJob);
		}
		
	}

	public String compositeOrderToXml(List<Orders> orders, AutomaticJob automaticJob) throws IOException, TemplateException {

		Template template = AuthanConstants.getAnchanConfiguration().getTemplate("rt-market-request-soap.ftl");

		Map<String, Object> data = new HashMap<String, Object>();

		data.put("htUsername", automaticJob.getDbUsernname());
		data.put("htPassword", automaticJob.getDbPassword());
		data.put("htDbName", automaticJob.getDbName());
		data.put("orders", orders);

		return FreeMarkerTemplateUtils.processTemplateIntoString(template, data);

	}

	public ResponseVo postDataToWebService(String start, String end, AutomaticJob job) {

		ResponseVo responseVo = ResponseVo.newResponse();

		List<Orders> orders;
		try {

			// Grab data from UI
			orders = grabOrders(start, end, job);

			if (orders == null || orders.size() == 0) {
				return ResponseVo.newSuccessMessage("没有发现需要采集的数据");
			}

			// composite data
			String data = compositeOrderToXml(orders, job);

			System.out.println(data);

			try {
				
				String url = job.getClientIp() + job.getClientEnd();

				// send ws
				HttpResponse response = postWebService(url, data);

				HttpEntity httpEntity = response.getEntity();
				String responseText = null;
				if (httpEntity != null) {
					responseText = EntityUtils.toString(httpEntity);

					responseVo = handleResponse(responseText);

					if (responseVo.getType().equals("FAIL")) {

						return responseVo;
					}
				}

				System.out.println(responseText);

				if (response.getStatusLine().getStatusCode() >= 200) {
					saveOrders(orders, job);
				} else {
					return ResponseVo.newFailMessage("发送web service失败。 response code :" + response.getStatusLine().getStatusCode() + " Response Text : " + responseText);
				}
				
			} catch (ParseException e) {
				
				responseVo.setType(ResponseVo.MessageType.FAIL.name());
				responseVo.setMessage("调用web service失败。" + e.getMessage());
			}

		} catch (ConfigurationException e) {

			responseVo.setType(ResponseVo.MessageType.FAIL.name());
			responseVo.setMessage("任务配置出现了问题：" + e.getMessage());

			logger.error("postDataToWebService error" + responseVo.toString());

			return responseVo;

		} catch (MalformedURLException e) {
			responseVo.setType(ResponseVo.MessageType.FAIL.name());
			responseVo.setMessage("连接数据源时出现了网络问题" + e.getMessage());

			logger.error("postDataToWebService error" + responseVo.toString());
		} catch (IOException e) {
			responseVo.setType(ResponseVo.MessageType.FAIL.name());
			responseVo.setMessage("连接数据源时出现了网络问题" + e.getMessage());

			logger.error("postDataToWebService error" + responseVo.toString());
		} catch (URISyntaxException e) {

			responseVo.setType(ResponseVo.MessageType.FAIL.name());
			responseVo.setMessage("连接数据源时出现了网络问题" + e.getMessage());

			logger.error("postDataToWebService error" + responseVo.toString());
		} catch (InterruptedException e) {
			// ??!
		} catch (TemplateException e) {

			responseVo.setType(ResponseVo.MessageType.FAIL.name());
			responseVo.setMessage("封装模板时发生了错误：" + e.getMessage());

			logger.error("postDataToWebService error" + responseVo.toString());
		}

		return responseVo;
	}

	public List<Order> saveOrders(List<Orders> orders, AutomaticJob job) {

		if (null == orders || orders.size() == 0) {
			return null;
		}

		List<Order> savedOrderList = new ArrayList<Order>();

		for (Orders singleOrder : orders) {

			Map<String, String> titleMap = singleOrder.getOrderTitleMap();
			String orderNumber = titleMap.get("orderNumber");
			String supplierNumber = titleMap.get("supplierNumber");

			String estimateTakeOverDate = titleMap.get("estimateTakeOverDate");
			String orderDate = titleMap.get("orderDate");
			String address = titleMap.get("address");

			Order order = new Order();
			order.setOrderNumber(orderNumber);
			order.setSupplierNumber(supplierNumber);
			order.setEstimateTakeOverDate(estimateTakeOverDate);
			order.setOrderDate(orderDate);
			order.setCreateDate(HanthinkUtil.getNow());
			order.setJobId(job.getId());
			order.setJobName(job.getName());
			order.setUuid(singleOrder.getOrderTitleMap().get("uuid"));
			order.setAddress(address);
			order.setStoreNumber(address);
			
			List<Map<String, String>> detailMap = singleOrder.getOrdersItemList();
			Order savedOrder = null;
			try {
				savedOrder = orderRepository.saveAndFlush(order);
			} catch (Exception e) {
			}

			if (null == savedOrder) {
				continue;
			}

			for (Map<String, String> singleDetailMap : detailMap) {

				String description = toEmpty(singleDetailMap.get("description"));
				String count = toEmpty(singleDetailMap.get("count"));
				// String moneyAmountWithoutTax =
				// toEmpty(singleDetailMap.get("moneyAmountWithoutTax"));
				String productNumber = toEmpty(singleDetailMap.get("productNumber"));
				// String priceWithoutTax =
				// toEmpty(singleDetailMap.get("priceWithoutTax"));
				 String storeNumber =
				 toEmpty(singleDetailMap.get("storeNumber"));
				String barCode = toEmpty(singleDetailMap.get("barCode"));
				
				ProductDetail productDetail = new ProductDetail();
				productDetail.setOrderId(savedOrder.getId());
				productDetail.setOrderNumber(orderNumber);
				productDetail.setDescription(description);
				productDetail.setCount(count);
				// productDetail.setMoneyAmountWithoutTax(moneyAmountWithoutTax);
				productDetail.setProductNumber(productNumber);
				productDetail.setBarCode(barCode);
				// productDetail.setPriceWithoutTax(priceWithoutTax);
				productDetail.setStoreNumber(storeNumber);

				try {
					productDetail = productDetailRepository.saveAndFlush(productDetail);
				} catch (Exception e) {
					e.printStackTrace();
				}

				if (null == productDetail) {
					continue;
				}
			}

			savedOrderList.add(savedOrder);

		}
		return savedOrderList;
	}

}
