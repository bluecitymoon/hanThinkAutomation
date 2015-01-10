package com.ls.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ls_product")
public class ProductDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7018160450581157710L;
	@Id
	@GeneratedValue
	protected Integer id;
	protected Integer orderId;
	protected String orderNumber;
	protected String productNumber;
	protected String barCode;
	protected String description;
	protected String count;
	protected String countInSingleBox;
	protected String priceWithTax;
	protected String priceWithoutTax;
	protected Date createDate;
	protected String moneyAmountWithoutTax;
	protected String giftName;
	protected String giftCount;
	protected String giftCode;
	
	public String getGiftCode() {
		return giftCode;
	}

	public void setGiftCode(String giftCode) {
		this.giftCode = giftCode;
	}

	public String getGiftName() {
		return giftName;
	}

	public void setGiftName(String giftName) {
		this.giftName = giftName;
	}

	public String getGiftCount() {
		return giftCount;
	}

	public void setGiftCount(String giftCount) {
		this.giftCount = giftCount;
	}

	public String getMoneyAmountWithoutTax() {
	
		return moneyAmountWithoutTax;
	}
	
	public void setMoneyAmountWithoutTax(String moneyAmountWithoutTax) {
	
		this.moneyAmountWithoutTax = moneyAmountWithoutTax;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Integer getId() {
	
		return id;
	}
	
	public void setId(Integer id) {
	
		this.id = id;
	}
	
	public Integer getOrderId() {
	
		return orderId;
	}
	
	public void setOrderId(Integer orderId) {
	
		this.orderId = orderId;
	}
	
	public String getProductNumber() {
	
		return productNumber;
	}
	
	public void setProductNumber(String productNumber) {
	
		this.productNumber = productNumber;
	}
	
	public String getBarCode() {
	
		return barCode;
	}
	
	public void setBarCode(String barCode) {
	
		this.barCode = barCode;
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

	
	public String getCountInSingleBox() {
	
		return countInSingleBox;
	}

	
	public void setCountInSingleBox(String countInSingleBox) {
	
		this.countInSingleBox = countInSingleBox;
	}

	public String getPriceWithTax() {
	
		return priceWithTax;
	}
	
	public void setPriceWithTax(String priceWithTax) {
	
		this.priceWithTax = priceWithTax;
	}
	
	public String getPriceWithoutTax() {
	
		return priceWithoutTax;
	}
	
	public void setPriceWithoutTax(String priceWithoutTax) {
	
		this.priceWithoutTax = priceWithoutTax;
	}
	
	
}
