package com.catalog.category;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.catalog.product.ProductServices;




@WebServlet(urlPatterns = "/add-catalog.go")
public class AddCatServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		String catname = request.getParameter("catname");
		//String catId = request.getParameter("catId");		
		
		CategoryServices.addCatalog(catname);
		response.sendRedirect("/categoryPage.jsp");
			
	}

}
