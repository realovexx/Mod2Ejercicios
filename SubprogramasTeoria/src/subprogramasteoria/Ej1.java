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
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*Escribir un programa que procese una secuencia de caracteres ingresada por 
teclado y terminada en punto, y luego codifique la palabra o frase ingresada 
de la siguiente manera: cada vocal se reemplaza por el carácter que se indica 
en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) 
se mantienen sin cambios.
        a = @
        e = #
        i = $
        o = %
        u = *
Realice un subprograma que reciba una secuencia de caracteres y retorne la 
codificación correspondiente. Utilice la estructura “según” para la 
transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.*/
      System.out.println("Ej. 1");
      Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase cualquiera, será transformada.");
        String frase = leer.nextLine();
        String newFrase = transformar(frase); 
        System.out.println(newFrase);
    }  
    
    public static String transformar(String frase)
    {
        String letra;
        int largo = frase.length();
        String frase2 = "";
        for (int i=0; i<largo;i++)
        {
            letra = frase.substring(i,i+1);
            switch (letra)
            {
                case "a":
                case "A":
                    frase2 = frase2.concat("@");
                    break;
                case "e":
                case "E":
                    frase2 = frase2.concat("#");
                    break;
                case "i":
                case "I":
                    frase2 = frase2.concat("$");
                    break;
                case "o":
                case "O":
                    frase2 = frase2.concat("%");
                    break;
                case "u":
                case "U":
                    frase2 = frase2.concat("*");
                    break;
                default:
                    frase2 = frase2.concat(letra);
            }
        }
        return frase2;
    }
}

