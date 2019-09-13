package com.budget.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Income {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="INCOME_ID")
	private Integer incomeId;
	@Column(name="INCOME_NAME")
	private String name;
	@Column(name="INCOME_TYPE")
	private Boolean salary;
	@Column(name="INCOME_AMOUNT")
	private Float incomeAmount;
		
}
