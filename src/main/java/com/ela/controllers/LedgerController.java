package com.ela.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ela.models.Transaction;
import com.ela.services.LedgerService;

@Controller
public class LedgerController {

	@Autowired
	private LedgerService  ledgerService;
	
	
	
	@GetMapping("/ledger")
	public String ledgerHome() {
		
	return "viewLedger";	
		
	}
	
	@PostMapping("/ledCustId")
	public String getTrasListByCustId(@RequestParam("type") String type, @RequestParam("custId") int custId,Model model,HttpSession session) {
		
		if(type.equals("both")) {
			List<Transaction> transByDateRange = ledgerService.getTransByDateRange((int) session.getAttribute("userId"), custId);
			System.out.println(transByDateRange);
			return "viewTrans";
		}
		else if(type.equals("bill")){
			return "viewTrans";
		}
		else if(type.equals("rec")){
			return "viewTrans";
		}
		
		model.addAttribute("viewLedger", "Select type of Transaction");
		return "viewLedger";
	}
}
