package com.ecommerce;

public class UserLogin {
	private static UserLogin instance;
	private boolean loggedIn;
	private UserLogin() {
		this.loggedIn= false;
	}
	
	public static UserLogin getInstance() {
		if(instance==null) {
			instance= new UserLogin();
		}
		return instance;
	}
   public void Login() {
	   if(!loggedIn) {
		   loggedIn= true;
		   System.out.println("Login Successfull");
	   }
	   else {
		   System.out.println("User is already logged in");
	   }
   }
   public void Logout() {
	   if(loggedIn) {
		   loggedIn= false;
		   System.out.println("Logged out sucessfully");
	   }
	   else {
		   System.out.println("User is already logged out");
	   }
   }
   
   public boolean isLoggedIn() {
	   return loggedIn;
   }
}
