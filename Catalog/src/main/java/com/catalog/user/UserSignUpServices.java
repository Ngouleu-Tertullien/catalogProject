package com.catalog.user;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserSignUpServices { 
			 		
			
			public void AddUser(String name, String password, String tel, String email) {		
			
				try {
					String sql = "insert into user(name, password, tel, email) values(?, ?, ?, ?)";
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Catalog", "root","");
					PreparedStatement ps = con.prepareStatement(sql);
					ps.setString(1, name);
					ps.setString(2, password);
					ps.setString(3, tel);
					ps.setString(4, email);
					ps.executeUpdate();
					
					return;
					
				} catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				}
				 return ;
			}

}
