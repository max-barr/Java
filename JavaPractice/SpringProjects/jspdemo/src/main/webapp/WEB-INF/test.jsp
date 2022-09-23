<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Testing this JSP file</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<h2>Hello JSP!</h2>
	<h4><c:out value="${13 * 2}"/></h4>
	<h1>Welcome to <c:out value="${location}"/>!</h1>
</body>
</html>