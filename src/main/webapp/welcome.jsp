<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page</title>
<style type="text/css">
body, html {
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
	<form action="greetings.jsp">
		Enter your Name <input type="text" name="userName" /><br/>
		<input type="submit" value="Enter" />
	</form>
</div>

<div style="height: 8%; bottom: 0; position: relative;" >
	<%@include file="footer.html" %>
</div>
</body>
</html>