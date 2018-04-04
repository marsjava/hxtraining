package com.varsity.session;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns= "/Login1",
			initParams= 
		    {
		    	@WebInitParam(name="vname", value="tom"),
		    	@WebInitParam(name="vpass", value="jerry")
		    })
public class Login1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RequestDispatcher rd = null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("userName");
		String pass = request.getParameter("passWrd");
		String city = request.getParameter("location");
		//ServletConfig config = getServletConfig();
		if(user.equals(getInitParameter("vname"))) {
			if(pass.equals(getInitParameter("vpass"))) {
				//rd = request.getRequestDispatcher("Inbox");
				//response.sendRedirect("Inbox?user="+user+"&location="+city);
//				Cookie c1 = new Cookie("user",user);
//				Cookie c2 = new Cookie("location",city);
//				response.addCookie(c1);
//				response.addCookie(c2);
				HttpSession session = request.getSession();
				session.setAttribute("user", user);
				session.setAttribute("location", city);
				response.sendRedirect("Inbox");
			}else {
				response.sendRedirect("login.jsp");
			}			
		}
	}
}
