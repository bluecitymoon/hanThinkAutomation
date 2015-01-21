package com.ls.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ls.entity.AutomaticJob;
import com.ls.repository.AutomaticJobRepository;
import com.ls.service.AuthanAutomationService;
import com.ls.vo.Orders;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestLianHua {

	@Resource(name = "lianHuaAutomationService")
	private AuthanAutomationService lianHuaAutomationService;

	@Autowired
	private AutomaticJobRepository automaticJobRepository;

	@Test
	public void testGrabOrders() throws Exception {

		AutomaticJob automaticJob = automaticJobRepository.findOne(5);
		// for (int i = 0; i < 10; i++) {
		List<Orders> orders = lianHuaAutomationService.grabOrders("2015-1-20", "2015-1-21", automaticJob);
		System.out.println(orders);
		// }

	}

	@Test
	public void testWholeProcess() throws Exception {

		AutomaticJob automaticJob = automaticJobRepository.findOne(5);

		lianHuaAutomationService.postDataToWebService("2015-01-15", "2015-01-15", automaticJob);
	}

	@Test
	public void testGrabValidateCode() throws Exception {

		System.out.println(6 / 10);
	}

}
