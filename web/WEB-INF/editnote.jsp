<%-- 
    Document   : editnote
    Created on : Oct 8, 2022, 7:54:24 PM
    Author     : bo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper!</h1>
        <h2> view note</h2>
        <form method="POST" action="note">
         <div> <label for="title">Title:</label>
         <input type="text" name="title" value="${title}">
         </div><br>
         <div>
             <label for="content">Content</label>
             <textarea name="content">${content}</textarea>
         </div>
         <input type="submit" value="save">
        </form>
    </body>
</html>
