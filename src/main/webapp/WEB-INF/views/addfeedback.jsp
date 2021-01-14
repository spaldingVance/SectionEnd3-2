<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Feedback</title>
</head>
<body>
<div align="center">
	<h5>Submit Your Feedback Below</h5>
	<br />
	<form:form modelAttribute="addFBForm">

		Name : <input type="text" name="uname" />
		<br />
		<br />
		Description : <input type="text" name="desc" />
		<br /> 
		<br />
		Rating : <input type="number" name="rating" />
		<br />
		<br />


		<button type="submit">Submit</button>
	</form:form>
</div>
</body>
</html>