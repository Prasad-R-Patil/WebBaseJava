<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/style/css" />
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Customer Relationship Manager</h1>

<input type="button" value="Add Customer" onclick="window.location.href='showFormForAdd';return false;" />

<table>
<tr>
<th>First Name</th><th>Last Name</th><th>Email</th><th>Actions</th>
</tr>

<c:forEach var="theCustomer" items="${customers }" >
<c:url var="updateLink" value="/customer/showFormForUpdate" >
<c:param name="customerid" value="${theCustomer.id }" ></c:param>
</c:url>
<c:url var="deleteLink" value="/customer/deleteCustomer" >
<c:param name="customerid" value="${theCustomer.id }" ></c:param>
</c:url>
<tr>
<td>${theCustomer.firstName }</td><td>${theCustomer.lastName }</td><td>${theCustomer.email }</td>
<td><a href="${updateLink }" >Update</a></td>
<td><a href="${deleteLink }" >Delete</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>