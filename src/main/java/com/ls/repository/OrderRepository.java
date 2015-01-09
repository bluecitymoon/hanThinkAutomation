package com.ls.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.ls.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> , JpaSpecificationExecutor<Order>{
	Order findByOrderNumberAndStoreNumber(String orderNumber, String storeNumber);
	Order findByOrderNumberAndAddress(String orderNumber, String address);
	Order findByOrderNumber(String orderNumber);
}
