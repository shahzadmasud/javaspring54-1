<%-- 
    Document   : home
    Created on : Jan 31, 2021, 11:24:38 AM
    Author     : ok
--%>

<%@page import="com.evs.javaspring54.model.User"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring :: MVC :: Home</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" />
    </head>
    <body>
        <h1>Welcome User 
            <%
                User u = (User) session.getAttribute("user");
                if (u != null) {
                    out.println(u.getUsername());
                }
            %>
        </h1>
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

        <!-- Main Table Area -->
        <table class="table">
            <!-- Header -->
            <thead class="thead-dark">
                <tr>
                    <td scope="col">ID</td>
                    <td scope="col">Name</td>
                    <td scope="col">Pass</td>
                    <td scope="col">CreatedAt</td>
                    <td scope="col">UpdatedAt</td>
                    <td scope="col">Active</td>
                    <td scope="col">Action</td>
                </tr>
            </thead>
            <!-- Body -->
            <c:if test="${not empty map.all}">
                <c:forEach items="${map.all}" var="user">
                    <tr>
                        <td>${user.id}</td>
                        <td>${user.username}</td>
                        <td>${user.userpass}</td>
                        <td>${user.createdAt}</td>
                        <td>${user.updatedAt}</td>
                        <td>${user.active}</td>
                        <td>
                            <!-- Delete --> 
                            <form action="userdel.htm" method="POST">
                                <input type="hidden" name="id" value="${user.id}" />
                                <input type="submit" value="Delete" class="btn btn-danger" />
                            </form>
                            <!-- Update -->
                            <form action="userupd.htm" method="GET">
                                <input type="hidden" name="id" value="${user.id}" />
                                <input type="submit" value="Update" class="btn btn-warning" />
                            </form>

                        </td>
                    </tr>
                </c:forEach>
            </c:if>
        </table>
        <a href="useradd.htm"><input type="button" value="Register" class="btn btn-primary" /></a>
        <a href="logout.htm"><input  type="button" value="Logout" class="btn btn-primary" /></a>
    </body>
</html>
