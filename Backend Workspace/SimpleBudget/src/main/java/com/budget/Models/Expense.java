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
	@Column(name="EXPENSE_ID")
	private Integer expenseId;
	@Column(name="EXPENSE_Name")
	private String expenseName;
	@Column(name="EXPENSE_Amount")
	private Float expenseAmount;
	@Column(name="EXPENSE_Period")
	private String expensePeriod;
	@Column(name="USER_ID")
	private Integer userId;
	
	
	public Integer getExpenseId() {
		return expenseId;
	}
	public void setExpenseId(Integer expenseId) {
		this.expenseId = expenseId;
	}
	public String getExpenseName() {
		return expenseName;
	}
	public void setExpenseName(String expenseName) {
		this.expenseName = expenseName;
	}
	public Float getExpenseAmount() {
		return expenseAmount;
	}
	public void setExpenseAmount(Float expenseAmount) {
		this.expenseAmount = expenseAmount;
	}
	public String getExpensePeriod() {
		return expensePeriod;
	}
	public void setExpensePeriod(String expensePeriod) {
		this.expensePeriod = expensePeriod;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	@Override
	public String toString() {
		return "Expense [expenseId=" + expenseId + ", expenseName=" + expenseName + ", expenseAmount=" + expenseAmount
				+ ", expensePeriod=" + expensePeriod + ", userId=" + userId + "]";
	}
	
	
	

}
