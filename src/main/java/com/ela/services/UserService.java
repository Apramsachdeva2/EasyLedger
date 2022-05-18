package com.ela.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.ela.models.User;
@Component
public class UserService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	public User validateUser(User user) {
		try {
		ResponseEntity<User> response = restTemplate.postForEntity("http://localhost:8082/auth/validUser", user, User.class);
		
		System.out.println(response);
		User valid_user= response.getBody();
		System.out.println(valid_user);
		if(valid_user.getUserName().equals(user.getUserName())  && valid_user.getPassword().equals(user.getPassword())) {
			return valid_user;
		}
		else{
			return null;
		}
		}catch(Exception e) {
			System.err.println(e.getMessage());
			return null;		
		}
	}
	
	
	public User updateUser(User user) {
		try {
			HttpEntity<User> entity=new HttpEntity<User>(user);
		//ResponseEntity<User> response = restTemplate.putForEntity("http://localhost:8082/auth/updateUser", user, User.class);
			System.err.println("uer in service="+user);
			ResponseEntity<User> response=restTemplate.exchange("http://localhost:8082/auth/updateUser", HttpMethod.PUT,entity,User.class);
		User updtd_user= response.getBody();
		System.out.println(updtd_user);
		return updtd_user;
		}catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
			return null;
		}
	}
}
