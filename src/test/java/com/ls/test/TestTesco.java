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
public class TestTesco {

	@Resource(name = "tescoSystemService")
	private AuthanAutomationService metroAutomationService;

	@Autowired
	private AutomaticJobRepository automaticJobRepository;

	@Test
	public void testGrabOrders() throws Exception {

		AutomaticJob automaticJob = automaticJobRepository.findOne(4);

		metroAutomationService.grabOrders("2015-01-01", "2015-01-13", automaticJob);
	}

	@Test
	public void testWholeProcess() throws Exception {

		AutomaticJob automaticJob = automaticJobRepository.findOne(4);

		ResponseVo responseVo = metroAutomationService.postDataToWebService("2015-01-01", "2015-01-13", automaticJob);

		System.out.println(responseVo.toString());
	}
}
