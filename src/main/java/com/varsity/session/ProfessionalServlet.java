package com.varsity.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Professional")
public class ProfessionalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fName = request.getParameter("firstName");
		String lName = request.getParameter("lastName");
		String city = request.getParameter("location");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html><head><title>Get Prof. Details</title></head>");
		out.println("<body bgcolor='#F5E0DB'>");
		out.println("<fieldset><form action='Display'>"
				+ "<table><tr><td>College Name</td>"
				+ "<td><input type='text' name='cname' id='cname'/></td></tr>"
				+ "<tr><td>Qualification</td>"
				+ "<td><input type='text' name='degree' id='degree'/></td></tr>"
				+ "<tr><td><input type='hidden' name='fname' value='"+fName+"'/></td>"
				+ "<td><input type='hidden' name='lname' value='"+lName+"'/></td>"
				+ "<td><input type='hidden' name='location' value='"+city+"'/></td></tr>"
				+ "<tr><td><input type='submit' value='Display' /></td></tr></table>"
				+ "</form></fieldset></body></html>");
	}
}
