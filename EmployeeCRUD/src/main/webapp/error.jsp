<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Operation Failed</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<style>
  body {
    background-color: #f8d7da;
    display: flex;
    flex-direction: column;
    align-items: center;
    padding: 30px;
    font-family: Arial, sans-serif;
  }
  .alert-fail {
    background-color: #f8d7da;
    border: 1px solid #f5c2c7;
    color: #842029;
    padding: 20px 30px;
    border-radius: 8px;
    font-weight: bold;
    font-size: 1.5rem;
    margin-bottom: 25px;
    text-align: center;
    width: 100%;
    max-width: 500px;
  }
  .form-container {
    width: 100%;
    max-width: 600px;
  }
</style>
</head>
<body>
  <div class="alert-fail">
    FAILED!!! Please try again.
  </div>
  <div class="form-container">
    <jsp:include page="employeeForm.html"></jsp:include>
  </div>
</body>
</html>
