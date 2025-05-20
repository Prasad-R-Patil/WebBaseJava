<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<style>
  body {
    background-color: #e9f7ef;
    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    padding: 40px;
  }
  .container {
    max-width: 600px;
    margin: auto;
    background: white;
    padding: 30px 40px;
    border-radius: 12px;
    box-shadow: 0 0 20px rgb(0 0 0 / 0.1);
    text-align: center;
  }
  .success-msg {
    font-size: 1.5rem;
    font-weight: 600;
    color: #198754; /* bootstrap success green */
    margin-bottom: 25px;
  }
</style>
</head>
<body>
  <div class="container">
    <div class="success-msg">
      Employee Record Saved Successfully!!!
    </div>
    <jsp:include page="employeeForm.html" />
  </div>
</body>
</html>
