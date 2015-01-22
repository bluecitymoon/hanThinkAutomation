package com.ls.vo;

import java.io.Serializable;

public class LihuaListJsonObject implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -864876615288415167L;

	private String created_date;

	private String status;

	private String rcvno;

	private String needfax;

	private String pono;

	private String sum;

	private String reply_delivery_date;

	private String faxtime;

	private String rcvid;

	private String bg_item_count;

	private String bg_net_amt;

	private String id;

	private String requestdate;

	private String amt;

	private String bgid;

	private String billdate;

	private String deptid;

	private String orgid;

	private String lastreferdate;

	private String sstatus;
	
	private String replydate;

	public String getCreated_date() {

		return created_date;
	}

	public void setCreated_date(String created_date) {

		this.created_date = created_date;
	}

	public String getStatus() {

		return status;
	}

	public void setStatus(String status) {

		this.status = status;
	}

	public String getRcvno() {

		return rcvno;
	}

	public void setRcvno(String rcvno) {

		this.rcvno = rcvno;
	}

	public String getNeedfax() {

		return needfax;
	}

	public void setNeedfax(String needfax) {

		this.needfax = needfax;
	}

	public String getPono() {

		return pono;
	}

	public void setPono(String pono) {

		this.pono = pono;
	}

	public String getSum() {

		return sum;
	}

	public void setSum(String sum) {

		this.sum = sum;
	}

	public String getReply_delivery_date() {

		return reply_delivery_date;
	}

	public void setReply_delivery_date(String reply_delivery_date) {

		this.reply_delivery_date = reply_delivery_date;
	}

	public String getFaxtime() {

		return faxtime;
	}

	public void setFaxtime(String faxtime) {

		this.faxtime = faxtime;
	}

	public String getRcvid() {

		return rcvid;
	}

	public void setRcvid(String rcvid) {

		this.rcvid = rcvid;
	}

	public String getBg_item_count() {

		return bg_item_count;
	}

	public void setBg_item_count(String bg_item_count) {

		this.bg_item_count = bg_item_count;
	}

	public String getBg_net_amt() {

		return bg_net_amt;
	}

	public void setBg_net_amt(String bg_net_amt) {

		this.bg_net_amt = bg_net_amt;
	}

	public String getId() {

		return id;
	}

	public void setId(String id) {

		this.id = id;
	}

	public String getRequestdate() {

		return requestdate;
	}

	public void setRequestdate(String requestdate) {

		this.requestdate = requestdate;
	}

	public String getAmt() {

		return amt;
	}

	public void setAmt(String amt) {

		this.amt = amt;
	}

	public String getBgid() {

		return bgid;
	}

	public void setBgid(String bgid) {

		this.bgid = bgid;
	}

	public String getBilldate() {

		return billdate;
	}

	public void setBilldate(String billdate) {

		this.billdate = billdate;
	}

	public String getDeptid() {

		return deptid;
	}

	public void setDeptid(String deptid) {

		this.deptid = deptid;
	}

	public String getOrgid() {

		return orgid;
	}

	public void setOrgid(String orgid) {

		this.orgid = orgid;
	}

	public String getLastreferdate() {

		return lastreferdate;
	}

	public void setLastreferdate(String lastreferdate) {

		this.lastreferdate = lastreferdate;
	}

	public String getSstatus() {

		return sstatus;
	}

	public void setSstatus(String sstatus) {

		this.sstatus = sstatus;
	}

	public String getReplydate() {

		return replydate;
	}

	public void setReplydate(String replydate) {

		this.replydate = replydate;
	}

	@Override
	public String toString() {

		return "LihuaListJsonObject [created_date=" + created_date + ", status=" + status + ", rcvno=" + rcvno + ", needfax=" + needfax + ", pono=" + pono + ", sum=" + sum + ", reply_delivery_date=" + reply_delivery_date + ", faxtime=" + faxtime + ", rcvid=" + rcvid + ", bg_item_count=" + bg_item_count + ", bg_net_amt=" +
			bg_net_amt + ", id=" + id + ", requestdate=" + requestdate + ", amt=" + amt + ", bgid=" + bgid + ", billdate=" + billdate + ", deptid=" + deptid + ", orgid=" + orgid + ", lastreferdate=" + lastreferdate + ", sstatus=" + sstatus + ", replydate=" + replydate + "]";
	}

}
