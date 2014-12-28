package com.ls.service.impl;

import java.io.IOException;
import java.util.List;

import com.gargoylesoftware.htmlunit.WebClient;
import com.ls.entity.AutomaticJob;
import com.ls.entity.Order;
import com.ls.exception.ConfigurationException;
import com.ls.service.AuthanAutomationService;
import com.ls.vo.Orders;
import com.ls.vo.ResponseVo;

import freemarker.template.TemplateException;

public abstract class AbstractAuthanAutomationService implements AuthanAutomationService {

	@Override
	public Orders grabSingleOrders(String start, String end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Orders> grabOrders(String start, String end, AutomaticJob dbName) throws ConfigurationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseVo postDataToWebService(String start, String end, AutomaticJob job) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String compositeOrderToXml(List<Orders> orders, AutomaticJob automaticJob) throws IOException, TemplateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseVo startupJobManually(String start, String end, AutomaticJob automaticJob) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> saveOrders(List<Orders> orders) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteJob(AutomaticJob automaticJob) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveOrUpdateJob(AutomaticJob automaticJob) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getCurrentGoodCode() {
		// TODO Auto-generated method stub
		return null;
	}

}
