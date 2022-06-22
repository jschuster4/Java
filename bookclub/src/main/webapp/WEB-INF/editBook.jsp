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
	<h1>Change Your Entry</h1>
	<a href="/user/dashboard">Back to the Shelves</a>
	
	<form:form method="POST" modelAttribute="bookUpdate" action="/books/${bookUpdate.id}/edit">
	
		<form:errors path="title"></form:errors>
		<form:input type="text"  path="title"></form:input>
		
		<form:errors path="author"></form:errors>
		<form:input type="text" path="author"></form:input>
		
		<form:errors path="thought"></form:errors>
		<form:input type="text" path="thought"></form:input>
		
 		<form:input type="hidden" path="user" value="${user.id}"></form:input>

		<input type="submit" value="Update Book on Shelf" />
		
	</form:form>
	
	
	<a href="/user/logout">Logout</a>
</body>
</html>