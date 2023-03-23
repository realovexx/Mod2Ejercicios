/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejarreglos;

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
/*Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios 
  y le pida al usuario un número a buscar en el vector. El programa mostrará 
  dónde se encuentra el numero y si se encuentra repetido*/
Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int dim = leer.nextInt();
        int[] vector = new int [dim];
        llenarVector(vector,dim);
        System.out.println("Ahora elige un numero del 1 al 100 a ver si está");
        int num = leer.nextInt();
        int pos = 0;
        int cont = 0;
        for (int i=0 ; i < dim ; i++){
            if (vector[i]==num){
                pos = i;
                cont += 1;
            }
        }
        System.out.println("El numero se encontró en la posicion "+pos);
        System.out.println("Por otro lado, el numero ha aparecido "+cont+" veces");
    }
 public static void llenarVector(int vector[], int dim){
     for (int i=0; i<dim;i++){
         vector[i] = (int)(Math.random()*100);
     }
 
 }  
}
