<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Student Registration Form</title>
<link rel="stylesheet" type="text/css"
	href="..\resources\css\helloworld-form.css">
</head>


<body>
<div class="container">
<form:form action="processForm" modelAttribute="student">
<form:input path="firstName" placeholder="First Name" />
<br/>
<form:input path="lastName" placeholder="Last Name" />
<br/>
<form:select path="country">
    <option value="" disabled selected>Select your option</option>
<form:options items="${student.countryOptions}"/>
</form:select>
<br/><br/>
Favorite Language : 

Java <form:radiobutton path="favoriteLanguage" value="Java"/>
C# <form:radiobutton path="favoriteLanguage" value="C#"/>
PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/>
<br/><br/>
Operating Systems : 

Linux <form:checkbox path="operatingSystems" value="Linux"/>
Windows <form:checkbox path="operatingSystems" value="Windows"/>
MacOS <form:checkbox path="operatingSystems" value="MacOS"/> 
<br>
<input type="submit" value="Submit"/>
</form:form>
</div>
</body>
</html>