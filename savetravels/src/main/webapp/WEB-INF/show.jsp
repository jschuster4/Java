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
	<h1>Expense Details</h1>
	<a href="/expense">Go back</a>
	
	<table>
		<tr>
			<th>Expense name:</th>
			<td>${expense.name}</td>
		</tr>
		<tr>
			<th>Expense Description: </th>
			<td>${expense.description}</td>
		</tr>
		<tr>
			<th>Vendor: </th>
			<td>${expense.vendor}</td>
		</tr>
		<tr>
			<th>Amount Spent: </th>
			<td>$${expense.amount}</td>
		</tr>
	
	</table>
</body>
</html>
