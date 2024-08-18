package com.RideSharing;

public class UserAuthentication {
	   private static UserAuthentication instance;
	   private String token;
	   private UserAuthentication() {

	   }

	   public static UserAuthentication getInstance() {
		   if(instance==null)
			   instance= new UserAuthentication();

		   return instance;
	   }
	   public void login(String token) {
		   this.token= token;
		   System.out.println("User logged in with token:"+token);
	   }

	   public void logout() {
		   this.token= null;
	   }
	   public boolean isAuthenticated() {
		   return this.token != null;
	   }

	}
