package com.ls.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.apache.http.client.ClientProtocolException;
import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.TriggerKey;
import org.quartz.impl.matchers.GroupMatcher;
import org.quartz.impl.triggers.CronTriggerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.ls.constants.AuthanConstants;
import com.ls.entity.AutomaticJob;
import com.ls.exception.ConfigurationException;
import com.ls.jobs.AuthanAutomationQuartzJob;
import com.ls.jobs.AutomaticJobManager;
import com.ls.repository.AutomaticJobRepository;
import com.ls.service.AuthanAutomationService;

import freemarker.template.TemplateException;

@Component("auchanAction")
@Scope("prototype")
public class AuchanAutomationAction extends BaseAction {

	private static final long serialVersionUID = 7537597127706997734L;

	private String orders;

	private AutomaticJob automaticJob;

	private List<AutomaticJob> jobList;

	@Autowired
	private AutomaticJobRepository automaticJobRepository;

	@Resource(name = "authanService")
	private AuthanAutomationService authanAutomationService;

	public String startManually() {

		String manuallyStart = getParameter("manuallyStart");
		String manuallyStop = getParameter("manuallyStop");
		String dbName = getParameter("manuallyDbName");

		try {
			AutomaticJob job = automaticJobRepository.findByTypeAndDbName(AuthanConstants.AUTHAN, dbName);
			if (job == null) {
				setMessage("不存在帐套[" + dbName + "]");
				return SUCCESS;
			}

			String mode = job.getMode();

			String response = authanAutomationService.postDataToWebService(manuallyStart, manuallyStop, dbName);
			if (StringUtils.isEmpty(mode) || !mode.equals("debug")) {
				orders = "";
			} else {
				orders = response;
			}

		} catch (ConfigurationException e) {
			setMessage(e.getMessage());
			return SUCCESS;
		} catch (UnsupportedEncodingException e) {
			setMessage(e.getMessage());
			return SUCCESS;
		} catch (ClientProtocolException e) {
			setMessage(e.getMessage());
			return SUCCESS;
		} catch (IOException e) {
			setMessage(e.getMessage());
			return SUCCESS;
		} catch (TemplateException e) {
			setMessage(e.getMessage());
			return SUCCESS;
		} catch (Exception e) {
			setMessage("抓取过程中出现意外错误，请重试或者联系管理员。");
			return SUCCESS;
		}

		return SUCCESS;
	}

	public String readConfiguration() {
		String id = getParameter("jobId");

		automaticJob = automaticJobRepository.findOne(Integer.valueOf(id));

		return SUCCESS;
	}

	public String readJobList() {

		jobList = automaticJobRepository.findByType(AuthanConstants.AUTHAN);

		return SUCCESS;
	}

	public String saveAutomaticJob() {

		String jobJason = getParameter("job");
		if (StringUtils.isEmpty(jobJason)) {

			setMessage("Job is missing.");

			return SUCCESS;
		} else {
			
			AutomaticJob automaticJob = (AutomaticJob) JSONObject.toBean(JSONObject.fromObject(jobJason), AutomaticJob.class);
//			
//			AutomaticJob jobInDb = automaticJobRepository.findByTypeAndDbName(AuthanConstants.AUTHAN, automaticJob.getDbName());
//			
//			if (jobInDb != null && automaticJob.getId() == null) {
//				
//				setMessage("该帐套的自动任务已经存在。");
//				return SUCCESS;
//				
//			} else {
				
				this.automaticJob = automaticJobRepository.saveAndFlush(automaticJob);
//			}
		}

		return SUCCESS;
	}

	public String deleteJob() {
		String jobJason = getParameter("job");
		AutomaticJob automaticJob = (AutomaticJob) JSONObject.toBean(JSONObject.fromObject(jobJason), AutomaticJob.class);

		automaticJobRepository.delete(automaticJob);

		return SUCCESS;
	}

