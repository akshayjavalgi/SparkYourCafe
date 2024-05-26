package com.example.SparkYourCafe.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PaymentType {
 
	private long paymentTypeId;
	private String paymentType;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getPaymentTypeId() {
		return paymentTypeId;
	}
	public void setPaymentTypeId(long paymentTypeId) {
		this.paymentTypeId = paymentTypeId;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	@Override
	public String toString() {
		return "PaymentType [paymentTypeId=" + paymentTypeId + ", paymentType=" + paymentType + "]";
	}
	
	
}
