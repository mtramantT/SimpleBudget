package com.budget.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.budget.Models.Receipt;

@Repository
public interface ReceiptRepo extends JpaRepository<Receipt, Integer>{
	
}
