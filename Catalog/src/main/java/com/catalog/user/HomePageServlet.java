package com.catalog.user;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/home.do")
public class HomePageServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		PrintWriter out = response.getWriter();
		Blob image = null;
		Connection con = null;
		byte[ ] imgData = null ;
		Statement stmt = null;
		ResultSet rs = null;
		try {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/catalog","root","");
		stmt = con.createStatement();
		rs = stmt.executeQuery("select prodimage from product ");
		while(rs.next()) {
		if (rs.next()) {
		image = rs.getBlob(1);
		imgData = image.getBytes(1,(int)image.length());
		} 
		else {
		out.println("Display Blob Example");
		out.println("image not found for given id>");
		return;
		}
		// display the image
		response.setContentType("image/jpg");
		OutputStream o = response.getOutputStream();
		o.write(imgData);
		o.flush();
		o.close();
		}
		} catch (Exception e) {
		out.println("Unable To Display image");
		out.println("Image Display Error=" + e.getMessage());
		return;
		} finally {
		try {
		rs.close();
		stmt.close();
		con.close();
		} catch (SQLException e) {
		e.printStackTrace();
		}
		}
		
		response.sendRedirect("/Home.jsp");
			
	}

}