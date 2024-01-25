<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import = "java.time.LocalDate"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Demo JSP page</h1>
	Date with ___ on : <%= LocalDate.now() %>
	<%
	int a = 10000;
	out.println("<br>Hi JSP from HandsomeHawk");
	out.println("<br>a = "+a);
	
	%>
	<hr>
	Bill amount of date is : <%= a %>
</body>
</html>