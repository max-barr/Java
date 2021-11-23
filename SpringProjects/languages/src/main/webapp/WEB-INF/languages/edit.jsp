<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<title>Edit Language</title>
</head>
<body>
	<div class="header">
		<a href="/languages">Dashboard</a>
		<form action="/books/${language.id}" method="post">
		    <input type="hidden" name="_method" value="delete">
		    <input type="submit" value="Delete">
		</form>
	</div>
	<%@ page isErrorPage="true" %> 
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
	<h1>Edit ${language.name}</h1>
	<form:form action="/languages/${language.id}" method="post" modelAttribute="language">
	    <input type="hidden" name="_method" value="put">
	    <p>
	        <form:label path="name">Name</form:label>
	        <form:errors path="name"/>
	        <form:input path="name"/>
	    </p>
	    <p>
	        <form:label path="creator">Creator</form:label>
	        <form:errors path="creator"/>
	        <form:textarea path="creator"/>
	    </p>
	    <p>
	        <form:label path="currentVersion">Version</form:label>
	        <form:errors path="currentVersion"/>
	        <form:input path="currentVersion"/>
	    </p>
	    <input type="submit" value="Submit"/>
		</form:form>
</body>
</html>