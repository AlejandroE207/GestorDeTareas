<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="modelo.Tarea"%>
<%@page import="modelo.Usuario"%>

<%
Usuario user = (Usuario) request.getSession().getAttribute("usuarioLogueado");
Map<String, Tarea> tareasPorEtiqueta = new HashMap<>();

try {
    if (user != null) {
        tareasPorEtiqueta = user.getTareasPorEtiqueta();
    } else {

        tareasPorEtiqueta = new HashMap<>();
    }
} catch (Exception e) {

    e.printStackTrace();
}

request.setAttribute("tareasPorEtiqueta", tareasPorEtiqueta);
%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="mapEstilo.css" rel="stylesheet" type="text/css"/>
    <title>Tarea Por Etiquetas</title>
</head>
<body>
    <h1>Tareas por Etiquetas</h1>
    
     <table class="Tabla">
    <thead>
        <tr>
            <th>Etiqueta</th>
            <th>Descripcion</th>
            <th>Estado</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="entry" items="${tareasPorEtiqueta.entrySet()}">
            <tr>
                <c:set var="tarea" value="${entry.value}" />
                <td>${tarea.getEtiqueta()}</td>
                <td>${tarea.getDescripcion()}</td>
                <td>${tarea.getEstado()}</td>
            </tr>
           
            <hr>
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
</html>
