<%-- 
    Document   : arithmeticCalculatorForm
    Created on : 26-Sep-2020, 6:25:22 PM
    Author     : ethan
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
        <form method="post" action="arithmetic">
            First: <input type="text" name="firstVal" value="${firstVal}"><br>
            Second: <input type="text" name="secondVal" value="${secondVal}"><br>
            <input type="submit" name="addition" value="+">
            <input type="submit" name="subtract" value="-">
            <input type="submit" name="multiply" value="*">
            <input type="submit" name="modulus" value="%">
        </form><br>
        Result: ${message}<br>
        <a href="./age">Age Calculator</a>
    </body>
</html>
