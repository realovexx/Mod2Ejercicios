/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejestructurascontrol;

import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.*/

        Scanner leer = new Scanner(System.in);
        Scanner leer1 = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num1 = leer.nextInt();
        System.out.println("Ahora ingrese otro numero");
        int num2 = leer.nextInt();
        int opc;
        String opc1;

        do {
            System.out.println(">----------------<");
            System.out.println("| Menu:          |");
            System.out.println("|                |");
            System.out.println("| 1. Sumar       |");
            System.out.println("| 2. Restar      |");
            System.out.println("| 3. Multiplicar |");
            System.out.println("| 4. Dividir     |");
            System.out.println("| 5. Salir       |");
            System.out.println("| Elija opción   |");
            System.out.println("|                |");
            System.out.println(">----------------<");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("");
                    System.out.println("La suma de " + num1 + " mas " + num2 + " da " + (num1 + num2));
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("La resta de " + num1 + " menos " + num2 + " da " + (num1 - num2));
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("La multiplicacion de " + num1 + " por " + num2 + " da " + (num1 * num2));
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("La division de " + num1 + " en " + num2 + " da " + (num1 / num2));
                    System.out.println("");
                    break;
                default: {
                    if (opc == 0) {
                        System.out.println("");
                        System.out.println("Opcion no valida. no vimo en diney");
                        System.out.println("");
                    } else if (opc!=5){
                        System.out.println("");
                        System.out.println("Opcion no valida. Volviendo al menu");
                        System.out.println("");
                    }
                }

            }
            if (opc == 5) {
                System.out.println("Está seguro que desea salir del programa?[S/n]");
                opc1 = leer1.nextLine();
                if (opc1.equalsIgnoreCase("s")) {
                    break;
                } else {
                    System.out.println("Volviendo al menu");
                }
            }
        } while (opc != 0);
    }
}
