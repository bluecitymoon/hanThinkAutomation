package com.ls.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.TriggerKey;
import org.quartz.impl.matchers.GroupMatcher;
import org.quartz.impl.triggers.CronTriggerImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.google.common.collect.Maps;
import com.ls.constants.AuthanConstants;
import com.ls.entity.AutomaticJob;
import com.ls.jobs.AuthanAutomationQuartzJob;
import com.ls.jobs.AutomaticJobManager;
import com.ls.repository.AutomaticJobRepository;
import com.ls.service.AuthanAutomationService;
import com.ls.vo.ResponseVo;

@Component("auchanAction")
@Scope("prototype")
public class AuchanAutomationAction extends BaseAction {

	private static final long serialVersionUID = 7537597127706997734L;

	private ResponseVo response;

	private AutomaticJob automaticJob;

	private List<AutomaticJob> jobList;
	
	private List<Map<String, String>> jobNames = new ArrayList<Map<String,String>>();

	private Logger logger = LoggerFactory.getLogger(AuchanAutomationAction.class);
	
	@Autowired
	private AutomaticJobRepository automaticJobRepository;

	@Resource(name = "authanService")
	private AuthanAutomationService authanAutomationService;

	public String startManually() {

		String manuallyStart = getParameter("manuallyStart");
		String manuallyStop = getParameter("manuallyStop");
		String dbName = getParameter("manuallyDbName");

		if (StringUtils.isEmpty(dbName)) {
			
			response = ResponseVo.newFailMessage("不存在帐套[" + dbName + "]");
			
			return SUCCESS;
		}
		try {
			
			AutomaticJob job = automaticJobRepository.findOne(Integer.valueOf(dbName));
			
			if (job == null) {
				response = ResponseVo.newFailMessage("不存在帐套[" + dbName + "]");
				
				return SUCCESS;
			}
 
			String mode = job.getMode();

			response = authanAutomationService.postDataToWebService(manuallyStart, manuallyStop, job);
			
			if (StringUtils.isEmpty(mode) || !mode.equals("debug") && response.getType().equals(ResponseVo.MessageType.SUCCESS.name())) {
				
				response.setMessage("200OK");
			} else {
				response.setMode("debug");
			}

		
		} catch (Exception e) {
			
			response = ResponseVo.newFailMessage("抓取过程中出现意外错误，请重试或者联系技术人员。" + e.getMessage());
			
			logger.error(response.toString());
			logger.error(e.getMessage());
			
			return SUCCESS;
		}

		return SUCCESS;
	}

	public String loadJobNames() {
		String blurryName = getParameter("blurryName");
		
		blurryName += "%";
		
		blurryName = "%" + blurryName;
		
		List<AutomaticJob> jobs = automaticJobRepository.findByNameOrDbName(blurryName, blurryName);
		
		for (AutomaticJob automaticJob : jobs) {

			Map<String, String> jobMap = Maps.newHashMap();
			jobMap.put("id", automaticJob.getId().toString());
			
			jobMap.put("value", automaticJob.getDbName() + " - " + automaticJob.getName());
			jobMap.put("label", automaticJob.getDbName() + " - " + automaticJob.getName());
			
			jobNames.add(jobMap);
			
		}
		return SUCCESS;
	}
	
	public String readConfiguration() {
		String id = getParameter("jobId");

		automaticJob = automaticJobRepository.findOne(Integer.valueOf(id));
		
		makeGeneralSuccessResponse();

		return SUCCESS;
	}

	public String readJobList() {

		jobList = automaticJobRepository.findByType(AuthanConstants.AUTHAN);

		
		makeGeneralSuccessResponse();
		return SUCCESS;
	}

	public String saveAutomaticJob() {

		String jobJason = getParameter("job");
		if (StringUtils.isEmpty(jobJason)) {

			setMessage("Job is missing.");

			response = ResponseVo.newFailMessage("请求数据错误");
			
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
				makeGeneralSuccessResponse();
//			}
		}

		return SUCCESS;
	}

	public String deleteJob() {
		String jobJason = getParameter("job");
		AutomaticJob automaticJob = (AutomaticJob) JSONObject.toBean(JSONObject.fromObject(jobJason), AutomaticJob.class);

		automaticJobRepository.delete(automaticJob);

		makeGeneralSuccessResponse();
		
		return SUCCESS;
	}

