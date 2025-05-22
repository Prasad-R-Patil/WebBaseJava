<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Book Result</title>
<style>
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background-color: #f4f4f4;
        text-align: center;
        padding: 50px;
    }

    h1 {
        font-size: 28px;
        color: #333;
        margin-bottom: 30px;
    }

    .success {
        color: green;
    }

    .error {
        color: red;
    }

    a {
        display: inline-block;
        margin-top: 30px;
        padding: 10px 20px;
        background-color: #007bff;
        color: white;
        text-decoration: none;
        border-radius: 6px;
        transition: background-color 0.3s ease;
    }

    a:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>

<jsp:useBean id="b" class="com.app.entity.Book" />
<jsp:setProperty property="*" name="b" />
<jsp:useBean id="bd" class="com.app.dao.BookDAO" />

<%
    int id = bd.updateBook(b, b.getId());
    if (id > 0) {
%>
    <h1 class="success">Book Updated Successfully!</h1>
<%
    } else {
%>
    <h1 class="error">Book Update Failed!</h1>
<%
    }
%>

<a href="index.jsp">Back</a>

</body>
</html>
