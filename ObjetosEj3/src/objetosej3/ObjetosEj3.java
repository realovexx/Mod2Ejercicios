/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosej3;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class ObjetosEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operacion coso = new Operacion();
        coso.crearOperacion();
        System.out.println("La suma da "+coso.sumar());
        System.out.println("La resta da "+coso.restar());
        System.out.println("La multiplicacion da "+coso.multiplicar());
        System.out.println("La division da: "+coso.dividir());        
    }
    
}
