/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosextra3.pkg2;

import entidad.Tiempo;
import servicios.TiempoServicio;

/**
 *
 * @author OvExX
 */
public class ServiciosExtra32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TiempoServicio TS = new TiempoServicio();
        Tiempo hora = TS.crearHora();
        TS.imprimirHoraCompleta(hora);
        TS.modificarHora(hora);
    }
    
}
