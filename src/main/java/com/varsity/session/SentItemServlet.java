package com.varsity.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SentItem")
public class SentItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String name = (String)session.getAttribute("user");
		String city = (String)session.getAttribute("location");		
//		Cookie[] cookies = request.getCookies();
//		for(Cookie cookie:cookies) {
//			if(cookie.getName().equals("user")) {
//				name = cookie.getValue();
//			}
//			if(cookie.getName().equals("location")) {
//				city = cookie.getValue();
//			}
//		}
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html><head><title>SentItem Page</title></head>"
				+ "<body><h1 style='margin-left:40%;'>Sent Item</h1>"
				+ "<h2>Welcome to Mr./Ms."+name.toUpperCase()+"</h2>"
				+ "<h2>Location "+city+"</h2>"
				+ "<a href='Inbox'>Inbox</a>"
				+ "<a href='Logout'>Logout</a>"
				+ "</body></html>");
	}

}
