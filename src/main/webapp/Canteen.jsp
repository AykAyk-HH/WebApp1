<%@page import="org.apache.catalina.util.RequestUtil"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import = "java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Canteen Menu</h1>
	<%
	ArrayList<String> lst = (ArrayList<String>)request.getAttribute("menuList");
	%>
<ol>
<% for(int i=0;i<lst.size();i++){ %>
  <li> <%=lst.get(i) %></li>
  <%} %>
</ol>
</body>
</html>