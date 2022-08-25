<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Edit Idea</title>
</head>
<body>
	<a href="/ideas">Back</a>
	<h1>Edit ${idea.name}</h1>
	
	
	<form:form action="/ideas/update" method="post" modelAttribute="idea">
			<input type="hidden" name="_method" value="put">
			<input type="hidden" name="id" value="${idea.id}">
			<form:hidden path="user" value="${idea.user.id}"/>
			<p>
				<form:label path="name">Content:</form:label>
				<form:textarea path="name"/>
				<form:errors path="name"/>
			</p>
			<input type="submit" value="Update"/>
		</form:form>
		<p><a href="/ideas/${idea.id}/delete">Delete Idea</a></p>
</body>
</html>