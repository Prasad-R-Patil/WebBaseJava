<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="saveCustomer" modelAttribute="customer" method="post" >
<form:hidden path="id"/>
<table>
<tr>
<td>First Name</td>
<td><form:input path="firstName"/>  </td>
<td>Last Name</td>
<td><form:input path="lastName"/>  </td>
<td>Email</td>
<td><form:input path="email"/>  </td>
<td><input type="submit" value="SUBMIT" /></td>
</tr>
</table>
</form:form>

<p>
<a href="${pageContext.request.contextPath }/customer/list" >Back To List</a>
</p>
</body>
</html>