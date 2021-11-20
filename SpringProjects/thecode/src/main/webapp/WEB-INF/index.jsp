<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<title>Secret Code</title>
</head>
<body>
	<div id="container">
		<h3>What is the code?</h3>
		<form method="post" action="/login">
			<input type="text" name="code">
			<button>Try Code</button><br>
			<c:out value="${error}"/>
		</form>
	</div>
</body>
</html>