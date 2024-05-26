package com.example.SparkYourCafe.Entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
	@Size(min = 2 ,max = 20, message = "Enter valid name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Size(min = 20 ,max = 250, message = "Enter min 20 character and maximun 250")
	public String getDeescription() {
		return deescription;
	}
	public void setDeescription(String deescription) {
		this.deescription = deescription;
	}
	
	@NotNull
	@NotEmpty
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	@NotNull
	@NotEmpty
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	@NotNull
	@NotEmpty
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
