/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtrasarreglos;

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
/*Construya un programa que lea 5 palabras de mínimo 3 y hasta 5
caracteres y, a medida que el usuario las va ingresando, construya una
“sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las
palabras se ubicarán todas en orden horizontal en una fila que será
seleccionada de manera aleatoria. Una vez concluida la ubicación de las
palabras, rellene los espacios no utilizados con un número aleatorio del 0
al 9. Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java substring(), Length() y Math.random().
*/
Scanner leer = new Scanner(System.in);
String matriz[][] = new String[20][20];
String palabra;
int rand;

for (int i = 0 ; i<5 ; i++){
        System.out.println("escribe una palabra entre 3 y 5 letras");
        palabra = leer.nextLine();
        palabra = palabra.toUpperCase();
        
        while ((palabra.length()<3)||(palabra.length()>5)){
            System.out.println("intentalo nuevamente!");
            palabra = leer.nextLine();
            palabra = palabra.toUpperCase();
        }
       int j = 0;
    rand = (int) (Math.random()*20);
    while (j < palabra.length()) {
        if (matriz[rand][j] == null || matriz[rand][j].isEmpty()) {
            matriz[rand][j] = palabra.substring(j, j+1);
            j++;
        } else {
            rand = (int) (Math.random()*20);
            j = 0;
        }
    }
    
}


Integer numToSt;
String StFrNum;

        for (int k = 0; k < 20; k++) {
            for (int l = 0; l < 20; l++) {
               if (matriz[k][l] == null || matriz[k][l].isEmpty()) {
                   numToSt = (int) (Math.random()*10);
                   StFrNum = Integer.toString(numToSt);
                   matriz[k][l] = StFrNum;
               }
            }
        }

        for (int g = 0 ; g < 20 ; g++){
            for (int h = 0; h < 20; h++) {
                System.out.print("["+matriz[g][h]+"]");
            }
            System.out.println("");
        }


    }
}
