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
	<h1>Save Travels</h1>
	
	<table>
		<tr>
			<th>Expense</th>
			<th>Vendor</th>
			<th>Amount</th>
		</tr>
		<c:forEach var="item" items="${expenses}">
		<tr>
			<td><c:out value="${item.getName()}"/></td>
			<td><c:out value="${item.getVendor()}"/></td>
			<td><c:out value="${item.getAmount()}"/></td>
		</tr>
		</c:forEach>

	
	</table>
</body>
</html>
