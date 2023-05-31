/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author Michael
 */
public class Usuario {
    private String nombre;
    private String apellido;
    private String id;
    private boolean tienePermisos;
    // Otros atributos de usuario
    
    public Usuario(String nombre, String apellido, String id, boolean tienePermisos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.tienePermisos = tienePermisos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    
    public boolean tienePermisos() {
        return tienePermisos; 
    }
    
    // Otros métodos relacionados con el usuario
}
