package com.ls.service.impl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.List;

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

}
