package com.ls.service.impl;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.eclipse.jetty.http.HttpURI;
import org.htmlparser.util.ParserException;
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
import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlImage;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlPasswordInput;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.io.Files;
import com.ls.constants.AuthanConstants;
import com.ls.entity.AutomaticJob;
import com.ls.entity.Order;
import com.ls.entity.ProductDetail;
import com.ls.exception.ConfigurationException;
import com.ls.grab.GrapImgUtil;
import com.ls.grab.HtmlParserUtilPlanB;
import com.ls.repository.AutomaticJobRepository;
import com.ls.repository.OrderRepository;
import com.ls.repository.ProductDetailRepository;
import com.ls.service.AuthanAutomationService;
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

			String vendorNo = authanJob.getUsername().substring(2);
			final HtmlPage orderResultPage = webClient.getPage(makeParametersToSearchOrderList(start, end, null, vendorNo));
		
			String ordersListHtml = orderResultPage.getWebResponse().getContentAsString();

			//urls
			List<String> orderIdList = HtmlParserUtilPlanB.findOrderListInOrderSystem(ordersListHtml);
			
			if (orderIdList.size() == 0) {
				return null;
			}
			
			if (orderIdList.size() > 100000) {
				logger.error("data is too big");
			}

			String orderDetailUrl = "http://logistics.auchan.com.cn:8000";
			for (String orderId : orderIdList) {

				String singleOrderDetail = orderDetailUrl + orderId;
				final HtmlPage singleOrderDetailPage = webClient.getPage(singleOrderDetail);

				String singleOrderHtml = singleOrderDetailPage.getWebResponse().getContentAsString();

				Orders singleOrder = null;
				try {
					singleOrder = HtmlParserUtilPlanB.parseOrderInOrderSystem(singleOrderHtml);
					
					Map<String, String> titlesMap = singleOrder.getOrderTitleMap();
					titlesMap.put("供应商：", vendorNo);
					
					String childTableId = singleOrder.getOrderTitleMap().get("订单号：");
					List<Map<String, String>> detailsMaps = singleOrder.getOrdersItemList();
					for (Map<String, String> map : detailsMaps) {
						map.put("订单号：", childTableId);
						
						String priceInWithoutTax = map.get("未税进价");
						if (StringUtils.isNotBlank(priceInWithoutTax) && priceInWithoutTax.startsWith(".")) {
							map.put("未税进价", "0" + priceInWithoutTax);
						}
					}
					if(checkIfOrderNotGrabed(singleOrder)) {
						ordersList.add(singleOrder);
					}
					

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
			logger.error("grab order failed for start : " + start + " end : " + end + ", meets unexpected exception!! error message is -> " + e.getMessage());
		}

		Date endTime = new Date();
		authanJob.setLastGrabEnd(AuthanConstants.HANTHINK_TIME_FORMATTER.format(endTime));

		automaticJobRepository.saveAndFlush(authanJob);

		return ordersList;
	}
	
	public boolean tryToLogin(WebClient webClient, AutomaticJob authanJob) throws FailingHttpStatusCodeException, MalformedURLException, IOException, URISyntaxException, InterruptedException {
		
		String url = "http://v30.sosgps.net.cn/platform-1.0/systemindex.do";
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

		
		Page responsePage = logInput.click();
		
		return false;
	}

	private String currentGoodCode;
	
	public String getCurrentGoodCode() {
		return currentGoodCode;
	}

	public void setCurrentGoodCode(String currentGoodCode) {
		this.currentGoodCode = currentGoodCode;
	}

	public String getCurrentValidateCode(WebClient webClient) throws IOException, InterruptedException {
		
		Thread.sleep(1000);
		
		String validateCodeActionUrl = "http://v30.sosgps.net.cn/platform-1.0/systemadmin/validateCode.do";
		
		String fileName = GrapImgUtil.grabImgWithSrc(validateCodeActionUrl);
		String command = "D:\\applications\\Tesseract-OCR\\tesseract.exe D:\\applications\\Tesseract-OCR\\" + fileName + " D:\\applications\\Tesseract-OCR\\" + fileName;
		
		Process process = Runtime.getRuntime().exec(command);
		process.waitFor();
		
		String code = Files.readFirstLine(new File("D:\\applications\\Tesseract-OCR\\" + fileName + ".txt"), Charset.defaultCharset());
		
		System.out.println(code);
		
		if (StringUtils.isNotBlank(code) && code.length() == 4 && StringUtils.isNumeric(code)) {
			
			setCurrentGoodCode(code);
			
			return code;
			
		} else {
			
			getCurrentValidateCode(webClient);
		}
		
		return code;
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

	private String makeParametersToSearchOrderList(String start, String end, Integer currentPageNumber, String vendorNo) {

		if (null == currentPageNumber) {
			currentPageNumber = 1;
		}
		String basicTemplate = "http://logistics.auchan.com.cn:8000/logi/sup.do?method=supper_search&appStatus=&ec_crd=100000" +
			"&ec_i=ec&ec_p=1&ec_rd=15&ec_rd=15&endDate="+ end + "objNo=&rcvNo=&rcvType=&sectionNo=&startDate=" + start + "&status=&stype=1&supNo=" + vendorNo ;

		return basicTemplate;
	}


	public Orders grabSingleOrders(String start, String end) {

		return null;
	}

	public ResponseVo postDataToWebService(String start, String end, AutomaticJob job) {

		ResponseVo responseVo = ResponseVo.newResponse();
		
		List<Orders> orders;
		try {
			
			//Grab data from UI 
			orders = grabOrders(start, end, job);
			
			if (orders == null || orders.size() == 0) {
				return ResponseVo.newSuccessMessage("没有发现需要采集的数据");
			}
			
			//composite data
			String data = compositeOrderToXml(orders, job);
			
			String url = job.getClientIp() + job.getClientEnd();
			
			//send ws
			HttpResponse response = postWebService(url, data);
			
			HttpEntity httpEntity = response.getEntity();
			String responseText = null;
			if (httpEntity != null) {
				responseText = EntityUtils.toString(httpEntity);
			}
			
			if (response.getStatusLine().getStatusCode() >= 200) {
				//XMLSerializer xmlSerializer = new XMLSerializer();
				//xmlSerializer.read(responseText)
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
