<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Customer Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    <div class="container mt-5">
        <div class="card shadow p-4">
            <h2 class="mb-4">Customer Form</h2>
            <form:form action="saveCustomer" modelAttribute="customer" method="post" class="row g-3">
                <form:hidden path="id"/>
                
                <div class="col-12">
                    <label class="form-label">First Name</label>
                    <form:input path="firstName" cssClass="form-control"/>
                </div>

                <div class="col-12">
                    <label class="form-label">Last Name</label>
                    <form:input path="lastName" cssClass="form-control"/>
                </div>

                <div class="col-12">
                    <label class="form-label">Email</label>
                    <form:input path="email" cssClass="form-control"/>
                </div>

                <div class="col-12">
                    <input type="submit" value="Submit" class="btn btn-primary"/>
                    <a href="${pageContext.request.contextPath}/customer/list" class="btn btn-secondary ms-2">Back To List</a>
                </div>
            </form:form>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
