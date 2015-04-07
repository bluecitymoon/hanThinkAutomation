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
import com.ls.entity.Order;
import com.ls.entity.ProductDetail;
import com.ls.entity.Store;
import com.ls.entity.User;
import com.ls.jobs.AuthanAutomationQuartzJob;
import com.ls.jobs.AutomaticJobManager;
import com.ls.repository.AutomaticJobRepository;
import com.ls.repository.OrderRepository;
import com.ls.repository.ProductDetailRepository;
import com.ls.repository.StoreRepository;
import com.ls.repository.UserRepository;
import com.ls.service.AuthanAutomationService;
import com.ls.util.HanthinkUtil;
import com.ls.vo.PagedElement;
import com.ls.vo.ResponseVo;

@Component("auchanAction")
@Scope("prototype")
public class AuchanAutomationAction extends BaseAction {

	private static final long serialVersionUID = 7537597127706997734L;

	private ResponseVo response;

	private AutomaticJob automaticJob;

	private List<AutomaticJob> jobList;

	private PagedElement<Order> orders;

	private List<ProductDetail> productDetails;

	private List<Map<String, String>> jobNames = new ArrayList<Map<String, String>>();

	private Logger logger = LoggerFactory.getLogger(AuchanAutomationAction.class);

	@Autowired
	private AutomaticJobRepository automaticJobRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ProductDetailRepository productDetailRepository;

	@Resource(name = "authanOrderSystemService")
	private AuthanAutomationService authanAutomationService;

	@Resource(name = "tescoSystemService")
	private AuthanAutomationService tescoAutomationService;

	@Resource(name = "sosoAutomationService")
	private AuthanAutomationService sosoAutomationService;

	@Resource(name = "carrefourAutomationService")
	private AuthanAutomationService carrefourAutomationService;

	@Resource(name = "lianHuaAutomationService")
	private AuthanAutomationService lianHuaAutomationService;

	@Resource(name = "suzhouUnivercityAutomationService")
	private AuthanAutomationService suzhouUnivercityAutomationService;

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private StoreRepository storeRepository;

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

			Integer storeId = job.getStoreId();

			if (storeId == null) {
				response = ResponseVo.newFailMessage("未知的数据源，检查这个任务是否配置了数据源。");

				return SUCCESS;
			}

			Store store = storeRepository.findOne(storeId);
			String storeDatasourceIdentity = store.getIdentity();

