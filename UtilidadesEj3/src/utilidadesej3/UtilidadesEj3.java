/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidadesej3;

import servicios.ArregloService;

/**
 *
 * @author OvExX
 */
public class UtilidadesEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] a = new double[50];
        double[] b = new double[20];
        ArregloService as = new ArregloService();
        System.out.println("Inicializo A");
        as.inicializarA(a);
        System.out.println("Muestro A");
        as.mostrar(a);
        System.out.println("Ordeno A");
        as.ordenar(a);
        System.out.println("Inicializo B");
        as.inicializarB(a, b);
        System.out.println("Muestro Ambos");
        as.mostrar(a);
        as.mostrar(b);
    }
    
}
