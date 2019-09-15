package com.budget.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.budget.Models.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	public String findByUsername(String username);
	
}