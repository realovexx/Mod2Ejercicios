/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosej4;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class ObjetosEj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Rectangulo bob = new Rectangulo();
        bob.crearRectangulo();
        System.out.println(bob.toString());
        bob.dibujarRectangulo();
    }
    
}
