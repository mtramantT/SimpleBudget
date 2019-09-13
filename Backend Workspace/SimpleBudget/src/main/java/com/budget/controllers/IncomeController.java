package com.budget.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.budget.repo.IncomeRepo;

@RestController
@RequestMapping("/income")
public class IncomeController {
	
	@Autowired
	IncomeRepo ir;

}
