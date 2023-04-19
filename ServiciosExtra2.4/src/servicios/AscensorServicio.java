/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.Ascensor;
import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class AscensorServicio {

    /*Crea una clase "Ascensor" con las propiedades "pisoActual" y "maximoPisos".
Crea un constructor para inicializar los valores de las propiedades.
En la clase servicio:
Crea un método "subir" que aumente en uno el valor de la propiedad "pisoActual" si aún no se ha alcanzado el "maximoPisos".
Crea un método "bajar" que disminuya en uno el valor de la propiedad "pisoActual" si no se ha alcanzado el piso "0".
Crea un método "irA" que reciba como parámetro el número de piso al que se desea ir y que modifique la propiedad 
    "pisoActual" para que tenga ese valor.
Crea un programa que cree un objeto "Ascensor" con un "maximoPisos" de 10. Simula el comportamiento del ascensor 
    moviéndolo hacia arriba y hacia abajo, yendo a un piso específico, y mostrando en pantalla el piso actual 
    después de cada movimiento.
     */
    public void subir(Ascensor a) {

        if (a.getPisoActual() < a.getMaximoPisos()) {
            System.out.println("Estas en piso " + a.getPisoActual() + ". Subiendo...");
            a.setPisoActual(a.getPisoActual() + 1);
            System.out.println("Ahora estas en el piso " + a.getPisoActual());
        } else {
            System.out.println("Ya estas en el piso " + a.getMaximoPisos());
        }
    }

    public void bajar(Ascensor a) {

        if (a.getPisoActual() > 0) {
            System.out.println("Estas en piso " + a.getPisoActual() + ". Bajando...");
            a.setPisoActual(a.getPisoActual() - 1);
            System.out.println("Ahora estas en el piso " + a.getPisoActual());
        } else {
            System.out.println("Ya estas en PB");
        }
    }

    public void irA(Ascensor a) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Estas en piso " + a.getPisoActual() + ", a que piso queres ir?");
        int ir = leer.nextInt();
        while (ir < 0 || ir > a.getMaximoPisos()) {
            System.out.println("Piso invalido, ingrese un piso del 0 (PB) al " + a.getMaximoPisos());
            ir = leer.nextInt();
        }
        a.setPisoActual(ir);
        System.out.println("Llegaste al piso " + a.getPisoActual());
    }

    public void menu(Ascensor a) {
        Scanner leer = new Scanner(System.in);
        int opc = 0;
        do{
        System.out.println("Que desea hacer?");
        System.out.println("");
        System.out.println("1. Subir un piso");
        System.out.println("2. Bajar un piso");
        System.out.println("3. Ir a un piso especifico");
        System.out.println("4. Salir");
        opc = leer.nextInt();
        while (opc < 0 || opc > 4) {
            System.out.println("ingreso invalido, intentelo nuevamente");
            opc = leer.nextInt();
        }
        switch (opc) {
            case 1:
                subir(a);
                break;
            case 2:
                bajar(a);
                break;
            case 3:
                irA(a);
                break;
            default:
                System.out.println("Saliendo...");
        }
        }while (opc != 4);
    }
}
