<%-- 
    Document   : editnote
    Created on : 6-Jun-2021, 11:09:01 PM
    Author     : brixa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab04</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <br>
        <h2>Edit Note</h2>
        <br>
        <form method="post" action="note">
        <label>Title:</label>
        <input type="text" name="title" value="${inTitle}">
        <br>
        <label>Contents:</label>
        <input type="text" name="contents" value="${inContents}">
               
        <input type="submit" value="Save">
        </form>
        
    </body>
    <br>
</html>
