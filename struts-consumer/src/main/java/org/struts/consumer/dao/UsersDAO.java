package org.struts.consumer.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.struts.model.User;

/**
 * Our users DAO using POstgresql
 * 
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
				
				return user;
			}
			
			
		}
		
				);
				
	}

	public void createUser(User user) {

	}
}
