<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.app.dao.EmployeeDao" %>
<%@ page import="com.app.bean.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<style>
  body {
    background-color: #f8f9fa;
    height: 100vh;
    display: flex;
    justify-content: center;
    align-items: center;
  }
  .message-box {
    background: white;
    padding: 30px 40px;
    border-radius: 12px;
    box-shadow: 0 0 15px rgb(0 0 0 / 0.1);
    max-width: 450px;
    width: 100%;
    text-align: center;
  }
  .message-box h4 {
    margin-bottom: 15px;
  }
</style>
<meta http-equiv="refresh" content="3;URL=viewEmployees.jsp">
</head>
<body>

<jsp:useBean id="emp" class="com.app.bean.Employee" />
<jsp:setProperty property="*" name="emp" />

<%
    int i = EmployeeDao.updateEmployee(emp);
    if (i > 0) {
%>
  <div class="message-box">
    <div class="alert alert-success">
      <h4>Employee updated successfully!</h4>
      <p>Redirecting to the employee list...</p>
      <a href="viewEmployees.jsp" class="btn btn-success mt-3">Go to List Now</a>
    </div>
  </div>
<%
    } else {
%>
  <div class="message-box">
    <div class="alert alert-danger">
      <h4>Failed to update employee.</h4>
      <p>Please try again.</p>
      <a href="editEmployee.jsp?id=<%= emp.getId() %>" class="btn btn-danger mt-3">Back to Edit</a>
    </div>
  </div>
<%
    }
%>

</body>
</html>
