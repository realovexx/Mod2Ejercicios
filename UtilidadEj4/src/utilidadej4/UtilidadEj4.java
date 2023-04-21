/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidadej4;

import java.util.Date;
import servicios.FechaService;

/**
 *
 * @author OvExX
 */
public class UtilidadEj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FechaService fs = new FechaService();
        Date nac = fs.fechaNacimiento();
        Date hoy = fs.fechaActual();
        System.out.println("La fecha de nacimiento fue: "+nac);
        System.out.println("Hoy es "+hoy);
        System.out.println("Su edad es "+fs.diferencia(hoy, nac));
    }
}
