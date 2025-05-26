<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Student Confirametion</h1>
First Name => ${theStudent.firstName }
<br>
Last Name => ${theStudent.lastName }
<br>
Country => ${theStudent.country }
<br>
Favorite Language => ${theStudent.favoriteLanguage }
<br>

Operating System =>
<c:forEach var="temp" items="${theStudent.operatingSystem}">
    ${temp}
</c:forEach>

</body>
</html>