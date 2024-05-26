package com.example.SparkYourCafe.Entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Coupons {

	private long couponId;
	private String couponCode;
	private double discountPercentage;
	private LocalDate startDate;
	private LocalDate endDate;
	private int usageLimit;
	
	private Customer customerId;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getCouponId() {
		return couponId;
	}

	public void setCouponId(long couponId) {
		this.couponId = couponId;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public double getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public int getUsageLimit() {
		return usageLimit;
	}

	public void setUsageLimit(int usageLimit) {
		this.usageLimit = usageLimit;
	}

	@ManyToOne
	@JoinColumn(name = "customerId")
	public Customer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "Coupons [couponId=" + couponId + ", couponCode=" + couponCode + ", discountPercentage="
				+ discountPercentage + ", startDate=" + startDate + ", endDate=" + endDate + ", usageLimit="
				+ usageLimit + ", customerId=" + customerId + "]";
	}
	
	
	
}
