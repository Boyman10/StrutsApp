package org.struts.business.model;

/*
 * Entity class to store User  properties
 * POJO
 * @author boy
 * @version 1
 */
public class User {

	private int id;
	private String username;
	private String email;
	private String password;

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