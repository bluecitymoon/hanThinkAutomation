package com.ls.service.impl;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlImage;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlPasswordInput;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.ls.constants.AuthanConstants;
import com.ls.entity.AutomaticJob;
import com.ls.entity.Order;
import com.ls.entity.ProductDetail;
import com.ls.exception.ConfigurationException;
import com.ls.repository.AutomaticJobRepository;
import com.ls.repository.OrderRepository;
import com.ls.repository.ProductDetailRepository;
import com.ls.util.HanthinkUtil;
import com.ls.vo.Orders;
import com.ls.vo.ResponseVo;

import freemarker.template.Template;
import freemarker.template.TemplateException;

@Service("sosoAutomationService")
@Scope("prototype")
public class SoSoAutomationServiceImpl extends AbstractAuthanAutomationService {

	private Logger logger = LoggerFactory.getLogger(SoSoAutomationServiceImpl.class);

	@Autowired
	AutomaticJobRepository automaticJobRepository;

	@Autowired
	OrderRepository orderRepository;

	@Autowired
	ProductDetailRepository productDetailRepository;

	public List<Orders> grabOrders(String start, String end, AutomaticJob authanJob) throws ConfigurationException {

		List<Orders> ordersList = Lists.newArrayList();

		if (null == authanJob) {
			logger.error("configuration for job authan is not good.");
			throw new ConfigurationException();
		}

		Date now = new Date();
		authanJob.setLastGrabStart(AuthanConstants.HANTHINK_TIME_FORMATTER.format(now));

		try {

			final WebClient webClient = new WebClient(BrowserVersion.CHROME);
			webClient.getOptions().setCssEnabled(false);
			webClient.getOptions().setThrowExceptionOnScriptError(false);

			tryToLogin(webClient, authanJob);

			String getOrdersListRequestUrl = "http://report.sosgps.net.cn/report-1.0/order/getDynamicPageData.do";
			String getTotalCountUrl = "http://report.sosgps.net.cn/report-1.0/order/countOrderData.do";

			HtmlPage totalCountPage = webClient.getPage(getTotalCountUrl + getQueryParameters(start, end));

			String countResponse = totalCountPage.getWebResponse().getContentAsString();

			Integer totalCount = 0;
			if (StringUtils.isBlank(countResponse)) {

				throw new RuntimeException("获取数据总数失败，可能是因为登陆失败。");
			} else {
				totalCount = JSONArray.fromObject(countResponse).getInt(1);

				for (int index = 1; index <= totalCount; index++) {
					String retrievingDataUrl = getOrdersListRequestUrl + getQueryParameters(start, end) + "&page=" + index;
					String responseData = webClient.getPage(retrievingDataUrl);

					JSONArray dataArray = JSONObject.fromObject(responseData).getJSONArray("rows");

					saveToOrderList(dataArray, ordersList, webClient);
				}

			}

			Date endTime = new Date();
			authanJob.setLastGrabEnd(AuthanConstants.HANTHINK_TIME_FORMATTER.format(endTime));

			automaticJobRepository.saveAndFlush(authanJob);

		} catch (Exception e) {
			return null;
		}
		return ordersList;
	}

	private void saveToOrderList(JSONArray dataArray, List<Orders> ordersList, final WebClient webClient) throws JsonParseException, JsonMappingException, IOException {

		Object[] objects = dataArray.toArray();

		for (Object object : objects) {

			Orders order = new Orders();
			ObjectMapper objectMapper = new ObjectMapper();

			HashMap<String, String> titleMap = objectMapper.readValue(object.toString(), new TypeReference<HashMap<String, String>>() {
			});
			order.setOrderTitleMap(titleMap);

			String orderNumber = titleMap.get("CELL0");
			String orderDate = titleMap.get("CREATEON");
			String address = titleMap.get("CELL3");
			String estimateTakeOverDate = titleMap.get("CELL2");

			titleMap.put("orderNumber", orderNumber);
			titleMap.put("orderDate", orderDate);
			titleMap.put("address", address);
			titleMap.put("estimateTakeOverDate", estimateTakeOverDate);

			String detailBaseUrl = "http://report.sosgps.net.cn/report-1.0/order/getPopupDynamicPageData.do?code=13836306053711&linkField=v30_bd_order.code&linkFieldValue=" + orderNumber;
			Page detailPage = webClient.getPage(detailBaseUrl);

			List<Map<String, String>> ordersItemList = parseDetails(detailPage.getWebResponse().getContentAsString(), orderNumber);
			order.setOrdersItemList(ordersItemList);

			ordersList.add(order);
		}

	}

