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
	<h1>Your Shopping cart</h1>
	
	<table>
		<tr>
			<th>Name</th>
			<th>Price</th>
		</tr>
		<c:forEach var="item" items="${cart}">
		<tr>
			<td><c:out value="${item.getName()}"/></td>
			<td><c:out value="${item.getPrice()}"/></td>
		</tr>
		</c:forEach>
	</table>

	
	
	
</body>
</html>