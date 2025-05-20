<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Form</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<style>
  body {
    background-color: #f0f2f5;
    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    padding: 40px 20px;
  }
  .form-container {
    max-width: 600px;
    margin: auto;
    background: white;
    padding: 30px 40px;
    border-radius: 10px;
    box-shadow: 0 0 15px rgb(0 0 0 / 0.1);
  }
</style>
</head>
<body>
  <div class="form-container">
    <jsp:include page="employeeForm.html" />
  </div>
</body>
</html>
