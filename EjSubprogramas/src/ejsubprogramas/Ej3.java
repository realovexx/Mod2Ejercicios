/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejsubprogramas;

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
    /*Crea una aplicación que a través de una función nos convierta una 
      cantidad de euros introducida por teclado a otra moneda, estas pueden 
      ser a dólares, yenes o libras. La función tendrá como parámetros, 
      la cantidad de euros y la moneda a convertir que será una cadena, este 
      no devolverá ningún valor y mostrará un mensaje indicando el cambio 
      (void).
        
        El cambio de divisas es:
        i. * 0.86 libras es un 1 € 
        ii. * 1.28611 $ es un 1 €
        iii. * 129.852 yenes es un 1 € */
    
    Scanner leer = new Scanner(System.in);
        System.out.println("Conversor de divisas:");
        System.out.println("");
        System.out.println("Ingrese el monto en euros a convertir");
        int monto = leer.nextInt();
        System.out.println("Ahora ingrese la divisa hacia la que desea");
        System.out.println("Convertir (Libras, Dolares, Yenes)");
        String divisa = leer.next();
        convertir(divisa, monto);
        
    }
    public static void convertir(String divisa, int monto){
        divisa = divisa.toLowerCase();
        switch (divisa){
            case "libras":
            case "libra":    
                System.out.println(monto+" Euros equivale a "+(monto*0.86)+" Libras.");
                break;
            case "dolares":
            case "dolar":
                System.out.println(monto+" Euros equivale a "+(monto*1.28611)+" Dolares.");
                break;
            case "yenes":
            case "yen":
                System.out.println(monto+" Euros equivale a "+(monto*129.852)+" Yenes.");
                break;
            default:
                System.out.println("Divisa invalida, saliendo...");
        }
    }
}
