/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class CafeteraServicio {

    Scanner leer = new Scanner(System.in);

    public void llenarCafetera(Cafetera cafe) {
        System.out.println("");
        System.out.println("La cafetera tenía " + cafe.getCantidadActual() + " mL. Llenando...");
        cafe.setCantidadActual(cafe.getCapacidadMaxima());
        System.out.println("Ahora la cafetera tiene " + cafe.getCantidadActual() + " mL de cafe");
        System.out.println("");
    }

    public void servirTaza(Cafetera cafe) {
        System.out.println("");
        System.out.println("Ingrese la capacidad en mL de su taza");
        double ml = leer.nextDouble();
        System.out.println("Sirviendo taza");
        if (ml > cafe.getCantidadActual()) {
            System.out.println("Se han vertido " + cafe.getCantidadActual() + "mL de cafe en la taza");
            cafe.setCantidadActual(0.0);
            System.out.println("A la cafetera le quedan " + cafe.getCantidadActual() + "mL.");
        } else {
            System.out.println("Se ha llenado la taza con " + ml + "mL de cafe.");
            cafe.setCantidadActual(cafe.getCantidadActual() - ml);
            System.out.println("A la cafetera le quedan " + cafe.getCantidadActual() + "mL.");
        }
        System.out.println("");
    }

    public void vaciarCafetera(Cafetera cafe) {
        System.out.println("Se ha vaciado la cafetera. ");
        cafe.setCantidadActual(0.0);
        System.out.println("A la cafetera le quedan " + cafe.getCantidadActual() + "mL.");
    }

    public void agregarCafe(Cafetera cafe) {
        System.out.println("Cuanto cafe desea agregar en la cafetera?");
        double ml = leer.nextDouble();
        if (ml+cafe.getCantidadActual() > cafe.getCapacidadMaxima()) {
            System.out.println("La cantidad ingresada supera la capacidad maxima");
            System.out.println("Llenando la cafetera a capacidad");
            cafe.setCantidadActual(cafe.getCapacidadMaxima());
            System.out.println("A la cafetera le quedan " + cafe.getCantidadActual() + "mL.");
        } else {
            System.out.println("Se han agregado " + ml + "mL de cafe a la cafetera");
            cafe.setCantidadActual(cafe.getCantidadActual() + ml);
            System.out.println("A la cafetera le quedan " + cafe.getCantidadActual() + "mL.");
        }
    }
}
