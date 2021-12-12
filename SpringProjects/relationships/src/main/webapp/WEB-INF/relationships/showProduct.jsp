<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Product Page</title>
</head>
<body>
	<a href="/products/new">New Product</a> |
	<a href="/categories/new">New Category</a>
	
	<h1>${product.name}</h1>
	
	<p>
		<form action='/products/${product.id}/add' method="post">
			<label>Add Category:</label>
		    <select name="category_id">
		    		<c:forEach items="${categoriesOut}" var="category">
					<option value= "${category.id}">${category.name}</option>
				</c:forEach>
			</select>
			<input type="submit" value="Add"/>
		</form>
	</p>
	
	<table>
		<tr>
			<th>Categories</th>
		</tr>
		<c:forEach items="${categoriesIn}" var="category">
			<td>-<c:out value="${category.name}"/></td>
		</c:forEach>
	</table>
</body>
</html>