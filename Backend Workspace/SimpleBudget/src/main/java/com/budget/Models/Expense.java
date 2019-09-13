package com.budget.Models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


// Entity means it is a table in the database
@Entity
public class Expense {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="E_ID")
	private Integer Expense_ID;
	@Column(name="E_Name")
	private String E_Name;
	@Column(name="E_Amount")
	private Float E_Amount;
	@Column(name="Period")
	private String Period;
 
	public Integer getExpense_ID() {
		return Expense_ID;
	}
	public void setExpense_ID(Integer expense_ID) {
		Expense_ID = expense_ID;
	}
	public String getE_Name() {
		return E_Name;
	}
	public void setE_Name(String e_Name) {
		E_Name = e_Name;
	}
	public Float getE_Amount() {
		return E_Amount;
	}
	public void setE_Amount(Float e_Amount) {
		E_Amount = e_Amount;
	}
	public String getPeriod() {
		return Period;
	}
	public void setPeriod(String period) {
		Period = period;
	}
	@Override
	public String toString() {
		return "Expense [Expense_ID=" + Expense_ID + ", E_Name=" + E_Name + ", E_Amount=" + E_Amount + ", Period="
				+ Period + "]";
	}
	
 
	 
	
	

}
