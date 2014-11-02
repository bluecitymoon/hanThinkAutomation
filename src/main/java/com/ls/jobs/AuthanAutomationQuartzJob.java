package com.ls.jobs;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Service;

@Service("authanAutomationQuartzJob")
public class AuthanAutomationQuartzJob extends QuartzJobBean implements ApplicationContextAware {
	private ApplicationContext applicationContext = null;
	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		System.out.println("OH come on");

	}

	@Override
	public void setApplicationContext(ApplicationContext ApplicationContext) throws BeansException {
		this.applicationContext = ApplicationContext;
	}

}
