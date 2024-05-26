package com.example.SparkYourCafe.Entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TableReservation {
	
	private long tableReservationId;
	private LocalDate reservationTime;
	private LocalDate startTime;
	private LocalDate endTime;
	private int numberOfPeople;
	

	private Customer customerId;
	private Tables tableId;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getTableReservationId() {
		return tableReservationId;
	}
	public void setTableReservationId(long tableReservationId) {
		this.tableReservationId = tableReservationId;
	}
	public LocalDate getReservationTime() {
		return reservationTime;
	}
	public void setReservationTime(LocalDate reservationTime) {
		this.reservationTime = reservationTime;
	}
	public LocalDate getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalDate startTime) {
		this.startTime = startTime;
	}
	public LocalDate getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalDate endTime) {
		this.endTime = endTime;
	}
	public int getNumberOfPeople() {
		return numberOfPeople;
	}
	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}
	
	@ManyToOne
	@JoinColumn(name="customerId")
	public Customer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}
	
	@ManyToOne
	@JoinColumn(name="tableId")
	public Tables getTableId() {
		return tableId;
	}
	
	public void setTableId(Tables tableId) {
		this.tableId = tableId;
	}
	
	@Override
	public String toString() {
		return "TableReservation [tableReservationId=" + tableReservationId + ", reservationTime=" + reservationTime
				+ ", startTime=" + startTime + ", endTime=" + endTime + ", numberOfPeople=" + numberOfPeople + "]";
	}
	
	
}
