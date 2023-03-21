/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjGeneralidadesJava;

import java.util.Scanner;

/**
 *
 * @author ovexx
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
System.out.println("Ej. 4");
        System.out.println("");
        /*Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).*/
        System.out.println("Ingrese la temperatura en Grados Centigrados");
        Scanner leer = new Scanner (System.in);
        byte tempC = leer.nextByte();
        short tempF = (short) (32+(9*tempC/5));
        System.out.println("");
        System.out.println("El equivalente es " + tempF + " grados Farenheit");
        System.out.println("");
    }
    
}
