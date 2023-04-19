/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.Mascota;
import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class MascotaServicios {
    /*Crea una clase "Mascota" con las propiedades "nombre", "edad", "raza" y "tipo" (perro, gato, etc.).
Crea un constructor para inicializar los valores de las propiedades y en la clase servicio 
crear un método para agregar la mascota y otro para mostrar por pantalla la información de la mascota.
También crea un método "cumplirAnios" que aumente en uno la edad de la mascota.*/

public Mascota crearMascota(){
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    System.out.println("Ingrese el nombre de su mascota");
    String nombre = leer.next();
    System.out.println("Que animal es?");
    String tipo = leer.next();
    System.out.println("Y que raza?");
    String raza = leer.next();
    System.out.println("Por ultimo, cual es su edad?");
    int edad = leer.nextInt();
    return new Mascota(nombre, edad, raza, tipo);
}

public String mostrarMascota(Mascota m){
    return m.getNombre()+" es un/a "+m.getTipo()+" de raza "+m.getRaza()+" y tiene "+m.getEdad()+" años!";
}

public void cumplirAnios(Mascota m){
    System.out.println("Tu mascota cumple años!");
    m.setEdad(m.getEdad()+1);
    System.out.println(m.getNombre()+" ahora tiene "+m.getEdad()+" años!");
}
}
