package com.ls.service.impl;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.ls.entity.AutomaticJob;
import com.ls.exception.ConfigurationException;
import com.ls.repository.AutomaticJobRepository;
import com.ls.service.AuthanAutomationService;
import com.ls.vo.Orders;
import com.ls.vo.ResponseVo;

import freemarker.template.TemplateException;

public abstract class AbstractAuthanAutomationService implements AuthanAutomationService {

	@Autowired
	private AutomaticJobRepository automaticJobRepository;

	public abstract List<Orders> grabOrders(String start, String end, AutomaticJob dbName) throws ConfigurationException, FailingHttpStatusCodeException, MalformedURLException, IOException, URISyntaxException, InterruptedException;

	public abstract ResponseVo postDataToWebService(String start, String end, AutomaticJob job);

	public abstract String compositeOrderToXml(List<Orders> orders, AutomaticJob automaticJob) throws IOException, TemplateException;

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
	
	public ResponseVo handleResponse(String soapMessage) {
		
		if (StringUtils.isEmpty(soapMessage) || !soapMessage.contains("daorudanjuResult")) {
			
			return ResponseVo.newFailMessage("无法处理的SOAP返回消息 --> " + soapMessage);
			
		}
		String[] splitResult = soapMessage.split("daorudanjuResult");
		
		if (splitResult.length == 2) {
			
			return ResponseVo.newSuccessMessage("采集成功");
		} else if (splitResult.length == 3) {
			return ResponseVo.newFailMessage("SOAP处理失败，" + splitResult[1].replace("<", "").replace(">", ""));
		} else {
			
			return ResponseVo.newSuccessMessage(soapMessage);
		}
		
	}
}
