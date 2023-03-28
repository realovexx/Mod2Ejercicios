/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtrasarreglos;

import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*Crear una función rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o
procedimiento que imprima el vector.
*/
Scanner leer = new Scanner(System.in);       
System.out.println("Ingrese la dimension del vector");
int dim = leer.nextInt();
int vector[] = llenarVector(dim);
mostrarVector(vector);
    }
    public static int[] llenarVector(int dim){
        int vector [] = new int [dim];
        for (int i = 0 ; i < dim ; i++){
          vector[i] = (int)(Math.random()*100);
        }
        return vector;
    }
    
    public static void mostrarVector(int[] vector){
        for (int i = 0 ; i < vector.length ; i++){
            System.out.print("["+vector[i]+"]");
        }
        System.out.println("");
    }
    
  }
