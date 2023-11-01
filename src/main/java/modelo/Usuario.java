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

    public Usuario(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;

    }

    LinkedList<Tarea> tareasPendientes = new LinkedList<>();
    Map<String, Tarea> tareasPorEtiqueta = new HashMap<>();
    ArrayList<Tarea> listaTareas = new ArrayList<Tarea>();

    public void agregarTarea(Tarea tar) {
        tareasPendientes.add(tar);
        tareasPorEtiqueta.put(tar.getEtiqueta(), tar);
        listaTareas.add(tar);
        System.out.println("SE AGREGO LA TAREA AL ARRAY");
    }
    
    public void completarPendiente(Tarea tar,int indice, String estado){
        tar.actualizarEstado(estado);
        tareasPendientes.remove(indice);
    }

    public void modificarEstado(Tarea tar, int indice ,String estado) {
        
        tar.actualizarEstado(estado);
        //Si tarea esta completada entonves elimina de la cola y modificar el estado del array y el hasmap
        if (tar.getEstado().equals("Completado")) {
            
            Iterator it = listaTareas.iterator();
            while (it.hasNext()) {
                Object produc = it.next();
                Tarea pro = (Tarea) produc;
                if (pro.equals(tar)) {
                    pro.setEstado("Completado");
                }

            }

        }
        String etiqueta = tar.getEtiqueta();
        if (tareasPorEtiqueta.containsKey(etiqueta)) {
            Tarea tareaEnHashMap = tareasPorEtiqueta.get(etiqueta);
            tareaEnHashMap.setEstado("Completado");
            tareasPorEtiqueta.put(etiqueta, tareaEnHashMap); // Actualizar la tarea en el HashMap
        }
    }

    public ArrayList mostrarArray() {
        return listaTareas;
    }

    public LinkedList mostrarCola() {
        return tareasPendientes;
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

}
