/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstCtrlTeoria;

import java.util.Scanner;

/**
 *
 * @author ovexx
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escriba un programa que valide si una nota está entre 0 y 10, sino 
   *está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea 
   *correcta.*/
        System.out.println("Ej. 3");
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una nota valida");
        int nota = leer.nextInt();
        while ((nota<0)||(nota>10)){
            System.out.println("nota no valida, intentelo nuevamente");
             nota = leer.nextInt();
        }
        System.out.println("la nota "+nota+" es una nota valida");   
    }  
}
