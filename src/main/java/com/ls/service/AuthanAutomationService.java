package com.ls.service;

import java.util.List;

import com.ls.entity.AutomaticJob;
import com.ls.exception.ConfigurationException;
import com.ls.vo.Orders;
import com.ls.vo.ResponseVo;

public interface AuthanAutomationService {
	
	public Orders grabSingleOrders(String start, String end);
	
	public List<Orders> grabOrders(String start, String end, String dbName) throws ConfigurationException;
	
	public ResponseVo postDataToWebService(String start, String end, String dbName);
	
	public AutomaticJob getJobByDbName(String dbName);
}
