<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Data JSp</title>
</head>
 
<body>
 
<form>
	<hr>
	Name: <%=request.getAttribute("name") %>
	<hr>
	ID: <%=request.getAttribute("id") %>
	<hr>
 
	Salary: <%=request.getAttribute("salary") %>
	<hr>
	</form>
	
 
 
</body>
</html>