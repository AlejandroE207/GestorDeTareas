<%-- 
    Document   : home
    Created on : 24/10/2023, 10:28:09 a. m.
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.*" %>
<%
    
    Usuario user = (Usuario) session.getAttribute("usuario");
    String nombre = user.getNombre();
    request.getSession().setAttribute("usuarioTarea", user);
    //response.sendRedirect("NewTarea");
    
%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="estiloPrincipal.css">
        <link rel="stylesheet" href="normalize.css">
        <title>Document</title>
    </head>
<body>
    <H1>HOME</H1>
    <p><%= nombre %></p>
    <a href="registroTarea.jsp">REGISTRAR TAREA</a>
</body>
</html>
