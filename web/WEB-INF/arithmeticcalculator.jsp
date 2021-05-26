<%-- 
    Document   : arithmeticcalculator.jsp
    Created on : May 26, 2021, 1:00:55 PM
    Author     : DWEI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="POST">
        <label>First:</label>
        <input type="text" name="first_number" value=${firstNumber}>
        <br>
        <label>Second:</label>
        <input type="text" name="second_number" value=${secondNumber}>
        <br>
        <input type="submit" value="+" name="calculate">
        <input type="submit" value="-" name="calculate">
        <input type="submit" value="*" name="calculate">
        <input type="submit" value="%" name="calculate">
        </form>
        <br>
        <br>
        <label>Result: ${message}</label>
        <br>
        <a href="http://localhost:8084/Lab3_Calculators/age">Age Calculator</a>
    </body>
</html>
