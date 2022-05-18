package com.ela.models;


public class Customer {

	
	private Integer custId;
	private String custName;
			
	private String custPhone;
	
	private Integer userId;
	
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custPhone=" + custPhone + ", userId="
				+ userId + "]";
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(Integer custId, String custName, String custPhone, Integer userId) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custPhone = custPhone;
		this.userId = userId;
	}

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustPhone() {
		return custPhone;
	}

	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}


}
