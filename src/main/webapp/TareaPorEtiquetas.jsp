<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="modelo.Tarea"%>

<%
// Crea e inicializa el mapa tareasPorEtiqueta
Map<String, Tarea> tareasPorEtiqueta = new HashMap<>();
// Llena el mapa con tareas (debes tener lógica para llenar este mapa según tus requerimientos)

// Establece el mapa como un atributo de la solicitud
request.setAttribute("tareasPorEtiqueta", tareasPorEtiqueta);
%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Tarea Por Etiquetas</title>
</head>
<body>
    <!-- Ahora puedes acceder a tareasPorEtiqueta en tu JSP -->
    <h1>Tareas por Etiquetas</h1>
     <c:forEach var="entry" items="${tareasPorEtiqueta}">
        Clave: ${entry.key}, Valor: ${entry.value} <br/>
    </c:forEach>
    <%
    // Obtén el mapa de la solicitud
    Map<String, Tarea> tareasPorEtiqueta = (Map<String, Tarea>) request.getAttribute("tareasPorEtiqueta");

    // Itera a través del mapa y haz algo con las tareas
    for (Map.Entry<String, Tarea> entry : tareasPorEtiqueta.entrySet()) {
        String etiqueta = entry.getKey();
        Tarea tarea = entry.getValue();
        // Haz algo con la etiqueta y la tarea
    }
    %>
</body>
</html>
