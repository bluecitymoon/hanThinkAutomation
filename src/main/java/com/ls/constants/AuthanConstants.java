package com.ls.constants;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import freemarker.cache.FileTemplateLoader;
import freemarker.template.Configuration;

public class AuthanConstants {

	public static final String AUTHAN = "authan";
	public static final String HANTHINK_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
	
	public static final String HANTHINK_DATE_FORMAT_QUERY = "yyyy-MM-dd";

	public static final SimpleDateFormat HANTHINK_TIME_FORMATTER = new SimpleDateFormat(HANTHINK_DATE_FORMAT);
	
	public static final SimpleDateFormat HANTHINK_TIME_FORMATTER_QUERY = new SimpleDateFormat(HANTHINK_DATE_FORMAT_QUERY);
	
	public static final String TEMPLATE_PATH = "htTemplatePath";
	public static final String HANTHINK_USERNAME = "htUsername";
	public static final String HANTHINK_PASSWORD = "htPassword";

	public static String MAIN_TABLE_TEMPLATE = null;
	public static String CHILD_TABLE_TEMPLATE = null;
	
	public static String BIG_VIEW = null;
	
	public static Configuration anchanConfiguration = null;
	
	public static Set<String> startedJobIdentityList = new HashSet<String>();

	public static String readResource(String fileName) {
		InputStream in = ClassLoader.getSystemResourceAsStream(fileName);

		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(in));
		String s = "";
		StringBuilder sBuilder = new StringBuilder();
		try {
			while ((s = bufferReader.readLine()) != null) {
				sBuilder.append(s);
			}
		} catch (IOException e) {
		}
		
		return sBuilder.toString();
	}
	
	public static String getBigView() {
		if (BIG_VIEW == null) {
			BIG_VIEW = readResource("wholeData.xml");
		}
		
		return BIG_VIEW;
	}
	
	public static String getMainTable() {
		if (MAIN_TABLE_TEMPLATE == null) {
			MAIN_TABLE_TEMPLATE = readResource("oushang-mainTable.xml");
		}
		
		return MAIN_TABLE_TEMPLATE;
	}
	
	public static String getChildTable() {
		if (CHILD_TABLE_TEMPLATE == null) {
			CHILD_TABLE_TEMPLATE = readResource("oushang-child.xml");
		}
		
		return CHILD_TABLE_TEMPLATE;
	}
	
	public static Configuration getAnchanConfiguration() {
		if (anchanConfiguration == null) {
			anchanConfiguration = new Configuration();
			anchanConfiguration.setDefaultEncoding("UTF-8");
			try {
				String path = HanthinkProperties.getString(TEMPLATE_PATH);
				File file = new File(path);
				if (file.exists()) {
					anchanConfiguration.setTemplateLoader(new FileTemplateLoader(file));
				} 
				
			} catch (IOException e) {
			}
		}
		return anchanConfiguration;
	}
}
