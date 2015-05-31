package com.ls.service.impl.test;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string = "?&empCode=c2hjbW15&userAccount=YWRtaW4=&password=YWRtaW4=&sessionId=0BCF7B076D07DE2284AA448C4CAA2753.tomcat6&sso_sys_module=sms_platform";
		System.out.println(string.substring(0, string.lastIndexOf("&")));

	}

}
