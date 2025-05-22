<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.app.entity.Book,com.app.dao.BookDAO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Book</title>
<style>
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background-color: #f4f6f9;
        padding: 40px;
        text-align: center;
    }

    h1 {
        color: #343a40;
        margin-bottom: 30px;
    }

    h2 {
        color: #495057;
        font-weight: normal;
    }

    .form-container {
        background-color: #ffffff;
        display: inline-block;
        padding: 30px;
        border-radius: 10px;
        box-shadow: 0 2px 8px rgba(0, 0, 0, 0.1);
        margin-bottom: 30px;
    }

    input[type="text"] {
        padding: 10px;
        width: 220px;
        border: 1px solid #ccc;
        border-radius: 5px;
        font-size: 16px;
        margin-top: 10px;
    }

    input[type="submit"] {
        padding: 10px 20px;
        background-color: #007bff;
        color: white;
        border: none;
        border-radius: 5px;
        font-size: 16px;
        cursor: pointer;
        margin-top: 15px;
    }

    input[type="submit"]:hover {
        background-color: #0056b3;
    }

    .book-details {
        text-align: left;
        display: inline-block;
        background-color: #fff;
        padding: 25px;
        border-radius: 10px;
        box-shadow: 0 2px 8px rgba(0, 0, 0, 0.1);
        margin-top: 30px;
    }

    .error-message {
        color: red;
        margin-top: 20px;
        font-size: 18px;
    }
</style>
</head>
<body>

<h1>View Book Details</h1>

<div class="form-container">
    <form action="viewBook.jsp">
        <label for="txtid"><strong>Book ID:</strong></label><br>
        <input type="text" name="txtid" id="txtid" placeholder="Enter Book ID"><br>
        <input type="submit" value="View Book">
    </form>
</div>

<%
    String bid = request.getParameter("txtid");

    if (bid != null && !bid.trim().isEmpty()) {
        try {
            int id = Integer.parseInt(bid);
            BookDAO bd = new BookDAO();
            Book b = bd.getBook(id);

            if (b != null) {
%>
<div class="book-details">
    <h2><strong>Book ID:</strong> <%= b.getId() %></h2>
    <h2><strong>Title:</strong> <%= b.getTitel() %></h2>
    <h2><strong>Author:</strong> <%= b.getAurthor() %></h2>
    <h2><strong>Publisher:</strong> <%= b.getPublisher() %></h2>
    <h2><strong>Price:</strong> ₹<%= b.getPrice() %></h2>
</div>
<%
            } else {
%>
    <div class="error-message">No book found with the given ID.</div>
<%
            }
        } catch (NumberFormatException e) {
%>
    <div class="error-message">Invalid Book ID format. Please enter a numeric value.</div>
<%
        }
    } else if (bid != null) {
%>
    <div class="error-message">Book ID is required.</div>
<%
    }
%>

</body>
</html>
