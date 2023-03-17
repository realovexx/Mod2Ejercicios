/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintrop2;
import java.util.Scanner;
/*@author OvExX */
public class JavaIntroP2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Guia Teorica. Ejercicios");
        System.out.println("Ej. 1");
        /*Implementar un programa que le pida dos números 
     *enteros al usuario y determine si ambos o alguno
     *de ellos es mayor a 25.*/
        System.out.println("Ingrese un numero");
        Scanner leer1 = new Scanner(System.in);
        int num1 = leer1.nextInt();
        System.out.println("Ahora ingrese otro numero");
        int num2 = leer1.nextInt();
        if ((num1 > 25) || (num2 > 25)) {
            System.out.println("Alguno de los numeros es 25");
        } else {
            System.out.println("Ninguno de los numeros ingresados es 25");
        }

        System.out.println("Ej. 2");

        /* Considera que estás desarrollando una web para una empresa que fabrica motores 
(suponemos que se trata del tipo de motor de una bomba para mover fluidos). Definir una 
variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4. El programa 
debe mostrar lo siguiente:
Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de gasolina”.
Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de hormigón”.
Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta alimenticia”.
Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor válido para tipo de bomba”*/
        System.out.println("Fabrica de Motores");
        System.out.println("Elija la bomba deseada 1-4");
        int tipoMotor = leer1.nextInt();
        switch (tipoMotor) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
        }
        System.out.println("Ej. 3");
        /*Escriba un programa que valide si una nota está entre 0 y 10, sino 
   *está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea 
   *correcta.*/
        System.out.println("Ingrese una nota valida");
        int nota = leer1.nextInt();
        while ((nota<0)||(nota>10)){
            System.out.println("nota no valida, intentelo nuevamente");
             nota = leer1.nextInt();
        }
        System.out.println("la nota "+nota+" es una nota valida");
        
        
        
        
        
}
}
