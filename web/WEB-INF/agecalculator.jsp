<%-- 
    Document   : agecalculator.jsp
    Created on : May 26, 2021, 1:00:18 PM
    Author     : DWEI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="POST">
        <label>Enter your age:</label>
        <input type="text" name="age">
        <br>
        <input type="submit" value="Age next birthday">
        <br>
        </form>
        <p>${message}</p>
        <a href="http://localhost:8084/Lab3_Calculators/arithmetic">Arithmetic Calculator</a>
    </body>
</html>
