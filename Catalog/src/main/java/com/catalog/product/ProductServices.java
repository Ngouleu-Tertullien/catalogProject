package com.catalog.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductServices {

	public static void addProduct(String prodname, String prodCat, int price) {		
		try {
			String sql = "insert into product(prodname, prodCat, price) values(?,?,?)";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Catalog", "root","");
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, prodname);
			ps.setString(2, prodCat);
			ps.setLong(3, price);
			ps.executeUpdate();
			return;
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return ;
	}
	public static void deleteProduct(int prodId) {		
		try {
			String sql = "delete from product where prodId ="+prodId;
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
