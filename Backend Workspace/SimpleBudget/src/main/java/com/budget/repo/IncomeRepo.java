package com.budget.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.budget.Models.Income;

@Repository
public interface IncomeRepo extends JpaRepository<Income, Integer> {

}
