<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3>Quiz</h3>
	<form method="post" action="${pageContext.request.contextPath }/quest/submit">
	<o1 type="1">
	<c:forEach var="question" items="${questions }">
		<li>
		${question.content }
		<input type="hidden" name="questionId" value="${question.id }" > 
		<o1 type="a">
		<c:forEach var="answer" items="${question.answer }">
		<li>
			<input type="radio" name="question_${question.id }" value="${answer.id }">
			${answer.content }
		</li>
		</c:forEach>
		</o1>
		</li>
		</c:forEach>
		</o1>
		<br>
		<input type="submit" value="Submit">
		</form>
		
</body>
</html>