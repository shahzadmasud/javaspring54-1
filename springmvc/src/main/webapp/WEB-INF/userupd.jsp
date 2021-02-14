<%-- 
    Document   : useradd
    Created on : Feb 14, 2021, 11:33:42 AM
    Author     : ok
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring :: MVC :: User Update </title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" />
    </head>
    <body>
        <c:if test="${not empty map.pass}">
            <div class="alert alert-success">
                ${map.pass}
            </div>
        </c:if>
        <c:if test="${not empty map.fail}">
            <div class="alert alert-danger">
                ${map.fail}
            </div>
        </c:if>
        <form action="userupd.htm" method="POST">
            <input type="hidden" name="id"
                   value="${map.user.id}" />
            <table border="1" class="table table-dark">
                <tr>
                    <td align="right">User Name</td>
                    <td><input type="text" name="username" value="${map.user.username}" /></td>
                </tr>
                <tr>
                    <td align="right">User Pass:</td>
                    <td><input type="password" name="userpass" value="${map.user.userpass}" /></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Update User" class="btn btn-success" />
                        <input type="reset" value="Cancel" class="btn btn-secondary" />
                    </td>
                </tr>
            </table>
        </form>
        <!-- Footer -->
        <a href="useradd.htm"><input type="button" value="Register" /></a>
        <a href="home.htm"><input type="button" value="Home" /></a>
    </body>
</html>
