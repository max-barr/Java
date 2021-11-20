<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<title>Dojo Survey</title>
</head>
<body>
	<div class="container">
		<form method="post" action="/submit">
			<label for="name">Your Name: </label><br>
  			<input type="text" id="name" name="name"><br><br>
  			<label for="location">Dojo Location: </label><br>
  			<select name="location" id="location">
  				<option value="San Jose">San Jose</option>
				<option value="Seattle">Seattle</option>
  				<option value="Miami">Miami</option>
  				<option value="New York">New York</option>
  				<option value="Austin">Austin</option>
  			</select><br><br>
  			<label for="language">Favorite Language: </label><br>
  			<select name="language" id="language">
  				<option value="Python">Python</option>
				<option value="Java">Java</option>
  				<option value="C++">C++</option>
  				<option value="JavaScript">JavaScript</option>
  			</select><br><br>
  			<label for="comment">Comment (optional): </label><br>
  			<textarea id="comment" name="comment" rows="4" cols="50"></textarea><br>
  			<input class="button" type="submit" value="Submit">
		</form>
	</div>
</body>
</html>