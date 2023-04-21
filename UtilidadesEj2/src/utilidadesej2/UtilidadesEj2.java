/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidadesej2;

import entidades.ParDeNumeros;
import servicios.ParDeNumerosServicios;

/**
 *
 * @author OvExX
 */
public class UtilidadesEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ParDeNumerosServicios pns = new ParDeNumerosServicios();
        ParDeNumeros par = new ParDeNumeros();
        pns.mostrarValores(par);
        pns.devolverMayor(par);
        pns.calcularPotencia(par);
        pns.calculaRaiz(par);
    }
    
}
