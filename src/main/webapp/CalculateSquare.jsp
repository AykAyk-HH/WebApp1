<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Showing square</title>
</head>
<body>
<h1>Square of <%=request.getParameter("num") %> is : <%=request.getAttribute("squaredNum") %>

</body>
</html>