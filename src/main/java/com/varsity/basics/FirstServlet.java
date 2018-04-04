package com.varsity.basics;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/1")
public class FirstServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html><head><title>My First Servlet App</title></head>");
		out.println("<body bgcolor='ivory'><h1>Welcome to All</h1>");
		out.println("<hr/>");
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm a");
		String now = sdf.format(today);
		out.println("<h2 style='align:right;'>"+now+"<h2>");
		out.println("</body></html>");
				
	}
}
