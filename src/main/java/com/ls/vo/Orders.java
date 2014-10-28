package com.ls.vo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Orders {
	
	private Map<String, String> orderTitleMap = new HashMap<String, String>();
	private List<Map<String, String>> ordersItemList = new ArrayList<Map<String,String>>();
	
	public Map<String, String> getOrderTitleMap() {
	
		return orderTitleMap;
	}
	
	public void setOrderTitleMap(Map<String, String> orderTitleMap) {
	
		this.orderTitleMap = orderTitleMap;
	}
	
	public List<Map<String, String>> getOrdersItemList() {
	
		return ordersItemList;
	}
	
	public void setOrdersItemList(List<Map<String, String>> ordersItemList) {
	
		this.ordersItemList = ordersItemList;
	}
	
}
