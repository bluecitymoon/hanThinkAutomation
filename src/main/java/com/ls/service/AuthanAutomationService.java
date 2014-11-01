package com.ls.service;

import java.util.List;

import com.ls.exception.ConfigurationException;
import com.ls.vo.Orders;

public interface AuthanAutomationService {
	
	public Orders grabSingleOrders(String start, String end);
	
	public List<Orders> grabOrders(String start, String end) throws ConfigurationException;
}
