package com.budget.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.budget.Models.Income;

public interface IncomeRepo extends JpaRepository<Income, Integer> {

}
