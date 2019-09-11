package com.budget.Models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Receipt {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="RECEIPT_ID")
	private Integer RECEIPT_ID;
//	@Column(name="RECEIPT_DATE")
//	private Timestamp RECEIPT_DATE;
	@Column(name="RECEIPT_AMOUNT")
	private Timestamp RECEIPT_AMOUNT;
	
	
}
