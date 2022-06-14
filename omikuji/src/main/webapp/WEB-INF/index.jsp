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
	<h1>Send an Omikuji</h1>
	<form action="/submit" method="POST">
		<div>
			<label for="random_number">Pick any number from 5 to 25</label>
			
			<select name="number" id="">
				<option value="5">5</option>
				<option value="6">6</option>
				<option value="7">7</option>
				<option value="8">8</option>
				<option value="9">9</option>
				<option value="10">10</option>
				<option value="11">11</option>
				<option value="12">12</option>
				<option value="13">13</option>
				<option value="14">14</option>
				<option value="15">15</option>
				<option value="16">16</option>
				<option value="17">17</option>
				<option value="18">18</option>
				<option value="19">19</option>
				<option value="20">20</option>
				<option value="21">21</option>
				<option value="22">22</option>
				<option value="23">23</option>
				<option value="24">24</option>
				<option value="25">25</option>
			</select>
		</div>
		<div>
			<label for="city_name">Enter the name of any city:</label>
			<input type="text" name="city_name"/>
		</div>
		<div>
			<label for="person_name">Enter the name of any real person:</label>
			<input type="text" name="person_name"/>
		</div>
		<div>
			<label for="hobby">Enter professional endeavor or hobby:</label>
			<input type="text" name="hobby"/>
		</div>
		<div>
			<label for="living_thing">Enter any type of living thing:</label>
			<input type="text" name="living_thing"/>
		</div>
		<div>
			<label for="nice">Say something nice to someone:</label>
			<input type="text" name="nice"/>
		</div>
		
		<div>
			<p>Send and show a friend</p>
		</div>
		<input type="submit" value="send" />
		
	</form>
</body>
</html>

