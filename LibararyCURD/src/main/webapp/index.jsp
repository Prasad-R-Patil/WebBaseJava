<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Library Management</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f5f7fa;
        margin: 0;
        padding: 0;
        text-align: center;
    }

    h1 {
        margin-top: 50px;
        color: #333;
    }

    .nav-container {
        margin-top: 60px;
    }

    a {
        text-decoration: none;
        background-color: #4CAF50;
        color: white;
        padding: 14px 25px;
        margin: 10px;
        display: inline-block;
        border-radius: 8px;
        font-size: 16px;
        transition: background-color 0.3s ease;
    }

    a:hover {
        background-color: #45a049;
    }
</style>
</head>
<body>

<h1>Library Book Management</h1>

<div class="nav-container">
    <a href="addBooks.jsp">Add Book</a>
    <a href="viewBook.jsp">View Books</a>
    <a href="updateBook.jsp">Update</a>
    <a href="deleteBook.jsp">Delete</a>
</div>

</body>
</html>
