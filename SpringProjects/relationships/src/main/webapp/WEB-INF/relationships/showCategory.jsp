<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Category Page</title>
</head>
<body>
	<a href="/products/new">New Product</a> |
	<a href="/categories/new">New Category</a>
	
	<h1>${category.name}</h1>
	
	<p>
		<form action='/categories/${category.id}/add' method="post">
			<label>Add Product:</label>
		    <select name="product_id">
		    		<c:forEach items="${productsOut}" var="product">
					<option value= "${product.id}">${product.name}</option>
				</c:forEach>
			</select>
			<input type="submit" value="Add"/>
		</form>
	</p>
	
	<table>
		<tr>
			<th>Products</th>
		</tr>
		<c:forEach items="${productsIn}" var="product">
			<td>-<c:out value="${product.name}"/></td>
		</c:forEach>
	</table>
</body>
</html>