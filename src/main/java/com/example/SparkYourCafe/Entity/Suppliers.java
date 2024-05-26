package com.example.SparkYourCafe.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Suppliers {

	private long supplierId;
	private String supplierName;
	private long supplierContact;
	private String supplierEmail;
	private String address;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(long supplierId) {
		this.supplierId = supplierId;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public long getSupplierContact() {
		return supplierContact;
	}
	public void setSupplierContact(long supplierContact) {
		this.supplierContact = supplierContact;
	}
	public String getSupplierEmail() {
		return supplierEmail;
	}
	public void setSupplierEmail(String supplierEmail) {
		this.supplierEmail = supplierEmail;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Suppliers [supplierId=" + supplierId + ", supplierName=" + supplierName + ", supplierContact="
				+ supplierContact + ", supplierEmail=" + supplierEmail + ", address=" + address + "]";
	}
	
	
}
