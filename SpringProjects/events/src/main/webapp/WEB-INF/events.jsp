<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Events</title>
</head>
<body>
	<a href="/logout">Logout</a>
	<h1>Welcome, <c:out value= "${user.firstName}" /></h1>
	<div>
		<p>Upcoming events</p>
		<table>
			<tr>
				<th>Name</th>
				<th>Date</th>
				<th>City</th>
				<th>State</th>
				<th>Host</th>
				<th>Action</th>
			</tr>
			<c:forEach items="${events}" var="event">
				<tr>
					<td><a href="/events/${event.id}"><c:out value="${event.name}"/></a></td>
					<td><fmt:formatDate pattern = "MMMM d, y" value = "${event.date}" /></td>
					<td><c:out value="${event.city}"/></td>
					<td><c:out value="${event.state}"/></td>
					<td><c:out value="${event.user.firstName}"/></td>
					<td><a href="/events/join/${event.id}">Join</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<div>
		<h2>Create an Event</h2>
		
		<p><form:errors path="event.*"/></p>
		
		<form:form action="/events/new" method="POST" modelAttribute="event">
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
	</div>
</body>
</html>