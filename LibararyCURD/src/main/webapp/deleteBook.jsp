<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.app.entity.Book,com.app.dao.BookDAO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Book</title>
<style>
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background-color: #f9f9f9;
        text-align: center;
        padding: 50px;
    }

    h2 {
        margin-bottom: 20px;
        color: #333;
    }

    input[type="text"] {
        padding: 10px;
        width: 200px;
        border: 1px solid #ccc;
        border-radius: 5px;
        font-size: 16px;
    }

    input[type="submit"] {
        padding: 10px 20px;
        background-color: #dc3545;
        color: white;
        border: none;
        border-radius: 5px;
        font-size: 16px;
        cursor: pointer;
        margin-top: 15px;
    }

    input[type="submit"]:hover {
        background-color: #c82333;
    }

    .success {
        color: green;
        margin-top: 30px;
        font-size: 24px;
    }

    .error {
        color: red;
        margin-top: 30px;
        font-size: 24px;
    }

    form {
        margin-bottom: 40px;
    }
</style>
</head>
<body>

<h2>Delete Book by ID</h2>
<form action="deleteBook.jsp">
    <input type="text" name="txtid" placeholder="Enter Book ID">
    <br>
    <input type="submit" value="Delete Book">
</form>

<%
    String bid = request.getParameter("txtid");

    if (bid != null && !bid.trim().isEmpty()) {
        try {
            int id = Integer.parseInt(bid);
            BookDAO bd = new BookDAO();
            bd.deleteBook(id);
%>
    <div class="success">Book Deleted Successfully!</div>
<%
        } catch (Exception e) {
%>
    <div class="error">Invalid Book ID!</div>
<%
        }
    } else if (bid != null) {
%>
    <div class="error">Book Not Deleted. Please enter a valid ID.</div>
<%
    }
%>

</body>
</html>
