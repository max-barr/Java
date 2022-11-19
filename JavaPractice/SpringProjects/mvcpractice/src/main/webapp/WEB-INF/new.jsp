<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Testing this JSP file</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<!-- YOUR own local CSS -->
	<link rel="stylesheet" href="/css/style.css"/>
	<!-- For any Bootstrap that uses JS or jQuery-->
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<h1>New Book</h1>
	<form action="/books" method="POST" modelAttribute="book">
		<p>
	        <label path="title">Title</label>
	        <errors path="title"/>
	        <input path="title"/>
    	</p>
    	<p>
	        <label path="description">Title</label>
	        <errors path="description"/>
	        <input path="description"/>
    	</p>
    	<p>
	        <label path="language">Title</label>
	        <errors path="language"/>
	        <input path="language"/>
    	</p>
    	<p>
	        <label path="numberOfPages">Title</label>
	        <errors path="numberOfPages"/>
	        <input path="numberOfPages"/>
    	</p>
    	<input type="submit" value="Submit"/>
	</form>

</body>
</html>