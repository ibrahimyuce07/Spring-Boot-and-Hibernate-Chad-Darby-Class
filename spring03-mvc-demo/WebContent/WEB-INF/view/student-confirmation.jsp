<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-9">
<link rel="stylesheet" type="text/css"
	href="..\resources\css\helloworld.css">
<title>Student Confirmation Page</title>
</head>
<body>
<div class="container">

<p>The student is confirmed: <b>${student.firstName} ${student.lastName} </b></p>


<br>
<p>Country: <b>${student.country}</b></p>


<br>
<p>Favorite Language: <b>${student.favoriteLanguage}</b> 
</p>

<br>

<!-- array üzerinde gezinip liste olustur. -->
<p>Operation Systems:</p>
<ul class="column-list">
<c:forEach var="temp" items="${student.operatingSystems}">
<li> ${temp} </li>
</c:forEach>
</ul>
</div>

</body>
<footer>
	<a href="/spring-mvc-demo">Main Menu</a>
</footer>
</html>