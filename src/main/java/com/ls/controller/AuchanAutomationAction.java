package com.ls.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.apache.http.client.ClientProtocolException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ls.constants.AuthanConstants;
import com.ls.entity.AutomaticJob;
import com.ls.exception.ConfigurationException;
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
