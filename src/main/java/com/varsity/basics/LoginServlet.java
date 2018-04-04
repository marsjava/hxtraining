package com.varsity.basics;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("userName");
		String pass = request.getParameter("passWrd");
		
		ServletConfig config = getServletConfig();
		String vUser = config.getInitParameter("userValue");
		String vPass = config.getInitParameter("passValue");	
		
		RequestDispatcher rd = null;
		if(user.equalsIgnoreCase(vUser)&&pass.equals(vPass)) {
			request.setAttribute("name", user);
			rd = request.getRequestDispatcher("success.jsp");
			rd.forward(request, response);			
		}else {  
			request.setAttribute("message", "Invalid username or password.");
			rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	}
}
