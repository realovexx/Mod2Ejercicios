/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosextra4;

import Entidad.Cuenta;

/**
 *
 * @author OvExX
 */
public class ObjetosExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Cuenta caja = new Cuenta(15000.0,"Jorge");  
      caja.retirar_dinero();
    }
    
}
