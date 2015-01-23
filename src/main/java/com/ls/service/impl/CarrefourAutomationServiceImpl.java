package com.ls.service.impl;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
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
import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlImage;
import com.gargoylesoftware.htmlunit.html.HtmlImageInput;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlPasswordInput;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;
import com.google.common.collect.Lists;
import com.google.common.io.Files;
import com.ls.constants.AuthanConstants;
import com.ls.constants.HanthinkProperties;
import com.ls.entity.AutomaticJob;
import com.ls.entity.Order;
import com.ls.entity.ProductDetail;
import com.ls.exception.ConfigurationException;
import com.ls.grab.GrapImgUtil;
import com.ls.repository.AutomaticJobRepository;
import com.ls.repository.OrderRepository;
import com.ls.repository.ProductDetailRepository;
import com.ls.util.HanthinkUtil;
import com.ls.vo.Orders;
import com.ls.vo.ResponseVo;

import freemarker.template.Template;
import freemarker.template.TemplateException;

@Service("carrefourAutomationService")
@Scope("prototype")
public class CarrefourAutomationServiceImpl extends AbstractAuthanAutomationService {

	private Logger logger = LoggerFactory.getLogger(CarrefourAutomationServiceImpl.class);

	private static final String CARREFOUR_ROOT_URL = "https://supplierweb.carrefour.com/";
	@Autowired
	AutomaticJobRepository automaticJobRepository;

	@Autowired
	OrderRepository orderRepository;

	@Autowired
	ProductDetailRepository productDetailRepository;

	private boolean checkIfOrderNotGrabed(Orders order, Integer jobId) {

		Map<String, String> titleMap = order.getOrderTitleMap();
		String orderNumber = titleMap.get("orderNumber");
		String storeNumberEnglish = titleMap.get("storeNumberEnglish");

		Order existedOrder = orderRepository.findByOrderNumberAndJobIdAndStoreNumberEnglish(orderNumber, jobId, storeNumberEnglish);

		return existedOrder == null;
	}

	public List<Orders> grabOrders(String start, String end, AutomaticJob authanJob) throws ConfigurationException, FailingHttpStatusCodeException, MalformedURLException, IOException, URISyntaxException, InterruptedException {

		List<Orders> ordersList = null;

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

		webClient.getPage("https://supplierweb.carrefour.com/callSSO.jsp");

		List<String> orderIds = getAllOrderFileIds(webClient, start, end);

		print(orderIds);

		ordersList = parseDetails(orderIds, webClient, authanJob.getId());

		return ordersList;
	}

	private List<Orders> parseDetails(List<String> orderIds, WebClient webClient, Integer jobId) throws FailingHttpStatusCodeException, MalformedURLException, IOException {

		List<Orders> ordersList = Lists.newArrayList();

		if (orderIds == null || orderIds.isEmpty()) {
			return ordersList;
		}

		for (String guid : orderIds) {

			try {
				String detailUrl = "https://platform.powere2e.com/platform/mailbox/performDocAction.htm?guid=" + guid + "&actionId=1";
				HtmlPage singleDetailPage = webClient.getPage(detailUrl);

				String singleDetailPageHtml = singleDetailPage.getWebResponse().getContentAsString();

				Parser htmlParser = new Parser();
				htmlParser.setInputHTML(singleDetailPageHtml);

				CarrefourDetailFinder carrefourDetailFinder = new CarrefourDetailFinder();
				htmlParser.visitAllNodesWith(carrefourDetailFinder);

				Orders order = carrefourDetailFinder.getOrder();

				if (order != null && checkIfOrderNotGrabed(order, jobId)) {
					ordersList.add(order);
				}

			} catch (ParserException e) {

			}

		}

		return ordersList;
	}

	private List<String> getAllOrderFileIds(WebClient webClient, String start, String end) throws FailingHttpStatusCodeException, MalformedURLException, IOException {

		List<String> allGuidList = new ArrayList<String>();
		try {
			String carrefourStart = HanthinkUtil.getCarrefourDateQueryString(start);
			String carrefourEnd = HanthinkUtil.getCarrefourDateQueryString(start);
			
			webClient.getPage("https://platform.powere2e.com/platform/mailbox/openInbox.htm?showAll");
			
			int page = 1;

			boolean hasNextPage = true;
			while (hasNextPage) {
				
				String archivePageUrl = "https://platform.powere2e.com/platform/mailbox/navigateInbox.htm?&receivedDateFrom=" + carrefourStart + "&receivedDateTo=" + carrefourEnd + "&searchText=&gotoPage=" + page;

				print("Visiting page " + page + "--> " + archivePageUrl);

				HtmlPage archivePage = webClient.getPage(archivePageUrl);
				String archivePageContent = archivePage.getWebResponse().getContentAsString();

				Parser htmlParser = new Parser();
				htmlParser.setInputHTML(archivePageContent);

				CarrefourDetailLinkingFinder carrefourDetailLinkingFinder = new CarrefourDetailLinkingFinder();
				htmlParser.visitAllNodesWith(carrefourDetailLinkingFinder);

				List<String> singlePageList = carrefourDetailLinkingFinder.getGuidList();
				
				allGuidList.addAll(singlePageList);

				hasNextPage = carrefourDetailLinkingFinder.hasNextPage();

				page++;
			}

		} catch (ParseException e) {
			throw new RuntimeException("非标准的日期格式");
		} catch (ParserException e) {

		}

		return allGuidList;
	}

	private String toEmpty(String input) {

		String inputString = StringUtils.trimToEmpty(input);

		if (inputString.toLowerCase().equals("null")) {
			inputString = "";
		}

		return inputString;
	}

