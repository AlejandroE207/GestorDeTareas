<%-- 
    Document   : inicioSesion
    Created on : 24/10/2023, 10:27:37 a. m.
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="estiloPrincipal.css">
    <link rel="stylesheet" href="normalize.css">
    <title>Document</title>
</head>
<body class="bodyLogin">
    
    <main class="mainLogin">
        <section class="seccionFormulario">
            <form action="NewServlet" method="POST" class="formulario">
                <fieldset class="formulario__fieldset">
                        <legend class="formulario__legend">
                            <svg xmlns="http://www.w3.org/2000/svg" class="icon icon-tabler icon-tabler-user-circle" width="44" height="44" viewBox="0 0 24 24" stroke-width="1.5" stroke="#2c3e50" fill="none" stroke-linecap="round" stroke-linejoin="round">
                                <path stroke="none" d="M0 0h24v24H0z" fill="none"/>
                                <path d="M12 12m-9 0a9 9 0 1 0 18 0a9 9 0 1 0 -18 0" />
                                <path d="M12 10m-3 0a3 3 0 1 0 6 0a3 3 0 1 0 -6 0" />
                                <path d="M6.168 18.849a4 4 0 0 1 3.832 -2.849h4a4 4 0 0 1 3.834 2.855" />
                              </svg>
                            INICIO DE SESIÓN
                        </legend>
                    <div class="contenedor-campos">
                        <div class="campo">
                            <label class="campo__label" for="nombre">Nombre</label>
                            <input class="campo__field" type="text" placeholder="Tu nombre hermos@" id="nombre" name="nombre">
                        </div> 
                        <div class="campo">
                            <label class="campo__label" for="correo">Correo</label>
                            <input class="campo__field" type="mail" placeholder="alguien@algo.com" id="correo" name="correo">
                        </div>


                    </div>
                    <div class="flex alinear-centro">
                            <input class="boton enviar w-sm-100"   type="submit" value="Entrar">
                    </div>
                </fieldset>
            </form>
        </section>
    </main>
    <script src="menu.js"></script>
</body>
</html>