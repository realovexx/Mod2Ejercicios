/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author OvExX
 */
public class ArregloService {
    public void inicializarA(double[] a){
        for (int i = 0 ; i < a.length; i++){
           a[i] = Math.random()*100;
        }        
    }
    public void mostrar(double[] a){
        for (int i = 0 ; i < a.length; i++){
            System.out.print("["+a[i]+"]");
        }
        System.out.println("");
    }
    public void ordenar(double[] a){
        Arrays.sort(a); //no encontre la forma de ordenarlos de forma descendente. queda pendiente.
    }
    public void inicializarB(double[] a, double[] b){
        for (int i = 0 ; i < 10 ; i++ ){
            b[i] = a[i];
        }
        Arrays.fill(b,10,20,0.5);
    }
}
