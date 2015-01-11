package com.ls.service;

import java.util.Collection;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ls.entity.Order;

public interface DataManagementService {
	
	Page<Order> loadOrderInPage(Integer jobId, Pageable pageable);
	
	void removeOrders(Collection<Integer> orders);
}
