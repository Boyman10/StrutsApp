package org.struts.webapp.action;

import java.util.List;

import org.struts.model.User;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Class mapping the manager user action
 * @author John
 * @version 1
 */
public class ManageUserAction extends ActionSupport {

	private static final long serialVersionUID = 7246774814524999309L;

	// The actionsupport already bring interesting stuff
	
	// User id
	private Integer id;
	
	private List<User> listUsers;
	private User userBean;
	
	public Integer getId() {
		
		return id;
	}

	public User getUser() {
		return userBean;
	}

	public void setUser(User user) {
		this.userBean = user;
	}

	/**
	 * Method which returns users
	 * replaces default execute method
	 * @return success
	 */
	public String doList() {
		
		// Retrieve the list of users using the manager factory having the userManager returning the users listing
		//listUsers = WebappHelper.getManagerFactory().getUserManager().getListUsers();
		return ActionSupport.SUCCESS;
	}
	
	/**
	 * 
	 * @return
	 */
	public String doDetail() {
		
		
		return ActionSupport.SUCCESS;
	}
	
	/**
	 * Login method checking user sign in
	 * @return
	 */
	public String doLogin() {
		
		// Call service class to retrieve and compare state in database
		
		
		return ActionSupport.SUCCESS;
	}
	
	/**
	 * Register method
	 * @return
	 */
	public String doRegister() {
		
		// Call service class to store and compare state in database
		
		
		return ActionSupport.SUCCESS;
	}	
}

