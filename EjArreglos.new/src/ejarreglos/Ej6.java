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
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
idénticas. Crear un programa que permita introducir un cuadrado por
teclado y determine si este cuadrado es mágico o no. El programa
deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9*/

        Scanner leer = new Scanner(System.in);
        System.out.println("Se creara una matriz de 3 x 3, luego debes llenarla y revisaremos si es magica.");
        int[][] magix = new int[3][3];
        System.out.println("");
        System.out.println("A continuacion, ingresa los numeros");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                magix[i][j] = leer.nextInt();
                while (magix[i][j] < 1 || magix[i][j] > 9) {
                    System.out.println("numero no valido, intentelo nuevamente");
                    magix[i][j] = leer.nextInt();
                }
            }
        }
        System.out.println("");
        System.out.println("La matriz ingresada se muestra a continuacion");
        System.out.println("");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + magix[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
        
        boolean filas = fFilas(magix);
        boolean columnas = fColumnas(magix);
        boolean diagonal = fDiagonal(magix);
        
        int suma1fila = 0 ;
        for (int i = 0 ; i < 3 ; i++){
            suma1fila += magix[0][i];
        }
        if ((filas==true)&&(columnas==true)&&(diagonal==true)) {
            System.out.println("La matriz cumple con los requisitos para ser una matriz magica!");
            System.out.println("");
            System.out.println("Todas las filas, columnas y diagonales principales suman "+suma1fila);
        }else{
            System.out.println("La matriz NO cumple con los requisitos para ser una matriz magica...");
        }
    }

    public static boolean fFilas(int[][] matriz) {
        int[] sumas = new int[3];
        int resultadoFila = 0;
        int sumaSumas = 0;
        boolean filas;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultadoFila += matriz[i][j];
            }
            sumas[i] = resultadoFila;
            resultadoFila = 0;
        }
        for (int i = 0 ; i < 3 ;i++){
            sumaSumas += sumas[i];
        }
        if (sumaSumas==(sumas[0]*3)){
            filas = true;
        }else{
            filas = false;
        }
                return filas;
                
    }

     public static boolean fColumnas(int[][] matriz) {
        int[] sumas = new int[3];
        int[][] matrizT = new int [3][3];
        int resultadoColumna = 0;
        int sumaSumas = 0;
        boolean columnas;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizT[i][j] = matriz[j][i];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultadoColumna += matrizT[i][j];
            }
            sumas[i] = resultadoColumna;
            resultadoColumna = 0;
        }
        for (int i = 0 ; i < 3 ;i++){
            sumaSumas += sumas[i];
        }
        if (sumaSumas==(sumas[0]*3)){
            columnas = true;
        }else{
            columnas = false;
        }
                return columnas;
    }
     
     public static boolean fDiagonal(int[][] matriz){
         int diag = 0;
                 int diagI = 0;
         boolean diagonal;
         int[][] matrizI = new int [3][3];
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizI[i][j] = matriz [i][2-j];
            }
         }
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i==j){
                   diag+=matriz[i][j]; 
                }
            }
         }
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i==j){
                   diagI+=matrizI[i][j]; 
                }
            }
         }
         if (diag==diagI){
             diagonal = true;
         }else{
             diagonal = false;
         }
         return diagonal;
     }
}
