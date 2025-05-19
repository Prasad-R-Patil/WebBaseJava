<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="jakarta.tags.core" prefix="c" %>
    <%@ taglib uri="jakarta.tags.fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Internationalization</title>
<c:set var="theLocale" value="${not empty param.theLocale ? param.theLocale : pageContext.request.locale}" />
<!-- param.theLoacle n- Read the locale param sent by link 
   pageContent.request.locale - Read the locale sent by browser http request-->
   <fmt:setLocale value="${theLocale}"/>
   <fmt:setBundle basename="com.app.jsp.tagDemo.i18n.resource.mylabels"/>
</head>
<body>
 <a href="test.jsp?theLocale=en_US">English(US)</a>
 <a href="test.jsp?theLocale=es_ES">Spanish(ES)</a>
 <a href="test.jsp?theLocale=de_DE">German(DE)</a>
 <a href="testththjt.jsp?theLocale=mr_IN">Marathi(IN)</a>
 
 <hr>
 <fmt:message key="label.greeting"/><br><br>
 <fmt:message key="label.firstname"/><i> Prasad</i><br><br>
 <fmt:message key="label.lastname"/><i> Patil</i><br><br>
  <fmt:message key="label.welcome"/><br><br> 
  <hr>
  Selected Locale: ${theLocale}
</body>
</html>