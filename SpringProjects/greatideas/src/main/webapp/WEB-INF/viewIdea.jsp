<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>View Idea</title>
</head>
<body>
	<a href="/ideas">Back</a>
	<h1>${idea.name}</h1>
	
	<p>Created By: ${idea.user.name}</p>
	
	<p><a href="/ideas/${idea.id}/edit">Edit Idea</a></p>
</body>
</html>