/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosextra5;

import Entidad.Empleado;

/**
 *
 * @author OvExX
 */
public class ObjetosExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado coso = new Empleado("Jorge Vega", 37, 160000);
        coso.calcularAumento();
    }
    
}
