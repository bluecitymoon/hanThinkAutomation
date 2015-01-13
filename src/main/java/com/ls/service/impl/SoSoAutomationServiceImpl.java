package com.ls.service.impl;

import java.io.File;
import java.io.FilenameFilter;
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
import java.util.Set;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
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
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlImage;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlPasswordInput;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;
import com.gargoylesoftware.htmlunit.util.Cookie;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
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
	
	private boolean checkIfOrderNotGrabed(Orders order, Integer jobId) {
		
		Map<String, String> titleMap = order.getOrderTitleMap();
		String orderNumber = titleMap.get("orderNumber");
		String address = titleMap.get("address");
		
		Order existedOrder = orderRepository.findByOrderNumberAndJobId(orderNumber, jobId);
		
		return existedOrder == null;
	}

	public List<Orders> grabOrders(String start, String end, AutomaticJob authanJob) throws ConfigurationException, FailingHttpStatusCodeException, MalformedURLException, IOException, URISyntaxException, InterruptedException {

		List<Orders> ordersList = Lists.newArrayList();

		if (null == authanJob) {
			logger.error("configuration for job authan is not good.");
			throw new ConfigurationException();
		}
		
		if (StringUtils.isEmpty(authanJob.getCompanyCode())) {
			
			throw new ConfigurationException("未配置企业代码");
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

				int pageCount = totalCount / 10;

				for (int index = 1; index <= pageCount + 1; index++) {

					String retrievingDataUrl = getOrdersListRequestUrl + getQueryParameters(start, end) + "&page=" + index;
					
					String responseData = webClient.getPage(retrievingDataUrl).getWebResponse().getContentAsString();

					JSONArray dataArray = JSONObject.fromObject(responseData).getJSONArray("rows");
					
					Object[] orderListArray = dataArray.toArray();

					for (Object singleOrder : orderListArray) {

						Orders order = new Orders();
						ObjectMapper objectMapper = new ObjectMapper();

						HashMap<String, String> titleMap = objectMapper.readValue(singleOrder.toString(), new TypeReference<HashMap<String, String>>(){});
						order.setOrderTitleMap(titleMap);

						String orderNumber = titleMap.get("CELL0");
						String orderDate = titleMap.get("CREATEON");
						String address = titleMap.get("CELL3");
						String estimateTakeOverDate = titleMap.get("CELL2");
						
						titleMap.put("orderNumber", toEmpty(orderNumber));
						titleMap.put("orderDate",  toEmpty(orderDate));
						titleMap.put("address",  toEmpty(address));
						titleMap.put("estimateTakeOverDate",  toEmpty(estimateTakeOverDate));
						
						if (checkIfOrderNotGrabed(order, authanJob.getId())) {
							
							String detailBaseUrl = "http://report.sosgps.net.cn/report-1.0/order/getPopupDynamicPageData.do?code=13836306053711&linkField=v30_bd_order.code&linkFieldValue=" + orderNumber;
							
							Page detailPage = webClient.getPage(detailBaseUrl);

							List<Map<String, String>> ordersItemList = parseDetails(detailPage.getWebResponse().getContentAsString(), orderNumber);
							order.setOrdersItemList(ordersItemList);

							ordersList.add(order);
						}
					}

				}

			}

			Date endTime = new Date();
			authanJob.setLastGrabEnd(AuthanConstants.HANTHINK_TIME_FORMATTER.format(endTime));

			automaticJobRepository.saveAndFlush(authanJob);

		}  finally {
			
			String ocrInstallPath = HanthinkProperties.getString("tessertOcrInstallPath");
			
			System.out.println(ocrInstallPath);
			
			File[] filesNeedToBeDeleted = new File(ocrInstallPath).listFiles(new FilenameFilter(){
				public boolean accept(File dir, String name) {
					
					if (name.endsWith("txt") || name.endsWith("jpg")) {
						return true;
					}
					return false;
				}
			});
			
			for (File file : filesNeedToBeDeleted) {
				file.delete();
			}
		}
		return ordersList;
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

			itemMap.put("description",  toEmpty(detailObject.getString("CELL3")));
			itemMap.put("count",  toEmpty(detailObject.getString("CELL4")));
			
			itemMap.put("moneyAmount",  toEmpty(detailObject.getString("CELL7")));
			
			itemMap.put("orderNumber",  toEmpty(orderNumber));
			
			String giftName = detailObject.getString("CELL5");
			String giftCount = detailObject.getString("CELL6");
			if (StringUtils.isNotBlank(giftName) && !giftName.equals("null")) {
				itemMap.put("giftName", giftName);
			} else {
				itemMap.put("giftName", "");
			}
			if (StringUtils.isNotBlank(giftCount) && !giftCount.equals("null")) {
				itemMap.put("giftCount", giftCount);
			} else {
				itemMap.put("giftCount", "");
			}

			ordersItemList.add(itemMap);
		}

		return ordersItemList;

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
		usernameTextInput.setValueAttribute(automaticJob.getUsername());
		passwordField.setValueAttribute(automaticJob.getPassword());

		Set<Cookie> cookies = webClient.getCookieManager().getCookies();
		List<String> keyvaluePairList = Lists.newArrayList();

		for (Cookie cookie : cookies) {
			String keyvaluePair = cookie.getName() + "=" + cookie.getValue();
			keyvaluePairList.add(keyvaluePair);
		}

		String baseCookieValue = Joiner.on(";").join(keyvaluePairList);
		baseCookieValue += ";login_entCode=" + automaticJob.getCompanyCode() + "; login_userName=admin; ENT_CUSTOMIZATION=default_ent";

		String validationCode = generateNewValidationCode(baseCookieValue, webClient);

		validateCodeTextInput.setValueAttribute(validationCode);

		Page responsePage = logInput.click();

		String nextUrl = responsePage.getUrl().toString();

		if (nextUrl.contains("loginAlone.do")) {
			String parameters = nextUrl.split("\\?")[1];
			String reportCenterBase = "http://report.sosgps.net.cn/report-1.0/loginAlone.do?";

			Page reportBasePage = webClient.getPage(reportCenterBase + parameters);

			return reportBasePage.getUrl().toString();

		} else {

			return tryToLogin(webClient, automaticJob);
		}
	}

	public String generateNewValidationCode(String cookies, WebClient webClient) throws FailingHttpStatusCodeException, IOException, InterruptedException {

		String getNewValidationCodeURL = "http://v30.sosgps.net.cn/platform-1.0/systemadmin/validateCode.do?timestamp=" + System.currentTimeMillis();

		String fileName = GrapImgUtil.grabImgWithSrc(getNewValidationCodeURL, cookies);
		Thread.sleep(1000);
		String ocrInstallPath = HanthinkProperties.getString("tessertOcrInstallPath");
		String command = ocrInstallPath + "tesseract.exe " + ocrInstallPath + fileName + ".jpg " + ocrInstallPath + fileName;

		Process process = Runtime.getRuntime().exec(command);
		process.waitFor();

		String code = Files.readFirstLine(new File( ocrInstallPath + fileName + ".txt"), Charset.defaultCharset());
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

		Template template = AuthanConstants.getAnchanConfiguration().getTemplate("soso-request-soap.ftl");

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
			}
			
			System.out.println(responseText);
			
			if (response.getStatusLine().getStatusCode() >= 200) {
				// XMLSerializer xmlSerializer = new XMLSerializer();
				// xmlSerializer.read(responseText)
				saveOrders(orders, job);
			} else {
				return ResponseVo.newFailMessage("发送web service失败。 response code :" + response.getStatusLine().getStatusCode() + " Response Text : " + responseText);
			}

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
			//??!
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
			String address = titleMap.get("address");

			String estimateTakeOverDate = titleMap.get("estimateTakeOverDate");
			String orderDate = titleMap.get("orderDate");

			Order order = new Order();
			order.setOrderNumber(orderNumber);
			order.setAddress(address);
			order.setEstimateTakeOverDate(estimateTakeOverDate);
			order.setOrderDate(orderDate);
			order.setCreateDate(HanthinkUtil.getNow());
			order.setJobId(job.getId());
			order.setJobName(job.getName());

			List<Map<String, String>> detailMap = singleOrder.getOrdersItemList();
			Order savedOrder = null;
			try {
				savedOrder = orderRepository.saveAndFlush(order);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (null == savedOrder) {
				 continue;
			}
			
			for (Map<String, String> singleDetailMap : detailMap) {

				String description = toEmpty(singleDetailMap.get("description"));
				String count = toEmpty(singleDetailMap.get("count"));
				String moneyAmount = toEmpty(singleDetailMap.get("moneyAmount"));
				String giftName = toEmpty(singleDetailMap.get("giftName"));
				String giftCount = toEmpty(singleDetailMap.get("giftCount"));

				ProductDetail productDetail = new ProductDetail();
				productDetail.setOrderId(savedOrder.getId());
				productDetail.setOrderNumber(orderNumber);
				productDetail.setDescription(description);
				productDetail.setCount(count);
				productDetail.setMoneyAmountWithoutTax(moneyAmount);
				productDetail.setGiftCount(giftCount);
				productDetail.setGiftName(giftName);

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
