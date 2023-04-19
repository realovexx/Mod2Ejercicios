/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosextra2.pkg1;

import entidad.Coche;
import servicios.CocheServicio;

/**
 *
 * @author OvExX
 */
public class ServiciosExtra21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CocheServicio CS = new CocheServicio();
        Coche vehiculo = CS.crearCoche();
        System.out.println(CS.mostrarCoche(vehiculo));
    }
    
}
