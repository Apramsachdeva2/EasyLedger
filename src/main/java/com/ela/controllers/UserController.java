package com.ela.controllers;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.ela.models.User;
import com.ela.services.UserService;

@Controller

public class UserController {

	@Autowired
	private UserService service;
	@GetMapping(value={"","/","/home"})
	public String home(HttpSession session) {
		session.invalidate();
		return "home";
	}
	
	@GetMapping("/login")
	public String login(HttpSession session) {
		session.invalidate();
		return "login";
	}
	
	@PostMapping("/validate")
	public String validation(@ModelAttribute User user , Model model, HttpSession session) {

		User valid_user=service.validateUser(user);
		if(valid_user==null) {
			model.addAttribute("validate_msg","User not found");
			return "login";
		}
		
	else {
		model.addAttribute("userId",valid_user.getUserId());
		session.setAttribute("loggedIn","true");
		session.setAttribute("userId", valid_user.getUserId());
		session.setAttribute("user", valid_user);
		return "redirect:/user";
	}
}
	
	@GetMapping("/user")
	public String userHome(HttpSession session) {
		System.err.println(session.getAttribute("loggedIn"));
		if(session.getAttribute("loggedIn")=="true") {
			return "userhome";
		}
		else {
			return "redirect:/login";
		}
		
	}
	
	@GetMapping("/profile")
	public String viewProfile( Model model,HttpSession session) {
		
		System.err.println(session.getAttribute("loggedIn"));
		if(session.getAttribute("loggedIn")=="true") {
			
			model.addAttribute("user",session.getAttribute("user"));
			
			return "myprofile";
		}
		else {
			return "redirect:/login";
		}
		
		
		
	}
	
	@PostMapping("/updtuser")
	public String updateUser(@ModelAttribute("user") User user,HttpSession session,Model model) {
		User updateUser = service.updateUser(user);
		if(updateUser==null) {
			model.addAttribute("updt_msg","user details not updated" );
			
			return "myprofile";
			
		}
		else {
			session.setAttribute("user", updateUser);
			return"redirect:/user";
						
		}
		
	}
	
	
	@GetMapping("/logout")
	public String logout() {
		
		return "redirect:/login";
	}
	

	
}
