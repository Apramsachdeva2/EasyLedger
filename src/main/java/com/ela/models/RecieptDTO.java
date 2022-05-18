package com.ela.models;

import java.util.List;



public class RecieptDTO {

	private List<Reciept> reciepts;

	public List<Reciept> getReciepts() {
		return reciepts;
	}

	public void setReciepts(List<Reciept> reciepts) {
		this.reciepts = reciepts;
	}

	public RecieptDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RecieptDTO(List<Reciept> reciepts) {
		super();
		this.reciepts = reciepts;
	}

	@Override
	public String toString() {
		return "RecieptDTO [reciepts=" + reciepts + "]";
	}
	
}
