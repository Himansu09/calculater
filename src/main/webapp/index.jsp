<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Calculator Page</title>
</head>
<body bgcolor=lightgreen>
<center>
<h3>Calculator</h3>
<div class="card-body">
<form action="controller">
<div class="input-group form-group">
<input type="number"  placeholder="Enter First Number" name="num1">
</div><br><br>
<div class="input-group form-group">
<input type="number"  placeholder="Enter Second Number" name="num2">
</div><br><br>
<div class="form-group">
<input type="submit" name="action" value="+" >
<input type="submit" name="action" value="-" >
<input type="submit" name="action" value="*" >
<input type="submit" name="action" value="/" >
</div>
</form>
</div>
</center>
</body>
</html>