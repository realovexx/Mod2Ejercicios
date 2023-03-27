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
/*Realizar un programa que llene una matriz de tamaño NxM con valores
aleatorios y muestre la suma de sus elementos.
*/
Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas de su matriz");
        int n = leer.nextInt();
        System.out.println("Ahora ingrese la cantidad de columnas de su matriz");
        int m = leer.nextInt();
        System.out.println("...");
        int [][] matriz = new int [n][m];
        System.out.println("Llenando automaticamente");
        int contador = 0;
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < m ; j++){
                matriz [i][j] = (int) (Math.random()*100);
                contador += matriz[i][j];
            }
        }
        System.out.println("");
        System.out.println("La suma de todos los elementos de la matriz da "+contador);
        System.out.println("");
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < m; l++) {
                System.out.print("["+matriz[k][l]+"]");
            }
            System.out.println("");
        }

    }
    
}
