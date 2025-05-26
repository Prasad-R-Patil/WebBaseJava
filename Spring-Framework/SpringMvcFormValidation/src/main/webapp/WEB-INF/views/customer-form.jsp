<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.error{color:red}
</style>
</head>
<body>

<i>Fill out a form where fields marked with an asterisk (*) are required?</i>
<br><br>
<form:form action="ProcessForm" modelAttribute="customer">

Enter First Name : <form:input path="firstName"/>
<br><br>
Enter Last Name(*) : <form:input path="lastName"/>
<form:errors path="lastName" cssClass="error"/>
<br><br>

<input type="submit" value="Submit"/>
</form:form>

</body>
</html>