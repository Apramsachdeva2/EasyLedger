package com.ela.services;

import java.net.URI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.ela.models.Customer;
import com.ela.models.CustomerDTO;
@Component
public class CustomerService {

	
	@Autowired
	private RestTemplate restTemplate;
	
	public List<Customer> getCustomersForUser(int userId){
		try {
			
	
		ResponseEntity<CustomerDTO> response=restTemplate.getForEntity("http://localhost:8081/cust/getCust/"+userId,CustomerDTO.class);
			CustomerDTO cust_dto=response.getBody();
			List<Customer> cust_list=cust_dto.getCustomersList();
//			System.err.println("cust service -"+cust_list);
			
			return cust_list;
			
		}catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
			return null;
		}
		
	}
	
	public Boolean addCustomer(Customer cust) {
		try {
			ResponseEntity<String> response = restTemplate.postForEntity("http://localhost:8081/cust/saveCust", cust,String.class);
			String saved_cust=response.getBody();
			System.err.println("in customer service "+saved_cust);
			if(saved_cust.equals("User Created")) {
				return true;
			}
			else {
				return false;
			}
			
			
		}catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
			return false;
		}}
		
		public Boolean deleteCustomer(int custId) {
			try {
			URI uri	=new URI("http://localhost:8081/cust/delCust/"+custId);
			restTemplate.delete(uri);
			return true;
						}
			catch (Exception e) {
				// TODO: handle exception
				System.err.println(e.getMessage());
				return false;
			}
			
		}
		
		public Boolean updateCustomer(Customer cust) {
			try {
			
				restTemplate.put("http://localhost:8081/cust/updateCust",cust);
				return true;
			}
			catch (Exception e) {
				// TODO: handle exception
				System.err.println(e.getMessage());
				return false;
				
			}
		}
	}

