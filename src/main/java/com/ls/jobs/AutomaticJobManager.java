package com.ls.jobs;

import java.util.HashMap;
import java.util.Set;

import org.quartz.JobBuilder;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.matchers.GroupMatcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ls.constants.AuthanConstants;
import com.ls.entity.AutomaticJob;
import com.ls.repository.AutomaticJobRepository;
import com.ls.service.AuthanAutomationService;

public class AutomaticJobManager {
	private static Logger logger = LoggerFactory.getLogger(AutomaticJobManager.class);

	public static AutomaticJobManager _instance;

	private AuthanAutomationService authanAutomationService;
	
	private HashMap<String, JobDetail> jobDetailMap = new HashMap<String, JobDetail>();
	
	private static Scheduler scheduler;
	
	private AutomaticJobManager() {
		if (null == scheduler) {
			try {
				scheduler = new StdSchedulerFactory().getScheduler();
				
				scheduler.start();
			} catch (SchedulerException e) {
				logger.error("can't create schedular." + e.getMessage());
				
			}
		}
	}

	public static AutomaticJobManager getInstance() {

		if (null == _instance) {
			_instance = new AutomaticJobManager();
		}

		return _instance;
	}

	/*
	 * 
	 */
	public void startUpJob(String dbName, AutomaticJobRepository jobRepository) {
		try {
			Set<JobKey> jobKeys = getScheduler().getJobKeys(GroupMatcher.jobGroupEquals(AuthanConstants.AUTHAN));
			
			JobKey key = new JobKey(dbName);
			
			if (!jobKeys.contains(key)) {
				
				JobDataMap jobDataMap = new JobDataMap();
				jobDataMap.put("authanAutomationService", getAuthanAutomationService());
				
				AutomaticJob automaticJob = jobRepository.findByTypeAndDbName(AuthanConstants.AUTHAN, dbName);
				
				if (automaticJob != null) {
					
					if (!getJobDetailMap().containsKey(dbName)) {
						JobDetail jobDetail = JobBuilder.newJob(AuthanAutomationQuartzJob.class).usingJobData(jobDataMap).withIdentity(dbName, AuthanConstants.AUTHAN).build();
						getJobDetailMap().put(dbName, jobDetail);
					}
				}
			}
		} catch (SchedulerException e) {
			e.printStackTrace();
		}
	}
	public AuthanAutomationService getAuthanAutomationService() {
		return authanAutomationService;
	}

	public void setAuthanAutomationService(AuthanAutomationService authanAutomationService) {
		this.authanAutomationService = authanAutomationService;
	}

	public HashMap<String, JobDetail> getJobDetailMap() {
		return jobDetailMap;
	}

	public void setJobDetailMap(HashMap<String, JobDetail> jobDetailMap) {
		this.jobDetailMap = jobDetailMap;
	}

	public static Scheduler getScheduler() {
		if (null == scheduler) {
			try {
				scheduler = new StdSchedulerFactory().getScheduler();
			} catch (SchedulerException e) {
				logger.error("can't create schedular." + e.getMessage());
				
				return null;
			}
			try {
				scheduler.start();
			} catch (SchedulerException e) {
				
				logger.error("Starting schedular failed." + e.getMessage());
				return null;
				
			}
		}
		return scheduler;
	}
	
}
