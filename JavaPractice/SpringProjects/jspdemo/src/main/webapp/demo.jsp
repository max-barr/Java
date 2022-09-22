<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cool Demo Project</title>
</head>
<body>
	<h1>Hello there!</h1>
	<h3>The date and time is: <%= new Date() %></h3>

	<% String req = request.getParameter("name"); %>
	<h1>The parameter you used is <%= req %></h1>
	
	<% for (int i = 0; i < 10; i++) { %>
		<h2><%= i %></h2>
	<% } %>
	
	
</body>
</html>