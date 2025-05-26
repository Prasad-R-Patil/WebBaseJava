<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Student Form</h1>
<form:form action="StudentConfirm" method="post" modelAttribute="theStudent">

Enter First-Name: <form:input path="firstName"/>
<br><br>
Enter last-Name: <form:input path="lastName"/>
<br><br>
Select Country : 
<form:select path="country">
<form:options items="${theStudent.countryOption }"/>
</form:select>
<br><br>
Select Favorite-Language: 
Java : <form:radiobutton path="favoriteLanguage" value="java"/>
Spring-Boot : <form:radiobutton path="favoriteLanguage" value="springBoot"/>
Microservices : <form:radiobutton path="favoriteLanguage" value="microservices"/>
<br><br>
Select Operating-System :

Windows:<form:checkbox path="operatingSystem" value="windows"/>
Linux:<form:checkbox path="operatingSystem" value="linux"/>
Mac Os:<form:checkbox path="operatingSystem" value="mac"/>
<br><br>
<input type="Submit" value="Register"/>


</form:form>
</body>
</html>