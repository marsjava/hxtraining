<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<fieldset>
	<%
		String msg = (String)request.getAttribute("message");
		if(msg!=null){
	%>
	<div><span style="font-size: 20px; color: red;">
		<%=msg %>
	</span></div>
	<%
		}
	%>
	<legend>My Login Page</legend>
	<form action="Login1" method="get">
		<table>
			<tr><td>Username</td></tr>
		 	<tr><td><input type="text" name="userName" id="userName" /></td></tr>
  			<tr><td>Password</td></tr>
			<tr><td><input type="password" name="passWrd" id="passWrd" /></td></tr>
			<tr><td>Location</td></tr>
			<tr><td><input type="text" name="location" id="location" /></td></tr>
			<tr><td><input type="submit" value="Login" /></td></tr>					
		</table>
	</form>
</fieldset>
</body>
</html>