/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.progamesoft.project.model;
// axel Romero 20172469
abstract public class Producto {
    private static int idProducto =0 ; 
    private String nombre ; 
    private String descripcion ; 

    public Producto( String nombre, String descripcion) {
        idProducto = idProducto + 1 ;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    
    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
        
    
    abstract public String consultarDatos();
}
