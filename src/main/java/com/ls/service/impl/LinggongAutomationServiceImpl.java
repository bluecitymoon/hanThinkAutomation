package com.ls.service.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.attachment.Attachment;
import com.gargoylesoftware.htmlunit.attachment.CollectingAttachmentHandler;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlButtonInput;
import com.gargoylesoftware.htmlunit.html.HtmlImage;
import com.gargoylesoftware.htmlunit.html.HtmlLabel;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlPasswordInput;
import com.gargoylesoftware.htmlunit.html.HtmlTable;
import com.gargoylesoftware.htmlunit.html.HtmlTableCell;
import com.gargoylesoftware.htmlunit.html.HtmlTableRow;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptJobManager;
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

	private boolean checkIfOrderNotGrabed(String orderNumber, String address, Integer jobId) {

		Order existedOrder = orderRepository.findByOrderNumberAndStoreNumberAndJobId(orderNumber, address, jobId);

		return existedOrder == null;
	}

	@Override
	public ResponseVo grabStorageInformation(String startDate, String endDate, AutomaticJob automaticJob) {

		if (null == automaticJob) {

			return ResponseVo.newFailMessage("未知的任务配置.");
		}

		final WebClient webClient = new WebClient(BrowserVersion.CHROME);
		webClient.getOptions().setCssEnabled(false);
		webClient.getOptions().setThrowExceptionOnScriptError(false);

		try {

			tryToLogin(webClient, automaticJob);

		} catch (FailingHttpStatusCodeException e) {
			return ResponseVo.newFailMessage("登陆零供b2b失败，错误的http code FailingHttpStatusCodeException : " + e.getMessage());
		} catch (MalformedURLException e) {
			return ResponseVo.newFailMessage("登陆零供b2b失败，MalformedURLException " + e.getMessage());
		} catch (IOException e) {
			return ResponseVo.newFailMessage("登陆零供b2b失败，IOException " + e.getMessage());
		} catch (URISyntaxException e) {
			return ResponseVo.newFailMessage("登陆零供b2b失败，URISyntaxException " + e.getMessage());
		} catch (InterruptedException e) {
			return ResponseVo.newFailMessage("登陆零供b2b失败，InterruptedException " + e.getMessage());
		}

		final List<Attachment> attachments = new ArrayList<Attachment>();
		webClient.setAttachmentHandler(new CollectingAttachmentHandler(attachments));
		String queryPageUrl = "http://scm.sgcs.com.cn/manager/sambillSelect/sambillSelect_findXcDayInfo.action?__multiselect_xcMonthBean.qryState=&xcMonthBean.qryBeginTime=" + startDate.replace("-", "") + "&xcMonthBean.qryEndTime=" + endDate.replace("-", "") + "&xcMonthBean.qryState=0009";
		
		System.out.println(queryPageUrl);
		
		try {
			HtmlPage listPage = webClient.getPage(queryPageUrl);

			List<HtmlAnchor> links = (List<HtmlAnchor>)listPage.getByXPath("//a");
			for (HtmlAnchor htmlAnchor : links) {
				if (htmlAnchor.getHrefAttribute().contains("downFile")) {
					Page page = htmlAnchor.click();

					JavaScriptJobManager javaScriptJobManager = listPage.getEnclosingWindow().getJobManager();
					while (javaScriptJobManager.getJobCount() > 0) {
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
						}
					}

					if (attachments.isEmpty()) {
						System.out.println("No attachement found.");
					} else {

						for (Attachment attachment : attachments) {
							System.err.println("Find Attachement " + attachment.getSuggestedFilename());
							
							Page conentPage = attachment.getPage();
							String fileName = HanthinkProperties.getString("dataFileBase") + System.currentTimeMillis() + "-downloadData";
							
							try {
								InputStream is = conentPage.getWebResponse().getContentAsStream();
								
								File file = new File(fileName + ".zip");
								if (!file.exists()) {
									file.createNewFile();
								}
								FileOutputStream fileout = new FileOutputStream(file);

								byte[] buffer = new byte[2048];
								int ch = 0;
								while ((ch = is.read(buffer)) != -1) {
									fileout.write(buffer, 0, ch);
								}
								is.close();
								fileout.flush();
								fileout.close();

							} catch (Exception e) {
								e.printStackTrace();
							}
							
							HanthinkUtil.unzipLingduZipFile(fileName + ".zip");	
						}
					}
				}
			}

		} catch (FailingHttpStatusCodeException e) {
			return ResponseVo.newFailMessage("获取销存页面失败，错误的http code FailingHttpStatusCodeException : " + e.getMessage());
		} catch (MalformedURLException e) {
			return ResponseVo.newFailMessage("获取销存页面失败，MalformedURLException : " + e.getMessage());
		} catch (IOException e) {
			return ResponseVo.newFailMessage("获取销存页面失败，IOException : " + e.getMessage());
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

		String firstPageUrl =
			"http://scm.sgcs.com.cn/manager/orderform/orderform_findSupplierList?orderFormBean.billCate=&orderFormBean.billNumber=&orderFormBean.billState=1&orderFormBean.endTime=" + end.replace("-", "") + "&orderFormBean.inDeptCode=&orderFormBean.readState=&orderFormBean.startTime=" + start.replace("-", "") +
				"&page.currentIndex=1&page.offset=10";

		HtmlPage firstHtmlPage = webClient.getPage(firstPageUrl);

		retrieveData(firstHtmlPage, ordersList, webClient, authanJob.getName(), authanJob.getId());

		HtmlLabel totalPageLabel = HanthinkUtil.getFirstElementByXPath(firstHtmlPage, "//*[@id=\"pagetotalpage\"]");
		String totalNumberString = HanthinkUtil.getNumbersInString(totalPageLabel.asText());
		if (StringUtils.isNotBlank(totalNumberString)) {
			Integer totalNumber = Integer.valueOf(totalNumberString);

			if (totalNumber > 1) {
				for (int i = 2; i <= totalNumber; i++) {
					String nextPage =
						"http://scm.sgcs.com.cn/manager/orderform/orderform_findSupplierList?orderFormBean.billCate=&orderFormBean.billNumber=&orderFormBean.billState=1&orderFormBean.endTime=" + end.replace("-", "") + "&orderFormBean.inDeptCode=&orderFormBean.readState=&orderFormBean.startTime=" + start.replace("-", "") +
							"&page.currentIndex=" + i + "&page.offset=10";
					HtmlPage nextHtmlPage = webClient.getPage(nextPage);

					retrieveData(nextHtmlPage, ordersList, webClient, authanJob.getName(), authanJob.getId());
				}
			}
		}

		return ordersList;
	}

	private void retrieveData(HtmlPage queryResultPage, List<Orders> ordersList, final WebClient webClient, String supplierNumber, Integer jobId) {

		HtmlTable dataTable = HanthinkUtil.getFirstElementByXPath(queryResultPage, "//*[@id=\"tablist\"]");

		List<HtmlTableRow> rows = dataTable.getRows();

		for (int i = 1; i < rows.size(); i++) {
			HtmlTableRow singleRow = rows.get(i);
			Orders singleOrder = new Orders();
			String uuid = UUID.randomUUID().toString();

			singleOrder.getOrderTitleMap().put("uuid", uuid);
			singleOrder.getOrderTitleMap().put("supplierNumber", supplierNumber);

			List<HtmlTableCell> tds = singleRow.getCells();
			String orderNumber = "";
			String orderCreatorDeptNumber = "";
			String address = "";
			for (int j = 0; j < tds.size(); j++) {

				HtmlTableCell singleCell = tds.get(j);
				String content = StringUtils.trimToEmpty(singleCell.getTextContent());
				switch (j) {
					case 2:
						orderNumber = content;
						singleOrder.getOrderTitleMap().put("orderNumber", content);
						break;

					case 4:
						orderCreatorDeptNumber = content;
						break;
					case 6:
						singleOrder.getOrderTitleMap().put("orderDate", getLingGongDateString(content));
						break;
					case 8:
						address = content;

						singleOrder.getOrderTitleMap().put("address", content);
						break;

					case 10:
						singleOrder.getOrderTitleMap().put("estimateTakeOverDate", getLingGongDateString(content));
						break;
					default:
						break;
				}
			}

			if (checkIfOrderNotGrabed(orderNumber, address, jobId)) {
				ordersList.add(singleOrder);
				retrieveDetail(singleOrder, orderNumber, orderCreatorDeptNumber, webClient, uuid);
			}
		}
	}

	private String getLingGongDateString(String shortString) {

		if (StringUtils.isNotBlank(shortString)) {

			String year = shortString.substring(0, 4);
			String month = shortString.substring(4, 6);
			String day = shortString.substring(6);

			return year + "-" + month + "-" + day;
		}

		return "";
	}

	private void retrieveDetail(Orders singleOrder, String orderNumber, String orderCreatorDeptNumber, final WebClient webClient, String uuid) {

		String detailUrl = "http://scm.sgcs.com.cn/manager/orderform/orderform_findGoodsInfo?id=" + orderNumber + "&deptid=" + orderCreatorDeptNumber;

		try {

			HtmlPage detailPage = webClient.getPage(detailUrl);

			HtmlTable dataTable = HanthinkUtil.getFirstElementByXPath(detailPage, "//*[@id=\"tablist\"]");

			List<HtmlTableRow> rows = dataTable.getRows();

			for (int i = 1; i < rows.size(); i++) {

				Map<String, String> singleDetail = new HashMap<String, String>();
				singleOrder.getOrdersItemList().add(singleDetail);
				singleDetail.put("uuid", uuid);

				HtmlTableRow singleRow = rows.get(i);
				List<HtmlTableCell> tds = singleRow.getCells();
				for (int j = 0; j < tds.size(); j++) {

					HtmlTableCell singleCell = tds.get(j);
					String content = StringUtils.trimToEmpty(singleCell.getTextContent());
					switch (j) {
						case 2:
							singleDetail.put("description", content);
							break;
						case 3:
							singleDetail.put("productNumber", content);
							break;
						case 4:
							singleDetail.put("barCode", content);
							break;
						case 6:

							if (StringUtils.isNotBlank(content)) {
								singleDetail.put("taxRate", "0." + content.replace("%", ""));
							} else {
								singleDetail.put("taxRate", "");
							}

							break;
						case 7:
							singleDetail.put("count", content);
							break;
						case 8:
							singleDetail.put("priceWithoutTax", content);
							break;
						case 9:
							singleDetail.put("moneyAmountWithoutTax", content);

							break;
						default:
							break;
					}
				}
			}

		} catch (FailingHttpStatusCodeException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
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

		HtmlImage validationCodeImage = HanthinkUtil.getFirstElementByXPath(loginPage, "//*[@id=\"codeId\"]");

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

		System.out.println("Using Code -> " + code);

		if (code != null) {
			code = code.replace(" ", "");
			checkstrHtmlPasswordInput.setValueAttribute(code);

			HtmlButtonInput loginButton = HanthinkUtil.getFirstElementByXPath(loginPage, "//*[@id=\"denglu\"]");
			HtmlPage loginResultPage = (HtmlPage)loginButton.click();
			JavaScriptJobManager javaScriptJobManager = loginResultPage.getEnclosingWindow().getJobManager();
			while (javaScriptJobManager.getJobCount() > 0) {
				Thread.sleep(1000);
			}

			String testDataUrl = "http://scm.sgcs.com.cn/manager/orderform/orderform_toSuplist";
			HtmlPage testPage = webClient.getPage(testDataUrl);
			String resultURL = testPage.getUrl().toString();

			if (resultURL.equals(testDataUrl)) {

				System.out.println("LingGong login successfully!");

				cleanUpValidationCodeFiles();

			} else {
				tryToLogin(webClient, automaticJob);
			}
		} else {
			tryToLogin(webClient, automaticJob);
		}
	}

	public String compositeOrderToXml(List<Orders> orders, AutomaticJob automaticJob) throws IOException, TemplateException {

		Template template = AuthanConstants.getAnchanConfiguration().getTemplate("lg-request-soap.ftl");

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
				String moneyAmountWithoutTax = toEmpty(singleDetailMap.get("moneyAmountWithoutTax"));
				String productNumber = toEmpty(singleDetailMap.get("productNumber"));
				String priceWithoutTax = toEmpty(singleDetailMap.get("priceWithoutTax"));
				String barCode = toEmpty(singleDetailMap.get("barCode"));
				String taxRate = toEmpty(singleDetailMap.get("taxRate"));

				ProductDetail productDetail = new ProductDetail();
				productDetail.setOrderId(savedOrder.getId());
				productDetail.setOrderNumber(orderNumber);
				productDetail.setDescription(description);
				productDetail.setCount(count);
				productDetail.setMoneyAmountWithoutTax(moneyAmountWithoutTax);
				productDetail.setProductNumber(productNumber);
				productDetail.setBarCode(barCode);
				productDetail.setPriceWithoutTax(priceWithoutTax);

				productDetail.setTaxRate(taxRate);

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
