/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosej2;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class ObjetosEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Circunferencia pelota = new Circunferencia();
        pelota.crearCircunferencia();
        System.out.println("El area es: "+pelota.Area(pelota.getRadio()));
        System.out.println("El perímetro es: "+pelota.Perimetro(pelota.getRadio()));
    }
}
