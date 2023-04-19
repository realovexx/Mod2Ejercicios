/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosextra3.pkg1;

import entidad.Fraccion;
import servicios.FraccionServicios;

/**
 *
 * @author OvExX
 */
public class ServiciosExtra25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
FraccionServicios FC = new FraccionServicios();
Fraccion f = FC.crearFraccion();
FC.menu(f);
    }
    
}
