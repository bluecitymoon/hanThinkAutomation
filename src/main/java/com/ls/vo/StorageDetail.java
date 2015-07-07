package com.ls.vo;

public class StorageDetail {
	private String storageGroupId;
	private String productNumber;
	private String description;
	private String count;
	private String moneyAmount;
	private String dayBalanceInDb;
	
	private String storeNumber;
	private String orderDate;
	private String taxRate;
	private String moneyAmountWithoutTax;
	private String barCode;
	
	public String getBarCode() {
		return barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}
	public String getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}
	public String getMoneyAmountWithoutTax() {
		return moneyAmountWithoutTax;
	}
	public void setMoneyAmountWithoutTax(String moneyAmountWithoutTax) {
		this.moneyAmountWithoutTax = moneyAmountWithoutTax;
	}
	public String getStoreNumber() {
		return storeNumber;
	}
	public void setStoreNumber(String storeNumber) {
		this.storeNumber = storeNumber;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getStorageGroupId() {
		return storageGroupId;
	}
	public void setStorageGroupId(String storageGroupId) {
		this.storageGroupId = storageGroupId;
	}
	public String getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getMoneyAmount() {
		return moneyAmount;
	}
	public void setMoneyAmount(String moneyAmount) {
		this.moneyAmount = moneyAmount;
	}
	public String getDayBalanceInDb() {
		return dayBalanceInDb;
	}
	public void setDayBalanceInDb(String dayBalanceInDb) {
		this.dayBalanceInDb = dayBalanceInDb;
	}
	@Override
	public String toString() {
		return "StorageDetail [storageGroupId=" + storageGroupId + ", productNumber=" + productNumber + ", description=" + description + ", count=" + count + ", moneyAmount=" + moneyAmount + ", dayBalanceInDb=" + dayBalanceInDb + ", storeNumber=" + storeNumber + ", orderDate="
				+ orderDate + ", taxRate=" + taxRate + ", moneyAmountWithoutTax=" + moneyAmountWithoutTax + ", barCode=" + barCode + "]";
	}
}
