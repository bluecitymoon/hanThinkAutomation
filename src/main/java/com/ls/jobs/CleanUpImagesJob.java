package com.ls.jobs;

import java.io.File;
import java.io.FilenameFilter;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.ls.constants.HanthinkProperties;

public class CleanUpImagesJob implements Job {

	public void execute(JobExecutionContext context) throws JobExecutionException {

		cleanUpValidationCodeFiles();
	}

	public void cleanUpValidationCodeFiles() {

		try {
			String ocrInstallPath = HanthinkProperties.getString("tessertOcrInstallPath");

			File[] filesNeedToBeDeleted = new File(ocrInstallPath).listFiles(new FilenameFilter(){

				public boolean accept(File dir, String name) {

					if (name.endsWith("txt") || name.endsWith("jpg")) {
						return true;
					}
					return false;
				}
			});

			for (File file : filesNeedToBeDeleted) {
				file.delete();
			}
		} catch (Exception e) {
		}

	}
}
