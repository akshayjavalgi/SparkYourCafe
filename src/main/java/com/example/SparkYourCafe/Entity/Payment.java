package com.example.SparkYourCafe.Entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Payment {

	private  long paymentId;
	private Orders orderId;
	private LocalDate paymentDate;
	private double ammount;
	private PaymentType paymentTypeId;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}
	
	@ManyToOne
	@JoinColumn(name = "orderId")
	public Orders getOrderId() {
		return orderId;
	}
	public void setOrderId(Orders orderId) {
		this.orderId = orderId;
	}
	public LocalDate getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}
	public double getAmmount() {
		return ammount;
	}
	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}
	
	@ManyToOne
	@JoinColumn(name = "paymentTypeId")
	public PaymentType getPaymentTypeId() {
		return paymentTypeId;
	}
	public void setPaymentTypeId(PaymentType paymentTypeId) {
		this.paymentTypeId = paymentTypeId;
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", orderId=" + orderId + ", paymentDate=" + paymentDate
				+ ", ammount=" + ammount + ", paymentTypeId=" + paymentTypeId + "]";
	}
	
	
	
}
