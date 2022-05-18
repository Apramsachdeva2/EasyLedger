package com.ela.models;

import java.util.List;

public class CustomerDTO {

	private List<Customer> customersList;

	public CustomerDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerDTO(List<Customer> customersList) {
		super();
		this.customersList = customersList;
	}

	@Override
	public String toString() {
		return "CustomerDTO [customersList=" + customersList + "]";
	}

	public List<Customer> getCustomersList() {
		return customersList;
	}

	public void setCustomersList(List<Customer> customersList) {
		this.customersList = customersList;
	}
}
