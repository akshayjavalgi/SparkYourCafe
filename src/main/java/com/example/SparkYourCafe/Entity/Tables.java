package com.example.SparkYourCafe.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tables {

	
	private long tableId;
	private int tableNumber;
	private int capacity;
	private boolean available;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getTableId() {
		return tableId;
	}
	public void setTableId(long tableId) {
		this.tableId = tableId;
	}
	public int getTableNumber() {
		return tableNumber;
	}
	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	@Override
	public String toString() {
		return "Table [tableId=" + tableId + ", tableNumber=" + tableNumber + ", capacity=" + capacity + ", available="
				+ available + "]";
	}
	
	
	
}
