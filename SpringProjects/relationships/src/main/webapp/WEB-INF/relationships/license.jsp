<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>New License</title>
</head>
<body>
	<h1>New License</h1>
	<form:form action="/licenses/new" method="post" modelAttribute="license">
	    <p>
	    		<form:label path="person">Person</form:label>
	    		<form:errors path="person"></form:errors>
	    		<form:select path="person">
	    			<c:forEach var="person" items="${persons}">
			        	<form:option value= "${person.id}" label="${person.firstName} ${person.lastName}"/>
		   			</c:forEach>
				</form:select>
	    </p>
	    <p>
	        <form:label path="state">State</form:label>
	        <form:errors path="state"></form:errors>
	        <form:textarea path="state"/>
	    </p>
	    <p>
	        <form:label path="expiration_date">Expiration Date</form:label>
	        <form:errors path="expiration_date"></form:errors>
	        <input type="date" id="expiration_date" name="expiration_date" min="2022-01-01">
	    </p>
	    <input type="submit" value="Create"/>
	</form:form>
</body>
</html>