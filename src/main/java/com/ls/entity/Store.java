package com.ls.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ls_store")
public class Store implements Serializable{
	
	@Id
	@GeneratedValue
	protected Integer id;
	protected String name;
	protected String identity;
	
	public String getIdentity() {
	
		return identity;
	}
	
	public void setIdentity(String identity) {
	
		this.identity = identity;
	}

	@ManyToMany(cascade = CascadeType.REFRESH, mappedBy = "stores", fetch = FetchType.LAZY)
	protected List<User> users;
	
	public Store() {

		super();
	}
	
	public Store(String name) {

		super();
		this.name = name;
	}
	
	public Store(String name, String identity) {

		super();
		this.name = name;
		this.identity = identity;
	}

	public List<User> getUsers() {
	
		return users;
	}

	
	public void setUsers(List<User> users) {
	
		this.users = users;
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
