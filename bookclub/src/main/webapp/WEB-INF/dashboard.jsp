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
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="/js/main.js"></script>
</head>
<body>
	<h1>Welcome ${user.name}</h1>
	<h3>Books from everyone's shelves</h3>
	<a href="/books/new">Add to my shelf</a>
	<a href="/user/logout">Logout</a>
	
	
	<table>
		<tr>
			<th> ID </th>
			<th> Title </th>
			<th> Author Name </th>
			<th> Posted By </th>
		</tr>
		<c:forEach var="books" items="${book}">
			<tr>
				<td><c:out value= "${books.getId()}"/></td>
				<td><a href="/books/${books.id}">${books.title}</a></td>
				<td><c:out value= "${books.getAuthor()}"/></td>
 				<td>${books.user.name}</td>
			
			</tr>
		</c:forEach>
	
	
	
	</table>
	
	<a href="/user/logout">Logout</a>
</body>
</html>