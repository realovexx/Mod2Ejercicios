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
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
*/
Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimension del vector");
        int dim = leer.nextInt();
        int[] vector = new int[dim];
        System.out.println("se completara el vector de forma aleatoria");
        for (int i = 0 ; i < dim ; i++){
            vector[i] = (int)(Math.random()*100000);
        }
       /* System.out.println("A continuación, ingrese los "+dim+" numeros:");
          for (int i = 0 ; i < dim ; i++){
            vector[i] = leer.nextInt();
        }*/
        int undig = 0;
        int dosdig = 0;
        int tresdig = 0;
        int cuadig = 0;
        int cinqdig = 0;
        for (int j = 0 ; j < dim ; j++){
            if (vector[j]<10){
                undig++;
            }else if (vector[j]<100 && vector[j]>=10){
                dosdig++;
            }else if (vector[j]<1000 && vector[j]>=100){
                tresdig++;
            }else if (vector[j]<10000 && vector[j]>=1000){
                cuadig++;
            }else if (vector[j]<100000 && vector[j]>=10000){
                cinqdig++;
            }
        }
        
        System.out.println("El vector contiene "+undig+" numeros de 1 digito, "+dosdig+" numeros de 2 digitos");
        System.out.println(tresdig+" numeros de 3 digitos, "+cuadig+" numeros de 4 digitos y "+cinqdig+" de 5.");
        System.out.println("A continuacion, se muestra el vector para corroborar");
        System.out.println("");
        for (int k = 0; k < dim; k++) {
            System.out.print("["+vector[k]+"]");
        }
        System.out.println("");
        
    }
    
}
