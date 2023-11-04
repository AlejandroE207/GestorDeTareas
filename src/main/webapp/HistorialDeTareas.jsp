<%@page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="modelo.Tarea" %>
<%@ page import="modelo.Usuario" %>




<!DOCTYPE html>
<html>
<head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <link rel="stylesheet" href="EstiloArray.css">
    <title>Lista de Tareas</title>
</head>
<body>
  

    <table class="Tabla">
    <thead>
        <tr>
            <th>Descripción</th>
            <th>Etiqueta</th>
            <th>Estado</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="tarea" items="${usuario.mostrarArray()}">
            <tr>
                <td>${tarea.descripcion}</td>
                <td>${tarea.etiqueta}</td>
                <td>${tarea.estado}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>
 <button onclick="redirigir()">Volver a inicio</button>

<script>
    function redirigir() {
        window.location.href = 'home.jsp'; 
    }
</script>
</body>