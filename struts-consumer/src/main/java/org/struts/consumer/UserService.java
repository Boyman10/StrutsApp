package org.struts.consumer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.struts.consumer.dao.UsersDAO;
import org.struts.model.User;

@Service("userService")
public class UserService {

	private UsersDAO usersDAO;

	@Autowired
	public void setUsersDAO(UsersDAO usersDAO) {
		this.usersDAO = usersDAO;
	}
	
	public List<User> getUsers(){
		
		return usersDAO.getUsers();
	}
	
	public void doCreate(User user) {
		
		usersDAO.createUser(user);
	}
}