			if (storeDatasourceIdentity.equals("SOSO")) {

				response = sosoAutomationService.postDataToWebService(manuallyStart, manuallyStop, job);

			} else if (storeDatasourceIdentity.equals("TESCO")) {

				response = tescoAutomationService.postDataToWebService(manuallyStart, manuallyStop, job);

			} else if (storeDatasourceIdentity.equals("AUTHAN")) {

				response = authanAutomationService.postDataToWebService(manuallyStart, manuallyStop, job);

			} else if (storeDatasourceIdentity.equals("CARREFOUR")) {

				response = carrefourAutomationService.postDataToWebService(manuallyStart, manuallyStop, job);

			} else if (storeDatasourceIdentity.equals("LIANHUA")) {

				response = lianHuaAutomationService.postDataToWebService(manuallyStart, manuallyStop, job);

			} else if (storeDatasourceIdentity.equals("SUZHOU_DAXUE")) {

				response = suzhouUnivercityAutomationService.postDataToWebService(manuallyStart, manuallyStop, job);

			} else {

				response = ResponseVo.newFailMessage("尚未开发的功能。");

				return SUCCESS;
			}

		} catch (Exception e) {

			response = ResponseVo.newFailMessage("抓取过程中出现意外错误，请重试或者联系技术人员。" + e.getMessage());

			logger.error(response.toString());
			logger.error(e.getMessage());
			e.printStackTrace();
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

		String storeId = getParameter("selectedStoreId");
		String userId = getParameter("selectedUserId");

		User currentUser = userRepository.findByUsername(HanthinkUtil.getCurrentUserName());
		boolean isAdmin = HanthinkUtil.checkIfUserIsAdmin(currentUser);

		if (isAdmin) {

			if (StringUtils.isBlank(storeId) && StringUtils.isBlank(userId)) {
				jobList = automaticJobRepository.findAll();
			} else if (StringUtils.isNotBlank(storeId) && StringUtils.isBlank(userId)) {
				jobList = automaticJobRepository.findByStoreId(Integer.valueOf(storeId));
			} else if (StringUtils.isBlank(storeId) && StringUtils.isNotBlank(userId)) {
				jobList = automaticJobRepository.findByOwnerId(Integer.valueOf(userId));
			} else {
				jobList = automaticJobRepository.findByOwnerIdAndStoreId(Integer.valueOf(userId), Integer.valueOf(storeId));
			}

		} else {

			if (StringUtils.isBlank(storeId)) {
				jobList = automaticJobRepository.findByOwnerId(currentUser.getId());
			} else {
				jobList = automaticJobRepository.findByOwnerIdAndStoreId(currentUser.getId(), Integer.valueOf(storeId));
			}
		}

		makeGeneralSuccessResponse();
		return SUCCESS;
	}

	public String saveAutomaticJob() {

		String jobJason = getParameter("job");
		if (StringUtils.isEmpty(jobJason)) {

			setMessage("Job is missing.");

			response = ResponseVo.newFailMessage("请求数据错误");

		} else {

			AutomaticJob automaticJob = (AutomaticJob)JSONObject.toBean(JSONObject.fromObject(jobJason), AutomaticJob.class);

			if (automaticJob.getId() == null) {
				automaticJob.setClientEnd("/hanthinkserver/service1.asmx");
				automaticJob.setStatus("新创建");
				automaticJob.setDbUsernname("Admin");
				automaticJob.setDbPassword("E1CCjc7z+m3nmqvYlGnc+LcM8t4=");
			}

			try {
				authanAutomationService.saveOrUpdateJob(automaticJob);
			} catch (Exception e) {

				makeGeneralFailResponse(e.getMessage());
				return SUCCESS;
			}
			makeGeneralSuccessResponse();
		}

		return SUCCESS;
	}

	public String deleteJob() {

		String jobJason = getParameter("job");
		AutomaticJob automaticJob = (AutomaticJob)JSONObject.toBean(JSONObject.fromObject(jobJason), AutomaticJob.class);

		try {
			authanAutomationService.deleteJob(automaticJob);
		} catch (Exception e) {

			makeGeneralFailResponse(e.getMessage());
			return SUCCESS;
		}

		makeGeneralSuccessResponse();

		return SUCCESS;
	}

	public String startupJob() {

		AutomaticJob jobRequest = getJobdetailsFromRequest();

		AutomaticJob jobInDb = automaticJobRepository.findOne(jobRequest.getId());

		if (jobInDb.getAutoJobRunning() != null && jobInDb.getAutoJobRunning()) {

			makeGeneralFailResponse("该任务已经启动！");
			return SUCCESS;
		}

		Integer storeId = jobInDb.getStoreId();

		if (storeId == null) {
			response = ResponseVo.newFailMessage("未知的数据源，检查这个任务是否配置了数据源。");

			return SUCCESS;
		}

		Store store = storeRepository.findOne(storeId);
		String storeDatasourceIdentity = store.getIdentity();
		JobDataMap jobDataMap = new JobDataMap();
		jobDataMap.put("authanAutomationService", authanAutomationService);
		jobDataMap.put("sosoAutomationService", sosoAutomationService);
		jobDataMap.put("tescoSystemService", tescoAutomationService);
		jobDataMap.put("carrefourAutomationService", carrefourAutomationService);
		jobDataMap.put("lianHuaAutomationService", lianHuaAutomationService);
		jobDataMap.put("jobWillRun", jobInDb);
		jobDataMap.put("storeDatasourceIdentity", storeDatasourceIdentity);
		jobDataMap.put("suzhouUnivercityAutomationService", suzhouUnivercityAutomationService);
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

				String uniqueGroupName = getUniqueGroupName(jobInDb);

				JobDetail jobDetail = JobBuilder.newJob(AuthanAutomationQuartzJob.class).usingJobData(jobDataMap).withIdentity(jobIdentityKey, uniqueGroupName).build();
				CronTriggerImpl singleTrigger = (CronTriggerImpl)CronScheduleBuilder.dailyAtHourAndMinute(jobStartHour, startMin).build();
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
			Set<TriggerKey> keySet = AutomaticJobManager.getScheduler().getTriggerKeys(GroupMatcher.triggerGroupEquals(getUniqueGroupName(requestJob)));

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
		}

		makeGeneralSuccessResponse();

		return SUCCESS;
	}

	private String getUniqueGroupName(AutomaticJob jobInDb) {

		return jobInDb.getDbName() + jobInDb.getName() + jobInDb.getId();
	}

	private AutomaticJob getJobdetailsFromRequest() {

		String jobJason = getParameter("job");
		AutomaticJob automaticJob = (AutomaticJob)JSONObject.toBean(JSONObject.fromObject(jobJason), AutomaticJob.class);

		return automaticJob;
	}

	private void makeGeneralSuccessResponse() {

		response = ResponseVo.newSuccessMessage(null);
	}

	private void makeGeneralFailResponse(String message) {

		if (StringUtils.isNotBlank(message) && message.equals("Access is denied")) {
			message = "没有权限";
		}

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

	public PagedElement<Order> getOrders() {

		return orders;
	}

	public void setOrders(PagedElement<Order> orders) {

		this.orders = orders;
	}

	public List<ProductDetail> getProductDetails() {

		return productDetails;
	}

	public void setProductDetails(List<ProductDetail> productDetails) {

		this.productDetails = productDetails;
	}

}
