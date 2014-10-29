package com.ls.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.ls.service.AuthanAutomationService;
import com.ls.vo.Orders;

@Component("auchanAction")
public class AuchanAutomationAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7537597127706997734L;

	private List<Orders> orders;

	@Resource(name = "authanService")
	private AuthanAutomationService authanAutomationService;

	public String startManually() {

		String manuallyStart = getParameter("manuallyStart");
		String manuallyStop = getParameter("manuallyStop");

		orders = authanAutomationService.grabOrders(manuallyStart, manuallyStop);

		return SUCCESS;
	}

	public List<Orders> getOrders() {

		return orders;
	}

	public void setOrders(List<Orders> orders) {

		this.orders = orders;
	}

}
