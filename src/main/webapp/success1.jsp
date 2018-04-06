<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EL - Response Page</title>
</head>
<body>
<h3 style="color: green;">User Agent : ${header["user-agent"]}</h3><br/>
<h3 style="color: maroon;">Count Attributes : ${count}</h3><br/>
<h3 style="color: blue;">Application Scope Attribute: ${applicationScope.count}</h3><br/>
<h3 style="color: gray;">Session Scope Attribute: ${sessionScope.count}</h3><br/>
<h3 style="color: purple;">Request Scope Attribute: ${requestScope.count}</h3><br/>
<hr/>
<%-- Reads the request parameter values --%>
<h1 style="color: olive;">Registration Details</h1>
<table>
	<tr><td>FirstName</td><td>${param.fName}</td></tr>
	<tr><td>LastName</td><td>${param.lName}</td></tr>
	<tr><td>Gender</td><td>${param.gender}</td></tr>
</table>

<%-- Reads the values from user bean object --%>
<h1 style="color: orange;">Registration Details in User Bean</h1>
<table>
	<tr><td>FirstName</td><td>${userBean.fName}</td></tr>
	<tr><td>LastName</td><td>${userBean.lName}</td></tr>
	<tr><td>Gender</td><td>${userBean.gender}</td></tr>
</table>
</body>
</html>