package com.catalog.user;

import java.util.ArrayList;
import java.util.List;

public class UserSignUpServices { 
			 
			public List<User> users = new ArrayList<User>();
			
			
			public void AddUser(String name, String password) {		
				User user = new User(name, password);
				users.add(user);
				 return ;
			}

}
