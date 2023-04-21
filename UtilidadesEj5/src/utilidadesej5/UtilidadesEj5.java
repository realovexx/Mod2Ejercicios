/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidadesej5;

import entidades.Persona;
import java.util.Scanner;
import servicios.PersonaService;

/**
 *
 * @author OvExX
 */
public class UtilidadesEj5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonaService ps = new PersonaService();
        Persona p = ps.crearPersona();
        System.out.println(p.getNombre()+" tiene "+ps.calcularEdad(p)+" años");
        System.out.println("Ingrese una edad");
        int edad = leer.nextInt();
        System.out.println("Es "+p.getNombre()+" menor que esa edad? "+ps.menorQue(p, edad));
        System.out.println("Info: ");
        System.out.println(ps.mostrarPersona(p));
    }
    
}
