package com.ela.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.swing.undo.CannotUndoException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import com.ela.models.Customer;
import com.ela.services.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService custService;
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/addCust")
	public String addCust(Model model) {
		
		model.addAttribute("cust",new Customer());
		return "addcust";
	}
	
	
	@PostMapping("/saveCust")
	public String  saveCustomer(@ModelAttribute("cust") Customer cust, Model model) {
		
		Boolean addCustomer = custService.addCustomer(cust);
		System.out.println(addCustomer);
			if(addCustomer) {
				model.addAttribute("cust_message", "Customer Added");
				return "addcust";
			}
			else{
			model.addAttribute("cust_message", "Customer Not Added");
			return "addcust";
			}
			
		}
		
	
	@GetMapping("/viewCustomers")
	public String viewCustomers(HttpSession session,Model model) {
		List<Customer> cust_list = (List<Customer>) session.getAttribute("cust_list");	
		
		if(cust_list==null) {
			cust_list=custService.getCustomersForUser((int) session.getAttribute("userId"));
			if(cust_list==null) {
				model.addAttribute("customers_exist",false);
			}			
			else {
				model.addAttribute("customers_exist",true);
				session.setAttribute("cust_list", cust_list);
				
			}
			
		}
		else {
			model.addAttribute("customers_exist",true);
			session.setAttribute("cust_list", cust_list);
			
		}
		return  "viewCustomers";
	}
	
	@GetMapping("/delCust/{custId}")
	public String deleteCustomer(@PathVariable("custId") int custId,HttpSession session,Model model) {
		
		if(custService.deleteCustomer(custId)) {
			List<Customer> cust_list=custService.getCustomersForUser((int) session.getAttribute("userId"));
			session.setAttribute("cust_list", cust_list);
			return "redirect:/viewCustomers";
		}
		else {
			model.addAttribute("cust_del_msg", "Customer could no be deleted");
			return "viewCustomers";
		}
		
		
	}
	

	@GetMapping("/custProfile/{custId}")
	public String customerProfile(HttpSession session, Model model,@PathVariable("custId") int custId) {
		
		List<Customer> cust_list=(List<Customer>) session.getAttribute("cust_list");
		for(Customer c:cust_list) {
			if(c.getCustId()==custId) {
				model.addAttribute("cust",c);
			}
		}
		
		return "custProfile";	
	}
	
	@PostMapping("/updtCust")
	public String updateCustomer(@ModelAttribute("cust") Customer cust,HttpSession session,Model model) {
		
		cust.setUserId((Integer) session.getAttribute("userId"));
		Boolean updateCustomer = custService.updateCustomer(cust);
		if(updateCustomer) {
			List<Customer> cust_list=custService.getCustomersForUser((int) session.getAttribute("userId"));
			session.setAttribute("cust_list", cust_list);
			model.addAttribute("customers_exist", true);
			return "viewCustomers";
		}
		else{
			model.addAttribute("cust",cust);
			model.addAttribute("cust_updtd_msg","Customer could not be updated");
			return "custProfile";
		}
	}
	
}
