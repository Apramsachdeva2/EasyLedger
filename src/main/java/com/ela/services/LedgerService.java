package com.ela.services;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;


import com.ela.models.Reciept;
import com.ela.models.RecieptDTO;
import com.ela.models.Transaction;

@Service
public class LedgerService {

	@Autowired
	private RestTemplate restTemplate;
	
	
	public List<Transaction> getTransByDateRange(int userId,int custId){
		
		try{Map<String,Object> uriVars=new HashMap<String,Object>();
		uriVars.put("userId", userId);
		uriVars.put("custId",custId);
		
			
		HttpHeaders headers=new HttpHeaders();
		HttpEntity entity=new HttpEntity(headers);
			
		
		ResponseEntity<RecieptDTO> response= restTemplate.exchange("http://localhost:8085/userCustRec?userId={userId}&custId={custId}", HttpMethod.GET,entity,RecieptDTO.class, uriVars);
		RecieptDTO dto=response.getBody();
		List<Reciept> recList=dto.getReciepts();
		List<Transaction> transacs=new ArrayList<Transaction>();
		for(Reciept rec : recList) {
			Transaction t=new Transaction();
			t.setRecieptId(rec.getRecieptId());
			t.setCustId(rec.getCustId());
			t.setUserId(rec.getUserId());
			t.setTransType("rec");
			t.setAmount(rec.getAmount());
			t.setDate(rec.getDate());
			transacs.add(t);		
			}
		System.out.println("In transaction Service - "+transacs);
		return transacs;
		
	}catch (Exception e) {
		// TODO: handle exception
		System.err.println(e.getMessage());
		return null;
	}
	}
}
