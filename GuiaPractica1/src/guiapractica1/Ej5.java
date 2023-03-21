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
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
System.out.println("Ej. 5");
        System.out.println("");
        /*Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.*/
        System.out.println("Ingrese un numero cualquiera");
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        System.out.println("");
        System.out.println("El doble del numero es " + 2*num);
        System.out.println("El triple del numero es " + 3*num);
        System.out.println("La raiz cuadrada del numero es " + Math.sqrt(num));
    }
    
}
