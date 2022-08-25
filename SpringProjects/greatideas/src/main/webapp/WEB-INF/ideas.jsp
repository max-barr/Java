<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Ideas</title>
</head>
<body>
	<a href="/logout">Logout</a>
	<h1>Welcome, <c:out value= "${user.name}" /></h1>
	<div>
		<h3>Ideas</h3>
		<table>
			<tr>
				<th>Idea</th>
				<th>Created By</th>
			</tr>
			<c:forEach items="${ideas}" var="idea">
				<tr>
					<td><a href="/ideas/${idea.id}"><c:out value="${idea.name}"/></a></td>
					<td>${idea.user.name}</td>
				</tr>
			</c:forEach>
		</table>
		<p><a href="/ideas/new">Create an Idea</a></p>
	</div>
</body>
</html>