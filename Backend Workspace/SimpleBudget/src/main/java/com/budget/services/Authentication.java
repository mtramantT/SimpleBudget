package com.budget.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.budget.Models.User;
import com.budget.repo.UserRepo;

//TODO: Implement Logger and clean up code
public class Authentication {
	
	@Autowired
	UserRepo ur;
	
	
	/**
	 * Calls the findByUsername function from UserRepo. If a user is pulled, 
	 * it calls the checkPassword function and passes the input user object. If it returns true the function will
	 * return the fetched user object, otherwise it returns null. 
	 * @param user
	 * @return
	 */
	public User fetchUser(User user) {
		User fetchedUser;
		try {
			//TODO: Log user details
			fetchedUser = ur.findByUsername(user.getUsername());
			if(checkPassword(fetchedUser, user.getPassword())) {
				return fetchedUser;
			}
			return null;
		}catch(Exception e) {
			//TODO change to custom error and return that.
			//TODO Implement logger
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Checks if the passed user entered the correct password or not.
	 * @param user
	 * @param inputPassword
	 * @return true/false
	 */
	public boolean checkPassword(User fetchedUser, String inputPassword) {
		try {
			String password = fetchedUser.getPassword();
			if(password.contentEquals(inputPassword)) {
				return true;
			}
			return false;
		}catch(Exception e) {
			return false;
		}
	}
}
