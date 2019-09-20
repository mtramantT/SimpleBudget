package com.budget.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.budget.Models.User;
import com.budget.repo.UserRepo;
import com.budget.services.Authentication;

//@RestController = @Controller + @ReponseBody
@RestController

//@RequestMapping when used above a class will append the indicated mapping to
//the url path
@RequestMapping("/users")
@CrossOrigin
public class UserController {
	
//	===IMPORTS===
	@Autowired
	private UserRepo ur;
	
	@Autowired
	Authentication auth;
	
//	===CONTROLLER METHODS ===
	@GetMapping(value="/hello")
	@ResponseBody
	public String sayHello() {
		return "hello";
	}
	
	@GetMapping(value="/all")
	public List<User> findAll(){
		return ur.findAll();
	}
	
	@GetMapping(value="/id/{userId}")
	public Optional<User> findById(@PathVariable Integer userId){
		return ur.findById(userId);
	}
	
	//Used for custom Validator when registering
	//TODO: implement async validation
	@GetMapping(value="/username/{username}")
	public User findByUsername(@PathVariable String username) {
		return ur.findByUsername(username);
	}
	
	@PostMapping(value="/save")
	public Optional<User> save(@RequestBody User users) {
		ur.save(users);
		return ur.findById(users.getUserId());
	}
	
	@PostMapping(value="/login")
	@ResponseBody
	public User login(@RequestBody User user) {
		User fetchedUser;
		fetchedUser = auth.fetchUser(user);
		if(fetchedUser != null) {
			return fetchedUser;
		}
		//TODO: implement custom error to send back
		return null;
	}
}