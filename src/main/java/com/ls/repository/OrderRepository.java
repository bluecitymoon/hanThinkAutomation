package com.ls.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.ls.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>, JpaSpecificationExecutor<Order> {

	Order findByOrderNumberAndStoreNumberAndJobId(String orderNumber, String storeNumber, Integer jobId);

	Order findByOrderNumberAndAddress(String orderNumber, String address);

	Order findByOrderNumberAndJobId(String orderNumber, Integer jobId);

	Order findByOrderNumberAndJobIdAndStoreNumberEnglish(String orderNumber, Integer jobId, String storeNumberEnglish);

	Order findByOrderNumberAndStoreNumber(String orderNumber, String storeNumber);
}
