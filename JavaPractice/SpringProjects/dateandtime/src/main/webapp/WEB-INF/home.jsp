<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Home</title>
		<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
		<!-- YOUR own local CSS -->
		<link rel="stylesheet" href="/css/style.css"/>
		<!-- For any Bootstrap that uses JS or jQuery-->
		<script src="/webjars/jquery/jquery.min.js"></script>
		<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	</head>
	<body>
		<div class="container">
			<h1 style="text-align: center">Welcome</h1>
			<div class="box"></div>
			<div class="container" style="display: flex">
				<div><h3><a href="/date">Date Template</a></h3></div>
				<div style="margin-left: auto"><h3><a href="/time">Time Template</a></h3></div>
			</div>
		</div>
	</body>
</html>