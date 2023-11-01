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

    public Tarea() {
    }

    
    
    public Tarea(String descripcion, String etiqueta, String fechaLimit) {
        this.descripcion = descripcion;
        this.etiqueta = etiqueta;
        this.fechaLimit = fechaLimit;
        this.estado = "Pendiente";
    }
    
    public void actualizarEstado(String estado){
        this.estado=estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaLimit() {
        return fechaLimit;
    }

    public void setFechaLimit(String fechaLimit) {
        this.fechaLimit = fechaLimit;
    }
    
    
}
