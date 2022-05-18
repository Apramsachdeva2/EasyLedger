package com.ela.models;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class Bill {

	private Integer billId;
	private int userId;
	private int custId;
	private double amount;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate date;
	
	
	public Integer getBillId() {
		return billId;
	}
	public void setBillId(Integer billId) {
		this.billId = billId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	


	public Bill(Integer billId,int userId, int custId, double amount, LocalDate date) {
		super();
		this.billId = billId;
		
		this.userId = userId;
		this.custId = custId;
		this.amount = amount;
		this.date = date;
	}
	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Bill [billId=" + billId + ", userId=" + userId + ", custId=" + custId + ", amount=" + amount + ", date="
				+ date + "]";
	}
}
