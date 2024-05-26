package com.example.SparkYourCafe.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

@Entity
public class Employee {
	private long employeeId;
	private String employeeName;
	private String designation;
	private String employeeEmail;
	private long employeeMobile;
	private double salary;
	
	private User userId;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	@NotNull
	@NotEmpty
	@Size(min = 2,max = 20,message = "Please enter valid name")
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@NotNull
	@NotEmpty
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Email
	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
 
	@Length(min = 10,max = 10,message = "Enter valid mobile number")
	public long getEmployeeMobile() {
		return employeeMobile;
	}

	public void setEmployeeMobile(long employeeMobile) {
		this.employeeMobile = employeeMobile;
	}

	@NotNull
	@NotEmpty
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@ManyToOne
	@JoinColumn(name = "userId")
	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}
	
	
}
