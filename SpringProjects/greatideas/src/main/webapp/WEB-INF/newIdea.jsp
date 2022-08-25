<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>New Idea</title>
</head>
<body>
	<a href="/ideas">Back</a>
	<h1>Create a New Idea</h1>
	
	<p><form:errors path="idea.*"/></p>
	
	<form:form action="/ideas/add" method="POST" modelAttribute="idea">
		<p>
			<form:label path="name">Content:</form:label>
			<form:textarea path="name"/>
		</p>
		<input type="submit" value="Create"/>
	</form:form>
</body>
</html>