	private List<Map<String, String>> parseDetails(String context, String orderNumber) {

		List<Map<String, String>> ordersItemList = new ArrayList<Map<String, String>>();

		JSONArray rootElement = JSONArray.fromObject(context);
		if (rootElement.size() == 0) {
			return ordersItemList;
		}

		JSONObject firstElement = rootElement.getJSONObject(0);

		JSONArray listItems = JSONArray.fromObject(JSONObject.fromObject(firstElement.get("data")).get("listItems"));
		Object[] dataItem = listItems.toArray();

		for (Object item : dataItem) {
			JSONObject detailObject = JSONObject.fromObject(item);
			Map<String, String> itemMap = Maps.newHashMap();

			itemMap.put("description", detailObject.getString("CELL3"));
			itemMap.put("count", detailObject.getString("CELL4"));
			itemMap.put("moneyAmount", detailObject.getString("CELL7"));
			itemMap.put("orderNumber", orderNumber);

			ordersItemList.add(itemMap);
		}

		return ordersItemList;

	}

	public String getQueryParameters(String start, String end) {

		String baseUrl = "?_search=false&endTime=" + end + "&page=1&rows=10&sord=asc&startTime=" + start;

		return baseUrl;
	}

	public boolean tryToLogin(WebClient webClient, AutomaticJob authanJob) throws FailingHttpStatusCodeException, MalformedURLException, IOException, URISyntaxException, InterruptedException {

		URL url = new URL("http://v30.sosgps.net.cn/platform-1.0/systemindex.do");

		final HtmlPage loginPage = webClient.getPage(url);

		HtmlForm form = loginPage.getFormByName("LoginForm");

		HtmlElement logInput = null;
		List<HtmlImage> images = form.getHtmlElementsByTagName("img");

		for (HtmlImage htmlImage : images) {

			if (StringUtils.isNotBlank(htmlImage.getAttribute("onclick")) && htmlImage.getAttribute("onclick").equals("submitForm()")) {
				logInput = htmlImage;
				break;
			}
		}

		final HtmlTextInput companyCodeTextInput = form.getInputByName("empCode");
		final HtmlTextInput usernameTextInput = form.getInputByName("userAccount");
		final HtmlPasswordInput passwordField = form.getInputByName("password");
		final HtmlTextInput validateCodeTextInput = form.getInputByName("validateCode");

		companyCodeTextInput.setValueAttribute("shcmmy");

		usernameTextInput.setValueAttribute(authanJob.getUsername());

		passwordField.setValueAttribute(authanJob.getPassword());

		HtmlImage validateCodeImage = (HtmlImage) loginPage.getElementById("validateImg");

		ImageReader imageReader = validateCodeImage.getImageReader();

		BufferedImage bufferedImage = imageReader.read(0);

		String name = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
		File storeFile = new File("D:\\applications\\Tesseract-OCR\\" + name + ".jpg");

		if (!storeFile.exists()) {
			storeFile.createNewFile();
		}

		ImageIO.write(bufferedImage, "jpg", storeFile);
		
		Thread.sleep(1000);
		
		String command = "D:\\applications\\Tesseract-OCR\\tesseract.exe D:\\applications\\Tesseract-OCR\\" + name + ".jpg" + " D:\\applications\\Tesseract-OCR\\" + name;

		Process process = Runtime.getRuntime().exec(command);
		process.waitFor();

		String code = Files.readFirstLine(new File("D:\\applications\\Tesseract-OCR\\" + name + ".txt"), Charset.defaultCharset());
		if (StringUtils.isNotBlank(code)) {
			code = code.replace(" ", "");
		}
		

		boolean isValidCode = (StringUtils.isNotBlank(code) && code.length() == 4 && StringUtils.isNumeric(code));

		if (isValidCode) {
			System.out.println(code);
			
			validateCodeTextInput.setValueAttribute(code);

			HtmlPage responsePage = logInput.click();

			String nextUrl = responsePage.getUrl().toString();
			
			if (nextUrl.contains("loginAlone.do")) {
				String parameters = nextUrl.split("?")[1];
				String loginToReportCenterUrl = "http://report.sosgps.net.cn/report-1.0/loginAlone.do?" + parameters;
				
				webClient.getPage(loginToReportCenterUrl);
				
				return true;
			} else {
				return tryToLogin(webClient, authanJob);
			}

		} else {

			return tryToLogin(webClient, authanJob);

		}

	}

