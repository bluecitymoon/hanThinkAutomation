package com.ls.jobs;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONObject;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Test;

import com.google.common.io.Files;
import com.ls.vo.Zhubiao;
import com.ls.vo.Zibiao;

public class TestWebServices {

	@Test
	public void testGrabCompanyList() throws Exception {
		
		String xml = Files.toString(new File("D:\\workspace\\hanThinkAutomation\\src\\main\\resources\\test.xml"), Charset.defaultCharset());
		
		HttpClient httpClient = HttpClientBuilder.create().build();
		
		byte[] b = xml.getBytes("utf-8");
		InputStream is = new ByteArrayInputStream(b,0,b.length);
		
		HttpPost request = new HttpPost("http://hanthink.gnway.org:88/hanthinkserver/service1.asmx");
		
		request.setEntity(new InputStreamEntity(is));
		
		HttpResponse response = httpClient.execute(request);
		
		System.out.println(response.toString());
	}
	

	@Test
	public void testSendJson() throws Exception {
		
		Zhubiao zhubiao = new Zhubiao();
		zhubiao.setChangbian("Test");
		zhubiao.setDaohuoriqi("2014-11-1");
		zhubiao.setDizhi("Test");
		zhubiao.setId("122");
		zhubiao.setKehudanhao("test");
		zhubiao.setRiqi("Test");
		
		List<Zibiao> zibiaoList = new ArrayList<Zibiao>();
		Zibiao zibiao = new Zibiao();
		zibiao.setBuhanshuidanjia("12333");
		zibiao.setZhubiaoid("12333");
		zibiao.setHuohao("12333");
		zibiao.setTiaoxingma("12333");
		zibiao.setShuliang("12333");
		zibiao.setHuansuanlv1("12333");
		zibiao.setXiangshu("12333");
		zibiao.setHanshuijine("12333");
		zibiao.setHanshuidanjia("12333");
		zibiao.setBuhanshuijine("12333");
		zibiao.setShuilv("12333");
		zibiaoList.add(zibiao);
		
		zhubiao.setZibiaoList(zibiaoList);
		
		
		JSONObject object = JSONObject.fromObject(zhubiao);
		System.out.println(object.toString());
		String xml = Files.toString(new File("D:\\workspace\\hanThinkAutomation\\src\\main\\resources\\test.xml"), Charset.defaultCharset());
		System.out.println(xml);
		HttpClient httpClient = HttpClientBuilder.create().build();
		
		byte[] b = xml.getBytes("utf-8");
		InputStream is = new ByteArrayInputStream(b,0,b.length);
		
		HttpPost request = new HttpPost("http://hanthink.gnway.org:88/hanthinkserver/service1.asmx");
		
		request.setEntity(new InputStreamEntity(is));
		
		HttpResponse response = httpClient.execute(request);
		
		System.out.println(response.toString());
	}
	 	
}
