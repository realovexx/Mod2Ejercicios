/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosej3;

import Entidad.Persona;
import Servicios.PersonaServicio;

/**
 *
 * @author OvExX
 */
public class ServiciosEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaServicio serv = new PersonaServicio();
        //public Persona(String nombre, int edad, String sexo, double peso, int altura)
        
        Persona wacho1 = new Persona("Jorge",37,"H",100.0,168);
        Persona wacho2 = new Persona("Lau",34,"M",70.0,156);
        Persona wacho3 = new Persona("Alita",18,"O",70.0,168);
        Persona wacho4 = new Persona("Pimienta",17,"O",45.0,157);
       /* 
        System.out.println("Ejercicio personas!");
        System.out.println("");
        System.out.println("Ingrese los datos de la primera persona");
        Persona wacho1 = serv.crearPersona();
        System.out.println("");
        System.out.println("Ahora ingrese los datos de la segunda persona");
        Persona wacho2 = serv.crearPersona();
        System.out.println("");
        System.out.println("Ahora para la tercera");
        Persona wacho3 = serv.crearPersona();
        System.out.println("");
        System.out.println("Por ultimo, los datos de la cuarta");
        Persona wacho4 = serv.crearPersona();
        System.out.println("");
        */
        serv.infoPersona(wacho1);
        serv.infoPersona(wacho2);
        serv.infoPersona(wacho3);
        serv.infoPersona(wacho4);
        System.out.println("");
        arrayIMC(wacho1,wacho2,wacho3,wacho4,serv);
        System.out.println("");
        arrayMay(wacho1,wacho2,wacho3,wacho4,serv);
    }
public static void arrayIMC(Persona p1, Persona p2, Persona p3, Persona p4, PersonaServicio serv){
    int[] vectorIMC = new int[4];
    vectorIMC[0] = serv.calcularIMC(p1);
    vectorIMC[1] = serv.calcularIMC(p2);
    vectorIMC[2] = serv.calcularIMC(p3);
    vectorIMC[3] = serv.calcularIMC(p4);

    double cont0 = 0.0;
    double cont1 = 0.0;
    double cont2 = 0.0;
    for (int i = 0 ; i < 4 ; i++){
        if (vectorIMC[i] == -1){
          cont0++;  
        }else if (vectorIMC[i] == 0){
          cont1++;
        }else{
          cont2++;
        }
    }
    System.out.println("Un "+(cont2/4)*100+"% de los participantes esta por arriba de su peso ideal, ");
    System.out.println("un "+(cont0/4)*100+"% esta por debajo y un "+(cont1/4)*100+"% esta en su peso ideal");
}
public static void arrayMay(Persona p1, Persona p2, Persona p3, Persona p4, PersonaServicio serv){
    boolean[] vectorMay = new boolean[4];
    vectorMay[0] = serv.esMayorDeEdad(p1);
    vectorMay[1] = serv.esMayorDeEdad(p2);
    vectorMay[2] = serv.esMayorDeEdad(p3);
    vectorMay[3] = serv.esMayorDeEdad(p4);

    double contV = 0.0;
    double contF = 0.0;
    
    for (int i = 0; i < 4; i++) {
        if (vectorMay[i] == true) {
            contV++;
        }else{
            contF++;
        }
    }
    System.out.println("Un "+(contV/4)*100+"% de los participantes es mayor de edad y ");
    System.out.println("un "+(contF/4)*100+"% es menor de edad");
}
}