	public String generateReconizableCode(WebClient webClient) throws IOException, InterruptedException {

		Thread.sleep(1000);

		String validateCodeActionUrl = "http://v30.sosgps.net.cn/platform-1.0/systemadmin/validateCode.do?timestamp=" + System.currentTimeMillis();

		String name = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
		File storeFile = new File("D:\\applications\\Tesseract-OCR\\" + name + ".jpg");

		if (!storeFile.exists()) {
			storeFile.createNewFile();
		}

		FileOutputStream fileOutputStream = new FileOutputStream(storeFile);

		InputStream inputStream = webClient.getPage(validateCodeActionUrl).getWebResponse().getContentAsStream();

		IOUtils.copy(inputStream, fileOutputStream);

		IOUtils.closeQuietly(inputStream);
		IOUtils.closeQuietly(fileOutputStream);

		String fileName = name + ".jpg";

		String command = "D:\\applications\\Tesseract-OCR\\tesseract.exe D:\\applications\\Tesseract-OCR\\" + fileName + " D:\\applications\\Tesseract-OCR\\" + fileName;

		Process process = Runtime.getRuntime().exec(command);
		process.waitFor();

		String code = Files.readFirstLine(new File("D:\\applications\\Tesseract-OCR\\" + fileName + ".txt"), Charset.defaultCharset());
		if (StringUtils.isNotBlank(code)) {
			code = code.replace(" ", "");
		}
		System.out.println(code);

		boolean isValidCode = (StringUtils.isNotBlank(code) && code.length() == 4 && StringUtils.isNumeric(code));

		System.out.println(isValidCode);

		if (isValidCode) {
			return code;

		} else {
			return generateReconizableCode(webClient);
		}

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

	public Orders grabSingleOrders(String start, String end) {

		return null;
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

			String url = job.getClientIp() + job.getClientEnd();

			// send ws
			HttpResponse response = postWebService(url, data);

			HttpEntity httpEntity = response.getEntity();
			String responseText = null;
			if (httpEntity != null) {
				responseText = EntityUtils.toString(httpEntity);
			}

			if (response.getStatusLine().getStatusCode() >= 200) {
				// XMLSerializer xmlSerializer = new XMLSerializer();
				// xmlSerializer.read(responseText)
				saveOrders(orders);
			} else {
				return ResponseVo.newFailMessage("发送web service失败。 response code :" + response.getStatusLine().getStatusCode() + " Response Text : " + responseText);
			}

		} catch (ConfigurationException e) {

			responseVo.setType(ResponseVo.MessageType.FAIL.name());
			responseVo.setMessage("任务配置出现了问题：" + e.getMessage());

			logger.error("postDataToWebService error" + responseVo.toString());

			return responseVo;

		} catch (Exception e) {
			responseVo.setType(ResponseVo.MessageType.FAIL.name());
			responseVo.setMessage("出错了:" + e.getMessage());

			logger.error("postDataToWebService error" + responseVo.toString());

			return responseVo;
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

	@Secured({ "ROLE_ADMIN" })
	public ResponseVo startupJobManually(String start, String end, AutomaticJob automaticJob) {

		return postDataToWebService(start, end, automaticJob);

	}

	@Secured({ "ROLE_ADMIN" })
	public void deleteJob(AutomaticJob automaticJob) {

		automaticJobRepository.delete(automaticJob);

	}

	@Secured({ "ROLE_ADMIN" })
	public void saveOrUpdateJob(AutomaticJob automaticJob) {

		automaticJobRepository.saveAndFlush(automaticJob);

	}

	private boolean checkIfOrderNotGrabed(Orders order) {

		Map<String, String> titleMap = order.getOrderTitleMap();
		String orderNumber = titleMap.get("订单号：");
		String storeNumber = titleMap.get("店号：");

		Order existedOrder = orderRepository.findByOrderNumberAndStoreNumber(orderNumber, storeNumber);

		return existedOrder == null;
	}

	public List<Order> saveOrders(List<Orders> orders) {

		if (null == orders || orders.size() == 0) {
			return null;
		}

		List<Order> savedOrderList = new ArrayList<Order>();

		for (Orders singleOrder : orders) {

			Map<String, String> titleMap = singleOrder.getOrderTitleMap();
			String orderNumber = titleMap.get("订单号：");
			String storeNumber = titleMap.get("店号：");

			String estimateTakeOverDate = titleMap.get("预定收货日期：");
			String supplierNumber = titleMap.get("供应商：");
			String orderDate = titleMap.get("订单日期：");

			Order order = new Order();
			order.setOrderNumber(orderNumber);
			order.setStoreNumber(storeNumber);
			order.setEstimateTakeOverDate(estimateTakeOverDate);
			order.setSupplierNumber(supplierNumber);
			order.setOrderDate(orderDate);
			order.setCreateDate(HanthinkUtil.getNow());

			List<Map<String, String>> detailMap = singleOrder.getOrdersItemList();
			Order savedOrder = orderRepository.saveAndFlush(order);

			for (Map<String, String> singleDetailMap : detailMap) {

				String productNumber = singleDetailMap.get("货号");
				String barCode = singleDetailMap.get("条目号");
				String description = singleDetailMap.get("货品描述");
				Integer count = Integer.valueOf(singleDetailMap.get("订货数"));
				Integer countInSingleBox = Integer.valueOf(singleDetailMap.get("箱含量"));
				String priceWithoutTax = singleDetailMap.get("未税进价");

				ProductDetail productDetail = new ProductDetail();
				productDetail.setOrderId(savedOrder.getId());
				productDetail.setOrderNumber(orderNumber);
				productDetail.setProductNumber(productNumber);
				productDetail.setBarCode(barCode);
				productDetail.setDescription(description);
				productDetail.setCount(count);
				productDetail.setCountInSingleBox(countInSingleBox);
				productDetail.setPriceWithoutTax(priceWithoutTax);

				productDetailRepository.save(productDetail);

			}

			savedOrderList.add(savedOrder);

		}
		return savedOrderList;
	}

}
