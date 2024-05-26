package com.example.SparkYourCafe.Entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
public class Complaints {

	
	private long complaintId;
	private String description;
	private LocalDate date;
	private String status;
	
	
	
	private Customer customerId;
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	public long getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(long complaintId) {
		this.complaintId = complaintId;
	}

	@Size(min = 20 ,max = 250, message = "Enter min 20 character and maximun 250")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@NotBlank
	@NotNull
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@NotEmpty
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@ManyToOne
	@JoinColumn(name="customerId")
	public Customer getCustomer() {
		return customerId;
	}

	public void setCustomer(Customer customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "Complaints [complaintId=" + complaintId + ", description=" + description + ", date=" + date
				+ ", status=" + status + "]";
	}

}
