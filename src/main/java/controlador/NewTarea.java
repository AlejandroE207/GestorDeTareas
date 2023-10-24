/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Tarea;
import modelo.Usuario;

/**
 *
 * @author User
 */
@WebServlet(name = "NewTarea", urlPatterns = {"/NewTarea"})
public class NewTarea extends HttpServlet {

    

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("INGRESO AL SERVLET DE TAREA");
        Usuario user = (Usuario)request.getAttribute("usuarioLogueado");
        String descripcion = request.getParameter("descripcion");
        String etiqueta = request.getParameter("etiqueta");
        String fechaLimit = request.getParameter("fechaLimit");
        
        Tarea tarea = new Tarea(descripcion, etiqueta, fechaLimit);
        user.agregarTarea(tarea);
        
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
