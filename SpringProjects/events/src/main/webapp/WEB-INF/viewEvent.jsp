<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>View Event</title>
</head>
<body>
	<a href="/events">Back</a>
	<h1>${event.name}</h1>
	<div>
		<p>Host: ${event.user.firstName} ${event.user.lastName}</p>
		<p>Date: <fmt:formatDate pattern = "MMMM d, y" value = "${event.date}" /></p>
		<p>Location: ${event.city}, ${event.state}</p>
	</div>
	<a href="/events/${event.id}/edit">Edit Event</a>
	<div>
		<h3>People attending:</h3>
		<table>
			<tr>
				<th>Name</th>
			</tr>
			<c:forEach items="${users}" var="user">
				<tr>
					<td><c:out value="${user.firstName}"/> <c:out value="${user.lastName}"/></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>