package com.ls.controller;

import org.springframework.stereotype.Component;

import com.google.common.collect.ImmutableMap;
import com.ls.vo.Orders;

@Component("auchanAction")
public class AuchanAutomationAction extends BaseAction {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7537597127706997734L;

	private Orders orders;
	
	public String startManually() {
		
		String manuallyStart = getParameter("manuallyStart");
		String manuallyStop = getParameter("manuallyStop");
		
		orders = new Orders();
		
		orders.setOrderTitleMap(ImmutableMap.of("manuallyStart", manuallyStart));
		//orders.setOrdersItemList(ImmutableList.of(ImmutableMap.of("manuallyStop", manuallyStop)));

		return SUCCESS;
	}

	
	public Orders getOrders() {
	
		return orders;
	}

	
	public void setOrders(Orders orders) {
	
		this.orders = orders;
	}

	
}
