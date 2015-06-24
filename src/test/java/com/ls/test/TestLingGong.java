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
import com.ls.vo.ResponseVo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestLingGong {

	@Resource(name = "LinggongAutomationService")
	private AuthanAutomationService rtmarketAutomationService;

	@Autowired
	private AutomaticJobRepository automaticJobRepository;

	@Test
	public void testGrabOrders() throws Exception {

		//AutomaticJob automaticJob = automaticJobRepository.findOne(34);
		AutomaticJob automaticJob = automaticJobRepository.findOne(24);
		rtmarketAutomationService.grabOrders("2015-06-20", "2015-06-20", automaticJob);
	}

	
	@Test
	public void testGrabStorageInformation() throws Exception {

		AutomaticJob automaticJob = automaticJobRepository.findOne(25);
		rtmarketAutomationService.grabStorageInformation("2015-06-20", "2015-06-20", automaticJob);
	}
	
	@Test
	public void testWholeProcess() throws Exception {

		//AutomaticJob automaticJob = automaticJobRepository.findOne(34);

		AutomaticJob automaticJob = automaticJobRepository.findOne(24);
		ResponseVo responseVo = rtmarketAutomationService.postDataToWebService("2015-06-18", "2015-06-20", automaticJob);

		System.out.println(responseVo.toString());
	}
}
