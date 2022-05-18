package com.ela.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ela.models.Customer;
import com.ela.models.Reciept;
import com.ela.services.CustomerService;
import com.ela.services.RecieptService;

@Controller
public class RecieptController {

	@Autowired
	private RecieptService recService;
	@Autowired
	private CustomerService custService;
	
	@GetMapping("/addRec")
	public String addRec(Model model,HttpSession session) {
		List<Customer> cust_list=custService.getCustomersForUser((int) session.getAttribute("userId"));
		model.addAttribute("rec",new Reciept());
		if(cust_list==null) {
			model.addAttribute("rec_updt_msg","Please add a customer");
		}
		session.setAttribute("cust_list", cust_list);
		session.setAttribute("updated_rec", false);
		return "addReciept";
		
	}
	
	@PostMapping("/saveRec")
	public String saveReciept(@ModelAttribute("rec") Reciept rec, Model model,HttpSession session) {
		rec.setUserId((int) session.getAttribute("userId"));
		if(!(boolean) session.getAttribute("updated_rec"))
		{
		
		Reciept saveReceipt = recService.saveReceipt(rec);
		
		if(saveReceipt==null) {
			model.addAttribute("rec_updt_msg","Receipt Not Added");
			return "addReciept";
			}

		else {
			model.addAttribute("recId",saveReceipt.getRecieptId());
			session.setAttribute("rec", saveReceipt);
			return "recsummary";
		}
		}
		else {
			Reciept updatedReciept = recService.updateReciept(rec);
			model.addAttribute("recId",updatedReciept.getRecieptId());
			session.setAttribute("rec", updatedReciept);
			return "recsummary";
			
		}
		
	}
	
	@GetMapping("/updtRec")
	public String updateReciept(Model model,HttpSession session) {
		model.addAttribute("rec",session.getAttribute("rec"));
		session.setAttribute("updated_rec", true);
		return "uodtRec";
		
	}
	
}
