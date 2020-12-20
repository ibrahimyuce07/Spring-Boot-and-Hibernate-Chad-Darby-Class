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

	<h2>Kullanıcı Adı ve Soyadı Birleştir</h2>
	<hr>
	<br />
	<p>
		İsim 	: <b>${param.kullaniciAdi}</b>
		Soyisim : <b>${param.kullaniciSoyadi}</b>
	</p>
	<br />
	<!-- message : attribute name from the model in controller -->
	<p>Sonuç : ${message}</p>




















</body>
<footer>
	<a href="/spring-mvc-demo">Main Menu</a>
</footer>
</html>