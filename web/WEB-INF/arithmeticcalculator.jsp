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
        
        <label>First:</label>
        <input type="number" name="first_number">
        <br>
        <label>Second:</label>
        <input type="number" name="second_number">
        <br>
        <input type="submit" value="+">
        <input type="submit" value="-">
        <input type="submit" value="*">
        <input type="submit" value="%">
        <br>
        <br>
        <label>Result: ---</label>
        <br>
        <a href="http://localhost:8084/Lab3_Calculators/age">Age Calculator</a>
    </body>
</html>
