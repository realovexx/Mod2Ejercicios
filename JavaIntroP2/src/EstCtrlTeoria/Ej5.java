/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstCtrlTeoria;

import java.util.Scanner;

/**
 *
 * @author ovexx
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
el número ingresado seguido de tantos asteriscos como indique su valor. Por
ejemplo:
5 *****
3 ***
11 ***********
2 **
*/
System.out.println("Ej. 6");
Scanner leer = new Scanner(System.in);
System.out.println("Ingrese 4 valores entre 1 y 20");
int star;
for (int i=0;i<4;i++)
        {
    star = leer.nextInt();
    while ((star<0)||(star>20))
            {
        System.out.println("Numero no valido, intentelo nuevamente");
        star = leer.nextInt();
            }
        System.out.print(star+": ");
        for (int j=0;j<star;j++)
            {
        System.out.print("*");
            }
        System.out.println(" ");
        }
    }  
}
