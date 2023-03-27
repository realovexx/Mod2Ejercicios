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
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*Escriba un programa que averigüe si dos vectores de N enteros son
iguales (la comparación deberá detenerse en cuanto se detecte alguna
diferencia entre los elementos).
*/
Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimension de sus vectores");
        int n = leer.nextInt();
        int[] vector1 = new int [n];
        int[] vector2 = new int [n];
        int aux = 0;
        System.out.println("Ahora completaremos el primer vector:");
        for (int i = 0 ; i < n ; i++){
            System.out.println("ingrese un numero");
            vector1[i] = leer.nextInt();
        }
        System.out.println("Primer vector completado, iniciando segundo vector:");
        for (int j = 0 ; j < n ; j++){
            System.out.println("ingrese un numero");
            vector2[j] = leer.nextInt();
        }
        System.out.println("Se compararan ambos vectores");
        for (int k = 0; k < n; k++) {
            if (vector1[k]!=vector2[k]){
                System.out.println("Diferencia encontrada en posicion "+k);
                System.out.println("Saliendo...");
                aux += 1;
                break;
            }
        }
        if (aux < 1){
            System.out.println("Los vectores son iguales!");
        }
  }  
}
