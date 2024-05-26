package com.example.SparkYourCafe.Entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class CustomerCoupons {

	private int customerCouponsId;
	private String code;
	private double disccountPercentage;
	private LocalDate expiryDate;
	
	private Customer customerId;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	public int getCustomerCouponsId() {
		return customerCouponsId;
	}

	public void setCustomerCouponsId(int customerCouponsId) {
		this.customerCouponsId = customerCouponsId;
	}

	@NotNull
	@NotEmpty
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@NotNull
	@NotEmpty
	public double getDisccountPercentage() {
		return disccountPercentage;
	}

	public void setDisccountPercentage(double disccountPercentage) {
		this.disccountPercentage = disccountPercentage;
	}

	@NotNull
	@NotEmpty
	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
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
		return "CustomerCoupons [customerCouponsId=" + customerCouponsId + ", code=" + code + ", disccountPercentage="
				+ disccountPercentage + ", expiryDate=" + expiryDate + "]";
	}
	
	
	
	
}
