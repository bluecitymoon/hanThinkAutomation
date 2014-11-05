package com.ls.exception;

public class ConfigurationException extends Exception{

	public static final String message = "配置信息错误！";
	/**
	 * 
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ConfigurationException() {
		super();
	}

	public ConfigurationException(String message, Throwable cause) {
		super(message, cause);
	}

	public ConfigurationException(String message) {
		super(message);
	}

	public ConfigurationException(Throwable cause) {
		super(cause);
	}
	

}
