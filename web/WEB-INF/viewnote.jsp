<%-- 
    Document   : viewnote
    Created on : Oct 8, 2022, 7:53:56 PM
    Author     : bo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper!</h1>
        <h2> view note</h2>
        <p><b>Title:</b> ${title}</p>
        <b>Contents:</b>
        <p> ${content}</p>
        <a href="note?edit">edit</a>
    </body>
</html>
