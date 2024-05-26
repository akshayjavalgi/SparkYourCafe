package com.example.SparkYourCafe.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
public class Customer {

	private long customerId;
	private String customerName;
	private String customerEmail;
	private long customerMobile;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	
	@NotNull
	@NotEmpty
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	@Email
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	
	@NotEmpty
	@NotNull
	@Length(min = 10,max = 10,message = "Enter valid mobile number")
	public long getCustomerMobile() {
		return customerMobile;
	}
	public void setCustomerMobile(long customerMobile) {
		this.customerMobile = customerMobile;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerEmail="
				+ customerEmail + ", customerMobile=" + customerMobile + "]";
	}
	
	
}
