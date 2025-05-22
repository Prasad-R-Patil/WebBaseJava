<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.app.dao.BookDAO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Book Result</title>
<style>
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background-color: #f0f2f5;
        text-align: center;
        padding: 50px;
    }

    h1 {
        font-size: 28px;
        margin-bottom: 30px;
    }

    .success {
        color: #28a745;
    }

    .error {
        color: #dc3545;
    }

    a {
        display: inline-block;
        margin-top: 30px;
        padding: 10px 20px;
        background-color: #007bff;
        color: white;
        text-decoration: none;
        border-radius: 5px;
        transition: background-color 0.3s ease;
    }

    a:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>

<jsp:useBean id="b" class="com.app.entity.Book"></jsp:useBean>
<jsp:setProperty property="*" name="b"/>
<jsp:useBean id="bd" class="com.app.dao.BookDAO"></jsp:useBean>

<%
    int id = bd.saveBook(b);
    if(id > 0) {
%>
    <h1 class="success">Book Added Successfully!</h1>
<%
    } else {
%>
    <h1 class="error">Book Not Added.</h1>
<%
    }
%>

<a href="index.jsp">Back</a>

</body>
</html>
