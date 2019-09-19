package com.budget.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.budget.Models.User;
import com.budget.repo.UserRepository;

//@RestController = @Controller + @ReponseBody
@RestController

//@RequestMapping when used above a class will append the indicated mapping to
//the url path
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserRepository ur;
	
	@GetMapping(value="/hello")
	public String sayHello() {
		return "hello";
	}
	
	@GetMapping(value="/all")
	public List<User> findAll(){
		return ur.findAll();
	}
	
	@GetMapping(value="/{userId}")
	public Optional<User> findById(@PathVariable Integer userId){
		return ur.findById(userId);
	}
	@GetMapping(value="/username/{username}")
	public User findByUsername(@PathVariable String username) {
		return ur.findByUsername(username);
	}
	
	@PostMapping(value="/save")
	public Optional<User> save(@RequestBody User users) {
		ur.save(users);
		return ur.findById(users.getUserId());
	}
}