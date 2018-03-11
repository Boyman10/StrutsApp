package org.struts.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*
 * Entity class to store User  properties
 * POJO
 * @author boy
 * @version 1
 */
@Component
@Qualifier("user") // designate the bean of this type
public class User {

	private int id;
	private String username;
	private String email;
	private String password;

	/**
	 * Empty Constructor
	 */
	public User() {
		
	}
	
	/**
	 * Constructor class initiliazing User
	 * @param username
	 * @param email
	 * @param password
	 */
	public User(String username, String email, String password) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}



}
