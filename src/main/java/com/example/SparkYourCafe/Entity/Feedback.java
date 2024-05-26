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
import javax.validation.constraints.Size;

@Entity
public class Feedback {

	private long feedbackId;
	private String comment;
	private int rating;
	private LocalDate feedbackdate;
	
	private Customer customerId;
	private Category categoryId;
	private Products productId;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(long feedbackId) {
		this.feedbackId = feedbackId;
	}
	@Size(min = 20 ,max = 250, message = "Enter min 20 character and maximun 250")
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	@NotNull
	@NotEmpty
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@NotNull
	@NotEmpty
	public LocalDate getFeedbackdate() {
		return feedbackdate;
	}
	public void setFeedbackdate(LocalDate feedbackdate) {
		this.feedbackdate = feedbackdate;
	}
	
	@ManyToOne
	@JoinColumn(name = "customerId")
	public Customer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
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
		return "Feedback [feedbackId=" + feedbackId + ", comment=" + comment + ", rating=" + rating + ", feedbackdate="
				+ feedbackdate + ", customerId=" + customerId + ", categoryId=" + categoryId + ", productId="
				+ productId + "]";
	}
	
	
	
	
}
