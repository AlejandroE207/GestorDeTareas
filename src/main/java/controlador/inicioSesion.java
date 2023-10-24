/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Iterator;
import modelo.Usuario;

/**
 *
 * @author User
 */
public class inicioSesion extends HttpServlet {

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        ArrayList<Usuario> usuarios = new ArrayList<>();
        // Agregar elementos a myList
        Usuario user1 = new Usuario("Nicolas", "dnalonso@ucundinamarca.edu.co", "12345");
        Usuario user2 = new Usuario("Alejandro", "aespinosar@ucundinamarca.edu.co", "12345");
        usuarios.add(user1);
        usuarios.add(user2);

        getServletContext().setAttribute("usuarios", usuarios);

    }
    ArrayList<Usuario> usuarios = (ArrayList<Usuario>) getServletContext().getAttribute("usuarios");

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String correo = request.getParameter("nombre");
        String contraseña = request.getParameter("contraseña");

        Iterator<Usuario> it = usuarios.iterator();

        // Utilizar el Iterator para recorrer la lista
        while (it.hasNext()) {
            Usuario elemento = it.next();
            if (elemento.getCorreo().equals(correo)) {
                if (elemento.getContraseña().equals(contraseña)) {
                    System.out.println("INGRESA EL USUARIO");
                    request.getSession().setAttribute("usuario", elemento);
                    response.sendRedirect("home.jsp");

                    request.setAttribute("usuarioLogueado", elemento);

                    // Redirigir a otro Servlet
                    RequestDispatcher dispatcher = request.getRequestDispatcher("/creacionTarea");
                    dispatcher.forward(request, response);
                } else {
                    System.out.println("CONTRASEÑA INCORRECTA");
                }
            } else {
                System.out.println("USUARIO INCORRECTO");
            }
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
