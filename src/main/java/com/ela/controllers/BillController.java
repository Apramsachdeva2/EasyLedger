package com.ela.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ela.models.Bill;
import com.ela.models.Customer;
import com.ela.services.BillService;
import com.ela.services.CustomerService;

@Controller
public class BillController {

	@Autowired
	private CustomerService cust_service;
	@Autowired
	private BillService billService;
	

	@GetMapping("/addBill")
	public String addBill(Model model,HttpSession session,@ModelAttribute("bill") Bill bill) {
		List<Customer> cust_list=cust_service.getCustomersForUser((int) session.getAttribute("userId"));
		if(cust_list==null) {
			model.addAttribute("bill_updt_msg","Please add a customer");
		}
		session.setAttribute("cust_list", cust_list);
		model.addAttribute("bill",new Bill());
		session.setAttribute("updated",false);
		return "addbill";
		
	}
	@PostMapping("/saveBill")
	public String saveBill(@ModelAttribute("bill") Bill bill, HttpSession session,Model model) {
		
		if((boolean) session.getAttribute("updated")) {
			
			Bill updateBill = billService.updateBill(bill);
			
			session.setAttribute("bill",updateBill);
			 model.addAttribute("bill_id", updateBill.getBillId());
			return "billsummary";
		}
		
		
		bill.setUserId((int) session.getAttribute("userId"));
		Bill savedBill = billService.saveBill(bill);
		
		session.setAttribute("bill",savedBill);
		 model.addAttribute("bill_id", savedBill.getBillId());
		return "billsummary";
		
	}
	
	@PostMapping("/updtBill")
	public String updtBill(Model model , HttpSession session) {
		Bill bill=(Bill) session.getAttribute("bill");
		
		model.addAttribute("bill",bill);
		session.setAttribute("updated",true);
		return "updtBill";
	} 

}
