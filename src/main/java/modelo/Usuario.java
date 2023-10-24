/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.HashMap;
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
    
    public void agregarTarea(Tarea tar){
        tareasPendientes.add(tar);
        tareasPorEtiqueta.put(tar.getEtiqueta(), tar);
    }
    public void modificarEstado(Tarea tar, String est){
        tar.actualizarEstado(est);
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
