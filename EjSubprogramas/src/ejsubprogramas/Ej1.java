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
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea una aplicación que le pida dos números al usuario
        y este pueda elegir entre sumar, restar, multiplicar y dividir. 
        La aplicación debe tener una función para cada operación 
        matemática y deben devolver sus resultados para imprimirlos 
        en el main.*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Calculadora:");
        System.out.println("");
        System.out.println("Ingrese el primer numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = leer.nextInt();
        System.out.println("A continuacion, elija la opcion deseada");
        System.out.println("");
        System.out.println("1. Sumar ambos numeros");
        System.out.println("2. Al primer numero restarle el segundo");
        System.out.println("3. Multiplicar ambos numeros");
        System.out.println("4. Dividir el primer numero por el segundo");
        int opc = leer.nextInt();
        switch (opc){
            case 1:
                System.out.println("La suma de "+num1+" y "+num2+" da "+suma(num1,num2));
                break;
            case 2:
                System.out.println("Si a "+num1+" le resto "+num2+" da "+resta(num1,num2));
                break;
            case 3:
                System.out.println("La multiplicacion de "+num1+" y "+num2+" da "+multiplicacion(num1,num2));
                break;
            case 4:
                System.out.println("Si a "+num1+" lo divido en "+num2+" da "+division(num1,num2));
                break;
            default:
                System.out.println("Opción no valida, salendo...");
        }
        
        
    }
    
    public static int suma(int a,int b){
       int  resultado = a + b;
        return resultado;
    }
    public static int resta(int a,int b){
       int  resultado = a - b;
        return resultado;
    }
    public static int multiplicacion(int a,int b){
       int  resultado = a * b;
        return resultado;
    }
    public static int division(int a,int b){
       int  resultado = a / b;
        return resultado;
    }
    
}
