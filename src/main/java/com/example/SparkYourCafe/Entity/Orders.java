package com.example.SparkYourCafe.Entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Orders {

	private long orderId;
	private LocalDate Date;
	private double amount;
	private String mode;
	
	private Category categoryId;
	private Products productId;
	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public LocalDate getDate() {
		return Date;
	}
	public void setDate(LocalDate date) {
		Date = date;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	@ManyToOne
	@JoinColumn(name = "categoryId")
	public Category getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Category categoryId) {
		this.categoryId = categoryId;
	}
	
	@ManyToOne
	@JoinColumn(name = "productId")
	public Products getProductId() {
		return productId;
	}
	public void setProductId(Products productId) {
		this.productId = productId;
	}
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", Date=" + Date + ", amount=" + amount + ", mode=" + mode
				+ ", categoryId=" + categoryId + ", productId=" + productId + "]";
	}
	
	
	
}
