/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejestructurascontrol;

import java.util.Scanner;

/**
 *
 * @author ovexx
 */
public class Ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Dibujar un cuadrado de N elementos por lado utilizando
        el carácter “*”. Por ejemplo, si el cuadrado tiene 4 elementos 
        por lado se deberá dibujar lo siguiente:
        
        **** 
        *  * 
        *  * 
        ****  */
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos del cuadrado");
        int lado = leer.nextInt();
        int i,j;
        System.out.println("");
        for (i=0;i<lado;i++){
            for (j=0;j<lado;j++){
                if ((i==0)||(j==0)||(i==lado-1)||(j==lado-1)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
}
}
