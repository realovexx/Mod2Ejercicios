/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.Meses;
import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class Adivinanza {
    public void juego(){
    Meses m = new Meses();
    Scanner leer = new Scanner(System.in);
        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:");
        String opc = leer.next();
        while (!opc.equals(m.getMesSecreto())){
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes: ");
            opc = leer.next();
        }
        System.out.println("¡Ha acertado!");
    }
}
