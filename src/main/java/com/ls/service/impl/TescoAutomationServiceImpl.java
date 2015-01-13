package com.ls.service.impl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.htmlparser.Parser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.TextPage;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlPasswordInput;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
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
import com.ls.vo.TescoDetailLinkParameters;

import freemarker.template.Template;
import freemarker.template.TemplateException;

@Service("tescoSystemService")
@Scope("prototype")
public class TescoAutomationServiceImpl extends AbstractAuthanAutomationService {

	private Logger logger = LoggerFactory.getLogger(TescoAutomationServiceImpl.class);

	@Autowired
	AutomaticJobRepository automaticJobRepository;

	@Autowired
	OrderRepository orderRepository;

	@Autowired
	ProductDetailRepository productDetailRepository;

	private List<Order> ordersNeedSendSOAP = new ArrayList<Order>();

	public List<Orders> grabOrders(String start, String end, AutomaticJob authanJob) throws ConfigurationException {

		List<Orders> ordersList = Lists.newArrayList();

		if (null == authanJob) {
			logger.error("configuration for job authan is not good.");
			throw new ConfigurationException();
		}

		Date now = new Date();
		authanJob.setLastGrabStart(AuthanConstants.HANTHINK_TIME_FORMATTER.format(now));

		try {
			String url = "https://tesco.chinab2bi.com/security/login.hlt";

			final WebClient webClient = new WebClient(BrowserVersion.CHROME);
			webClient.getOptions().setCssEnabled(false);
			webClient.getOptions().setThrowExceptionOnScriptError(false);

			final HtmlPage loginPage = webClient.getPage(url);

			final List<HtmlForm> forms = loginPage.getForms();

			HtmlForm form = null;
			for (HtmlForm singleForm : forms) {
				if (singleForm.getAttribute("id").equals("loginForm")) {
					form = singleForm;
				}
			}

			final HtmlSubmitInput loginInput = form.getInputByName("Submit");
			final HtmlTextInput textField = form.getInputByName("j_username");
			final HtmlPasswordInput passwordField = form.getInputByName("j_password");

			textField.setValueAttribute(authanJob.getUsername());
			passwordField.setValueAttribute(authanJob.getPassword());

			HtmlPage loginResultPage = loginInput.click();

			Pattern pattern = Pattern.compile("[^0-9]");
			Matcher matcher = pattern.matcher(authanJob.getUsername());

			String vendorNo = matcher.replaceAll("").trim();

			final HtmlPage orderResultPage = webClient.getPage(makeParametersToSearchOrderList(start, end, null, vendorNo));

			String ordersListHtml = orderResultPage.getWebResponse().getContentAsString();
			Parser htmlParser = new Parser();
			htmlParser.setInputHTML(ordersListHtml);

			TescoDetailLinkingFinder detaiLinkFindingVisitor = new TescoDetailLinkingFinder("[明细]");

			htmlParser.visitAllNodesWith(detaiLinkFindingVisitor);
			List<TescoDetailLinkParameters> detailList = detaiLinkFindingVisitor.getTescoDetailLinkParameters();

			for (TescoDetailLinkParameters tescoDetailLinkParameters : detailList) {
				String detailUrl = makeUrlToSearchDetailPage(tescoDetailLinkParameters);

				final TextPage testResultPage = webClient.getPage(detailUrl);

				String resutString = testResultPage.getWebResponse().getContentAsString();
				System.out.println(resutString);

				String[] lines = resutString.split("\\n");

				Order order = parseTescoOrdersTemplate(lines);

				System.out.println(order);

				if (order != null && notExistedOrder(order, authanJob.getId())) {

					ordersNeedSendSOAP.add(order);

					Orders orders = new Orders();
					Map<String, String> orderTitleMap = new HashMap<String, String>();
					List<Map<String, String>> ordersItemList = new ArrayList<Map<String, String>>();
					orders.setOrderTitleMap(orderTitleMap);
					orders.setOrdersItemList(ordersItemList);

					orderTitleMap.put("orderNumber", order.getOrderNumber());
					orderTitleMap.put("supplierNumber", order.getSupplierNumber());
					orderTitleMap.put("estimateTakeOverDate", order.getEstimateTakeOverDate());
					orderTitleMap.put("storeNumber", order.getStoreNumber());
					orderTitleMap.put("orderDate", order.getOrderDate());

					List<ProductDetail> productDetails = order.getProductDetails();
					for (ProductDetail productDetail : productDetails) {
						productDetail.setOrderNumber(order.getOrderNumber());
						Map<String, String> detailMap = new HashMap<String, String>();

						ordersItemList.add(detailMap);

						detailMap.put("orderNumber", order.getOrderNumber());
						detailMap.put("productNumber", productDetail.getProductNumber());
						detailMap.put("description", productDetail.getDescription());
						detailMap.put("count", productDetail.getCount());
						detailMap.put("countInSingleBox", productDetail.getCountInSingleBox());
						detailMap.put("boxCount", productDetail.getBoxCount());
						detailMap.put("priceWithoutTax", productDetail.getPriceWithoutTax());
						detailMap.put("moneyAmountWithoutTax", productDetail.getMoneyAmountWithoutTax());
					}

					ordersList.add(orders);
				}
			}

		} catch (FailingHttpStatusCodeException e) {
			loggerError(e, start, end);
		} catch (MalformedURLException e) {
			loggerError(e, start, end);
		} catch (ElementNotFoundException e) {
			loggerError(e, start, end);
		} catch (IOException e) {
			loggerError(e, start, end);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("grab order failed for start : " + start + " end : " + end + ", meets unexpected exception!! error message is -> " + e.getMessage());
		}

		Date endTime = new Date();
		authanJob.setLastGrabEnd(AuthanConstants.HANTHINK_TIME_FORMATTER.format(endTime));

		automaticJobRepository.saveAndFlush(authanJob);

		return ordersList;
	}

