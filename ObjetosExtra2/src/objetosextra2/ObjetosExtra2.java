/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosextra2;

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class ObjetosExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Puntos coord = new Puntos();
        coord.crearPuntos();
        System.out.println(coord.toString());
    }
    
}
