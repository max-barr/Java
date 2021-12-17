<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Edit Event</title>
</head>
<body>
	<a href="/events">Back</a>
	<h1>${event.name}</h1>
	<div>
		<h2>Edit Event</h2>
		<p><form:errors path="event.*"/></p>
		
		<form:form action="/events/update" method="post" modelAttribute="event">
			<input type="hidden" name="_method" value="put">
			<input type="hidden" name="id" value="${event.id}">
			<form:hidden path="user" value="${event.user.id}"/>
			<p>
				<form:label path="name">Name:</form:label>
				<form:input type="text" path="name"/>
			</p>
			<p>
				<form:label path="date">Date:</form:label>
				<form:input type="date" path="date"/>
			</p>
			<p>
				<form:label path="city">City:</form:label>
				<form:input type="text" path="city"/>
			</p>
			<p>
				<form:label path="state">State:</form:label>
				<form:input type="text" path="state"/>
			</p>
			<input type="submit" value="Submit"/>
		</form:form>
		<p><a href="/events/${event.id}/delete">Delete Event</a></p>
	</div>
</body>
</html>