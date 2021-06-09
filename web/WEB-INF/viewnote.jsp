<%-- 
    Document   : viewnote
    Created on : 6-Jun-2021, 11:08:46 PM
    Author     : brixa
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "sql" uri = "http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab04</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>

        <h2>View Note</h2>

        <form method="post" action="note">
            <h4>Title: </h4> 
            <p> ${note.title}</p>
            <h4>Contents: </h4>
            <p>${note.contents}</p>
        </form>

        <br>
        <a href="note?edit">Edit</a> 

    </body>

</html>
