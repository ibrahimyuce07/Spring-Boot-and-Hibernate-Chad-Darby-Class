<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Hello World</title>
<link rel="stylesheet" type="text/css"
	href="..\resources\css\helloworld.css">
</head>

<body>

	<h2>Hello World of Spring!</h2>
	<hr>
	<br />
	<!-- studentName is the actual name of the html form field.  name="studentName" -->
	<p>
		Student name : <b>${param.studentName}</b>
	</p>
	<br />
	<!-- message : attribute name from the model in controller -->
	<p>The message : ${message}</p>




















</body>
<footer>
	<a href="/spring-mvc-demo">Main Menu</a>
</footer>
</html>