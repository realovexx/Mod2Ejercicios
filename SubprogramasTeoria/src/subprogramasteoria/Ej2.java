/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subprogramasteoria;

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
    /*Crea un procedimiento EsMultiplo que reciba los dos números pasados por 
    el usuario, validando que el primer número múltiplo del segundo e imprima 
    si el primer número es múltiplo del segundo, sino informe que no lo son.*/
    Scanner leer = new Scanner(System.in);    
    System.out.println("A continuacion definiremos si un numero es multiplo de otro");
        System.out.println("");
        System.out.println("Ingrese el primer numero");
        int num1 = leer.nextInt();
        System.out.println("Ahora, ingrese el segundo numero");
        int num2 = leer.nextInt();
        System.out.println("");
        System.out.println("Veremos si "+num2+" entra un numero natural de ");
        System.out.println("veces en "+num1);
        System.out.println("");
        esMultiplo(num1, num2);
    }
    public static void esMultiplo(int a, int b){
        if (a%b==0){
            System.out.println(a+" es multiplo de "+b);
            System.out.println("");
            System.out.println("Entra "+(a/b)+" veces.");
        } else {
            System.out.println(a+" NO es multiplo de "+b);
        }
    }
}
