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
import java.util.Iterator;
import modelo.*;
import java.util.LinkedList;

/**
 *
 * @author User
 */
@WebServlet(name = "ModificarPendiente", urlPatterns = {"/ModificarPendiente"})
public class ModificarPendiente extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Usuario user = (Usuario) request.getSession().getAttribute("usuarioLogueado");
        int indice = Integer.parseInt(request.getParameter("indice"));
        LinkedList<Tarea> pendiente = new LinkedList<>();
        pendiente=user.mostrarCola();
        Tarea tar = new Tarea();
        
        user.completarPendiente(tar, indice, "Completado");

        response.sendRedirect("tareasPendientes.jsp"); 
        
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}