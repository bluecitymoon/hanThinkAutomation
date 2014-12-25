package com.ls.jobs;

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
public class TestMetro {
	
	@Resource(name = "authanService")
	private AuthanAutomationService authanAutomationService;
	
	
	@Resource(name = "authanOrderSystemService")
	private AuthanAutomationService authanAutomationServiceInOrderSystem;
	
	@Resource(name = "metroAutomationService")
	private AuthanAutomationService metroAutomationService;
	
	@Autowired
	private AutomaticJobRepository automaticJobRepository;
	
	@Test
	public void testGrabOrders() throws Exception {
		
		AutomaticJob automaticJob = automaticJobRepository.findOne(1);
		
		metroAutomationService.grabOrders("2014-12-25", "2014-12-25", automaticJob);
	}
	

}
