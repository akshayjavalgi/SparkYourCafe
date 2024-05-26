package com.example.SparkYourCafe.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Products {

	private  long productId;
	private String productName;
	private String productDescription;
	private double price;
	
	
	private Category categoryId;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getProductId() {
		return productId;
	}


	public void setProductId(long productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getProductDescription() {
		return productDescription;
	}


	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}

	@ManyToOne
	@JoinColumn(name = "categoryId")
	public Category getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(Category categoryId) {
		this.categoryId = categoryId;
	}


	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productName=" + productName + ", productDescription="
				+ productDescription + ", price=" + price + "]";
	}

	
	



}
