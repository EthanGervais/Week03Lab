<%-- 
    Document   : ageCalculatorForm
    Created on : 22-Sep-2020, 7:59:28 PM
    Author     : ethan
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
        <form method="post" action="age">
            Enter your age: <input type="text" name="currentAge"><br>
            <input type="submit" value="Age next birthday"><br>
        </form>
        ${message}<br>
        <a href="./arithmetic">Arithmetic Calculator</a>
    </body>
</html>
