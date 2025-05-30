<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Customer Relationship Manager</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    <div class="container mt-5">
        <h2 class="mb-4">Customer Relationship Manager</h2>
        <div class="mb-3">
            <input type="button" value="Add Customer" class="btn btn-success" onclick="window.location.href='showFormForAdd'; return false;" />
        </div>
        <table class="table table-striped table-bordered">
            <thead class="table-dark">
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                    <th colspan="2">Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="theCustomer" items="${customers}">
                    <c:url var="updateLink" value="/customer/showFormForUpdate">
                        <c:param name="customerid" value="${theCustomer.id}" />
                    </c:url>
                    <c:url var="deleteLink" value="/customer/deleteCustomer">
                        <c:param name="customerid" value="${theCustomer.id}" />
                    </c:url>
                    <tr>
                        <td>${theCustomer.firstName}</td>
                        <td>${theCustomer.lastName}</td>
                        <td>${theCustomer.email}</td>
                        <td><a href="${updateLink}" class="btn btn-primary btn-sm">Update</a></td>
                        <td><a href="${deleteLink}" class="btn btn-danger btn-sm">Delete</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