	public String getQueryParameters(String start, String end) {

		String baseUrl = "?_search=false&endTime=" + end + "&rows=10&sord=asc&startTime=" + start;

		return baseUrl;
	}

	public String tryToLogin(WebClient webClient, AutomaticJob automaticJob) throws FailingHttpStatusCodeException, MalformedURLException, IOException, URISyntaxException, InterruptedException {

		System.out.println("Trying to login......");

		URL url = new URL(CARREFOUR_ROOT_URL);

		final HtmlPage loginPage = webClient.getPage(url);

		HtmlForm form = loginPage.getFormByName("loginForm");

		HtmlImage validationCodeImage = null;

		List<HtmlImage> images = form.getHtmlElementsByTagName("img");

		for (HtmlImage htmlImage : images) {

			if (StringUtils.isNotBlank(htmlImage.getAttribute("src")) && htmlImage.getAttribute("src").equals("includes/image.jsp")) {
				validationCodeImage = htmlImage;
				break;
			}
		}

		String fileName = HanthinkProperties.getString("tessertOcrInstallPath") + System.currentTimeMillis() + ".jpg";
		validationCodeImage.saveAs(new File(fileName));

		Thread.sleep(1000);

		final HtmlTextInput usernameTextInput = form.getInputByName("login");
		final HtmlPasswordInput passwordField = form.getInputByName("password");
		final HtmlTextInput validateCodeTextInput = form.getInputByName("validate");
		final HtmlImageInput loginButton = form.getInputByName("imageField");

		usernameTextInput.setValueAttribute(automaticJob.getUsername());
		passwordField.setValueAttribute(automaticJob.getPassword());

		String ocrInstallPath = HanthinkProperties.getString("tessertOcrInstallPath");
		String command = ocrInstallPath + "tesseract.exe " + fileName + " " + fileName;

		Process process = Runtime.getRuntime().exec(command);
		process.waitFor();

		String code = Files.readFirstLine(new File(fileName + ".txt"), Charset.defaultCharset());

		Thread.sleep(1000);

		validateCodeTextInput.setValueAttribute(code);

		HtmlPage loginResultPage = (HtmlPage)loginButton.click();

		try {
			loginResultPage.getFormByName("loginForm");
		} catch (ElementNotFoundException e) {

			cleanUpValidationCodeFiles();
			System.out.println("Log in successfully.");

			return null;
		}

		tryToLogin(webClient, automaticJob);

		return null;
	}

	public String generateNewValidationCode(String cookies, WebClient webClient) throws FailingHttpStatusCodeException, IOException, InterruptedException {

		String getNewValidationCodeURL = "http://v30.sosgps.net.cn/platform-1.0/systemadmin/validateCode.do?timestamp=" + System.currentTimeMillis();

		String fileName = GrapImgUtil.grabImgWithSrc(getNewValidationCodeURL, cookies);
		Thread.sleep(1000);
		String ocrInstallPath = HanthinkProperties.getString("tessertOcrInstallPath");
		String command = ocrInstallPath + "tesseract.exe " + ocrInstallPath + fileName + ".jpg " + ocrInstallPath + fileName;

		Process process = Runtime.getRuntime().exec(command);
		process.waitFor();

		String code = Files.readFirstLine(new File(ocrInstallPath + fileName + ".txt"), Charset.defaultCharset());
		if (StringUtils.isNotBlank(code)) {
			code = code.replace(" ", "");
		}
		boolean isValidCode = (StringUtils.isNotBlank(code) && code.length() == 4 && StringUtils.isNumeric(code));

		if (isValidCode) {
			return code;
		} else {
			return generateNewValidationCode(cookies, webClient);
		}

	}

	public String compositeOrderToXml(List<Orders> orders, AutomaticJob automaticJob) throws IOException, TemplateException {

		Template template = AuthanConstants.getAnchanConfiguration().getTemplate("carrefour-request-soap.ftl");

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
			String storeNumber = titleMap.get("storeNumber");
			String storeNumberEnglish = titleMap.get("storeNumberEnglish");

			String estimateTakeOverDate = titleMap.get("estimateTakeOverDate");
			String orderDate = titleMap.get("orderDate");

			Order order = new Order();
			order.setOrderNumber(orderNumber);
			order.setSupplierNumber(supplierNumber);
			order.setEstimateTakeOverDate(estimateTakeOverDate);
			order.setOrderDate(orderDate);
			order.setCreateDate(HanthinkUtil.getNow());
			order.setJobId(job.getId());
			order.setJobName(job.getName());
			order.setStoreNumber(storeNumber);
			order.setStoreNumberEnglish(storeNumberEnglish);

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
				String moneyAmountWithoutTax = toEmpty(singleDetailMap.get("moneyAmountWithoutTax"));
				String giftCount = toEmpty(singleDetailMap.get("giftCount"));
				String barCode = toEmpty(singleDetailMap.get("barCode"));
				String productNumber = toEmpty(singleDetailMap.get("productNumber"));
				String countInSingleBox = toEmpty(singleDetailMap.get("countInSingleBox"));
				String priceWithoutTax = toEmpty(singleDetailMap.get("priceWithoutTax"));

				ProductDetail productDetail = new ProductDetail();
				productDetail.setOrderId(savedOrder.getId());
				productDetail.setOrderNumber(orderNumber);
				productDetail.setDescription(description);
				productDetail.setCount(count);
				productDetail.setMoneyAmountWithoutTax(moneyAmountWithoutTax);
				productDetail.setGiftCount(giftCount);
				productDetail.setBarCode(barCode);
				productDetail.setProductNumber(productNumber);
				productDetail.setCountInSingleBox(countInSingleBox);
				productDetail.setPriceWithoutTax(priceWithoutTax);

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
