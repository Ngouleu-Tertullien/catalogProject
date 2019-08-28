package com.catalog.user;

import java.sql.*;

public class UserLoginServices {
	public boolean isUserValid(String name, String password) {
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/catalog","root","");
		String query = "select * from user where name='"+name+"' and password='"+password+"'";
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery(query);
		
		if(rs.next()) {
			return true;
		}else
			System.out.println("User not found");
			return false;
		}
		catch(ClassNotFoundException e) {
			System.out.println(e);
			return false;
		}
		catch(SQLException e){
			System.out.println(e);
			return false;
		}
	}
}