package com.ls.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ls_store")
public class Store implements Serializable{
	
	@Id
	@GeneratedValue
	protected Integer id;
	protected String name;
	
	public Store() {

		super();
	}
	
	public Store(String name) {

		super();
		this.name = name;
	}

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

	
}
