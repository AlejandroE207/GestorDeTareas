/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class Tarea {
    private String descripcion;
    private String etiqueta;
    private String estado;
    private String fechaLimit;

    public Tarea(String descripcion, String etiqueta, String fechaLimit) {
        this.descripcion = descripcion;
        this.etiqueta = etiqueta;
        this.fechaLimit = fechaLimit;
        this.estado = "Pendiente";
    }
    
    
}
