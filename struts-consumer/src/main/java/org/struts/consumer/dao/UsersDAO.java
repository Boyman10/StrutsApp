package org.struts.consumer.dao;

import java.util.List;

import org.springframework.stereotype.Component;
import org.struts.model.User;

/**
 * Our users DAO
 * using POstgresql
 * @author John
 *
 */
@Component("usersDAO")
public class UsersDAO {

	private NamedParameterJdbcTemplate jdbc;
	
	/**
	 * Empty constructor
	 */
	public UsersDAO() {
		
		System.out.println("Good on you users DAO is loaded fine !!");
	}
	
	/**
	 * Method to get the list of users.
	 * @return
	 */
	public List<User> getUsers() {
		
		return null;
	}
	
	
	public void createUser(User user) {
		
		
	}
}
