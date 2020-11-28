<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
footer {
 position:fixed;
   left:0px;
   bottom:0px;
   height:20px;
   width:100%;
}
</style>
<meta charset="ISO-8859-1">
<title>Hello World</title>
</head>



















<body>

Hello World of Spring!
<br/>
<!-- studentName is the actual name of the html form field.  name="studentName" -->
Student name : ${param.studentName}
<br/>
<!-- message : attribute name from the model in controller -->
The message : ${message}























</body>
<footer >
<a href="/spring-mvc-demo">Main Menu</a>
</footer>
</html>