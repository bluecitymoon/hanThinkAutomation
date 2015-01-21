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

	private AuthanAutomationService sosoAutomationService;
	
	private AuthanAutomationService tescoAutomationService; 

	private AuthanAutomationService carrefourAutomationService;
	
	private Logger logger = LoggerFactory.getLogger(AuthanAutomationQuartzJob.class);

	public void execute(JobExecutionContext context) throws JobExecutionException {

		System.out.println("AuthanAutomationQuartzJob starts...................................................................");
		
		authanAutzmationService = (AuthanAutomationService) context.getJobDetail().getJobDataMap().get("authanAutomationService");

		sosoAutomationService = (AuthanAutomationService) context.getJobDetail().getJobDataMap().get("sosoAutomationService");
		
		tescoAutomationService  = (AuthanAutomationService) context.getJobDetail().getJobDataMap().get("tescoSystemService");
		
		carrefourAutomationService = (AuthanAutomationService) context.getJobDetail().getJobDataMap().get("carrefourAutomationService"); 
		Date today = new Date();
		AutomaticJob authanJob = (AutomaticJob) context.getJobDetail().getJobDataMap().get("jobWillRun");
		System.out.println("Job -- >" + authanJob.toString());
		
		String storeDatasourceIdentity = (String) context.getJobDetail().getJobDataMap().get("storeDatasourceIdentity");
		
		System.out.println("Type -- >" + storeDatasourceIdentity);
		
		String lastRunDate = authanJob.getLastGrabEnd();
		if (StringUtils.isEmpty(lastRunDate)) {
			lastRunDate = AuthanConstants.HANTHINK_TIME_FORMATTER.format(today);
		}

		Integer delayDays = authanJob.getDelayDays();
		if (delayDays == null) {
			delayDays = 0;
		}

		ResponseVo responseVo = null;

		try {
			Date lastRunDateInDb = AuthanConstants.HANTHINK_TIME_FORMATTER.parse(lastRunDate);
			long startDateWithDelay = lastRunDateInDb.getTime() - delayDays * 24 * 60 * 60 * 1000;

			Date lastRunDateForQuery = new Date(startDateWithDelay);

			lastRunDate = AuthanConstants.HANTHINK_TIME_FORMATTER_QUERY.format(lastRunDateForQuery);

			String now = AuthanConstants.HANTHINK_TIME_FORMATTER_QUERY.format(today);
			
			
			System.out.println("lastRunDate -- >" + lastRunDate);
			System.out.println("now -- >" + now	);
			if (storeDatasourceIdentity.equals("SOSO")) {
				
				System.out.println("sosoAutomationService postDataToWebService");
				responseVo = sosoAutomationService.postDataToWebService(lastRunDate, now, authanJob);
				
				System.out.println(responseVo.toString());
				
			} else if (storeDatasourceIdentity.equals("AUTHAN")) {
				
				responseVo = authanAutzmationService.postDataToWebService(lastRunDate, now, authanJob);

			}  else if (storeDatasourceIdentity.equals("TESCO")) {

				responseVo = tescoAutomationService.postDataToWebService(lastRunDate, now, authanJob);

			} else if(storeDatasourceIdentity.equals("CARREFOUR")) {
				
				responseVo = carrefourAutomationService.postDataToWebService(lastRunDate, now, authanJob);
			}else {

				responseVo = ResponseVo.newFailMessage("尚未开发的功能。");
			}

			System.out.println(responseVo.toString());
			
			logger.info(responseVo.toString());

		} catch (Exception e) {
			logger.error(AuthanConstants.HANTHINK_TIME_FORMATTER.format(new Date()));
			logger.error(responseVo.getType());
			logger.error(responseVo.getMessage());
			logger.error(e.getMessage());
		}
		
		System.out.println("AuthanAutomationQuartzJob stopped...................................................................");
	}

}
