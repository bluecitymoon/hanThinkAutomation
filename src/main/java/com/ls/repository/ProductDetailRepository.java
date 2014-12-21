package com.ls.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.ls.entity.ProductDetail;

public interface ProductDetailRepository extends JpaRepository<ProductDetail, Integer> , JpaSpecificationExecutor<ProductDetail>{

	List<ProductDetail> findByOrderId(Integer orderId);
}
