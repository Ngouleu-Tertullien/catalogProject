package com.catalog.product;

import java.io.IOException;

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
		String name = request.getParameter("name");
		String prodCat = request.getParameter("prodCat");
		String price = request.getParameter("price");
		
		
		ProductServices.addProduct(name,prodCat,Integer.parseInt(price));
		request.getRequestDispatcher("/productPage.jsp").forward(request, response);	
	}

}
