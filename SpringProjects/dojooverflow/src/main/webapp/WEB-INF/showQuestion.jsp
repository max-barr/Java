<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Question Profile</title>
</head>
<body>
	<div>
		<a href="/questions">Back</a>
		<h1>${question.questionText}</h1>
		<table>
			<tr>
				<th>Tags</th>
			</tr>
			<c:forEach items="${question.tags}" var="tag">
				<td><c:out value="${tag.subject}"/></td>
			</c:forEach>
		</table>
	</div>
	<div>
		<h2>Add your answer</h2>
		<form:form action="/questions/addAnswer" method="post" modelAttribute="answer">
		    <p>
		        <form:label path="answerText">Answer:</form:label>
		        <form:errors path="answerText"/>
		        <form:textarea path="answerText"/>
		        <form:input type="hidden" path="question" value="${question.id}"/>
		    </p>
		    <input type="submit" value="Answer it"/>
		</form:form>
	</div>
	<div>
		<table>
			<tr>
				<th>Answers</th>
			</tr>
			<c:forEach items="${question.answers}" var="answer">
				<tr>
					<td><c:out value="${answer.answerText}"/></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>