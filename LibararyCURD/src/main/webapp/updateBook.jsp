<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.app.entity.Book,com.app.dao.BookDAO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Book</title>
<style>
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background-color: #f4f6f9;
        padding: 40px;
        text-align: center;
    }

    h1, h2 {
        color: #333;
    }

    input[type="text"] {
        padding: 10px;
        width: 250px;
        border: 1px solid #ccc;
        border-radius: 5px;
        margin: 10px 0;
        font-size: 16px;
    }

    input[type="submit"] {
        padding: 10px 20px;
        background-color: #007bff;
        color: white;
        border: none;
        border-radius: 5px;
        font-size: 16px;
        cursor: pointer;
        margin-top: 20px;
    }

    input[type="submit"]:hover {
        background-color: #0056b3;
    }

    form {
        margin-bottom: 30px;
        display: inline-block;
        background-color: #ffffff;
        padding: 30px;
        border-radius: 10px;
        box-shadow: 0 2px 8px rgba(0,0,0,0.1);
        text-align: left;
    }

    .message {
        margin-top: 20px;
        color: red;
        font-size: 18px;
    }
</style>
</head>
<body>

<h1>Update Book Information</h1>

<form action="updateBook.jsp">
    <label for="txtid"><strong>Book ID:</strong></label><br>
    <input type="text" name="txtid" id="txtid" placeholder="Enter Book ID to update"><br>
    <input type="submit" value="Fetch Book">
</form>

<%
    String bid = request.getParameter("txtid");

    if (bid != null && !bid.trim().isEmpty()) {
        try {
            int id = Integer.parseInt(bid);
            BookDAO bd = new BookDAO();
            Book b = bd.getBook(id);

            if (b != null) {
%>
<form action="addUpdate.jsp">
    <h2>Book Details:</h2>
    <label>Book ID:</label><br>
    <input type="text" name="id" value="<%= b.getId() %>" readonly><br>

    <label>Title:</label><br>
    <input type="text" name="titel" value="<%= b.getTitel() %>"><br>

    <label>Author:</label><br>
    <input type="text" name="aurthor" value="<%= b.getAurthor() %>"><br>

    <label>Publisher:</label><br>
    <input type="text" name="publisher" value="<%= b.getPublisher() %>"><br>

    <label>Price:</label><br>
    <input type="text" name="price" value="<%= b.getPrice() %>"><br>

    <input type="submit" value="Update Book">
</form>
<%
            } else {
%>
<div class="message">No book found with the given ID.</div>
<%
            }
        } catch (NumberFormatException e) {
%>
<div class="message">Invalid Book ID format. Please enter a valid number.</div>
<%
        }
    } else if (bid != null) {
%>
<div class="message">Book ID is required.</div>
<%
    }
%>

</body>
</html>
