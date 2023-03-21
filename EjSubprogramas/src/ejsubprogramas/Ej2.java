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
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Diseñe una función que pida el nombre y la edad de N personas e 
        imprima los datos de las personas ingresadas por teclado e indique 
        si son mayores o menores de edad. Después de cada persona, el 
        programa debe preguntarle al usuario si quiere seguir mostrando 
        personas y frenar cuando el usuario ingrese la palabra “No"*/
        Scanner leer = new Scanner(System.in);
        String opc;
        System.out.println("El programa indicará si la persona es mayor o menor de edad.");
        do{
            System.out.println("Ingrese el nombre de la persona");
            String nombre = leer.next();
            System.out.println("Ahora ingrese la edad de la persona");
            int edad = leer.nextInt();
            esMayor(nombre,edad);
            System.out.println("Desea seguir mostrando personas?");
            opc = leer.next();
        }while(!opc.equalsIgnoreCase("No"));
        System.out.println("Saliendo del programa...");
        
    }
    public static void esMayor(String nombre,int edad){
        if (edad>=21){
            System.out.println(nombre+" es mayor de edad");
        }else{
            System.out.println(nombre+" es menor de edad");
        }
    }
}
