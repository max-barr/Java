<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<title>Dojo Survey Results</title>
</head>
<body>
	<div class="container">
		<h3>Submitted Info</h3>
		<p>Name: <c:out value="${name}"/></p>
		<p>Dojo Location: <c:out value="${location}"/></p>
		<p>Favorite Language: <c:out value="${language}"/></p>
		<p>Comment: <c:out value="${comment}"/></p>
		<a class="button" href="/">Go Back</a>
	</div>
</body>
</html>