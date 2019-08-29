package com.catalog.category;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class CategoryServices {
	
	
	public static void addCatalog(String catname) {		
		try {
			String sql = "insert into category(catname) values(?)";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Catalog", "root","");
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, catname);	
			ps.executeUpdate();
			return;
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return ;
	}
	
	
	public static void deleteCatalog( int catId) {		
		try {
			String sql = "delete from category where catId ="+catId;
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Catalog", "root","");
			PreparedStatement ps = con.prepareStatement(sql);
			ps.executeUpdate();
			return;
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}
}
