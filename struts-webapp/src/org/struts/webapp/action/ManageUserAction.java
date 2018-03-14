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
	private User user;
	
	public Integer getId() {
		
		return id;
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
}

