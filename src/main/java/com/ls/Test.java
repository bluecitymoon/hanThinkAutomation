package com.ls;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.ScheduleBuilder;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

import com.ls.jobs.AuthanAutomationQuartzJob;

public class Test {

	public static void main(String[] args) {

		try {

			JobDetail jobDetail = JobBuilder.newJob(AuthanAutomationQuartzJob.class).withIdentity("authan").build();

			ScheduleBuilder<?> simpleScheduleBuilder = SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(1).repeatForever();

			Trigger trigger = TriggerBuilder.newTrigger().withSchedule(simpleScheduleBuilder).build();

			Scheduler scheduler = new StdSchedulerFactory().getScheduler();
			scheduler.start();
			scheduler.scheduleJob(jobDetail, trigger);

		} catch (SchedulerException e) {
			e.printStackTrace();
		}
	}

}
