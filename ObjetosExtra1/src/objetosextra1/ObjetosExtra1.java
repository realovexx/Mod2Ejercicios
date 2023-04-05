/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosextra1;

import Entidad.Cancion;
import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class ObjetosExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cancion aullar = new Cancion();
        aullar.crearCancion();
        System.out.println(aullar.toString());
    }
    
}
