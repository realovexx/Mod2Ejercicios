/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosextra2.pkg4;

import entidad.Ascensor;
import servicios.AscensorServicio;

/**
 *
 * @author OvExX
 */
public class ServiciosExtra24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
AscensorServicio AS = new AscensorServicio();
Ascensor arrrriba = new Ascensor(0,10);
AS.menu(arrrriba);
    }
    
}
