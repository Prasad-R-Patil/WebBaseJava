<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.app.dao.EmployeeDao,com.app.bean.Employee" %>
<%@ page import="java.sql.SQLException" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Delete Employee</title>
<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<style>
  body {
    background-color: #f8f9fa;
    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    padding-top: 40px;
  }
  .container {
    max-width: 700px;
  }
  .card {
    border-radius: 10px;
    box-shadow: 0 4px 8px rgba(0,0,0,0.1);
  }
  .card-header {
    background-color: #dc3545;
    color: white;
    font-weight: 600;
    font-size: 1.5rem;
    border-top-left-radius: 10px;
    border-top-right-radius: 10px;
  }
  a.btn-back {
    margin-top: 20px;
  }
</style>
</head>
<body>

<div class="container">
  <div class="card">
<%
    String idStr = request.getParameter("id");
    if (idStr != null) {
        int id = Integer.parseInt(idStr);
        Employee emp = null;
        int status = 0;
        try {
            emp = EmployeeDao.getEmployeeId(id);
            if (emp != null) {
                status = EmployeeDao.deleteEmployee(id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (status > 0 && emp != null) {
%>
    <div class="card-header text-center">
      Employee Deleted Successfully!
    </div>
    <div class="card-body">
      <table class="table table-bordered table-striped">
        <thead class="table-danger">
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Gender</th>
            <th>Country</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td><%= emp.getId() %></td>
            <td><%= emp.getName() %></td>
            <td><%= emp.getEmail() %></td>
            <td><%= emp.getGender() %></td>
            <td><%= emp.getCountry() %></td>
          </tr>
        </tbody>
      </table>
      <div class="text-center">
        <a href="viewEmployees.jsp" class="btn btn-primary btn-back">Back to Employee List</a>
      </div>
    </div>
<%
        } else {
%>
    <div class="card-header text-center bg-warning">
      Delete Failed
    </div>
    <div class="card-body text-center">
      <h5>Failed to delete employee record!</h5>
      <a href="viewEmployees.jsp" class="btn btn-secondary btn-back">Back to Employee List</a>
    </div>
<%
        }
    } else {
%>
    <div class="card-header text-center bg-danger">
      Invalid Employee ID
    </div>
    <div class="card-body text-center">
      <h5>Invalid Employee ID!</h5>
      <a href="viewEmployees.jsp" class="btn btn-secondary btn-back">Back to Employee List</a>
    </div>
<%
    }
%>
  </div>
</div>

<!-- Bootstrap JS Bundle (Optional) -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
