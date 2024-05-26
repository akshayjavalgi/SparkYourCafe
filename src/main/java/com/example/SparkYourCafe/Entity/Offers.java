package com.example.SparkYourCafe.Entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Offers {

	
	private long offerId;
	private String name;
	private String deescription;
	private LocalDate startDate;
	private LocalDate endDate;
	private double discount;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getOfferId() {
		return offerId;
	}
	public void setOfferId(long offerId) {
		this.offerId = offerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeescription() {
		return deescription;
	}
	public void setDeescription(String deescription) {
		this.deescription = deescription;
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
	public double getDiscount() {
		return discount;
	}
	
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	@Override
	public String toString() {
		return "Offers [offerId=" + offerId + ", name=" + name + ", deescription=" + deescription + ", startDate="
				+ startDate + ", endDate=" + endDate + ", discount=" + discount + "]";
	}
	
	
}
