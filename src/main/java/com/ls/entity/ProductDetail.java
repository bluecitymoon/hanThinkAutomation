package com.ls.entity;

import java.io.Serializable;

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
	protected String productNumber;
	protected String barCode;
	protected String description;
	protected Integer count;
	protected Integer countInSingleBox;
	protected String priceWithTax;
	protected String priceWithoutTax;
	
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
	
	public Integer getCount() {
	
		return count;
	}
	
	public void setCount(Integer count) {
	
		this.count = count;
	}
	
	public Integer getCountInSingleBox() {
	
		return countInSingleBox;
	}
	
	public void setCountInSingleBox(Integer countInSingleBox) {
	
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
