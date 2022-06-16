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

	<table>
		<tr>
			<th>Expense</th>
			<th>Vendor</th>
			<th>Amount</th>
			<th>Actions</th>
		</tr>
		<c:forEach var="item" items="${expenses}">
		<tr>
			<td><a href="/expense/show/${item.id}"><c:out value="${item.getName()}"/></a></td>
			<td><c:out value="${item.getVendor()}"/></td>
			<td><c:out value="${item.getAmount()}"/></td>
			<td>
				<a href="/expense/edit/${item.id}">Edit</a>
				<form action="/expense/delete/${item.id}" method="GET">
					<input type="submit" value="Delete" />
				</form>
			</td>
		</tr>
		</c:forEach>
	</table>
	<form:form action="/expense" method="POST" modelAttribute="expense">
	
		<form:errors path="name" ></form:errors>
		<form:input placeholder="name" path="name" ></form:input>
		
		<form:errors path="vendor" ></form:errors>
		<form:input placeholder="vendor" path="vendor"></form:input>
		
		<form:errors path="amount" ></form:errors>
		<form:input type="number" placeholder="amount" path="amount"></form:input>
		
		<form:errors path="description" ></form:errors>
		<form:input placeholder="description" path="description"></form:input>
		
		<input type="submit" value="Create Expense"/>
		
	</form:form>
</body>
</html>
