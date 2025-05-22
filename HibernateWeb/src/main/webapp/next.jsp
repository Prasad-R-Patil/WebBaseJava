<%@page import="com.app.dao.StudentDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="s" class="com.app.entity.Student"></jsp:useBean>
<jsp:useBean id="sd" class="com.app.dao.StudentDAO"></jsp:useBean>
<jsp:setProperty property="*" name="s"/>

<% sd.saveStudent(s);%>

<h1 style="color:red; font-size:55px">Student Details :</h1>

<br>

<h1 style="color:purple; font-size:25px">stud-Id :<jsp:getProperty property="id" name="s"/></h1>
<br>
<h1 style="color:purple; font-size:25px">FirstName :<jsp:getProperty property="firstName" name="s"/></h1>
<br>
<h1 style="color:purple; font-size:25px">LastName :<jsp:getProperty property="lastName" name="s"/></h1>
<br>
<h1 style="color:purple; font-size:25px">Email-Id :<jsp:getProperty property="email" name="s"/></h1>
<br>

</body>
</html>