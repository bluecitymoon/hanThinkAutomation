package com.ls.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.ls.entity.AutomaticJob;
import com.ls.repository.AutomaticJobRepository;
import com.ls.service.AuthanAutomationService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestSoSo {

	@Resource(name = "sosoAutomationService")
	private AuthanAutomationService metroAutomationService;

	@Autowired
	private AutomaticJobRepository automaticJobRepository;

	@Test
	public void testGrabOrders() throws Exception {

		AutomaticJob automaticJob = automaticJobRepository.findOne(1);

		metroAutomationService.grabOrders("2014-12-25", "2014-12-25", automaticJob);
	}

	@Test
	public void testGrabValidateCode() throws Exception {

		final WebClient webClient = new WebClient(BrowserVersion.CHROME);
		webClient.getOptions().setCssEnabled(false);
		webClient.getOptions().setThrowExceptionOnScriptError(false);

		String code = metroAutomationService.getCurrentValidateCode(webClient);
		
		System.out.println(metroAutomationService.getCurrentGoodCode());

	}

}
