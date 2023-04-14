/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosextra1;

import entidad.Raices;
import servicios.RaicesServicio;

/**
 *
 * @author OvExX
 */
public class ServiciosExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Raices coso = new Raices(1,3,2); //esta deberia dar dos raices
        Raices coso2 = new Raices(2,4,2); //esta deberia dar una raiz
        Raices coso3 = new Raices(2,1,2); // esta no deberia tener raices
        RaicesServicio serv = new RaicesServicio();
        
        System.out.println("Prueba de metodos");
        System.out.println("Ej 1");
        serv.calcular(coso);
        System.out.println("Ej2");
        serv.calcular(coso2);
        System.out.println("Ej3");
        serv.calcular(coso3);
        
    }
    
}
