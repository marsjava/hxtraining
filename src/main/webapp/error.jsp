<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Error Page</title>
<style type="text/css">
body, html{
	height: 100%;
}
</style>
</head>
<body>
	<div id="header" style="background-color: blue; height: 20%;">
		<%@include file="header.html" %>
	</div>
	<div id="content" style="background-color: gray; height: 70%; text-align: center;">
		<br/><br/>
		<span style="color: red; font-size: 50px;">
			Error has occured.. <%=exception.getMessage() %>
		</span>				
	</div>
	<div id="footer" style="height: 8%; bottom: 0; position: relative;">
		<%@include file="footer.html" %>
	</div>
</body>
</html>