	private String makeUrlToSearchDetailPage(TescoDetailLinkParameters tescoDetailLinkParameters) {

		String detailUrl = "https://tesco.chinab2bi.com/tesco/sp/purOrder/pdfView.hlt?seed&fileName=" + tescoDetailLinkParameters.getFileName() + "&createDate=" + tescoDetailLinkParameters.getFileCreateDate() + "&poId=" + tescoDetailLinkParameters.getOrderNumber() + "&parentVendor=" + tescoDetailLinkParameters.getVendorNumber();

		System.out.println("found --> " + detailUrl);

		return detailUrl;
	}

	public String compositeOrderToXml(List<Orders> orders, AutomaticJob automaticJob) throws IOException, TemplateException {

		Template template = AuthanConstants.getAnchanConfiguration().getTemplate("tesco-request-soap.ftl");

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

		String basicTemplate = "https://tesco.chinab2bi.com/tesco/sp/purOrder/sellPubOrderQry.hlt?downFlag=&orderDateEnd=" + end + "&orderDateStart=" + start + "&page.pageNo=1&page.pageSize=1000&page.togglestatus=null&page.totalPages=-1&parentVendor=" + vendorNo + "&readFlag=&status=sell";

		return basicTemplate;
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

			if (response.getStatusLine().getStatusCode() >= 200) {

				try {
					saveOrders(job);
				} catch (Exception e) {
				}

				responseVo = ResponseVo.newSuccessMessage("采集成功。");

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

	@Secured({"ROLE_ADMIN"})
	public ResponseVo startupJobManually(String start, String end, AutomaticJob automaticJob) {

		return postDataToWebService(start, end, automaticJob);

	}

	@Secured({"ROLE_ADMIN"})
	public void deleteJob(AutomaticJob automaticJob) {

		automaticJobRepository.delete(automaticJob);

	}

	@Secured({"ROLE_ADMIN"})
	public void saveOrUpdateJob(AutomaticJob automaticJob) {

		automaticJobRepository.saveAndFlush(automaticJob);

	}

	private boolean notExistedOrder(Order order, Integer jobId) {

		String orderNumber = order.getOrderNumber();

		Order existedOrder = orderRepository.findByOrderNumberAndJobId(orderNumber, jobId);

		return existedOrder == null;
	}

	public void saveOrders(AutomaticJob automaticJob) {

		for (Order order : ordersNeedSendSOAP) {

			Order savedOrder = null;

			try {
				order.setJobId(automaticJob.getId());
				order.setJobName(automaticJob.getName());
				order.setCreateDate(HanthinkUtil.getNow());

				savedOrder = orderRepository.saveAndFlush(order);

			} catch (Exception e) {
			}

			if (savedOrder != null) {

				List<ProductDetail> productDetails = order.getProductDetails();
				for (ProductDetail productDetail : productDetails) {
					productDetail.setOrderId(savedOrder.getId());

					try {
						productDetailRepository.saveAndFlush(productDetail);
					} catch (Exception e) {
					}
				}
			}
		}
	}

	public static Order parseTescoOrdersTemplate(String[] lines) {

		if (null == lines || lines.length == 0) {
			return null;
		}

		Order order = new Order();
		List<ProductDetail> productDetails = new ArrayList<ProductDetail>();
		order.setProductDetails(productDetails);

		for (int i = 0; i < lines.length; i++) {

			String currentLine = lines[i];
			if (i > 14) {
				parseProductDetails(currentLine, order);

				if (StringUtils.isBlank(currentLine)) {

					break;
				}
			}

			switch (i) {
				case 0:
				case 2:
				case 5:
				case 6:
				case 8:
					break;
				case 1:
					parseStoreNumber(currentLine, order);
					break;
				case 3:
					parseOrderNumber(currentLine, order);
					break;
				case 4:
					parserOrderDate(currentLine, order);
					parserDeliverayDate(currentLine, order);
					break;
				// case 6 :
				// parserAddress(currentLine, order);
				// break;
				case 7:
					parseSupplierNumber(currentLine, order);
					break;

				default:
					break;
			}
		}

		return order;
	}

	private static void parseProductDetails(String currentLine, Order order) {

		Iterator<String> elementIterator = Splitter.on(" ").omitEmptyStrings().split(currentLine).iterator();
		List<String> productDetailList = new ArrayList<String>();
		while (elementIterator.hasNext()) {
			productDetailList.add(elementIterator.next());
		}

		if (productDetailList.size() < 10) {
			return;
		}

		ProductDetail productDetail = new ProductDetail();
		productDetail.setCreateDate(HanthinkUtil.getNow());

		String productNumber = productDetailList.get(0).replace("/", "");
		productDetail.setProductNumber(productNumber);
		String description = productDetailList.get(1);
		productDetail.setDescription(description);
		String count = productDetailList.get(10);
		productDetail.setCount(count);
		String countInSingleBox = productDetailList.get(4);
		productDetail.setCountInSingleBox(countInSingleBox);
		String boxCount = productDetailList.get(9);
		productDetail.setBoxCount(boxCount);
		String priceWithoutTax = productDetailList.get(5);
		productDetail.setPriceWithoutTax(priceWithoutTax);
		String moneyAmountWithoutTax = productDetailList.get(7);
		productDetail.setMoneyAmountWithoutTax(moneyAmountWithoutTax);

		System.out.println(productDetail);

		order.getProductDetails().add(productDetail);

	}

	private static void parseSupplierNumber(String currentLine, Order order) {

		Iterator<String> elementIterator = Splitter.on(" ").omitEmptyStrings().split(currentLine).iterator();

		boolean findOrderNumber = false;
		while (elementIterator.hasNext()) {
			String element = (String)elementIterator.next();

			if (findOrderNumber) {
				order.setSupplierNumber(element.trim());

				break;
			}

			if (element.equals("厂商编号")) {
				findOrderNumber = true;
			}
		}

	}

	@SuppressWarnings("unused")
	private static void parserAddress(String currentLine, Order order) {

		Iterator<String> elementIterator = Splitter.on(" ").omitEmptyStrings().split(currentLine).iterator();

		boolean findFirstElement = false;
		boolean findSecondElment = false;
		while (elementIterator.hasNext()) {
			String element = (String)elementIterator.next();

			if (findFirstElement && findSecondElment) {
				order.setAddress(element.trim());
				break;
			}

			if (element.equals("店")) {
				findFirstElement = true;
			}
			if (element.equals("址")) {
				findSecondElment = true;
			}
		}

	}

	private static void parserDeliverayDate(String currentLine, Order order) {

		Iterator<String> elementIterator = Splitter.on(" ").omitEmptyStrings().split(currentLine).iterator();

		boolean findOrderNumber = false;
		while (elementIterator.hasNext()) {
			String element = (String)elementIterator.next();

			if (findOrderNumber) {
				order.setEstimateTakeOverDate(element.trim());
				break;
			}

			if (element.equals("交货日期")) {
				findOrderNumber = true;
			}
		}
	}

	private static void parserOrderDate(String currentLine, Order order) {

		Iterator<String> elementIterator = Splitter.on(" ").omitEmptyStrings().split(currentLine).iterator();

		boolean findOrderNumber = false;
		while (elementIterator.hasNext()) {
			String element = (String)elementIterator.next();

			if (findOrderNumber) {
				order.setOrderDate(element.trim());

				break;
			}

			if (element.equals("订单日期")) {
				findOrderNumber = true;
			}
		}

	}

	private static void parseOrderNumber(String currentLine, Order order) {

		Iterator<String> elementIterator = Splitter.on(" ").omitEmptyStrings().split(currentLine).iterator();

		boolean findOrderNumber = false;
		while (elementIterator.hasNext()) {
			String element = (String)elementIterator.next();

			if (findOrderNumber) {
				order.setOrderNumber(element.trim());
				break;
			}

			if (element.equals("订单号码")) {
				findOrderNumber = true;
			}
		}
	}

	private static void parseStoreNumber(String currentLine, Order order) {

		Iterator<String> elementIterator = Splitter.on(" ").omitEmptyStrings().split(currentLine).iterator();

		boolean findStoreNumber = false;
		while (elementIterator.hasNext()) {
			String element = (String)elementIterator.next();

			if (findStoreNumber) {
				order.setStoreNumber(element.trim());
				break;
			}

			if (element.equals("店别:")) {
				findStoreNumber = true;
			}
		}

	}

	public List<Order> saveOrders(List<Orders> orders, AutomaticJob job) {

		return null;
	}
}
