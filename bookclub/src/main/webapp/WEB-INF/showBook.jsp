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
 	<h1>Review for ${book.title}</h1>
 	<a href="/user/dashboard">Back to the Shelves</a>
	<h3>${book.user.name} Read ${book.title} by ${book.author}</h3>
	
	<p>Here are ${book.user.name}'s thoughts:</p>
	<p>${book.thought}</p>
	
	<a href="/user/logout">Logout</a>
	
	<a href="/books/${book.id}/edit">Edit</a>
		
	<form action="/books/${book.id}/delete" method="POST">
    	<input type="hidden" name="_method" value="delete">
    	<input type="submit" value="Delete">
	</form>
	
</body>
</html>