package com.ela.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.ela.models.Reciept;
@Component
public class RecieptService {

	@Autowired
	private RestTemplate restTemplate;
	
	public Reciept saveReceipt(Reciept rec ) {
		try {
		ResponseEntity<Reciept> response = restTemplate.postForEntity("http://localhost:8085/saveRec", rec,Reciept.class);
		Reciept saved_rec=response.getBody();
		
		if(saved_rec!=null) {
			return saved_rec;
		}
		else {
			return null;
		}
		}catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
			return null;
		}
		
	}	
	
	public Reciept updateReciept(Reciept rec) {
		try {
			HttpEntity<Reciept> enity=new HttpEntity<Reciept>(rec);
			ResponseEntity<Reciept> response = restTemplate.exchange("http://localhost:8085/editRec", HttpMethod.PUT,enity,Reciept.class);
			Reciept updated_rec=response.getBody();
			if(updated_rec!=null) {
				return updated_rec;
			}
			else {
				return null;
			}
			
			
		}catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
			return null;
		}
		
		
		
	}
}
