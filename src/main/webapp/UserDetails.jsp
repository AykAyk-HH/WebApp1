<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String name = (String)session.getAttribute("name");
	String mobile = (String)session.getAttribute("mobile");
	
	%>
	<h1>
	Name : <%=name %>
	<br>
	Mobile : <%=mobile %>
	</h1>
	
</body>
</html>