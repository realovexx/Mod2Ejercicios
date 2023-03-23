/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglosteoria;

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
        
Scanner leer = new Scanner(System.in);
        System.out.println("Cuantos integrantes tiene tu equipo?");
        int equipo = leer.nextInt();
        String[] vector = new String[equipo];
        System.out.println("A continuacion, ingrese el nombre de cada integrante");
        for (int i = 0 ; i<equipo ; i++){
            System.out.println("Nombre de integrante "+i);
            vector[i] = leer.next();
            
        }
        System.out.println("Se mostraran en pantalla los integrantes del equipo");
        mostrarVector(vector,equipo);
    }
   public static void mostrarVector(String vector [], int dimension){
       for (int i = 0 ; i < dimension; i++){
           System.out.println("["+vector[i]+"]");
       }
   } 
}
