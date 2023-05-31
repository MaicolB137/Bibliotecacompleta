/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author Michael
 */
public class Revista {
    private String titulo;
    private String editor;
    private int numero;
    // Otros atributos de la clase Revista
    
    public Revista(String titulo, String editor, int numero) {
        this.titulo = titulo;
        this.editor = editor;
        this.numero = numero;
    }
    
    
    
    // Otros métodos relacionados con la clase Revista

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
