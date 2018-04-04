package com.varsity.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Display")
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		String city = request.getParameter("location");
		String CollegeName = request.getParameter("cname");
		String Qualification = request.getParameter("degree");
		out.println("<html><head><title>Display Details Page</title></head>");
		out.println("<body bgcolor='#55DC&E'>");
		out.println("<center><h1 style='color:#C70039'>"
				+ "Registration Details</h1></center><hr/>"
				+ "<table border='1'>"
				+ "<tr><td>Name</td><td>"+firstName+" "+lastName+"</td></tr>"
				+ "<tr><td>City</td><td>"+city+"</td></tr>"
				+ "<tr><td>College Name</td><td>"+CollegeName+"</td></tr>"
				+ "<tr><td>Qualification</td><td>"+Qualification+"</td></tr>"
				+ "</table></body></html>");
	}
}
