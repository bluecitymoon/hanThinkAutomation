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
	protected String type;
	protected String name;
	protected String clientIp;
	protected String clientEnd;
	protected String start;
	protected String stop;
	protected String lastGrabStart;
	protected String lastGrabEnd;
	protected String username;
	protected String password;
	protected String status;
	protected Integer restartInHours;
	protected Boolean locked;
	protected String mode;
	protected String dbName;
	protected String dbUsernname;
	protected String dbPassword;
	protected Boolean autoJobRunning;
	
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

	
	public String getType() {
	
		return type;
	}
	
	public void setType(String type) {
	
		this.type = type;
	}

	
	public String getLastGrabStart() {
	
		return lastGrabStart;
	}

	
	public void setLastGrabStart(String lastGrabStart) {
	
		this.lastGrabStart = lastGrabStart;
	}

	
	public String getLastGrabEnd() {
	
		return lastGrabEnd;
	}

	
	public void setLastGrabEnd(String lastGrabEnd) {
	
		this.lastGrabEnd = lastGrabEnd;
	}

	
	public String getUsername() {
	
		return username;
	}

	
	public void setUsername(String username) {
	
		this.username = username;
	}

	
	public String getPassword() {
	
		return password;
	}

	
	public void setPassword(String password) {
	
		this.password = password;
	}

	
	public String getStatus() {
	
		return status;
	}

	
	public void setStatus(String status) {
	
		this.status = status;
	}

	public Integer getRestartInHours() {
		return restartInHours;
	}

	public void setRestartInHours(Integer restartInHours) {
		this.restartInHours = restartInHours;
	}

	public Boolean getLocked() {
		return locked;
	}

	public void setLocked(Boolean locked) {
		this.locked = locked;
	}

	public String getMode() {
	
		return mode;
	}
	
	public void setMode(String mode) {
	
		this.mode = mode;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getDbUsernname() {
		return dbUsernname;
	}

	public void setDbUsernname(String dbUsernname) {
		this.dbUsernname = dbUsernname;
	}

	public String getDbPassword() {
		return dbPassword;
	}

	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}

	public Boolean getAutoJobRunning() {
		return autoJobRunning;
	}

	public void setAutoJobRunning(Boolean autoJobRunning) {
		this.autoJobRunning = autoJobRunning;
	}

	
	public String getClientEnd() {
	
		return clientEnd;
	}

	
	public void setClientEnd(String clientEnd) {
	
		this.clientEnd = clientEnd;
	}

	@Override
	public String toString() {

		return "AutomaticJob [id=" + id + ", type=" + type + ", name=" + name + ", clientIp=" + clientIp + ", clientEnd=" + clientEnd + ", start=" + start + ", stop=" + stop + ", lastGrabStart=" + lastGrabStart + ", lastGrabEnd=" + lastGrabEnd + ", username=" + username + ", password=" + password + ", status=" + status +
			", restartInHours=" + restartInHours + ", locked=" + locked + ", mode=" + mode + ", dbName=" + dbName + ", dbUsernname=" + dbUsernname + ", dbPassword=" + dbPassword + ", autoJobRunning=" + autoJobRunning + "]";
	}

}
