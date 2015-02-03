package com.ls.service.impl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

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
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.HttpMethod;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.WebRequest;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.util.NameValuePair;
import com.ls.constants.AuthanConstants;
import com.ls.entity.AutomaticJob;
import com.ls.entity.Order;
import com.ls.entity.ProductDetail;
import com.ls.exception.ConfigurationException;
import com.ls.repository.AutomaticJobRepository;
import com.ls.repository.OrderRepository;
import com.ls.repository.ProductDetailRepository;
import com.ls.util.HanthinkUtil;
import com.ls.vo.LihuaListJsonObject;
import com.ls.vo.LihuaResponseObject;
import com.ls.vo.Orders;
import com.ls.vo.ResponseVo;

import freemarker.template.Template;
import freemarker.template.TemplateException;

@Service("lianHuaAutomationService")
@Scope("prototype")
public class LianHuaAutomationServiceImpl extends AbstractAuthanAutomationService {

	private Logger logger = LoggerFactory.getLogger(LianHuaAutomationServiceImpl.class);

	private static final String LIANHUA_ROOT_URL = "http://b2b.chinalh.com/";
	@Autowired
	AutomaticJobRepository automaticJobRepository;

	@Autowired
	OrderRepository orderRepository;

	@Autowired
	ProductDetailRepository productDetailRepository;

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

		ordersList = parseTitlesTable(webClient, start, end, authanJob);

