<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="resources/css/mystylesheet.css"
    rel="stylesheet"> 
  
	<title>Customer Review Form</title>
	
	<style>
		.error {color:red}
	</style>
</head>
</head>

<body>
        <div class ="regform"><h1>Gadget Review</h1></div>
       
        <div class="main"> 
        <form:form action="register" method="post" modelAttribute="customerModel">
         <i class="mssg">* Mandatory fields</i>
        <div id="name">
        <h2 class="name">Name</h2>
            <form:input class="firstname" path="firstname"/>
           	<label class="firstlabel">first name</label>
            <form:input class="lastname" path="lastname"/>
            <label class="firstlabel">last name</label>
           <form:errors path="lastname" cssClass="error" />
            </div> 
            <h2 class="name">E-mail*</h2> 
            <form:input class="email" path="email" />
            <form:errors path="email" cssClass="error"/>
            <h2 class="name">Phone no.</h2>
            <form:input class="phn" path="phn" />
            <h2 class="name">Postal Code*</h2>
            <form:input class="postcode" path="postcode" />
            <form:errors path="postcode" cssClass="error"/>
            <h2 class="gen">Gender</h2>
             <label class="radio">
             <form:radiobutton path="gender" value="Male"/>Male
             </label>
             <label class="radio">
            <form:radiobutton path="gender" value="Female"/>Female
            </label>
            <h2 class="name">Product*</h2>
             <form:select class="prd" path="prd" items="${productList}" />
             
            <form:errors path="prd" cssClass="error"/>
            <h2 class="name">Review*</h2>
             <form:input class="review" path="review" />
            <form:errors path="review" cssClass="error"/>
             <form:errors path="prd" cssClass="error"/>
            <h2 class="name">Course Id*</h2>
             <form:input class="Course_id" path="Course_id" />
            <form:errors path="Course_id" cssClass="error"/>
           <form:button class="button">Submit</form:button>
</form:form>
</div>
</body>
</html>

