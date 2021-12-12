<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>New Dojo</title>
</head>
<body>
	<a href="/ninjas/new">New Ninja</a>
	<h1>New Dojo</h1>
	<form:form action="/dojos/new" method="post" modelAttribute="dojo">
	    <p>
	        <form:label path="name">Name</form:label>
	        <form:errors path="name"/>
	        <form:input path="name"/>
	    </p>
	    <input type="submit" value="Create"/>
	</form:form>
	<table>
		<tr>
			<th>Dojo</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${dojos}" var="dojo">
			<tr>
				<td><c:out value="${dojo.name}"/></td>
				<td><a href='/dojos/<c:out value="${dojo.id}"/>'>Show Ninjas</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>