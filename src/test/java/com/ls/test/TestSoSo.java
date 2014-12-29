package com.ls.test;

import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.google.common.base.Strings;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.ls.entity.AutomaticJob;
import com.ls.repository.AutomaticJobRepository;
import com.ls.service.AuthanAutomationService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestSoSo {

	@Resource(name = "sosoAutomationService")
	private AuthanAutomationService metroAutomationService;

	@Autowired
	private AutomaticJobRepository automaticJobRepository;

	@Test
	public void testGrabOrders() throws Exception {

		AutomaticJob automaticJob = automaticJobRepository.findOne(1);

		metroAutomationService.grabOrders("2014-12-25", "2014-12-25", automaticJob);
	}

	@Test
	public void testWholeProcess() throws Exception {

		AutomaticJob automaticJob = automaticJobRepository.findOne(1);
		
		metroAutomationService.postDataToWebService("2014-12-27", "2014-12-27", automaticJob);
	}
	
	@Test
	public void testGrabValidateCode() throws Exception {

		System.out.println(6 / 10);
	}

	@Test
	public void testLogin() throws Exception {
		
		AutomaticJob automaticJob = new AutomaticJob();
		automaticJob.setUsername("admin");
		automaticJob.setPassword("admin");
		
		metroAutomationService.grabOrders("2014-12-26", "2014-12-28", automaticJob);
	}
	
	@Test
	public void testParseJson() throws Exception {
		
		String fileName = "D:\\workspace\\hanThinkAutomation\\src\\main\\java\\com\\ls\\service\\impl\\test.js";
		String text = Files.toString(new File(fileName), Charset.defaultCharset());
		
		List<Map<String, String>> ordersItemList = parseDetails(text, "123");
		
		System.out.println(ordersItemList);
		
	}
	
	private List<Map<String, String>> parseDetails(String context, String orderNumber) {

		
		List<Map<String, String>> ordersItemList = new ArrayList<Map<String,String>>();
		
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
			
			itemMap.put("description", detailObject.getString("CELL3") == null ? "" : detailObject.getString("CELL3"));
			itemMap.put("count", detailObject.getString("CELL4") == null ? "" : detailObject.getString("CELL4"));
			itemMap.put("moneyAmount", detailObject.getString("CELL7") == null ? "" : detailObject.getString("CELL7"));
			itemMap.put("orderNumber", orderNumber);
			
			ordersItemList.add(itemMap);
		}
		return ordersItemList;
		
	
	}
}
