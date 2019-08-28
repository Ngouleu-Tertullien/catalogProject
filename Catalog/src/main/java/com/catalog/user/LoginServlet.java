package com.catalog.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

	private UserLoginServices userValidationService = new UserLoginServices();
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.getRequestDispatcher("/loginPage.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		boolean isUserValid = userValidationService.isUserValid(name, password);
		
		if(isUserValid) {
			request.getSession().setAttribute("name",name);
		response.sendRedirect("/category.do");
		}else {
			request.setAttribute("errorMessage", "Invalid Entry. If you are not a user, please Sign up!!!");
;			request.getRequestDispatcher("/loginPage.jsp").forward(request, response);
		}
	}

}
