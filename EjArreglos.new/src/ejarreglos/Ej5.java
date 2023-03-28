/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejarreglos;

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
        /*Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
obtiene cambiando sus filas por columnas (o viceversa).*/

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimension de la matriz ");
        int dim = leer.nextInt();
        int[][] matriz = new int[dim][dim];
        int[][] matrizT = new int[dim][dim];
        System.out.println("Ingrese los valores ");
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                System.out.println(">");
                matriz[i][j] = leer.nextInt();
            }
        }
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                matrizT[i][j] = matriz[j][i];
            }
        }
        int aux = 0;
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {

                if (matriz[i][j] != -(matrizT[i][j])) {
                  aux++;  
                }
            }
        }
        if (aux>0){ 
            System.out.println("La matriz no es antisimetrica");
        }else{
            System.out.println("La matriz es antisimetrica!");
        }
        
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("");
         for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                System.out.print("["+matrizT[i][j]+"]");
            }
            System.out.println("");
        }
        
    }

}
