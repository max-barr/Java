<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>New Category</title>
</head>
<body>
	<a href="/products/new">New Product</a>
	
	<h1>New Category</h1>
	<form:form action="/categories/new" method="post" modelAttribute="category">
	    <p>
	        <form:label path="name">Name:</form:label>
	        <form:errors path="name"/>
	        <form:input type= "text" path="name"/>
	    </p>
	    <input type="submit" value="Create"/>
	</form:form>
	<table>
		<tr>
			<th>Categories</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${categories}" var="category">
			<tr>
				<td><c:out value="${category.name}"/></td>
				<td><a href='/categories/<c:out value="${category.id}"/>'>Show Category</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>