	public String startupJob() {

		AutomaticJob jobRequest = getJobdetailsFromRequest();

		AutomaticJob jobInDb = automaticJobRepository.findOne(jobRequest.getId());

		if (jobInDb.getAutoJobRunning()!= null && jobInDb.getAutoJobRunning()) {
			
			makeGeneralFailResponse("该任务已经启动！");
			return SUCCESS;
		}

		JobDataMap jobDataMap = new JobDataMap();
		jobDataMap.put("authanAutomationService", authanAutomationService);
		jobDataMap.put("jobWillRun", jobInDb);

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
				makeGeneralFailResponse("起始时间错误");
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

				String jobIdentityKey = jobInDb.getName() + jobInDb.getDbName() + "-" + jobStartHour + ":" + startMin;
				if (AuthanConstants.startedJobIdentityList.contains(jobIdentityKey)) {

				} else {
					String uniqueGroupName = jobInDb.getDbName() + jobInDb.getName() + jobInDb.getId();
					JobDetail jobDetail = JobBuilder.newJob(AuthanAutomationQuartzJob.class).usingJobData(jobDataMap).withIdentity(jobIdentityKey, uniqueGroupName).build();
					CronTriggerImpl singleTrigger = (CronTriggerImpl) CronScheduleBuilder.dailyAtHourAndMinute(jobStartHour, startMin).build();
					singleTrigger.setName(jobIdentityKey);
					singleTrigger.setGroup(uniqueGroupName);
					Scheduler scheduler = AutomaticJobManager.getScheduler();
					if (null == scheduler) {
						makeGeneralFailResponse("获取任务调度失败！");
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
			
			makeGeneralFailResponse("配置信息有误 : " + e.getMessage());
			jobInDb.setAutoJobRunning(false);
			jobInDb.setStatus("启动失败");
			automaticJobRepository.saveAndFlush(jobInDb);
			
			logger.error("start up job failed.");
			logger.error(jobInDb.toString());
			
		}

		makeGeneralSuccessResponse();
		
		return SUCCESS;
	}
	
	public String shutDownJob() {
		
		AutomaticJob requestJob = getJobdetailsFromRequest();
		List<TriggerKey> keyList = new ArrayList<TriggerKey>();
		try {
			Set<TriggerKey> keySet = AutomaticJobManager.getScheduler().getTriggerKeys(GroupMatcher.triggerGroupEquals(requestJob.getDbName() + requestJob.getName()));
			
			for (TriggerKey triggerKey : keySet) {
				keyList.add(triggerKey);
			}
			AutomaticJobManager.getScheduler().unscheduleJobs(keyList);
			
		} catch (SchedulerException e) {
			setMessage(e.getMessage());
			
			logger.error("shut down job failed");
			logger.error(requestJob.toString());
		} finally {
			requestJob.setStatus("未启动");
			requestJob.setAutoJobRunning(false);
			automaticJobRepository.saveAndFlush(requestJob);
			
			try {
				AuthanConstants.startedJobIdentityList.removeAll(keyList);
			} catch (Exception e) {
			}
		}
		
		makeGeneralSuccessResponse();
		
		return SUCCESS;
	}

	

	private AutomaticJob getJobdetailsFromRequest() {

		String jobJason = getParameter("job");
		AutomaticJob automaticJob = (AutomaticJob) JSONObject.toBean(JSONObject.fromObject(jobJason), AutomaticJob.class);

		return automaticJob;
	}

	private void makeGeneralSuccessResponse() {
		response = ResponseVo.newSuccessMessage(null);
	}
	
	private void makeGeneralFailResponse(String message) {
		response = ResponseVo.newFailMessage(message);
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

	
	public ResponseVo getResponse() {
	
		return response;
	}

	public void setResponse(ResponseVo response) {
	
		this.response = response;
	}

	
	public List<Map<String, String>> getJobNames() {
	
		return jobNames;
	}
	
	public void setJobNames(List<Map<String, String>> jobNames) {
	
		this.jobNames = jobNames;
	}
}
