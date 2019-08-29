package com.catalog.category;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.catalog.product.Product;
import com.catalog.product.ProductServices;


@WebServlet(urlPatterns = "/delete-catalog.go")
public class DeleteCatServlet  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		CategoryServices.deleteCatalog(request.getParameter("catname"));
		response.sendRedirect("/categoryPage.jsp");	
			
	}

}