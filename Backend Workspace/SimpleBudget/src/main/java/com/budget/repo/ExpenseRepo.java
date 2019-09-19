package com.budget.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.budget.Models.Expense;

@Repository
public interface ExpenseRepo extends JpaRepository<Expense, Integer>{

}
