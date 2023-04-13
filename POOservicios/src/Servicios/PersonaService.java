/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Persona;

/**
 *
 * @author OvExX
 */
public class PersonaService {
   public void datosPersona(){
       Persona persona1 = new Persona("Jorge");
       System.out.println("La persona se llama "+persona1.getNombre());
   }
}
