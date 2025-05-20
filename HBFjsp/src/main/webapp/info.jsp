<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="header.html" %>
<br><hr>

User-Agent:<%= request.getHeader("User-Agent") %>
<br>
Locale: <%= request.getLocale() %>
<br><hr>
<%@ include file="footer.jsp" %>
</body>
</html>