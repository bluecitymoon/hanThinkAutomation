package com.ls.service;

import java.io.IOException;
import java.util.List;

import com.ls.entity.AutomaticJob;
import com.ls.entity.Order;
import com.ls.exception.ConfigurationException;
import com.ls.vo.Orders;
import com.ls.vo.ResponseVo;

import freemarker.template.TemplateException;

public interface AuthanAutomationService {
	
	public Orders grabSingleOrders(String start, String end);
	
	public List<Orders> grabOrders(String start, String end, AutomaticJob dbName) throws ConfigurationException;
	
	public ResponseVo postDataToWebService(String start, String end, AutomaticJob job);
	
	public String compositeOrderToXml(List<Orders> orders, AutomaticJob automaticJob) throws IOException, TemplateException;
	
	ResponseVo startupJobManually(String start, String end, AutomaticJob automaticJob);
	
	List<Order> saveOrders(List<Orders> orders);
	
	void deleteJob(AutomaticJob automaticJob);
	void saveOrUpdateJob(AutomaticJob automaticJob);
	
}
