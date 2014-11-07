package com.ls.jobs;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class AuthanAutomationQuartzJob implements Job {

	public void execute(JobExecutionContext context) throws JobExecutionException {

		System.out.println("something");

	}

}
