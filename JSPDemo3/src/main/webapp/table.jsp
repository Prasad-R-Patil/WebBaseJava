<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="ISO-8859-1">
  <title>Your Table</title>
  <!-- Bootstrap CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <style>
    body {
      background-color: #f8f9fa;
    }
    .table-box {
      width: 300px;
      margin: 100px auto;
      padding: 20px;
      border: 2px solid #007bff;
      border-radius: 10px;
      background-color: white;
      box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);
    }
    table {
      width: 100%;
    }
  </style>
</head>
<body>

<div class="table-box text-center">
  <h4 class="mb-3">Multiplication Table</h4>
  <table class="table table-bordered table-striped">
    <tbody>
      <%
        int no = Integer.parseInt(request.getParameter("textnum"));
        for (int i = 1; i <= 10; i++) {
      %>
      <tr>
        <td><%= no + " x " + i + " = " + (no * i) %></td>
      </tr>
      <% } %>
    </tbody>
  </table>
</div>

</body>
</html>
