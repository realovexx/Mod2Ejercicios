/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosextra6;

import Entidad.Rectangulo;

/**
 *
 * @author OvExX
 */
public class ObjetosExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(4,6);
        rectangulo1.calcular_area();
        System.out.println("El rectangulo tiene un lado de "+rectangulo1.getLado1()+" y "
                + "un lado de "+rectangulo1.getLado2()+", por ultimo su area "
                        + "es de "+rectangulo1.calcular_area());        
    }    
}
