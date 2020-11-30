<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Hello World - Input Form</title>
<link rel="stylesheet" type="text/css"
	href="..\resources\css\helloworld-form.css">
</head>

<body>
	<div class="container">
		<!-- processForm'u değiştirdik. -->
		<form action="processFormThree" method="GET">
			<input type="text" name="studentName" placeholder="What's your name?" />
			<input type="submit" />
		</form>
	</div>
	

</body>
</html>