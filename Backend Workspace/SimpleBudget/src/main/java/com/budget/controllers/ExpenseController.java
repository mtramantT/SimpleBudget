package com.budget.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.budget.repo.ExpenseRepo;
import com.budget.repo.ReceiptRepo;

@RestController
@RequestMapping("/expense")
public class ExpenseController {

	@Autowired
	ExpenseRepo er;
	 
	
	
}
