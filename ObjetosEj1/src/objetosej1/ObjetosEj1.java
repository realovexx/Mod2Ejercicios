/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosej1;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class ObjetosEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los
atributos pasados por parámetro y un constructor vacío. Crear un
método para cargar un libro pidiendo los datos al usuario y luego
informar mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas.*/
        Libro libro1 = new Libro();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el ISBN");
        libro1.setIsbn(leer.nextLine());
        System.out.println("Ahora ingrese el titulo del libro");
        libro1.setNombre(leer.nextLine());
        System.out.println("A continuacion, el autor");
        libro1.setAutor(leer.nextLine());
        System.out.println("Por ultimo, la cantidad de páginas");
        libro1.setPags(leer.nextInt());  
        System.out.println("");
        System.out.println("Confirmacion:");
        System.out.println(libro1.toString());
    }
    
}
