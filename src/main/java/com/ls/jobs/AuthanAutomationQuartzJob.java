package com.ls.jobs;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.http.client.ClientProtocolException;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.ls.exception.ConfigurationException;
import com.ls.service.AuthanAutomationService;

import freemarker.template.TemplateException;

public class AuthanAutomationQuartzJob implements Job {

	private AuthanAutomationService authanAutzmationService;

	public void execute(JobExecutionContext context) throws JobExecutionException {

		try {
			authanAutzmationService = (AuthanAutomationService) context.getJobDetail().getJobDataMap().get("authanAutomationService");

			String content = authanAutzmationService.postDataToWebService("2014-11-4", "2014-11-4", "测试帐套");
			System.out.println(content);

		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TemplateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
