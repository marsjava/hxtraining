<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Info</title>
<style type="text/css">
html, body{
	height: 100%;
}
table{
	border: 2px solid red;
}
td{
	border: 1px solid blue;
}
</style>
</head>
<jsp:useBean id="emp" class="com.varsity.model.Employee" scope="request" />
<body>
	<div>
		<% 	String edesig = emp.getDesig(); 
			if(edesig.equals("1")){			%>
			<jsp:include page="managerpage.jsp">
			<jsp:param value="<%=emp.getEmpName() %>" name="name"/>
			</jsp:include>			
		<%	} else if(edesig.equals("2")) { %>
			<jsp:include page="developerpage.jsp">
			<jsp:param value="<%=emp.getEmpName() %>" name="name"/>
			</jsp:include>		
		<%	} else if(edesig.equals("3")) { %>
			<jsp:include page="traineepage.jsp">
			<jsp:param value="<%=emp.getEmpName() %>" name="name"/>
			</jsp:include>		
		<%	} %>
	</div>
	<div>
		<h1 style="color: green;">
			<%=request.getParameter("message") %>
		</h1>
		<hr/>
		<h2 style="color: gray;">
			Registration Details.
		</h2>
	</div>
	<div>
	<table>
	<tr><td>Emp.Id</td><td><jsp:getProperty property="empId" name="emp"/></td></tr>
	<tr><td>Emp.Name</td><td><jsp:getProperty property="empName" name="emp"/></td></tr>
	<tr><td>Emp.Designation</td><td><jsp:getProperty property="desig" name="emp"/></td></tr>
	<tr><td>Emp.Salary</td><td><jsp:getProperty property="salary" name="emp"/></td></tr>
	<tr><td>Emp.DOJ</td><td><jsp:getProperty property="doj" name="emp"/></td></tr>	
	</table>		
	</div>
</body>
</html>








