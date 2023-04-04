/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author OvExX
 */
public class Libro {
   private String isbn;
   private String nombre;
   private String autor;
   private int pags;

    public Libro(String isbn, String nombre, String autor, int pags) {
        this.isbn = isbn;
        this.nombre = nombre;
        this.autor = autor;
        this.pags = pags;
    }

    public Libro() {
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPags() {
        return pags;
    }

    public void setPags(int pags) {
        this.pags = pags;
    }
   
   @Override
    public String toString(){
        return "El libro "+nombre+" del autor "+autor+" y con ISBN:"
                +isbn+" tiene "+pags+" páginas.";
    }
}
