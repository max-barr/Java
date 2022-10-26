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
			<label for="select1" class="form-label">Location:</label>
			<select class="form-select" aria-label="Default select" id="select1">
			  <option selected=""></option>
			  <option value="1">Boston</option>
			  <option value="2">Seattle</option>
			  <option value="3">Los Angeles</option>
			</select>
			<!-- Select -->
			<label for="select2" class="form-label">Favorite Sport:</label>
			<select class="form-select" aria-label="Default select" id="select2">
			  <option selected=""></option>
			  <option value="1">Football</option>
			  <option value="2">Baseball</option>
			  <option value="3">Basketball</option>
			  <option value="4">Golf</option>
			  <option value="5">Tennis</option>
			</select>
			<!-- Text area -->
			<label for="textarea">Comment (Optional)</label>
			<textarea class="form-control" id="textarea" style="height: 100px"></textarea><br>
			<button class="btn btn-primary">Submit</button>
		</form>
	</div>
</body>
</html>