package com.ela.models;

import java.util.List;

public class BillDTO {

	private List<Bill> bills;

	public BillDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BillDTO(List<Bill> bills) {
		super();
		this.bills = bills;
	}

	@Override
	public String toString() {
		return "BillDTO [bills=" + bills + "]";
	}

	public List<Bill> getBills() {
		return bills;
	}

	public void setBills(List<Bill> bills) {
		this.bills = bills;
	}
}
