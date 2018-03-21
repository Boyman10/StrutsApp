package org.struts.webapp.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.struts.consumer.UserService;
import org.struts.model.User;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Class mapping the manager user action
 * @author John
 * @version 1
 */
@Controller
public class ManageUserAction extends ActionSupport implements SessionAware  {

	private static final long serialVersionUID = 7246774814524999309L;

	//https://struts.apache.org/getting-started/http-session.html
	private static final String USER = "user";
	
	// The actionsupport already bring interesting stuff
	
	// User id
	private Integer id;
	
	private List<User> listUsers;
	private User userBean;
	
	@Autowired
	private UserService userService;
	
	// Handling session
	private Map<String, Object> userSession ;
	
	public Integer getId() {
		
		return id;
	}

	public User getUserBean() {
		return userBean;
	}

	public void setUserBean(User user) {
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
		
		// Add user to session
		userSession.put(USER, this.userBean);
		
		return ActionSupport.SUCCESS;
	}
	
	/**
	 * Register method
	 * @return
	 */
	public String doRegister() {
		
		System.out.println(this.userBean);
		// Call service class to store and compare state in database
		this.userService.doCreate(this.userBean); 
		
		return ActionSupport.SUCCESS;
	}	

	
	
	public void setUserService(UserService userService) {
		
		System.out.println("User service coming");
		this.userService = userService;
	}

	public void validateRegistration(){
	    if (userBean.getUsername().length() == 0) {
	        addFieldError("userBean.userName", "User name is required.");
	    }

	    if (userBean.getEmail().length() == 0) {
	        addFieldError("userBean.email", "Email is required.");
	    }

	    if (userBean.getPassword().length() < 6) {
	        addFieldError("userBean.password", "Password is required and must be more than 6 characters");
	    }
	}

	/**
	 * Overriding method to handle session
	 */
	@Override
	public void setSession(Map<String, Object> arg0) {
		
		userSession = arg0 ;

		
	}
}

