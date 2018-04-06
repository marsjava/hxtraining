package com.varsity.basics;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.varsity.model.User;

@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext context;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		context = getServletContext();
		HttpSession session = request.getSession();
		request.setAttribute("count", 1);
		session.setAttribute("count", 2);
		context.setAttribute("count", 3);
		User user = new User();
		user.setfName(request.getParameter("fName"));
		user.setlName(request.getParameter("lName"));
		user.setGender(request.getParameter("gender"));
		request.setAttribute("userBean", user);
		RequestDispatcher rd = request.getRequestDispatcher("success1.jsp");
		rd.forward(request, response);
	}
}
