<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*, com.app.bean.Customer"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<%
List<Customer> list = (List)request.getAttribute("list");
%>
</head>
<body>

<table border="1">
<tr>
<th>FirstName</th>
<th>LastName</th>
<th>Email-Id</th>
<th>Status</th>
</tr>

<%  
	for(Customer c:list)
	{
		
%>
<tr>
	<td>${c.firstName }</td>
	<td>${c.lastName }</td>
	<td>${c.email }</td>
	<td>${c.status }</td>

</tr>
<%} %>

</table>

</body>
</html>