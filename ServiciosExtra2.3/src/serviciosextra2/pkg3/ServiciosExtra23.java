/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosextra2.pkg3;

import entidad.Mascota;
import servicios.MascotaServicios;

/**
 *
 * @author OvExX
 */
public class ServiciosExtra23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MascotaServicios MS = new MascotaServicios();
       Mascota pet = MS.crearMascota();
       System.out.println(MS.mostrarMascota(pet));
       MS.cumplirAnios(pet);
       System.out.println(MS.mostrarMascota(pet));
       
    }
    
}
