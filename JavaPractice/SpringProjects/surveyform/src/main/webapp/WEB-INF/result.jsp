<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Results</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<!-- YOUR own local CSS -->
	<link rel="stylesheet" href="style.css"/>
	<!-- For any Bootstrap that uses JS or jQuery-->
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h1>Your Information</h1>
		<p>Name: <c:out value="${name}"/></p>
		<p>Location: <c:out value="${location}"/></p>
		<p>Favorite sport: <c:out value="${sport}"/></p>
		<p>Comment: <c:out value="${comment}"/></p>
		<a href="/" class="btn btn-primary">Go Back</a>
	</div>
</body>
</html>