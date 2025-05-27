<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


</head>
<body>
<h2>CRM-Customer Relationship Manager</h2>

<!-- Put NEW Button :ADD Customer -->

<input type="button" value="Add Customer" onclick="window.location.href='ShowFormForAdd'; return false;" class="add-button">

<!-- Add our html table here -->
<table>
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Action</th>
</tr>

<!-- loop over and print our customers -->

<c:forEach var="tempCustomer" items="${Customers}">

<!-- Construct on "update" link with customer id -->
<c:url var="updateLink" value="/Customer/ShowFormForUpdate">
<c:param name="customerID" value="${tempCustomer.id} "></c:param>
</c:url>
<tr>
<td>${tempCustomer.firstName}</td>
<td>${tempCustomer.lastName}</td>
<td>${tempCustomer.email}</td>
<td>
<!-- display the updatelink -->
<a href="${updateLink}">update</a>
</td>
</tr>
</c:forEach>

</table>
</body>
</html>