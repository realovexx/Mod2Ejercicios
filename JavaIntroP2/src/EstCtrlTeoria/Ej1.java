/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstCtrlTeoria;

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
        /*Implementar un programa que le pida dos números 
     *enteros al usuario y determine si ambos o alguno
     *de ellos es mayor a 25.*/
        System.out.println("Ej. 1");
        System.out.println("Ingrese un numero");
        Scanner leer = new Scanner(System.in);
        int num1 = leer.nextInt();
        System.out.println("Ahora ingrese otro numero");
        int num2 = leer.nextInt();
        if ((num1 > 25) || (num2 > 25)) {
            System.out.println("Alguno de los numeros es 25");
        } else {
            System.out.println("Ninguno de los numeros ingresados es 25");
        }
    }
    
}
