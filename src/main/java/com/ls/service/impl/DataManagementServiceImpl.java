package com.ls.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.ls.entity.AutomaticJob;
import com.ls.entity.Order;
import com.ls.entity.ProductDetail;
import com.ls.entity.User;
import com.ls.repository.AutomaticJobRepository;
import com.ls.repository.OrderRepository;
import com.ls.repository.ProductDetailRepository;
import com.ls.repository.UserRepository;
import com.ls.service.DataManagementService;
import com.ls.util.HanthinkUtil;

@Service("dataManagementService")
public class DataManagementServiceImpl implements DataManagementService {
	
	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	ProductDetailRepository productDetailRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	AutomaticJobRepository automaticJobRepository;

	public Page<Order> loadOrderInPage(Integer jobId, Pageable pageable) {
		
		return orderRepository.findAll(generateSpecification(jobId), pageable);
	}

	private Specification<Order> generateSpecification(final Integer jobId) {

		return new Specification<Order>() {

			public Predicate toPredicate(Root<Order> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {

				query.distinct(true);

				Predicate predicate = criteriaBuilder.conjunction();

				javax.persistence.criteria.Order createDateOrder = criteriaBuilder.desc(root.get("createDate"));
				//javax.persistence.criteria.Order starOrder = criteriaBuilder.desc(root.get("star"));
				
				if (jobId != null) {
					predicate.getExpressions().add(criteriaBuilder.equal(root.get("jobId"), jobId));
				} else {
					User currentUser = userRepository.findByUsername(HanthinkUtil.getCurrentUserName());
					boolean isAdmin = HanthinkUtil.checkIfUserIsAdmin(currentUser);
					
					if (!isAdmin) {
						
						//normal user only show his own data
						List<AutomaticJob> jobList = automaticJobRepository.findByOwnerId(currentUser.getId());
						
						System.out.println(jobList);
						
						List<Integer> idList = Lists.newArrayList();
						for (AutomaticJob job : jobList) {
							idList.add(job.getId());
						}
						
						if (idList.isEmpty()) {
							throw new RuntimeException("没有数据");
						}
						
						predicate.getExpressions().add(root.get("jobId").in(idList));
					}
				}

				List<javax.persistence.criteria.Order> orders = ImmutableList.of(createDateOrder/*, starOrder*/);

				query.orderBy(orders);

				return predicate;
			}
		};

	}

	@Secured({"ROLE_ADMIN", "ROLE_CUSTOMER"})
	public void removeOrders(Collection<Integer> orders) {
		
		List<Integer> orderList = new ArrayList(orders);
		
		for (Integer orderId : orderList) {
			
			orderRepository.delete(orderId);
			
			List<ProductDetail> productDetails = productDetailRepository.findByOrderId(orderId);
			productDetailRepository.deleteInBatch(productDetails);
		}
		
	}
}
