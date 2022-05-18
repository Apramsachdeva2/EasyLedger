package com.ela.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.ela.models.Bill;
@Component
public class BillService {

	@Autowired
	private RestTemplate restTemplate;
	
	public Bill saveBill(Bill bill) {
		try {
			ResponseEntity<Bill> response=restTemplate.postForEntity("http://localhost:8084/saveBill", bill, Bill.class);
			System.err.println("billService -"+response);
			Bill saved_bill=response.getBody();
			return saved_bill;
			
		}catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
			return null;
			
		}
	}
	
	public Bill updateBill(Bill bill) {
		try {
		HttpEntity<Bill> entity=new HttpEntity<Bill>(bill);
		ResponseEntity<Bill> response = restTemplate.exchange("http://localhost:8084/updateBill", HttpMethod.PUT,entity, Bill.class);
		Bill updt_bill=response.getBody();
		return updt_bill;
		}catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
			return null;
		}
	
	
	}
	
}
