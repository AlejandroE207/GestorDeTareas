<%-- 
    Document   : tareasPendientes
    Created on : 26/10/2023, 2:03:49 p. m.
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.*"%>
<%@page import="java.util.Iterator"%>
<%@page import ="java.util.LinkedList"%>
<%@page import ="java.io.IOException"%>
<% 
    Usuario user = (Usuario) request.getSession().getAttribute("usuarioLogueado");
    LinkedList pendiente = new LinkedList();
    
    try {
    if (user != null) {
        pendiente = user.mostrarCola();
    } else {

        pendiente = new LinkedList<>();
    }
} catch (Exception e) {

    e.printStackTrace();
}
    int numTar = pendiente.size();
%>

<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="EstilosTablas.css">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 class="tituloTP">TAREAS PENDIENTES</h1>
        <div>
            <table class="Tabla">
       
                <thead>
                <th>Num</th>
                <th>Descripció</th>
                <th>Etiqueta</th>
                <th>Estado</th>
                <th></th>
                </thead>
                <tbody>
                    <% 
                        try{
                            Iterator it = pendiente.iterator();
                            int indice = 0;
                            while(it.hasNext()){
                                Tarea tar = (Tarea)it.next();
                                indice = pendiente.indexOf(tar); %>
                                <tr>
                                    <td><%= indice+1 %></td>
                                    <td><%= tar.getDescripcion() %></td>
                                    <td><%= tar.getEtiqueta() %></td>
                                    <td><%= tar.getEstado() %></td>
                                    <td>
                                        <form action="ModificarPendiente" method="POST">
                                            <input type="hidden" name="tarea" value="<%= tar %>">
                                            <input type="hidden" name="indice" value="<%= indice %>">
                                            <input title="Completar" alt="Completar" src="img/check.png" type="image"/>
                                        </form>
                                    </td>

                                </tr>   
                    <%        
                            }
                        }catch(Exception e){
                    %>
                            <tr>
                                    <td>N/A</td>
                                    <td>N/A</td>
                                    <td>N/A</td>
                                    <td>N/A</td>
                                    <td>
                                        SIN TAREAS
                                    </td>

                                </tr>  
                    <% }%>
                </tbody>
            </table>
        </div>
        <button onclick="redirigir()">Volver a inicio</button>

<script>
    // Función JavaScript para redirigir
    function redirigir() {
        // Redirigir a la página deseada
        window.location.href = 'home.jsp'; 
    }
</script>        
    </body>
    <a href="https://www.flaticon.es/iconos-gratis/check-in-foursquare" title="check in foursquare iconos">Check in foursquare iconos creados por Freepik - Flaticon</a>
</html>
