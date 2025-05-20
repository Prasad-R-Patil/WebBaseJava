<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,com.app.bean.*,com.app.dao.*"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employees List</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<style>
  body {
    background-color: #f8f9fa;
    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    padding: 40px;
  }
  h1 {
    margin-bottom: 20px;
    font-weight: 700;
    color: #333;
    text-align: center;
  }
  hr {
    margin-bottom: 30px;
    border-color: #dee2e6;
  }
  .table-container {
    max-width: 900px;
    margin: auto;
    background: white;
    padding: 25px 30px;
    border-radius: 12px;
    box-shadow: 0 0 20px rgb(0 0 0 / 0.1);
  }
  table {
    width: 100%;
  }
  th {
    background-color: #007bff;
    color: white;
    text-align: center;
  }
  td, th {
    padding: 12px 15px;
    text-align: center;
  }
  a.btn-edit, a.btn-delete {
    padding: 6px 12px;
    border-radius: 6px;
    color: white;
    text-decoration: none;
    font-weight: 600;
    transition: background-color 0.3s ease;
  }
  a.btn-edit {
    background-color: #28a745;
  }
  a.btn-edit:hover {
    background-color: #218838;
  }
  a.btn-delete {
    background-color: #dc3545;
  }
  a.btn-delete:hover {
    background-color: #c82333;
  }
</style>
</head>
<body>
<h1>Employees</h1>
<hr>
<div class="table-container">
<%
    List<Employee> list = EmployeeDao.getAllEmployees();
    request.setAttribute("list", list);
%>

<table class="table table-striped table-bordered">
  <thead>
    <tr>
      <th>ID</th>
      <th>Name</th>
      <th>Password</th>
      <th>Email</th>
      <th>Gender</th>
      <th>Country</th>
      <th>Edit</th>
      <th>Delete</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach var="e" items="${list}">
    <tr>
      <td>${e.getId()}</td>
      <td>${e.getName()}</td>
      <td>${e.getPassword()}</td>
      <td>${e.getEmail()}</td>
      <td>${e.getGender()}</td>
      <td>${e.getCountry()}</td>
      <td><a href="editEmployee.jsp?id=${e.getId()}" class="btn-edit">Edit</a></td>
      <td><a href="deleteEmployee.jsp?id=${e.getId()}" class="btn-delete">Delete</a></td>
    </tr>
  </c:forEach>
  </tbody>
</table>
</div>
</body>
</html>
