<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<title>Customer Registration Form</title>
<link rel="stylesheet" type="text/css"
	href="..\resources\css\helloworld-form.css">
</head>

<body>
	<div class="container">

		<p>
			<i>Fill out the form. Asterisk(*) means required.</i>
		</p>

		<form:form action="processForm" modelAttribute="customer">

			<form:input path="firstName" placeholder="First Name" />
			<br>
			<br>
			<form:input path="lastName" placeholder="Last Name*"/>
			<br>
			<form:errors path="lastName" cssClass="error" />
			<br>
			<br>
			<form:input path="freePasses" placeholder="Free Passes" />
			<br>
			<form:errors path="freePasses" cssClass="error" />

			<br>
			<br>
			<form:input path="postalCode" placeholder="Postal Code" />
			<br>
			<form:errors path="postalCode" cssClass="error" />
<br><br>
			<input type="submit" value="Submit" />

		</form:form>


	</div>
</body>
</html>