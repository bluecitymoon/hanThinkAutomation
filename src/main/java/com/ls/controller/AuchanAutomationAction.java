package com.ls.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.apache.http.client.ClientProtocolException;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.ScheduleBuilder;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.SimpleTrigger;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.spi.MutableTrigger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ls.constants.AuthanConstants;
import com.ls.entity.AutomaticJob;
import com.ls.exception.ConfigurationException;
import com.ls.jobs.AuthanAutomationQuartzJob;
import com.ls.repository.AutomaticJobRepository;
import com.ls.service.AuthanAutomationService;

import freemarker.template.TemplateException;

@Component("auchanAction")
public class AuchanAutomationAction extends BaseAction {

	private static final long serialVersionUID = 7537597127706997734L;

	private String orders;

	private AutomaticJob automaticJob;

	@Autowired
	private AutomaticJobRepository automaticJobRepository;

	@Resource(name = "authanService")
	private AuthanAutomationService authanAutomationService;

	public String startManually() {

		String manuallyStart = getParameter("manuallyStart");
		String manuallyStop = getParameter("manuallyStop");

		try {
			orders = authanAutomationService.postDataToWebService(manuallyStart, manuallyStop);
			
			String mode = automaticJobRepository.findByType(AuthanConstants.AUTHAN).getMode();
			
			if (StringUtils.isEmpty(mode) || !mode.equals("debug")) {
				orders = "";
			}

		} catch (ConfigurationException e) {
			addActionError(e.getMessage());
			return ERROR;
		} catch (UnsupportedEncodingException e) {
			addActionError(e.getMessage());
		} catch (ClientProtocolException e) {
			addActionError(e.getMessage());
		} catch (IOException e) {
			addActionError(e.getMessage());
		} catch (TemplateException e) {
			addActionError(e.getMessage());
		} catch (Exception e) {
			addActionError("抓取过程中出现意外错误，请重试或者联系管理员。");
		}

		return SUCCESS;
	}

	public String readConfiguration() {

		automaticJob = automaticJobRepository.findByType(AuthanConstants.AUTHAN);

		return SUCCESS;
	}

	public String saveAutomaticJob() {

		String jobJason = getParameter("job");
		if (StringUtils.isEmpty(jobJason)) {
			
			addActionError("Job is missing.");

			return ERROR;
		} else {
			AutomaticJob automaticJob = (AutomaticJob)JSONObject.toBean(JSONObject.fromObject(jobJason), AutomaticJob.class);

			AutomaticJob dbHasThisJob = automaticJobRepository.findByType("authan");
			if (dbHasThisJob != null) {
				automaticJob.setId(dbHasThisJob.getId());
			}

			this.automaticJob = automaticJobRepository.saveAndFlush(automaticJob);

		}

		return SUCCESS;
	}

	public String startupJob() {

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
		return SUCCESS;
	}
	
	public String getOrders() {

		return orders;
	}

	public void setOrders(String orders) {

		this.orders = orders;
	}

	public AutomaticJob getAutomaticJob() {

		return automaticJob;
	}

	public void setAutomaticJob(AutomaticJob automaticJob) {

		this.automaticJob = automaticJob;
	}

}
