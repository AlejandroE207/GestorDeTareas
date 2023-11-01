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

<body class="bodyHome">



    <main class="mainHome">
        
        <section>
            <h1 class="tituloSGT">SISTEMA DE GESTION DE TAREAS</h1>
            <div class="contenedorOpciones">
                <a href="registroTarea.jsp" class="opcion registrarTarea">
                    <p>
                        REGISTRAR TAREA
                    </p>
                </a>

                <a href="tareasPendientes.jsp" class="opcion TareaPendiente">
                    <p>
                        TAREAS PENDIENTES
                    </p>

                </a>

                <a href="" class="opcion HistoriaTarea">
                    <p>
                        HISTORIAL TAREAS
                    </p>

                </a>


                <a href="" class="opcion TareaEtiqueta">
                    <p>
                        TAREAS POR ETIQUETAS
                    </p>

                </a>
            </div>


        </section>
    </main>
</body>

</html>