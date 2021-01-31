<%-- 
    Document   : index
    Created on : Jan 31, 2021, 10:44:10 AM
    Author     : ok
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring :: MVC :: Index</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" />
    </head>
    <body>
        <c:if test="${not empty map.pass}">
            <div class="alert alert-success">
                ${map.pass}
            </div>
<!--            <font color="GREEN">${map.pass}</font>-->
        </c:if>
        <c:if test="${not empty map.fail}">
            <div class="alert alert-danger">
                ${map.fail}
            </div>
<!--            <font color="RED">${map.fail}</font>-->
        </c:if>
        <form action="login.htm" method="POST">
            <table border="1" class="table table-dark">
                <tr>
                    <td align="right">Login:</td>
                    <td><input type="text" name="username" /></td>
                </tr>
                <tr>
                    <td align="right">Password:</td>
                    <td><input type="password" name="userpass" /></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Login" class="btn btn-primary" />
                        <input type="reset" value="Cancel" class="btn btn-danger" />
                    </td>
                </tr>
            </table>
            <!--            Login: <input type="text" name="username" /> <br />
                        Password: <input type="password" name="userpass" /> <br />
                        <input type="submit" value="Login" /> 
                        <input type="reset" value="Cancel" />-->
        </form>
    </body>
</html>
