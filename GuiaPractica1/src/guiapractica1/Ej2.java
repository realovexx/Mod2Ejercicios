/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapractica1;

import java.util.Scanner;

/**
 *
 * @author ovexx
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ej. 2");
        /*Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla.*/
        System.out.println("");
        System.out.println("Ingrese su nombre");
        Scanner leer = new Scanner (System.in);
        String nom = leer.nextLine();
        System.out.println("");
        System.out.println("Hola "+ nom + "!");
        System.out.println("");
    }
    
}
