package com.budget.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.budget.Models.Receipt;
import com.budget.repo.ReceiptRepo;

@RestController
@RequestMapping("/")
public class ReceiptController {
	
	@Autowired
	ReceiptRepo rr;
	
	@PostMapping("/save")
	public void saveReceipt(@RequestBody Receipt receipt) {
		rr.save(receipt);
	}

}
