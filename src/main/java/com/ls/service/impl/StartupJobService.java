package com.ls.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.impl.triggers.CronTriggerImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ls.constants.AuthanConstants;
import com.ls.entity.AutomaticJob;
import com.ls.entity.Store;
import com.ls.jobs.AuthanAutomationQuartzJob;
import com.ls.jobs.AutomaticJobManager;
import com.ls.repository.AutomaticJobRepository;
import com.ls.repository.StoreRepository;
import com.ls.service.AuthanAutomationService;

@Component("StartupJobService")
public class StartupJobService implements InitializingBean {

	private Logger logger = LoggerFactory.getLogger(StartupJobService.class);

	@Autowired
	private AutomaticJobRepository automaticJobRepository;

	@Autowired
	private StoreRepository storeRepository;

	@Resource(name = "authanOrderSystemService")
	private AuthanAutomationService authanAutomationService;

	@Resource(name = "carrefourAutomationService")
	private AuthanAutomationService carrefourAutomationService;

	@Resource(name = "tescoSystemService")
	private AuthanAutomationService tescoAutomationService;

	@Resource(name = "sosoAutomationService")
	private AuthanAutomationService sosoAutomationService;

	@Resource(name = "lianHuaAutomationService")
	private AuthanAutomationService lianHuaAutomationService;

	@Resource(name = "suzhouUnivercityAutomationService")
	private AuthanAutomationService suzhouUnivercityAutomationService;
	
	@Resource(name = "RTMarketAutomationService")
	private AuthanAutomationService rtMarketAutomationService;
	
	@Resource(name = "LinggongAutomationService")
	private AuthanAutomationService linggongAutomationService;

	public void afterPropertiesSet() throws Exception {

		List<AutomaticJob> allJobs = automaticJobRepository.findAll();

		for (AutomaticJob automaticJob : allJobs) {
			if (StringUtils.isNotBlank(automaticJob.getStatus()) && automaticJob.getStatus().equals("已启动")) {

				Integer storeId = automaticJob.getStoreId();

				if (storeId == null) {
					System.out.println("can't find store");
					return;
				}

				Store store = storeRepository.findOne(storeId);
				String storeDatasourceIdentity = store.getIdentity();
				JobDataMap jobDataMap = new JobDataMap();
				jobDataMap.put("authanAutomationService", authanAutomationService);
				jobDataMap.put("sosoAutomationService", sosoAutomationService);
				jobDataMap.put("tescoSystemService", tescoAutomationService);
				jobDataMap.put("carrefourAutomationService", carrefourAutomationService);
				jobDataMap.put("storeDatasourceIdentity", storeDatasourceIdentity);
				jobDataMap.put("lianHuaAutomationService", lianHuaAutomationService);
				jobDataMap.put("suzhouUnivercityAutomationService", suzhouUnivercityAutomationService);
				jobDataMap.put("jobWillRun", automaticJob);
				jobDataMap.put("storeDatasourceIdentity", storeDatasourceIdentity);
				jobDataMap.put("rtMarketAutomationService", rtMarketAutomationService);
				jobDataMap.put("linggongAutomationService", linggongAutomationService);
				
				try {

					String startHourAndMin = automaticJob.getStart();
					String[] start = startHourAndMin.split(":");
					int startHour = Integer.valueOf(start[0]);
					int startMin = Integer.valueOf(start[1]);

					String endHourAndMin = automaticJob.getStop();
					String[] end = endHourAndMin.split(":");
					int endHour = Integer.valueOf(end[0]);
					int endMin = Integer.valueOf(end[1]);

					if (startHour > endHour) {
						logger.error("bad job configuration, start hour bigger than end hour. ");
						return;
					}
					int restartInHours = automaticJob.getRestartInHours();
					int jobStartHour = startHour;
					while (jobStartHour <= endHour) {

						if (jobStartHour == endHour) {

							if (endMin < startMin) {
								break;
							}
						}
						String jobIdentityKey = automaticJob.getName() + automaticJob.getDbName() + "-" + jobStartHour + ":" + startMin;

						String uniqueGroupName = getUniqueGroupName(automaticJob);

						JobDetail jobDetail = JobBuilder.newJob(AuthanAutomationQuartzJob.class).usingJobData(jobDataMap).withIdentity(jobIdentityKey, uniqueGroupName).build();
						CronTriggerImpl singleTrigger = (CronTriggerImpl)CronScheduleBuilder.dailyAtHourAndMinute(jobStartHour, startMin).build();
						singleTrigger.setName(jobIdentityKey);
						singleTrigger.setGroup(uniqueGroupName);
						Scheduler scheduler = AutomaticJobManager.getScheduler();
						if (null == scheduler) {
							logger.error("schedular null. ");
							return;
						} else {
							scheduler.scheduleJob(jobDetail, singleTrigger);
							AuthanConstants.startedJobIdentityList.add(jobIdentityKey);
						}

						jobStartHour += restartInHours;
					}

					automaticJob.setAutoJobRunning(true);
					automaticJob.setStatus("已启动");
					automaticJobRepository.saveAndFlush(automaticJob);

				} catch (Exception e) {

					logger.error("配置信息有误 : " + e.getMessage());
					automaticJob.setAutoJobRunning(false);
					automaticJob.setStatus("启动失败");
					automaticJobRepository.saveAndFlush(automaticJob);

					logger.error("start up job failed.");
					logger.error(automaticJob.toString());

				}
			}
		}
	}

	private String getUniqueGroupName(AutomaticJob jobInDb) {

		return jobInDb.getDbName() + jobInDb.getName() + jobInDb.getId();
	}
}
