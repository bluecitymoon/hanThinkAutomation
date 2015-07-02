package com.ls.service.impl;

import java.io.File;
import java.io.IOException;
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
import com.gargoylesoftware.htmlunit.ScriptResult;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlBold;
import com.gargoylesoftware.htmlunit.html.HtmlImage;
import com.gargoylesoftware.htmlunit.html.HtmlImageInput;
import com.gargoylesoftware.htmlunit.html.HtmlOption;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlPasswordInput;
import com.gargoylesoftware.htmlunit.html.HtmlSelect;
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
import com.ls.util.XinXinConstants;
import com.ls.vo.Orders;
import com.ls.vo.ResponseVo;

import freemarker.template.Template;
import freemarker.template.TemplateException;

@Service("RTMarketAutomationService")
@Scope("prototype")
public class RTMarketAutomationServiceImpl extends AbstractAuthanAutomationService {

	private Logger logger = LoggerFactory.getLogger(RTMarketAutomationServiceImpl.class);

	private static final String RTMARKET_ROOT_URL = "https://supplier.rt-mart.com.cn/index.php";
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

	private boolean checkIfStorageNotGrabed(String orderDate, String storeNumber, Integer jobId) {

		Order existedOrder = null;
		try {
			existedOrder = orderRepository.findByStoreNumberAndJobIdAndOrderDate(storeNumber, jobId, orderDate);
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			return false;
		}

		return existedOrder == null;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public ResponseVo grabStorageInformation(String startDate, String endDate, AutomaticJob automaticJob) {
		ResponseVo responseVo = null;
		
		if (null == automaticJob) return ResponseVo.newFailMessage("未知的任务配置.");

		Date now = new Date();
		automaticJob.setLastGrabStart(AuthanConstants.HANTHINK_TIME_FORMATTER.format(now));
		
		final WebClient webClient = new WebClient(BrowserVersion.CHROME);
		webClient.getOptions().setCssEnabled(false);
		webClient.getOptions().setThrowExceptionOnScriptError(false);

		try {

			tryToLogin(webClient, automaticJob);

		} catch (FailingHttpStatusCodeException e) {
			return ResponseVo.newFailMessage("登陆大润发失败，错误的http code FailingHttpStatusCodeException : " + e.getMessage());
		} catch (MalformedURLException e) {
			return ResponseVo.newFailMessage("登陆大润发失败，MalformedURLException " + e.getMessage());
		} catch (IOException e) {
			return ResponseVo.newFailMessage("登陆大润发失败，IOException " + e.getMessage());
		} catch (URISyntaxException e) {
			return ResponseVo.newFailMessage("登陆大润发失败，URISyntaxException " + e.getMessage());
		} catch (InterruptedException e) {
			return ResponseVo.newFailMessage("登陆大润发失败，InterruptedException " + e.getMessage());
		}
		
		List<Orders> storageOrders = new ArrayList<Orders>();
		String storagePageURL = "https://supplier.rt-mart.com.cn/php/scm_items_stat_list_a.php?code=all&pcode=";
		try {
			HtmlPage storageHtmlPage = webClient.getPage(storagePageURL);
			ScriptResult scriptResult = storageHtmlPage.executeJavaScript("printall()");
			HtmlPage wholeListPage = (HtmlPage) scriptResult.getNewPage();
			
			HtmlTable dataTable = HanthinkUtil.getFirstElementByXPath(wholeListPage, "/html/body/form/table");
			
			parseStorage(storageOrders, dataTable, automaticJob);
			
			if (storageOrders.isEmpty()) {
				return ResponseVo.newSuccessMessage("没有需要抓取的数据！");
			}
			String xml = "";
			try {
				xml = compositeStorageToXml(storageOrders, automaticJob);

			} catch (TemplateException e) {
				return ResponseVo.newFailMessage("遇到错误：请联系小江。" + e.getMessage());
			}
			
			responseVo = postStorageDataToWebService(storageOrders, automaticJob, xml);
			
		} catch (FailingHttpStatusCodeException e) {
			return ResponseVo.newFailMessage("大润发终端销量页面加载失败. 错误的http code FailingHttpStatusCodeException : " + e.getMessage());
		} catch (MalformedURLException e) {
			return ResponseVo.newFailMessage("大润发终端销量页面加载失败， MalformedURLException " + e.getMessage());
		} catch (IOException e) {
			return ResponseVo.newFailMessage("大润发终端销量页面加载失败，IOException " + e.getMessage());
		}
		
		Date endTime = new Date();
		automaticJob.setLastGrabEnd(AuthanConstants.HANTHINK_TIME_FORMATTER.format(endTime));

		automaticJobRepository.saveAndFlush(automaticJob);
		return responseVo;
	}
	
	private void parseStorage(List<Orders> storageOrders, HtmlTable dataTable, AutomaticJob automaticJob) {
		
		if (dataTable == null) return;
		
		List<HtmlTableRow> rows = dataTable.getRows();
		if (rows == null || rows.isEmpty()) return;
		
		String lastProductNumber = "";
		String lastDescription = "";
		for (int i = 2; i < rows.size(); i++) {
			
			HtmlTableRow singleRow = rows.get(i);
			List<HtmlTableCell> cells = singleRow.getCells();
			
			Map<String, String> singleOrderDetailMap = new HashMap<String, String>();
			Orders singleOrder = null;
			for (int j = 0; j < cells.size(); j++) {
				
				String cellContent = StringUtils.trimToEmpty(cells.get(j).asText());
				
				switch (j) {
				case 0:
					
					if (StringUtils.isNotEmpty(cellContent)) {
						lastProductNumber = cellContent;
					}
					singleOrderDetailMap.put("productNumber", lastProductNumber);
					break;
				case 1:
					
					if (StringUtils.isNotEmpty(cellContent)) {
						lastDescription = cellContent;
					}
					
					singleOrderDetailMap.put("description", lastDescription);
					break;
				case 2:
					
					singleOrder = getSingleOrderByProductNumber(storageOrders, cellContent);
					if (singleOrder == null) {
						singleOrder = new Orders();
						
						String supplierNumber = StringUtils.trimToEmpty(automaticJob.getCompanyCode());
						String todayString = new SimpleDateFormat(XinXinConstants.SIMPLE_DATE_FORMAT_STRING).format(new Date());
						singleOrder.getOrderTitleMap().put("supplierNumber", supplierNumber);
						singleOrder.getOrderTitleMap().put("orderDate", todayString);
						singleOrder.getOrderTitleMap().put("uuid", getRandomUUID());
					}
					singleOrder.getOrderTitleMap().put("storeNumber", cellContent);
					
					break;
				case 4:
					singleOrderDetailMap.put("dayBalanceInDb", cellContent);
					break;
					
				case 9:
					
					singleOrderDetailMap.put("count", cellContent);
					
					break;
				default:
					break;
				}
			}
			
			String uuid = singleOrder.getOrderTitleMap().get("uuid");
			singleOrderDetailMap.put("uuid", uuid);
			
			Integer jobId = automaticJob.getId();
			String storeNumber = singleOrderDetailMap.get("storeNumber");
			String orderDate = singleOrderDetailMap.get("orderDate");
			
			if (checkIfStorageNotGrabed(orderDate, storeNumber, jobId)) {
				storageOrders.add(singleOrder);
			}
			
		}
	}


	/**
	 * 
	 * @param storageOrders
	 * @param cellContent
	 * @return
	 */
	private Orders getSingleOrderByProductNumber(List<Orders> storageOrders, String cellContent) {
		
		for (Orders orders : storageOrders) {
			
			Map<String, String> titleMap = orders.getOrderTitleMap();
			String storeNumber = titleMap.get("storeNumber");
			
			if (StringUtils.isNotBlank(storeNumber) && storeNumber.equals(cellContent)) {
				return orders;
			}
		}
		
		return null;
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

		String dataUrl = "https://supplier.rt-mart.com.cn/php/scm_basic.php?status=0";

		HtmlPage dataPage = webClient.getPage(dataUrl);

		List<HtmlAnchor> anchors = dataPage.getAnchors(); 
		for (HtmlAnchor htmlAnchor : anchors) {

			String href = htmlAnchor.getHrefAttribute();

			if (StringUtils.isNotBlank(href) && href.startsWith("scm_basic_form.php") && checkIfOrderNotGrabed(htmlAnchor.getTextContent(), authanJob.getId())) {

				Orders orders = new Orders();

				ordersList.add(orders);

				Map<String, String> titleHashMap = new HashMap<String, String>();
				titleHashMap.put("orderNumber", htmlAnchor.getTextContent());
				titleHashMap.put("uuid", UUID.randomUUID().toString());

				orders.setOrderTitleMap(titleHashMap);

				String detailUrl = "https://supplier.rt-mart.com.cn/php/" + href;
				HtmlPage singleDetailPage = webClient.getPage(detailUrl);
				
				HtmlTableCell singleOrderDateCell = HanthinkUtil.getFirstElementByXPath(singleDetailPage, "//*[@id=\"waterMark\"]/table/tbody/tr/td/table/tbody/tr[3]/td[2]");
				if (singleOrderDateCell != null) {
					titleHashMap.put("orderDate", singleOrderDateCell.asText().trim());
				}
				
				HtmlTableCell firstestimateTakeOverDateHtmlTableCell = HanthinkUtil.getFirstElementByXPath(singleDetailPage, "//*[@id=\"waterMark\"]/table/tbody/tr/td/table/tbody/tr[4]/td[2]");
				if (firstestimateTakeOverDateHtmlTableCell != null) {
					titleHashMap.put("estimateTakeOverDate", firstestimateTakeOverDateHtmlTableCell.asText().trim());
				}
				
				//count and number
				HtmlTable singleTable = HanthinkUtil.getFirstElementByXPath(singleDetailPage, "/html/body/table[4]/tbody/tr/td[1]/table");
				if (singleTable != null) {
					extractProductNumberAndCount(singleTable, orders);
				}
				
				String address = "";
				List<HtmlAnchor> detailPageAnchors = singleDetailPage.getAnchors();
				for (HtmlAnchor htmlAnchor2 : detailPageAnchors) {
					
					String printPageHref = htmlAnchor2.getHrefAttribute();
					if (StringUtils.isNotBlank(printPageHref) && printPageHref.equals("javascript:printall()")) {
						
						HtmlPage printPreviewPage = htmlAnchor2.click();
						
						HtmlTableCell addressPartOneCell = HanthinkUtil.getFirstElementByXPath(printPreviewPage, "/html/body/table[3]/tbody/tr/td[1]/table/tbody/tr[2]/td");
						if (addressPartOneCell != null) {
							
							address = addressPartOneCell.asText();
							
							if(StringUtils.isNotBlank(address) && address.trim().startsWith("地址：")) {
								address = address.substring("地址：".length() + 1).trim(); 
							}
						}
						
						HtmlTableCell addressPartTwoCell = HanthinkUtil.getFirstElementByXPath(printPreviewPage, "/html/body/table[3]/tbody/tr/td[1]/table/tbody/tr[3]/td");
						
						if (addressPartTwoCell != null) {
							address += addressPartTwoCell.asText().trim();
						}
						
						titleHashMap.put("address", address);
						titleHashMap.put("storeNumber", address); //strange requirement 
						
						//supplier number
						String supplierNumber = "";
						HtmlBold compnayName = HanthinkUtil.getFirstElementByXPath(printPreviewPage, "/html/body/table[3]/tbody/tr/td[2]/table/tbody/tr[1]/th/b");
						if (compnayName != null) {
							String name = compnayName.asText();
							if (StringUtils.isNotBlank(name)) {
								supplierNumber = HanthinkUtil.getNumbersInString(name);
							}
						}
						
						titleHashMap.put("supplierNumber", supplierNumber);
						
						Parser detailpParser = new Parser();
						try {
							detailpParser.setInputHTML(printPreviewPage.getWebResponse().getContentAsString());
							RTMarketDetailParser suZhouUnivercityOrdersDetailFinder = new RTMarketDetailParser();
							detailpParser.visitAllNodesWith(suZhouUnivercityOrdersDetailFinder);

							List<String> columns = suZhouUnivercityOrdersDetailFinder.getProductList();

							mergeBarCodeAndProductName(orders, columns);

						} catch (ParserException e) {
							e.printStackTrace();
						}
						
						break;
					}
				}
			}
		}

		Date endTime = new Date();
		authanJob.setLastGrabEnd(AuthanConstants.HANTHINK_TIME_FORMATTER.format(endTime));

		automaticJobRepository.saveAndFlush(authanJob);
		
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
		webClient.getOptions().setUseInsecureSSL(true);

		URL url = new URL(RTMARKET_ROOT_URL);

		final HtmlPage loginPage = webClient.getPage(url);
		HtmlTextInput usernameHtmlTextInput = loginPage.getElementByName("userid");
		HtmlPasswordInput passwordHtmlTextInput = loginPage.getElementByName("passwd");
		HtmlPasswordInput checkstrHtmlPasswordInput = loginPage.getElementByName("checkstr");
		HtmlSelect zoneHtmlSelect = loginPage.getElementByName("area");

		if (StringUtils.isEmpty(automaticJob.getZone())) {
			automaticJob.setZone("1");
		}
		
		HtmlOption selectedOption = zoneHtmlSelect.getOptionByValue(automaticJob.getZone());
		zoneHtmlSelect.setSelectedAttribute(selectedOption, true);
		
		HtmlImage validationCodeImage = null;

		@SuppressWarnings("unchecked")
		List<HtmlImage> images = (List<HtmlImage>) loginPage.getByXPath("//img");

		for (HtmlImage htmlImage : images) {

			HtmlImage image = (HtmlImage) htmlImage;
			if (StringUtils.isNotBlank(htmlImage.getAttribute("src")) && htmlImage.getAttribute("src").equals("checkstr.php")) {
				validationCodeImage = image;
				break;
			}

		}

		String fileName = HanthinkProperties.getString("tessertOcrInstallPath") + System.currentTimeMillis() + ".jpg";
		validationCodeImage.saveAs(new File(fileName));

		Thread.sleep(1000);

		usernameHtmlTextInput.setValueAttribute(automaticJob.getUsername());
		passwordHtmlTextInput.setValueAttribute(automaticJob.getPassword());

		String ocrInstallPath = HanthinkProperties.getString("tessertOcrInstallPath");
		String command = ocrInstallPath + "tesseract.exe " + fileName + " " + fileName;

		Process process = Runtime.getRuntime().exec(command);
		process.waitFor();

		String code = "";
		try {
			code = Files.readFirstLine(new File(fileName + ".txt"), Charset.defaultCharset());
			
			if (StringUtils.isBlank(code)) {
				tryToLogin(webClient, automaticJob);
				return;
			}
			
			code = code.replaceAll("[^a-zA-Z0-9]", "");
			
			System.out.println(code);
		} catch (IOException e) {
			tryToLogin(webClient, automaticJob);
			return;
		}

		Thread.sleep(1000);

		checkstrHtmlPasswordInput.setValueAttribute(code);

		HtmlImageInput loginButton = loginPage.getElementByName("image");
		HtmlPage loginResultPage = (HtmlPage) loginButton.click();

		String callbackUrl = loginResultPage.getUrl().toString();

		if (callbackUrl.equals("https://supplier.rt-mart.com.cn/php/scm_main.php")) {
			
			System.out.println("RT-Market login successfully!");
			cleanUpValidationCodeFiles();
			return;
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

	public String compositeStorageToXml(List<Orders> orders, AutomaticJob automaticJob) throws IOException, TemplateException {

		Template template = AuthanConstants.getAnchanConfiguration().getTemplate("rt-market-storage-request-soap.ftl");

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

	
	@Override
	public void saveOrdersForStorage(List<Orders> orders, AutomaticJob job) {

		if (null == orders || orders.size() == 0) {
			return;
		}

		List<Order> savedOrderList = new ArrayList<Order>();

		for (Orders singleOrder : orders) {

			Map<String, String> titleMap = singleOrder.getOrderTitleMap();
			String supplierNumber = titleMap.get("supplierNumber");

			String storeNumber = titleMap.get("storeNumber");
			String orderDate = titleMap.get("orderDate");

			Order order = new Order();
			order.setSupplierNumber(supplierNumber);
			order.setOrderDate(orderDate);
			order.setCreateDate(HanthinkUtil.getNow());
			order.setJobId(job.getId());
			order.setJobName(job.getName());
			order.setUuid(singleOrder.getOrderTitleMap().get("uuid"));
			order.setStoreNumber(storeNumber);

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
				//String moneyAmountWithoutTax = toEmpty(singleDetailMap.get("moneyAmountWithoutTax"));
				String productNumber = toEmpty(singleDetailMap.get("productNumber"));
				String storageBalance = toEmpty(singleDetailMap.get("dayBalanceInDb"));

				ProductDetail productDetail = new ProductDetail();
				productDetail.setOrderId(savedOrder.getId());
				productDetail.setDescription(description);
				productDetail.setCount(count);
				//productDetail.setMoneyAmountWithoutTax(moneyAmountWithoutTax);
				productDetail.setProductNumber(productNumber);
				productDetail.setDayBalanceInDb(storageBalance);
				
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
	}
}
