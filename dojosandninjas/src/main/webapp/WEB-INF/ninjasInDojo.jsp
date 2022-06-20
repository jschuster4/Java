<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title></title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<script type="text/javascript" src="js/main.js"></script>
</head>
<body>
	<h1>${dojo.name} Location Ninjas</h1>
	
	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Age</th>	
		</tr>
		<tr>
		<c:forEach var="person" items="${dojo}">
			<tr>
				<td>person.firstname</td>
				<td>person.lastname</td>
				<td>person.age</td>
			</tr>
		</c:forEach>
		
		</tr>

	</table>
</body>
</html>