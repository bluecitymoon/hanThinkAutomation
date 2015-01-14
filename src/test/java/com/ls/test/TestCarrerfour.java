package com.ls.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ls.entity.AutomaticJob;
import com.ls.repository.AutomaticJobRepository;
import com.ls.service.AuthanAutomationService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestCarrerfour {

	@Resource(name = "carrefourAutomationService")
	private AuthanAutomationService carrefourAutomationService;

	@Autowired
	private AutomaticJobRepository automaticJobRepository;

	@Test
	public void testGrabOrders() throws Exception {

		AutomaticJob automaticJob = automaticJobRepository.findOne(4);
		//for (int i = 0; i < 10; i++) {
			carrefourAutomationService.grabOrders("2014-12-27", "2014-12-27", automaticJob);
		//}
		
	}

	@Test
	public void testWholeProcess() throws Exception {

		AutomaticJob automaticJob = automaticJobRepository.findOne(2);
		
		carrefourAutomationService.postDataToWebService("2014-12-27", "2014-12-27", automaticJob);
	}
	
	@Test
	public void testGrabValidateCode() throws Exception {

		System.out.println(6 / 10);
	}

	
}
