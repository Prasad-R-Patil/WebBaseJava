<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page session="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Todo List</title>

<!-- Bootstrap 5 CDN -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<style>
    body {
        padding: 30px;
        background-color: #f8f9fa;
    }
    .todo-box {
        max-width: 600px;
        margin: auto;
        background: white;
        padding: 25px;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0,0,0,0.1);
    }
</style>
</head>
<body>

<%
    // Session-based Todo List
    List<String> itemList = (List<String>) session.getAttribute("MyTodoList");
    if (itemList == null) {
        itemList = new ArrayList<String>();
        session.setAttribute("MyTodoList", itemList);
    }

    // Message variable
    String message = "";

    // Handle Add
    String theItem = request.getParameter("theItem");
    if (theItem != null && !theItem.trim().equals("")) {
        itemList.add(theItem.trim());
        message = "✅ Item added!";
    }

    // Handle Remove
    String removeFlag = request.getParameter("remove");
    if ("true".equals(removeFlag)) {
        if (!itemList.isEmpty()) {
            itemList.remove(itemList.size() - 1);
            message = "❌ Last item removed!";
        } else {
            message = "⚠️ Nothing to remove!";
        }
    }
%>

<div class="todo-box">
    <h2 class="text-center mb-4">📝 My Todo List</h2>

    <!-- Form with Add and Remove buttons at the top -->
    <div class="d-flex gap-2 mb-3">
        <!-- Add form -->
        <form action="todoDeo.jsp" method="get" class="flex-grow-1 d-flex">
            <input type="text" class="form-control me-2" name="theItem" placeholder="Enter new item">
            <button class="btn btn-success" type="submit">Add</button>
        </form>

        <!-- Remove form -->
        <form action="todoDeo.jsp" method="get">
            <input type="hidden" name="remove" value="true">
            <button class="btn btn-danger" type="submit">Remove Last</button>
        </form>
    </div>

    <!-- Message after add/remove -->
    <% if (!message.isEmpty()) { %>
        <div class="alert alert-info text-center"><%= message %></div>
    <% } %>

    <hr>
    <h5>Tasks:</h5>
    <ol class="list-group list-group-numbered">
        <% for (String temp : itemList) { %>
            <li class="list-group-item"><%= temp %></li>
        <% } %>
    </ol>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
