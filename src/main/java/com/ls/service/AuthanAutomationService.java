package com.ls.service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.List;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.ls.entity.AutomaticJob;
import com.ls.entity.Order;
import com.ls.exception.ConfigurationException;
import com.ls.vo.Orders;
import com.ls.vo.ResponseVo;

import freemarker.template.TemplateException;

public interface AuthanAutomationService {

	public List<Orders> grabOrders(String start, String end, AutomaticJob dbName) throws ConfigurationException, FailingHttpStatusCodeException, MalformedURLException, IOException, URISyntaxException, InterruptedException;

	public ResponseVo postDataToWebService(String start, String end, AutomaticJob job);

	public String compositeOrderToXml(List<Orders> orders, AutomaticJob automaticJob) throws IOException, TemplateException;

	ResponseVo startupJobManually(String start, String end, AutomaticJob automaticJob);

	List<Order> saveOrders(List<Orders> orders, AutomaticJob job);

	void deleteJob(AutomaticJob automaticJob);

	void saveOrUpdateJob(AutomaticJob automaticJob);
	
	/**
	 * Grab database storage information
	 * 
	 * @param startDate
	 * @param endDate
	 * @param automaticJob
	 * 
	 * @return
	 */
	public ResponseVo grabStorageInformation(String startDate, String endDate, AutomaticJob automaticJob);
	
	/**
	 * 
	 * @param startDate
	 * @param endDate
	 * @param automaticJob
	 * @return
	 */
	public ResponseVo grabReceivingReport(String startDate, String endDate, AutomaticJob automaticJob);
	
	/**
	 * 
	 * @param startDate
	 * @param endDate
	 * @param automaticJob
	 * @return
	 */
	public ResponseVo grabReturnedOrder(String startDate, String endDate, AutomaticJob automaticJob);
}
