/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

import modelo.Tarea;
/**
 *
 * @author User
 */
public class Usuario {
    private String nombre;
    private String correo;
    private String contraseña;

    public Usuario(String nombre, String correo, String contraseña) {
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
        
    }
    
    LinkedList<Tarea> tareasPendientes = new LinkedList<>();
    Map<String, Tarea> tareasPorEtiqueta = new HashMap<>();
     ArrayList<Tarea> listaTareas =new ArrayList<Tarea>();
    
    public void agregarTarea(Tarea tar){
        tareasPendientes.add(tar);
        tareasPorEtiqueta.put(tar.getEtiqueta(), tar);
         listaTareas.add(tar);
    }
    public void modificarEstado(Tarea tar, String est){
        tar.actualizarEstado(est);
<<<<<<< HEAD
      //Si tarea esta completada entonves elimina de la cola y modificar el estado del array y el hasmap
      if(tar.getEstado().equals("Completado")){
      tareasPendientes.remove(tar); 
      
            
       Iterator it=listaTareas.iterator();
        while (it.hasNext()) {
            Object produc = it.next();
            Tarea pro= (Tarea)produc;
             if(pro.equals(tar)){
                pro.setEstado("completado");
             }
=======
    }
>>>>>>> main

         
        }   
       String etiqueta = tar.getEtiqueta();
    if (tareasPorEtiqueta.containsKey(etiqueta)) {
        Tarea tareaEnHashMap = tareasPorEtiqueta.get(etiqueta);
        tareaEnHashMap.setEstado("completado");
        tareasPorEtiqueta.put(etiqueta, tareaEnHashMap); // Actualizar la tarea en el HashMap
    }
    }
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
  

    
}
