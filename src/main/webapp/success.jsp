<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success Page</title>
</head>
<body bgcolor="ivory">
<h1>Successfully Login the Page.</h1>
<hr/>
<div>
	<h2 style="color:green;">
	Welcome to Mr./Ms. <%=request.getAttribute("name") %>
	</h2>
	<br/>
	<h3 align="right">
	<%=new Date() %>
	</h3>
	</div>
</body>
</html>