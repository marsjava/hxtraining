<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/WEB-INF/mytags.tld" prefix="hxw" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Registration Page</title>
</head>
<jsp:useBean id="emp" class="com.varsity.model.Employee" scope="request" />
<jsp:setProperty property="*" name="emp"/>
<%
	if(request.getParameter("reg")!=null){
%>
	<jsp:forward page="successpage.jsp">
		<jsp:param value="Successfully Registered." name="message"/>
	</jsp:forward>
<%
	}
%>		
<body>
<h2 style="text-align: center;"><hxw:touppercase>employee registration form</hxw:touppercase></h2>
<h3 align="right"><hxw:now/></h3>
<hr/>
<form method="post">
	<table>
	<tr><td>Employee Id</td>
		<td><input type="text" name="empId" id="empId"/></td></tr>
	<tr><td>Employee Name</td>
		<td><input type="text" name="empName" id="empName"/></td></tr>
	<tr><td>Employee Designation</td>
		<td>
		<select name="desig">
			<option selected>---select---</option>
			<option value="1">Manager</option>
			<option value="2">Developer</option>
			<option value="3">Trainee</option>
		</select>
		</td></tr>
	<tr><td>Employee Salary</td>
		<td><input type="text" name="salary" id="salary"/></td></tr>
	<tr><td>Employee DoJ[MM-dd-yy]:</td>
		<td><input type="text" name="doj" id="doj"/></td></tr>
	<tr><td><input type="submit" value="Submit" name="reg" />				
	</table>
</form>
</body>
</html>