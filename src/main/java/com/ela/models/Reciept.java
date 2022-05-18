package com.ela.models;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class Reciept {

	private Integer recieptId;
	private int  userId;
	private int custId;
	private double amount;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate date;
	
	public Reciept() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Reciept(Integer recieptId, int userId, int custId, double amount, LocalDate date) {
		super();
		this.recieptId = recieptId;
		this.userId = userId;
		this.custId = custId;
		this.amount = amount;
		this.date = date;
	}
	
	
	@Override
	public String toString() {
		return "Reciept [recieptId=" + recieptId + ", userId=" + userId + ", custd=" + custId + ", amount=" + amount
				+ ", date=" + date + "]";
	}
	
	
	public Integer getRecieptId() {
		return recieptId;
	}
	public void setRecieptId(Integer recieptId) {
		this.recieptId = recieptId;
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
	public void setCustId(int custd) {
		this.custId = custd;
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
	
	
}
