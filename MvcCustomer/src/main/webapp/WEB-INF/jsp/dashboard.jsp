<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>  
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>DashBoard</title>
<style>
		.error {color:red}
	</style>
</head>
<body>
<a id="en" href="/MvcCustomer/login?lang=en">English</a> | <a id="fr" href="/MvcCustomer/login?lang=fr">French</a>
<div>&nbsp;</div> 
<h1><spring:message code="welcome.title" /></h1>

<div id="welcome_text">
<h2><spring:message code="welcome.message" /></h2>
</div> 

<form:form action="logined" method="post" modelAttribute="userModel">
<table>
<tr><td><spring:message code="welcome.username" /> <form:input path="username" /></td></tr>
<tr><td><spring:message code="welcome.password" /> <form:input path="pass" /></td></tr>
<tr><td><form:errors path="pass" cssClass="error" /></td></tr>
<tr><td><form:button><spring:message code="welcome.submit" /></form:button></td></tr>
</table>
</form:form>
</body>
</html>



