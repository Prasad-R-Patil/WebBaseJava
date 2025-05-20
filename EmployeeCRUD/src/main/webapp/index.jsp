<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CRUD Operations</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<style>
  body {
    background-color: #f0f2f5;
    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    padding: 40px;
  }
  .container {
    max-width: 500px;
    margin: auto;
    background: white;
    padding: 30px 40px;
    border-radius: 12px;
    box-shadow: 0 0 20px rgb(0 0 0 / 0.1);
    text-align: center;
  }
  h1 {
    margin-bottom: 20px;
    font-weight: 700;
    color: #333;
  }
  hr {
    margin-bottom: 30px;
  }
  a.btn-link {
    display: inline-block;
    margin: 10px 20px;
    font-size: 1.2rem;
    padding: 10px 25px;
    border-radius: 50px;
    color: #007bff;
    border: 2px solid #007bff;
    text-decoration: none;
    transition: all 0.3s ease;
  }
  a.btn-link:hover {
    background-color: #007bff;
    color: white;
    text-decoration: none;
  }
</style>
</head>
<body>
  <div class="container">
    <h1>CRUD Operations</h1>
    <hr>
    <a href="addEmployee.jsp" class="btn-link">Add Employee</a>
    <a href="viewEmployees.jsp" class="btn-link">View Employees</a>
  </div>
</body>
</html>
