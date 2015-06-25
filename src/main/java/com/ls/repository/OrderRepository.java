package com.ls.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.ls.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>, JpaSpecificationExecutor<Order> {

	Order findByOrderNumberAndStoreNumberAndJobId(String orderNumber, String storeNumber, Integer jobId);

	Order findByOrderNumberAndAddress(String orderNumber, String address);

	List<Order> findByOrderNumberAndJobId(String orderNumber, Integer jobId);

	Order findByOrderNumberAndJobIdAndStoreNumberEnglish(String orderNumber, Integer jobId, String storeNumberEnglish);

	Order findByOrderNumberAndStoreNumber(String orderNumber, String storeNumber);

	Order findByStoreNumberAndJobIdAndOrderDate(String address, Integer jobId, String orderNumber);
}
