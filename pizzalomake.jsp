<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Lisää Pizza</h1>

<form action="lisaa_pizza" method = "post">
<input type = "text" name = "pizzaName" placeholder = "Add pizza name" class = "inputfield"><br>
<input type = "text" name = "pizzaDescription" placeholder = "Description" class = "inputfield"><br>
<input type = "text" name = "pizzaPrice" placeholder = "Price" class = "inputfield">
<input type = "submit" value = Submit class = "button">

</form>
</body>
</html>