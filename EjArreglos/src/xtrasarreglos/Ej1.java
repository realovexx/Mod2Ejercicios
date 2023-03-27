/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtrasarreglos;

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
/*Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario.
*/
Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos a ingresar en el vector");
        int dim = leer.nextInt();
        int [] vector = new int[dim];
        int suma = 0;
        for (int i=0 ; i<dim ; i++){
            System.out.println("Ingrese un numero");
            vector[i]=leer.nextInt();
            suma += vector[i];
        }
        System.out.println("");
        for (int j = 0; j < dim; j++) {
            System.out.print("["+vector[j]+"]");
        }
        System.out.println("");
        System.out.println("La suma de los valores ingresados da "+suma);
        
    }
}
