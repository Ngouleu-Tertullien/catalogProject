package com.catalog.product;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/add-product.go")
public class AddProdServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		PrintWriter out = response.getWriter();
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		String url="jdbc:mysql://localhost:3306/catalog";
		FileInputStream fileinstream=null;
		String prodname=request.getParameter("prodname"); 
		String prodCat=request.getParameter("prodCat"); 
		int price=Integer.parseInt(request.getParameter("price")); 
		String myloc=request.getParameter("prodimage"); 
		
		try{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		conn=DriverManager.getConnection(url, "root", "");
		File image= new File(myloc);
		pstmt = conn.prepareStatement("insert into product(prodname, prodCat, price,prodimage) " + "values(?,?,?,?)");
		pstmt.setString(1, prodname);
		pstmt.setString(2, prodCat);
		pstmt.setLong(4, price);
		fileinstream=new FileInputStream(image);
		pstmt.setBinaryStream(3, (InputStream) fileinstream, (int) (image.length()));
		int count = pstmt.executeUpdate();
		if(count>0)
		{
		out.println("insert successfully");
		}
		else
		{
		out.println("not successfully");
		}
		}
		catch(Exception ex)
		{
		ex.printStackTrace();
		}
		finally{
		try{
		if(rs!=null){
		rs.close();
		rs= null;
		}
		if(pstmt !=null)
		{
		pstmt.close();
		pstmt=null;
		}
		if(conn!=null)
		{
		conn.close();
		conn=null;
		}
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
		}
		
		//ProductServices.addProduct(prodname,prodCat,price);
		request.getRequestDispatcher("/productPage.jsp").forward(request, response);	
	}

}
