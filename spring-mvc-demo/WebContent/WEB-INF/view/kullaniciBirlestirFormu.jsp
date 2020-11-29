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
		<form action="processFormTest" method="GET">
			<input type="text" name=kullaniciAdi placeholder="What's your first name?" />
			<input type="text" name="kullaniciSoyadi" placeholder="What's your last name?" />
			<input type="submit" />
		</form>
	</div>
	

</body>
</html>