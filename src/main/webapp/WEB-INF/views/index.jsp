<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 15/07/2021
  Time: 2:09 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>Calculator</h1>
<form method="post" action="/calculate">
    <input type="text" name="number1" value="${number1}">
    <input type="text" name="number2" value="${number2}">
    <p>
        <input type="submit" name="calculation" value="Addition(+)">
        <input type="submit" name="calculation" value="Subtraction(-)">
        <input type="submit" name="calculation" value="Multiplication(X)">
        <input type="submit" name="calculation" value="Division(/)">
    </p>
</form>
<h2>Result ${string}: ${result}</h2>
</body>
</html>