	public String startupJob() {

		AutomaticJob jobRequest = getJobdetailsFromRequest();

		AutomaticJob jobInDb = automaticJobRepository.findOne(jobRequest.getId());

		if (jobInDb.getAutoJobRunning()!= null && jobInDb.getAutoJobRunning()) {
			setMessage("该任务已经启动！");
			return SUCCESS;
		}

		JobDataMap jobDataMap = new JobDataMap();
		jobDataMap.put("authanAutomationService", authanAutomationService);

		try {
			String startHourAndMin = jobInDb.getStart();
			String[] start = startHourAndMin.split(":");
			int startHour = Integer.valueOf(start[0]);
			int startMin = Integer.valueOf(start[1]);

			String endHourAndMin = jobInDb.getStop();
			String[] end = endHourAndMin.split(":");
			int endHour = Integer.valueOf(end[0]);
			int endMin = Integer.valueOf(end[1]);

			if (startHour > endHour) {
				setMessage("起始时间错误");
				return SUCCESS;
			}
			int restartInHours = jobInDb.getRestartInHours();
			int jobStartHour = startHour;
			while (jobStartHour <= endHour) {

				if (jobStartHour == endHour) {

					if (endMin < startMin) {
						break;
					}
				}

				String jobIdentityKey = AuthanConstants.AUTHAN + jobInDb.getDbName() + "-" + jobStartHour + ":" + startMin;
				if (AuthanConstants.startedJobIdentityList.contains(jobIdentityKey)) {

				} else {
					JobDetail jobDetail = JobBuilder.newJob(AuthanAutomationQuartzJob.class).usingJobData(jobDataMap).withIdentity(jobIdentityKey, jobInDb.getDbName()).build();
					CronTriggerImpl singleTrigger = (CronTriggerImpl) CronScheduleBuilder.dailyAtHourAndMinute(jobStartHour, startMin).build();
					singleTrigger.setName(jobIdentityKey);
					singleTrigger.setGroup(jobInDb.getDbName());
					Scheduler scheduler = AutomaticJobManager.getScheduler();
					if (null == scheduler) {
						setMessage("获取任务调度失败！");
						return SUCCESS;
					} else {
						scheduler.scheduleJob(jobDetail, singleTrigger);
						AuthanConstants.startedJobIdentityList.add(jobIdentityKey);
					}
				}

				jobStartHour += restartInHours;
			}

			jobInDb.setAutoJobRunning(true);
			jobInDb.setStatus("已启动");
			automaticJobRepository.saveAndFlush(jobInDb);
			
		} catch (Exception e) {
			
			setMessage("配置信息有误 : " + e.getMessage());
			jobInDb.setAutoJobRunning(false);
			jobInDb.setStatus("启动失败");
			automaticJobRepository.saveAndFlush(jobInDb);
			
		}

		return SUCCESS;
	}
	
	public String shutDownJob() {
		
		AutomaticJob requestJob = getJobdetailsFromRequest();
		List<TriggerKey> keyList = new ArrayList<TriggerKey>();
		try {
			Set<TriggerKey> keySet = AutomaticJobManager.getScheduler().getTriggerKeys(GroupMatcher.triggerGroupEquals(requestJob.getDbName()));
			
			for (TriggerKey triggerKey : keySet) {
				keyList.add(triggerKey);
			}
			AutomaticJobManager.getScheduler().unscheduleJobs(keyList);
			
		} catch (SchedulerException e) {
			setMessage(e.getMessage());
		} finally {
			requestJob.setStatus("未启动");
			requestJob.setAutoJobRunning(false);
			automaticJobRepository.saveAndFlush(requestJob);
			
			try {
				AuthanConstants.startedJobIdentityList.removeAll(keyList);
			} catch (Exception e) {
			}
		}
		
		return SUCCESS;
	}

	public String getOrders() {

		return orders;
	}

	private AutomaticJob getJobdetailsFromRequest() {

		String jobJason = getParameter("job");
		AutomaticJob automaticJob = (AutomaticJob) JSONObject.toBean(JSONObject.fromObject(jobJason), AutomaticJob.class);

		return automaticJob;
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

	public List<AutomaticJob> getJobList() {
		return jobList;
	}

	public void setJobList(List<AutomaticJob> jobList) {
		this.jobList = jobList;
	}

}
