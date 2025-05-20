<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border="1">
<tr>
<th>FirstName</th>
<th>LastName</th>
<th>Email-Id</th>
<th>Status</th>
</tr>

<c:forEach var="temp" items="${list}">
<c:if test="${temp.status}">

<tr>
<td>${temp.firstName}</td>
<td>${temp.lastName}</td>
<td>${temp.email}</td>

<c:choose>
<c:when test="${temp.ststus }">
Gold Customer
</c:when>
<c:otherwise>
iron Customer
</c:otherwise>
</c:choose>

</tr>

</c:if>

</c:forEach>

</table>

</body>
</html>