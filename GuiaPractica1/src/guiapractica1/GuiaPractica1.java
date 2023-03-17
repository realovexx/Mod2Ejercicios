/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapractica1;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author OvExX
 */
public class GuiaPractica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduccion a Java");
        System.out.println("Ejercicios");
        System.out.println("");
        System.out.println("Ej. 1");
/*Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma*/
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numero cualquiera");
        int num1 = leer.nextInt();
        System.out.println("Ahora ingrese un segundo numero");
        int num2 = leer.nextInt();
        int res = num1 + num2;
        
        System.out.println("la suma de esos numeros da "+res);
        
        System.out.println("");
        System.out.println("Ej. 2");
        /*Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla.*/
        System.out.println("");
        System.out.println("Ingrese su nombre");
        Scanner leerC = new Scanner (System.in);
        String nom = leerC.nextLine();
        System.out.println("");
        System.out.println("Hola "+ nom + "!");
        System.out.println("");
        System.out.println("Ej. 3");
        System.out.println("");
        /*Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.*/
        System.out.println("Ingrese una frase cualquiera");
        String frase = leerC.nextLine();
        System.out.println("");
        String fraseM = toUpperCase(frase);
        System.out.println(fraseM);
        String fraseMi = toLowerCase (frase);
        System.out.println("fraseMi");
        System.out.println("");
        System.out.println("Ej. 4");
        System.out.println("");
        /*Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).*/
        System.out.println("Ingrese la temperatura en Grados Centigrados");
        Scanner leerB = new Scanner (System.in);
        byte tempC = leerB.nextByte();
        short tempF = (short) (32+(9*tempC/5));
        System.out.println("");
        System.out.println("El equivalente es " + tempF + " grados Farenheit");
        System.out.println("");
        System.out.println("Ej. 5");
        System.out.println("");
        /*Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.*/
        System.out.println("Ingrese un numero cualquiera");
        int num3 = leer.nextInt();
        System.out.println("");
        System.out.println("El doble del numero es " + 2*num3);
        System.out.println("El triple del numero es " + 3*num3);
        System.out.println("La raiz cuadrada del numero es " + Math.sqrt(num3));
    }
    
}
