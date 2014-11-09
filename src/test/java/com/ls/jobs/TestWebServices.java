package com.ls.jobs;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.SchedulerException;
import org.quartz.impl.triggers.CronTriggerImpl;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import com.google.common.io.Files;
import com.ls.constants.AuthanConstants;
import com.ls.controller.AuchanAutomationAction;
import com.ls.service.AuthanAutomationService;
import com.ls.vo.Orders;

import freemarker.template.Template;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestWebServices {
	
	@Resource(name = "authanService")
	private AuthanAutomationService authanAutomationService;
	
	@Test
	public void testSendXML() throws Exception {

		String xml = Files.toString(new File("D:\\data\\Jerry\\hanThinkAutomation\\src\\main\\resources\\test.xml"), Charset.defaultCharset());

		HttpClient httpClient = HttpClientBuilder.create().build();

		byte[] b = xml.getBytes("utf-8");
		InputStream is = new ByteArrayInputStream(b, 0, b.length);

		HttpPost request = new HttpPost("http://hanthink.gnway.org:88/hanthinkserver/service1.asmx");
		request.setHeader("Content-Type", " text/xml; charset=utf-8");
		request.setEntity(new InputStreamEntity(is));

		HttpResponse response = httpClient.execute(request);

		System.out.println(response.toString());
		System.out.println(response.getStatusLine().getStatusCode());

	}
	

	@Test
	public void testGenerateXML() throws Exception {
		
		String maintableTemplate = new String(AuthanConstants.MAIN_TABLE_TEMPLATE);
		
		maintableTemplate = maintableTemplate.replaceAll("@orderNumber@", "1111");
		maintableTemplate = maintableTemplate.replaceAll("@id@", "111");
		maintableTemplate = maintableTemplate.replaceAll("@date@", "111");
		maintableTemplate = maintableTemplate.replaceAll("@arriveDate@", "111");

		System.out.println(maintableTemplate);
	}
	
	@Test
	public void testAuchanTemplate() throws Exception {
		
		Template template = AuthanConstants.getAnchanConfiguration().getTemplate("src/main/resources/auchan-request-soap.ftl");
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<Orders> orders = new ArrayList<Orders>();
		
		data.put("htUsername", "Admin");
		data.put("htPassword", "E1CCjc7z+m3nmqvYlGnc+LcM8t4=");
		data.put("htDbName", "测试帐套");
		data.put("orders", orders);
		
		for (int i = 0; i < 3; i++) {
			
			Orders order = new Orders();
			
			Map<String, String> title = new HashMap<String, String>();
			title.put("id", "123");
		//	title.put("订单号：", "TESt1");
			title.put("订单日期：", "TESt2");
			title.put("预计收货日期：", "TESt3");
			order.setOrderTitleMap(title);
			
			List<Map<String, String>> productList = new ArrayList<Map<String,String>>();
			order.setOrdersItemList(productList);
			
			for (int j = 0; j < 3; j++) {
				Map<String, String> product = new HashMap<String, String>();
				product.put("id", "123");
				product.put("商品号", "123");
				product.put("商品名称", "123");
				product.put("订单数量", "123");
				product.put("单价", "123");
				product.put("金额", "123");
				product.put("税率", "123");
				productList.add(product);
			}
			orders.add(order);
		}
		String output = FreeMarkerTemplateUtils.processTemplateIntoString(template, data);
		System.out.println(output);
		
	}
	
	
	@Test
	public void testSendData() throws Exception {
		
		//AuthanAutomationService authanAutomationService = new AuthanAutomationServiceImpl();
		//String code = authanAutomationService.postDataToWebService("2014-11-3", "2014-11-6");
		//System.out.println(code);
		
	}
	
	@Test
	public void testAuchanTrigger() throws Exception {
		
		AuchanAutomationAction action = new AuchanAutomationAction();
		System.out.println(action.startupJob());
		
	}
	
	@Test
	public void testTrigger() {
		
		JobDetail jobDetail = JobBuilder.newJob(AuthanAutomationQuartzJob.class).withIdentity("key1", "").build();
		CronTriggerImpl singleTrigger = (CronTriggerImpl) CronScheduleBuilder.dailyAtHourAndMinute(12, 11).build();
		singleTrigger.setName("");
		
		try {
			AutomaticJobManager.getScheduler().scheduleJob(jobDetail, singleTrigger);
		} catch (SchedulerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
