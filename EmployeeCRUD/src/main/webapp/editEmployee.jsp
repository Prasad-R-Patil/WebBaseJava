<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,com.app.bean.*,com.app.dao.*" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="ISO-8859-1">
  <title>Edit Employee</title>
  <!-- Bootstrap CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
  <style>
    body {
      background-color: #f8f9fa;
    }
    .form-container {
      max-width: 700px;
      margin: 50px auto;
    }
  </style>
</head>
<body>

<%
    int id = Integer.parseInt(request.getParameter("id"));
    Employee e = EmployeeDao.getEmployeeId(id);
%>

<div class="container form-container">
  <div class="card shadow">
    <div class="card-header bg-primary text-white text-center">
      <h3>Edit Employee</h3>
    </div>
    <div class="card-body">
      <form action="editEmp.jsp" method="post">
        <input type="hidden" name="id" value="<%= e.getId() %>">

        <div class="mb-3">
          <label class="form-label">Name:</label>
          <input type="text" name="name" class="form-control" value="<%= e.getName() %>" required>
        </div>

        <div class="mb-3">
          <label class="form-label">Password:</label>
          <input type="password" name="password" class="form-control" value="<%= e.getPassword() %>" required>
        </div>

        <div class="mb-3">
          <label class="form-label">Email-Id:</label>
          <input type="email" name="email" class="form-control" value="<%= e.getEmail() %>" required>
        </div>

        <div class="mb-3">
          <label class="form-label d-block">Gender:</label>
          <div class="form-check form-check-inline">
            <input class="form-check-input" type="radio" name="gender" value="male" <%= e.getGender().equals("male") ? "checked" : "" %>>
            <label class="form-check-label">Male</label>
          </div>
          <div class="form-check form-check-inline">
            <input class="form-check-input" type="radio" name="gender" value="female" <%= e.getGender().equals("female") ? "checked" : "" %>>
            <label class="form-check-label">Female</label>
          </div>
        </div>

        <div class="mb-4">
          <label class="form-label">Country:</label>
          <select class="form-select" name="country" required>
            <option <%= e.getCountry().equals("India") ? "selected" : "" %>>India</option>
            <option <%= e.getCountry().equals("USA") ? "selected" : "" %>>USA</option>
            <option <%= e.getCountry().equals("France") ? "selected" : "" %>>France</option>
            <option <%= e.getCountry().equals("Germany") ? "selected" : "" %>>Germany</option>
            <option <%= e.getCountry().equals("Other") ? "selected" : "" %>>Other</option>
          </select>
        </div>

        <div class="d-grid">
          <button type="submit" class="btn btn-primary">Update Employee</button>
        </div>
      </form>
    </div>
  </div>
</div>

<!-- Bootstrap JS (optional) -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
