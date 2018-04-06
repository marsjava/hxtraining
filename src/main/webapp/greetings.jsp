<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page session="true" buffer="8kb" errorPage="error.jsp" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Greetings Pages</title>
<style type="text/css">
body, html {
	height: 100%;
}
</style>
</head>
<%
	String name = request.getParameter("userName");
	if(name==null || name.length()<1 || name.equals("")){
		throw new Exception("Name is empty.");
	}
	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm a");
	String now = sdf.format(date);
%>
<body>
	<div id="header" style="background-color: blue; height: 20%;">
		<%@include file="header.html" %>
	</div>
	
	<h3 style="text-align: right;"><%=now %></h3>
	<div id="content" style="background-color: gray; height: 70%; text-align: center;">
		<br/><br/>
		<span style="color: green; font-size: 80px;">
			Welcome to Mr./Ms. <%=name %>
		</span>				
	</div>
	
	<div id="footer" style="height: 8%; bottom: 0; position: relative;">
		<%@include file="footer.html" %>
	</div>
</body>
</html>

