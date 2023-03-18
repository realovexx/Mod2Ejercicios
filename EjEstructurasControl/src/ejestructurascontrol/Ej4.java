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
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*Escriba un programa que pida una frase o palabra y valide si la primera
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
Substring y equals() de Java.*/
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase o palabra que empiece con A");
        String frase = leer.nextLine();
        String letra = frase.substring(0,1);
       while (letra.equalsIgnoreCase("A")==false){
            System.out.println("INCORRECTO");
             frase = leer.nextLine();
             letra = frase.substring(0,1);
        }
        System.out.println("CORRECTO");
}
}
