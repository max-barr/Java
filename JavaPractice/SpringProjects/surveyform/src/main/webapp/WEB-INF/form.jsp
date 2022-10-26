<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Submit Your Information</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<!-- YOUR own local CSS -->
	<link rel="stylesheet" href="style.css"/>
	<!-- For any Bootstrap that uses JS or jQuery-->
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h1>Submit Your Information</h1>
		<form method="POST" action="/submit">
			<label for="formControlInput" class="form-label">Your Name:</label>
			<input type="email" class="form-control" id="formControlInput">
			<!-- Select -->
			<label for="select" class="form-label">Location:</label>
			<select class="form-select" aria-label="Default select" id="select">
			  <option selected=""></option>
			  <option value="1">Boston</option>
			  <option value="2">Seattle</option>
			  <option value="3">Los Angeles</option>
			</select>
		</form>
	</div>
</body>
</html>