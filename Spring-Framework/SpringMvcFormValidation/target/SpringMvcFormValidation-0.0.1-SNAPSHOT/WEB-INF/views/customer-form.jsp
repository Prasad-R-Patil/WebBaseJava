<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<i>Fill out the form Asterisk(*) means required</i>
<br><br>
<form:form action="ProcessForm" modelAttribute="customer">
Enter FirstName<sup style="color:red">*</sup>:<form:input path="firstName"/>
<form:errors path="firstName" cssClass="error"></form:errors>
<br><br>
Enter LastName<sup style="color:red">*</sup>:<form:input path="lastName"/>
<form:errors path="lastName" cssClass="error"></form:errors>
<br><br>
<input type="submit" value="Submit">
</form:form>
</body>
</html>