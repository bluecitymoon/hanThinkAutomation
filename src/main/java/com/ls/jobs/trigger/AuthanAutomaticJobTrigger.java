package com.ls.jobs.trigger;

import java.util.Date;

import org.quartz.JobDetail;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.scheduling.quartz.SimpleTriggerBean;

import com.ls.constants.AuthanConstants;
import com.ls.entity.AutomaticJob;
import com.ls.jobs.AuthanAutomationQuartzJob;
import com.ls.repository.AutomaticJobRepository;

public class AuthanAutomaticJobTrigger extends SimpleTriggerBean implements ApplicationContextAware{
	private ApplicationContext applicationContext = null;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private AutomaticJobRepository automaticJobRepository;

	public AuthanAutomaticJobTrigger() {
		super();
		automaticJobRepository = applicationContext.getBean(AutomaticJobRepository.class);
		
		AutomaticJob authanJob = automaticJobRepository.findByType(AuthanConstants.AUTHAN);

		setRepeatInterval(authanJob.getRestartInHours());
		JobDetail jobDetail = new JobDetail();
		jobDetail.setJobClass(AuthanAutomationQuartzJob.class);
		jobDetail.setName(authanJob.getName());

		setStartDelay(1000);
		setStartTime(new Date());

		setJobDetail(jobDetail);

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
}
