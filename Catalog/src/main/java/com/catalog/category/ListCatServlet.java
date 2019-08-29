package com.catalog.category;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet(urlPatterns = "/category.do")
public class ListCatServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.setAttribute("category",CategoryServices.retreiveCategory());
		request.getRequestDispatcher("/categoryPage.jsp").forward(request, response);
	}

}