package org.struts.consumer.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.struts.model.User;

/**
 * Our users DAO using POstgresql
 * 
 * @author John
 *
 */
@Repository("usersDAO")
public class UsersDAO {

	private NamedParameterJdbcTemplate jdbc;

	/**
	 * Empty constructor
	 */
	public UsersDAO() {

		System.out.println("Good on you users DAO is loaded fine !!");
	}

	@Autowired
	public void setDataSource(DataSource jdbc) {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}

	/**
	 * Method to get the list of users.
	 * @return
	 */
	public List<User> getUsers() {
		
		return jdbc.query("SELECT * FROM user", new RowMapper<User>() {

			@Override
			public User mapRow(ResultSet rs, int nRows) throws SQLException {
				
				User user = new User();
				user.setUsername(rs.getString("username"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				
				return user;
			}
			
			
		}
		
				);
				
	}

	/**
	 * Creating user in database now 
	 * @param user
	 * @return
	 */
	@Transactional
	public boolean createUser(User user) {

		
		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(user);
		
		System.out.println("entering dao method to create user");
		return jdbc.update("INSERT INTO user(username,email,password) values(:username,:email,:password)", params) == 1;
		
		
	}
}
