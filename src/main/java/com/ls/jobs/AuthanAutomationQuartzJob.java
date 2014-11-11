package com.ls.jobs;

import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ls.constants.AuthanConstants;
import com.ls.entity.AutomaticJob;
import com.ls.service.AuthanAutomationService;
import com.ls.vo.ResponseVo;

public class AuthanAutomationQuartzJob implements Job {

	private AuthanAutomationService authanAutzmationService;
	private Logger logger = LoggerFactory.getLogger(AuthanAutomationQuartzJob.class);
	
	public void execute(JobExecutionContext context) throws JobExecutionException {

			authanAutzmationService = (AuthanAutomationService) context.getJobDetail().getJobDataMap().get("authanAutomationService");
			
			AutomaticJob authanJob = (AutomaticJob)context.getJobDetail().getJobDataMap().get("jobWillRun");

			String lastRunDate = authanJob.getLastGrabEnd();
			
			if (StringUtils.isEmpty(lastRunDate)) {
				lastRunDate = AuthanConstants.HANTHINK_TIME_FORMATTER_QUERY.format(new Date());
			} 
			
			String now = AuthanConstants.HANTHINK_TIME_FORMATTER_QUERY.format(new Date());
			
			ResponseVo responseVo = null;
			
			try {
				
				responseVo = authanAutzmationService.postDataToWebService(lastRunDate, now, authanJob);
				
			} catch (Exception e) {
				logger.error(AuthanConstants.HANTHINK_TIME_FORMATTER.format(new Date()));
				logger.error(responseVo.getType());
				logger.error(responseVo.getMessage());
				logger.error(e.getMessage());
			}

	}

}
