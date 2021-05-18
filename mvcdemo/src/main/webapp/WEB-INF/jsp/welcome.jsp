<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="resources/css/docss.css"
    rel="stylesheet">
<title>Login</title>
</head>
<body>
<h1>Login Page </h1>
<form:form action="login" method="post" modelAttribute="userModel">
UserId: <form:input path="userid" />
Password: <form:input path="pwd" />
<form:button>Login</form:button>
</form:form>

</body>
</html>
