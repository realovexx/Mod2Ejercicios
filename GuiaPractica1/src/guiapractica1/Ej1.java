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
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ej. 1");
/*Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma*/
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numero cualquiera");
        int num1 = leer.nextInt();
        System.out.println("Ahora ingrese un segundo numero");
        int num2 = leer.nextInt();
        int res = num1 + num2;
        
        System.out.println("la suma de esos numeros da "+res);
        
        System.out.println("");
    }
    
}
