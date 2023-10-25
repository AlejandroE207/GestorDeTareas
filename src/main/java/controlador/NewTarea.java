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
import java.util.ArrayList;
import java.util.Iterator;
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
//        Usuario user = (Usuario) request.getParameter("usuarioLogueado");
Usuario user = (Usuario) request.getSession().getAttribute("usuarioLogueado");
        System.out.println("NOMBRE: "+user.getCorreo());
        
        
        String descripcion = request.getParameter("descripcion");
        String etiqueta = request.getParameter("etiqueta");
        String fechaLimit = request.getParameter("fechaLimit");
        Usuario user1 = new Usuario("Alejo", "aer@hotmail.com");
        Tarea tarea = new Tarea(descripcion, etiqueta, fechaLimit);
        System.out.println("DESCRIPCION: "+user.getNombre());
        
        
        user.agregarTarea(tarea);
        ArrayList<Tarea> listaTareas = new ArrayList<Tarea>();
        listaTareas = user.mostrarArray();
        System.out.println("TAMAÑO: "+listaTareas.size());
        Iterator it = listaTareas.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            Tarea tar = (Tarea) obj;
            System.out.println("Descripcion: "+tar.getDescripcion());
            System.out.println("Etiqueta: "+tar.getEtiqueta());
            System.out.println("Estado: "+tar.getEstado());
            System.out.println("Fecha limite: "+tar.getFechaLimit());
        }
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
