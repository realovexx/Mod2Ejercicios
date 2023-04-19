/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.Coche;
import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class CocheServicio {
    public Coche crearCoche(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar Marca del vehiculo");
        String marca = leer.nextLine();
        System.out.println("Ingrese el Modelo del vehiculo");
        String modelo = leer.nextLine();
        System.out.println("Por ultimo, ingrese el valor del vehiculo en $");
        double precio = leer.nextDouble();
        return new Coche(marca, modelo, precio);
    }
    public String mostrarCoche(Coche c){
    return "Vehiculo marca: "+c.getMarca()+", Modelo: "+c.getModelo()+" y con un valor de $"+c.getPrecio();
    }
}
