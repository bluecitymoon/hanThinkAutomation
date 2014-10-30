package com.ls.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.json.JSONException;
import org.apache.struts2.json.JSONUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ls.entity.AutomaticJob;
import com.ls.repository.AutomaticJobRepository;
import com.ls.service.AuthanAutomationService;
import com.ls.vo.Orders;
import com.sun.tools.internal.ws.processor.model.Request;

@Component("auchanAction")
public class AuchanAutomationAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7537597127706997734L;

	private List<Orders> orders;
	
	private AutomaticJob automaticJob;
	
	@Autowired
	private AutomaticJobRepository automaticJobRepository;

	@Resource(name = "authanService")
	private AuthanAutomationService authanAutomationService;

	public String startManually() {

		String manuallyStart = getParameter("manuallyStart");
		String manuallyStop = getParameter("manuallyStop");

		orders = authanAutomationService.grabOrders(manuallyStart, manuallyStop);

		return SUCCESS;
	}
	
	public String readConfiguration() {
		
		automaticJob = automaticJobRepository.findByType("authan");
		
		return SUCCESS;
	}

	public String saveAutomaticJob() {
		try {
			AutomaticJob job = (AutomaticJob)JSONUtil.deserialize(getParameter("job"));
			automaticJob = automaticJobRepository.save(job);
			
		} catch (JSONException e) {
			return ERROR;
		}
		
		
		return SUCCESS;
	}
	public List<Orders> getOrders() {

		return orders;
	}

	public void setOrders(List<Orders> orders) {

		this.orders = orders;
	}

	
	public AutomaticJob getAutomaticJob() {
	
		return automaticJob;
	}

	
	public void setAutomaticJob(AutomaticJob automaticJob) {
	
		this.automaticJob = automaticJob;
	}

}
