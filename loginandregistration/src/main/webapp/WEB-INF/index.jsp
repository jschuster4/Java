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
	<h1>Welcome!</h1>
	
	
	<h1>Register</h1>
	<form:form action="/user/register" method="POST" modelAttribute="userRegister">
	
		<form:errors path="name"></form:errors>
		<form:input type="text" placeholder="Username" path="name"></form:input>
		
		<form:errors path="email"></form:errors>
		<form:input type="text" placeholder="Email" path="email"></form:input>
		
		<form:errors path="password"></form:errors>
		<form:input type="password" placeholder="Password" path="password"></form:input>
		
		<form:errors path="confirm"></form:errors>
		<form:input type="password" placeholder="Confirm Password" path="confirm"></form:input>
		
		<input type="submit" value="Create New User" />
	
	</form:form>
	
	<h1>Login</h1>
	
	<form:form action="/user/login" method="POST" modelAttribute="userLogin">
	
		<form:errors path="email"></form:errors>
		<form:input type="text" placeholder="email" path="email"></form:input>
		
		<form:errors path="password"></form:errors>
		<form:input type="password" placeholder="Password" path="password"></form:input>
	
		<input type="submit" value="Login" />
	
	</form:form>
</body>
</html>