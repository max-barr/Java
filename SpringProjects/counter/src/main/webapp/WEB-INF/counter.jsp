<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Current Visit Count</title>
</head>
<body>
	You have visited <a href="/">your server</a> <c:out value="${countToShow}"/> times.
	
	<a href="/">Visit again</a>
</body>
</html>