<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 

	String uname = request.getParameter("textUsername");
	String pwd = request.getParameter("textPassword");
	
	if(uname.equals("admin") && pwd.equals("admin123"))
	{
		out.write("Login Successfully..."+uname);
		
	}
	else
	{
		out.write("Invalid UserName or Password....");
	}



%>
</body>
</html>