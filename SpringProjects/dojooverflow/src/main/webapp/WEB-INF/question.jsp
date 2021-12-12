<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>New Question</title>
</head>
<body>
	<a href="/questions">Back</a>
	<h1>What is your question?</h1>
	<form:form action="/questions/new" method="POST" modelAttribute="question">
	    <p>
	        <form:label path="questionText">Question:</form:label>
	        <form:errors path="questionText"/>
	        <form:textarea path="questionText"/>
	    </p>
	    <p>
			<label name="tags">Tags:</label>
	        <input type= "text" name="tags"/>
	    </p>
	    <input type="submit" value="Submit"/>
	</form:form>
</body>
</html>