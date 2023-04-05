/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class Cancion {
  private String titulo;
  private String autor;

    public Cancion() {
        titulo = "";
        autor = "";
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void crearCancion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el titulo de la cancion");
        setTitulo(leer.nextLine());
        System.out.println("Ahora ingrese el nombre del Autor");
        setAutor(leer.nextLine());
    }
  @Override
    public String toString(){
        return "La cancion "+getTitulo()+" fue compuesta por "+getAutor();
    }
}
