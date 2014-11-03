package com.ls.jobs;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.charset.Charset;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Test;

import com.google.common.io.Files;

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

}
