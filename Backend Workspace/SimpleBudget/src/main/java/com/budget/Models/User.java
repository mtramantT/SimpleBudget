package com.budget.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	@Id//used to indicate field is the primary key
	@GeneratedValue//used to indicate that it will be auto generated
	@Column(name="USER_ID")
	private Integer userId;
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="USERNAME")
	private String username;
	@Column(name="PASSWORD")
	private String password;
	@Column(name="EMAIL")
	private String email;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUsername() {
		return username;
	}
	public void setUserName(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", userName="
				+ username + ", password=" + password + ", email=" + email + "]";
	}
	public User(Integer userId, String firstName, String lastName, String userName, String password, String email) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = userName;
		this.password = password;
		this.email = email;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userName, String password) {
		super();
		this.username = userName;
		this.password = password;
	}
}
