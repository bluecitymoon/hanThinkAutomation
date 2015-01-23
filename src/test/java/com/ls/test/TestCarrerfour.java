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
public class TestCarrerfour {

	@Resource(name = "carrefourAutomationService")
	private AuthanAutomationService carrefourAutomationService;

	@Autowired
	private AutomaticJobRepository automaticJobRepository;

	@Test
	public void testGrabOrders() throws Exception {

		AutomaticJob automaticJob = automaticJobRepository.findOne(5);
		List<Orders> orders = carrefourAutomationService.grabOrders("2015-01-23", "2015-01-23", automaticJob);

	}

	@Test
	public void testWholeProcess() throws Exception {

		AutomaticJob automaticJob = automaticJobRepository.findOne(5);

		carrefourAutomationService.postDataToWebService("2015-01-15", "2015-01-15", automaticJob);
	}

	@Test
	public void testGrabValidateCode() throws Exception {

		System.out.println(6 / 10);
	}

}
