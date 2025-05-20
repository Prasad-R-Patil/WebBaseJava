<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="java.util.*, com.app.bean.Customer"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
List<Customer> l = new ArrayList<Customer>();
l.add(new Customer("Prasad","Patil","prasad@gmail.com",true));
l.add(new Customer("Sagar","mali","sagar@gmail.com",true));
l.add(new Customer("tejas","jadhav","tejas@gmail.com",false));
l.add(new Customer("viki","kambli","viki@gmail.com",false));
l.add(new Customer("zakan","zulya","zaknzuly@gmail.com",false));

pageContext.setAttribute("listCustomer", l);

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

<c:forEach var="temp" items="${listCustomer}">
<c:if test="${temp.status}">

<tr>
<td>${temp.firstName}</td>
<td>${temp.lastName}</td>
<td>${temp.email}</td>
<td>${temp.status}</td>

</tr>

</c:if>

</c:forEach>

</table>

</body>
</html>