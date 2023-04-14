/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosextra2;

import entidad.NIF;
import servicios.NIFService;

/**
 *
 * @author OvExX
 */
public class ServiciosExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      NIFService serv = new NIFService();
      NIF newNIF = serv.crearNif();
      System.out.println(serv.mostrar(newNIF));
    }
    
}