		return ordersList;
	}

	private List<Orders> parseTitlesTable(WebClient webClient, String start, String end, AutomaticJob automaticJob) throws FailingHttpStatusCodeException, MalformedURLException, IOException {

		List<Orders> result = new ArrayList<Orders>();

		String baseQueryUrl = "http://edi.chinalh.com/lhscm/cm/business/form/po/po.do?search=true&accid=&bgid=0002&datebegin=" + start + "&dateend=" + end + "&datetype=1&deptid=&findnew=&limit=3000&orderby=bg_org_id&orgid=&pono=&status=-1";

		System.out.println("visiting --> " + baseQueryUrl);

		String resultQuery = webClient.getPage(baseQueryUrl).getWebResponse().getContentAsString();

		JSONObject jsonObject = JSONObject.fromObject(resultQuery);

		JSONArray detailListJsonArray = jsonObject.getJSONArray("rows");

		LihuaResponseObject lihuaResponseObject = (LihuaResponseObject)JSONObject.toBean(jsonObject, LihuaResponseObject.class);

		@SuppressWarnings({"deprecation", "unchecked"})
		List<LihuaListJsonObject> detaiList = JSONArray.toList(detailListJsonArray, LihuaListJsonObject.class);

		int count = Integer.valueOf(lihuaResponseObject.getCount());
		if (count > 3000) {
			throw new RuntimeException("查询订单数量过大，请缩小查询范围。");
		}

		for (LihuaListJsonObject orderJsonObject : detaiList) {

			String storeNumber = HanthinkUtil.getNumbersInString(orderJsonObject.getOrgid());
			String orderNumber = orderJsonObject.getPono();
			Order existedOrder = orderRepository.findByOrderNumberAndStoreNumberAndJobId(orderNumber, storeNumber, automaticJob.getId());

			if (null != existedOrder) {
				continue;
			}

			String orderId = orderJsonObject.getId();

			Orders orders = new Orders();
			result.add(orders);

			Map<String, String> orderTitleMap = new HashMap<String, String>();

			orders.setOrderTitleMap(orderTitleMap);

			orderTitleMap.put("orderNumber", orderNumber);
			orderTitleMap.put("supplierNumber", automaticJob.getUsername());
			orderTitleMap.put("estimateTakeOverDate", orderJsonObject.getReply_delivery_date());
			orderTitleMap.put("storeNumber", storeNumber);
			orderTitleMap.put("orderDate", orderJsonObject.getBilldate());
			orderTitleMap.put("orderId", orderId);

			String lianhuaOrderDetailUrl = "http://edi.chinalh.com/lhscm/cm/business/form/po/poreportview.do?headerid=" + orderId;

			System.out.println("visiting --> " + lianhuaOrderDetailUrl);

			if (StringUtils.isNotBlank(orderId)) {

				HtmlPage singleDetailPage = webClient.getPage(lianhuaOrderDetailUrl);
				Parser htmlParser = new Parser();

				try {
					htmlParser.setInputHTML(singleDetailPage.getWebResponse().getContentAsString());
					LianHuaDetailFinder lianHuaDetailFinder = new LianHuaDetailFinder(orderNumber);

					htmlParser.visitAllNodesWith(lianHuaDetailFinder);

					String cancelDate = lianHuaDetailFinder.getOrderCancelDate();

					if (StringUtils.isNotBlank(cancelDate)) {
						orderTitleMap.put("estimateTakeOverDate", cancelDate);
					}

					List<Map<String, String>> ordersItemList = lianHuaDetailFinder.getOrdersItemList();

					orders.setOrdersItemList(ordersItemList);

				} catch (ParserException e) {

				}
			}
		}

		return result;
	}

	private String toEmpty(String input) {

		String inputString = StringUtils.trimToEmpty(input);

		if (inputString.toLowerCase().equals("null")) {
			inputString = "";
		}

		return inputString;
	}

	public void tryToLogin(WebClient webClient, AutomaticJob automaticJob) throws FailingHttpStatusCodeException, MalformedURLException, IOException, URISyntaxException, InterruptedException {

		System.out.println("LianHua Trying to login......");

		URL url = new URL(LIANHUA_ROOT_URL);

		final HtmlPage loginPage = webClient.getPage(url);

		WebRequest webRequest = new WebRequest(new URL("http://b2b.chinalh.com/login.do"), HttpMethod.POST);
		List<NameValuePair> parameterList = new ArrayList<NameValuePair>();
		parameterList.add(new NameValuePair("username", automaticJob.getUsername()));
		parameterList.add(new NameValuePair("password", automaticJob.getPassword()));
		parameterList.add(new NameValuePair("checkText", "fuck"));
		parameterList.add(new NameValuePair("checkCode", "fuck"));
		webRequest.setRequestParameters(parameterList);

		webClient.getPage(webRequest);

		System.out.println("LianHua logged in......");
		// TODO check if login success.

	}

	public String compositeOrderToXml(List<Orders> orders, AutomaticJob automaticJob) throws IOException, TemplateException {

		Template template = AuthanConstants.getAnchanConfiguration().getTemplate("lianhua-request-soap.ftl");

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
				} else {
					saveOrders(orders, job);
				}
			}

			System.out.println(responseText);

		} catch (ConfigurationException e) {

			responseVo.setType(ResponseVo.MessageType.FAIL.name());
			responseVo.setMessage("任务配置出现了问题：" + e.getMessage());

			logger.error("postDataToWebService error" + responseVo.toString());

			return responseVo;

		} catch (FailingHttpStatusCodeException e) {

			responseVo.setType(ResponseVo.MessageType.FAIL.name());
			responseVo.setMessage("连接数据源时出现了网络问题" + e.getMessage());

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
		} catch (Exception e) {

			e.printStackTrace();

			responseVo.setType(ResponseVo.MessageType.FAIL.name());
			responseVo.setMessage("出错了:" + e.getMessage());

			logger.error("postDataToWebService error" + responseVo.toString());

			return responseVo;
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
				String moneyAmountWithTax = toEmpty(singleDetailMap.get("moneyAmountWithTax"));
				String taxRate = toEmpty(singleDetailMap.get("taxRate"));

				String priceWithTax = toEmpty(singleDetailMap.get("priceWithTax"));

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
				productDetail.setMoneyAmountWithTax(moneyAmountWithTax);
				productDetail.setTaxRate(taxRate);
				productDetail.setPriceWithTax(priceWithTax);

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
