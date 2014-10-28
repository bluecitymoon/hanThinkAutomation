package com.ls.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hs_job")
public class AutomaticJob implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -2676258363138538790L;
	@Id
	@GeneratedValue
	protected Integer id;
	protected String name;
	protected String clientIp;
	protected String customer;
	protected String start;
	protected String stop;
	
	public Integer getId() {
	
		return id;
	}
	
	public void setId(Integer id) {
	
		this.id = id;
	}
	
	public String getName() {
	
		return name;
	}
	
	public void setName(String name) {
	
		this.name = name;
	}
	
	public String getClientIp() {
	
		return clientIp;
	}
	
	public void setClientIp(String clientIp) {
	
		this.clientIp = clientIp;
	}
	
	public String getCustomer() {
	
		return customer;
	}
	
	public void setCustomer(String customer) {
	
		this.customer = customer;
	}
	
	public String getStart() {
	
		return start;
	}
	
	public void setStart(String start) {
	
		this.start = start;
	}
	
	public String getStop() {
	
		return stop;
	}
	
	public void setStop(String stop) {
	
		this.stop = stop;
	}

	

}
