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
 * @author ovexx
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ej. 3");
        System.out.println("");
        /*Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase cualquiera");
        String frase = leer.nextLine();
        System.out.println("");
        String fraseM = toUpperCase(frase);
        System.out.println(fraseM);
        String fraseMi = toLowerCase (frase);
        System.out.println(fraseMi);
        System.out.println("");
    }
    
}
