<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>New Product</title>
</head>
<body>
	<a href="/categories/new">New Category</a>
	
	<h1>New Product</h1>
	<form:form action="/products/new" method="post" modelAttribute="product">
	    <p>
	        <form:label path="name">Name:</form:label>
	        <form:errors path="name"/>
	        <form:input type= "text" path="name"/>
	    </p>
	    <p>
	        <form:label path="description">Description:</form:label>
	        <form:errors path="description"/>
	        <form:textarea path="description"/>
	    </p>
	    <p>
	        <form:label path="price">Price:</form:label>
	        <form:errors path="price"/>
	        <form:input type= "text" path="price"/>
	    </p>
	    <input type="submit" value="Create"/>
	</form:form>
	<table>
		<tr>
			<th>Product</th>
			<th>Description</th>
			<th>Price</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${products}" var="product">
			<tr>
				<td><c:out value="${product.name}"/></td>
				<td><c:out value="${product.description}"/></td>
				<td><c:out value="${product.price}"/></td>
				<td><a href='/products/<c:out value="${product.id}"/>'>Show Product</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>