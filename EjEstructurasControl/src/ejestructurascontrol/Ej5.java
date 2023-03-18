/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejestructurascontrol;

import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/* Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.*/
Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un valor limite positivo");
        int lim = leer.nextInt();
    int suma = 0;
    int num;
    
    do {
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        suma+=num;
    }
    while (suma<lim);
        System.out.println("La suma de los valores dio "+suma);
    
    
}
}
