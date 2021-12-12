<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Questions Dashboard</title>
</head>
<body>
	<a href="/questions/new">New Question</a>
	<h1>Questions Dashboard</h1>
	<table>
		<tr>
			<th>Question</th>
			<th>Tags</th>
		</tr>
		<c:forEach items="${questions}" var="question">
			<tr>
				<td><a href="/questions/${question.id}"><c:out value="${question.questionText}"/></a></td>
				<td><c:out value="${question.tagDescription()}"/></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>