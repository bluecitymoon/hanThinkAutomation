package com.ls.controller;

import java.util.Collection;
import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JSONArray;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import com.google.common.collect.Lists;
import com.ls.entity.Order;
import com.ls.entity.ProductDetail;
import com.ls.repository.ProductDetailRepository;
import com.ls.service.DataManagementService;
import com.ls.vo.PagedElement;
import com.ls.vo.ResponseVo;

@Component("consoleAction")
@Scope("prototype")
public class DataConsoleAction extends BaseAction {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5826518690403293194L;

	private PagedElement<Order> orders;

	private List<ProductDetail> productDetails;
	@Autowired
	private ProductDetailRepository productDetailRepository;
	
	@Resource(name = "dataManagementService")
	private DataManagementService dataManagementService;
	
	public String getAllGrabData() {

		String currentIndexString = getParameter("currentIndex");
		if (StringUtils.isEmpty(currentIndexString)) {
			currentIndexString = "1";
		}

		String selectedTaskId = getParameter("selectedTaskId");
		Integer jobId = null;

		if (StringUtils.isNotBlank(selectedTaskId)) {
			jobId = Integer.valueOf(selectedTaskId);

		}

		PageRequest pageRequest = new PageRequest(Integer.valueOf(currentIndexString), 50);

		Page<Order> ordersResult = dataManagementService.loadOrderInPage(jobId, pageRequest);

		orders = new PagedElement<Order>(ordersResult);

		return SUCCESS;
	}

	public String showProductDetailsByOrderId() {

		String orderId = getParameter("orderIdSelected");

		if (StringUtils.isNotBlank(orderId)) {
			productDetails = productDetailRepository.findByOrderId(Integer.valueOf(orderId));
		} else {
			productDetails = Lists.newArrayList();
		}

		return SUCCESS;
	}
	
	public String removeOrders() {
		
		String orderIdList = getParameter("orderIdList");
		
		if (StringUtils.isNotBlank(orderIdList)) {
			
			JSONArray jsonArray = JSONArray.fromObject(orderIdList);
			
			Collection<Integer> orderIdCollection = jsonArray.toCollection(jsonArray);
			
			dataManagementService.removeOrders(orderIdCollection);
			
			setResponse(ResponseVo.newSuccessMessage("删除成功。"));
			
		} else {
			
			setResponse(ResponseVo.newFailMessage("没有提交任何数据可删"));
			
			return SUCCESS;
		}
		
		return SUCCESS;
	}

	public PagedElement<Order> getOrders() {
		return orders;
	}

	public void setOrders(PagedElement<Order> orders) {
		this.orders = orders;
	}

	public List<ProductDetail> getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(List<ProductDetail> productDetails) {
		this.productDetails = productDetails;
	}

	public DataManagementService getDataManagementService() {
		return dataManagementService;
	}

	public void setDataManagementService(DataManagementService dataManagementService) {
		this.dataManagementService = dataManagementService;
	}
	
	
}