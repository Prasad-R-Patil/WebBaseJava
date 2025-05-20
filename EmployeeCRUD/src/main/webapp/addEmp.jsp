<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
    pageEncoding="ISO-8859-1" import="com.app.dao.EmployeeDao" %>
<%@ page import="com.app.bean.Employee" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="ISO-8859-1">
  <title>Processing...</title>
  <!-- Bootstrap CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
  <style>
    .center-box {
      margin-top: 100px;
    }
  </style>
</head>
<body class="bg-light">

<jsp:useBean id="emp" class="com.app.bean.Employee" scope="request" />
<jsp:setProperty property="*" name="emp" />

<%
    String statusMessage = "";
    String alertType = "";
    try {
        int result = EmployeeDao.AddEmp(emp);
        if (result > 0) {
            statusMessage = "Employee added successfully!";
            alertType = "success";
        } else {
            statusMessage = "Failed to add employee.";
            alertType = "danger";
        }
    } catch (Exception e) {
        statusMessage = "An error occurred while processing the request.";
        alertType = "danger";
        e.printStackTrace(); // For debugging
    }
%>

<div class="container center-box">
  <div class="row justify-content-center">
    <div class="col-md-6">
      <div class="alert alert-<%= alertType %> text-center shadow rounded" role="alert">
        <h4><%= statusMessage %></h4>
        <hr>
        <a href="index.jsp" class="btn btn-primary">Back to Form</a>
        <a href="viewEmployees.jsp" class="btn btn-outline-secondary ms-2">View Employees</a>
      </div>
    </div>
  </div>
</div>

<!-- Bootstrap JS (optional) -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
