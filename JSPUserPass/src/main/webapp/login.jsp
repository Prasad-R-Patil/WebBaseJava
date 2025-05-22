<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:forward page="next.jsp">
<jsp:param value="${param.textUsername }" name="uname"/>
<jsp:param value="${param.textPassword }" name="pwd"/>
</jsp:forward>
</body>
</html>