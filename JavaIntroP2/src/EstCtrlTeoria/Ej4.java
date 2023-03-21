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
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escriba un programa que lea 20 números. Si el número leído es igual a cero se
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
de la sentencia break.*/
        System.out.println("Ej. 4");
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        int aux = 0;
        int opc = 0;
        do {
            System.out.println("Ingrese un numero, o 0 para salir");
            opc = leer.nextInt();
            if (opc == 0) {
                System.out.println("Se capturó el numero cero");
                break;
            }
            if (opc > 0) {
                suma += opc;
            }
            aux++;
        } while (aux < 20);
        System.out.println("La suma de los numeros positivos ingresados da "+suma);
    }
}
