/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.ParDeNumeros;

/**
 *
 * @author OvExX
 */
public class ParDeNumerosServicios {
    public void mostrarValores(ParDeNumeros n){
        System.out.println("Los valores son: "+n.getNum1()+" y "+n.getNum2()+".");  
    }
    public void devolverMayor(ParDeNumeros n){
        System.out.println("El numero mayor es el "+Math.max(n.getNum1(),n.getNum2()));
    }
    public void calcularPotencia(ParDeNumeros n){
        long a = Math.round(n.getNum1());
        long b = Math.round(n.getNum2());
        System.out.println("La potencia de "+a+" a la "+b+" da: "+Math.pow(a,b));
    }
    public void calculaRaiz(ParDeNumeros n){
        int a = (int) Math.min(n.getNum1(),n.getNum2());
        System.out.println("La raiz cuadrada del menor ("+a+") de los numeros da "+Math.sqrt(a));
    }
    
}
