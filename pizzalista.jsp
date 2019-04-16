<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pizzaa</title>
</head>
<body>
<h1>Pizzat</h1>

<a href = "lisaa_pizza">Lisää Henkilö</a>
<table class="table table_striped" >
<tr>
			<th>Id</th>
			<th>Nimi</th>
			<th>Kuvaus</th>
			<th>Hinta</th>
</tr><br>

<c:forEach items="${pizzalist}" var="pizza">

<tr>
	<td><c:out value="${pizza.pizzaId}"></c:out></td>
	<td><c:out value="${pizza.pizzaName}"></c:out></td>
	<td><c:out value="${pizza.pizzaDescription}"></c:out></td>
	<td><c:out value="${pizza.price}"></c:out></td>
	<td><a href="poista-pizza">Poista</a></td>
</tr>


</c:forEach>
</table>

</body>
</html>