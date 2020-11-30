<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-9">
<link rel="stylesheet" type="text/css"
	href="..\resources\css\helloworld.css">
<title>Customer Confirmation Page</title>
</head>




<body>
<div class="container">

The customer is confirmed: ${customer.firstName}  ${customer.lastName}
<br>
Free passes: ${customer.freePasses}
<br>
Postal Code: ${customer.postalCode}
</div>





</body>
<footer>
	<a href="/spring-mvc-demo">Main Menu</a>
</footer>
</html>