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
	
	private String beforePrice;
	private String beforeMonyAmountWithTax;
	private String beforeTax;
	
	private String afterPrice;
	private String afterMonyAmountWithTax;
	private String afterTax;
	
	private String paperType;
	
	private String danjuhao; //fk

	//单号
	private String paperNumber;
	
	public String getDanjuhao() {
		return danjuhao;
	}
	public void setDanjuhao(String danjuhao) {
		this.danjuhao = danjuhao;
	}
	
	public String getPaperNumber() {
		return paperNumber;
	}
	public void setPaperNumber(String paperNumber) {
		this.paperNumber = paperNumber;
	}
	public String getPaperType() {
		return paperType;
	}
	public void setPaperType(String paperType) {
		this.paperType = paperType;
	}
	public String getBeforePrice() {
		return beforePrice;
	}
	public void setBeforePrice(String beforePrice) {
		this.beforePrice = beforePrice;
	}
	public String getBeforeMonyAmountWithTax() {
		return beforeMonyAmountWithTax;
	}
	public void setBeforeMonyAmountWithTax(String beforeMonyAmountWithTax) {
		this.beforeMonyAmountWithTax = beforeMonyAmountWithTax;
	}
	public String getBeforeTax() {
		return beforeTax;
	}
	public void setBeforeTax(String beforeTax) {
		this.beforeTax = beforeTax;
	}
	public String getAfterPrice() {
		return afterPrice;
	}
	public void setAfterPrice(String afterPrice) {
		this.afterPrice = afterPrice;
	}
	public String getAfterMonyAmountWithTax() {
		return afterMonyAmountWithTax;
	}
	public void setAfterMonyAmountWithTax(String afterMonyAmountWithTax) {
		this.afterMonyAmountWithTax = afterMonyAmountWithTax;
	}
	public String getAfterTax() {
		return afterTax;
	}
	public void setAfterTax(String afterTax) {
		this.afterTax = afterTax;
	}
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
		return "" + storageGroupId + "," + productNumber + ", " + description + "," + count + ", " + moneyAmount + ", " + dayBalanceInDb + ", " + storeNumber + ", "
				+ orderDate + ", " + taxRate + ", " + moneyAmountWithoutTax + ", " + barCode + "\n";
	}
}
