package com.ela.models;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class Transaction {

	private String transType;
	private Integer billId;
	private Integer recieptId;
	private double amount;
	private int userId;
	private int custId;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate date;
	public String getTransType() {
		return transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}
	public Integer getBillId() {
		return billId;
	}
	public void setBillId(Integer billId) {
		this.billId = billId;
	}
	public Integer getRecieptId() {
		return recieptId;
	}
	public void setRecieptId(Integer recieptId) {
		this.recieptId = recieptId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
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
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Transaction [transType=" + transType + ", billId=" + billId + ", recieptId=" + recieptId + ", amount="
				+ amount + ", userId=" + userId + ", custId=" + custId + ", date=" + date + "]";
	}
	public Transaction(String transType, Integer billId, Integer recieptId, double amount, int userId, int custId,
			LocalDate date) {
		super();
		this.transType = transType;
		this.billId = billId;
		this.recieptId = recieptId;
		this.amount = amount;
		this.userId = userId;
		this.custId = custId;
		this.date = date;
	}
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	
	
}
