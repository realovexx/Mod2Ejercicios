/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.Raices;

/**
 *
 * @author OvExX
 */
public class RaicesServicio {
    public double getDiscriminante(Raices raiz){
        return ((Math.pow(raiz.getB(),2))-4*raiz.getA()*raiz.getC());
    }
    
    public boolean tieneRaices(Raices raiz){
        return getDiscriminante(raiz)>0;
    }
    
     public boolean tieneRaiz(Raices raiz){
        return getDiscriminante(raiz)==0;
    }
     public void obtenerRaices(Raices raiz){
         double r1 = (-(raiz.getB())+ Math.sqrt((Math.pow(raiz.getB(),2))-4*raiz.getA()*raiz.getC()))/(2*raiz.getA());
         double r2 = (-(raiz.getB())- Math.sqrt((Math.pow(raiz.getB(),2))-4*raiz.getA()*raiz.getC()))/(2*raiz.getA());
         if (tieneRaices(raiz)){
             System.out.println("Las raices son:" + r1 + " y " + r2);
         }
     }
     
     public void obtenerRaiz(Raices raiz){
         double r = (-(raiz.getB()))/(2*raiz.getA());
         if (tieneRaiz(raiz)){
             System.out.println("La raiz es "+r);
         }
     }
     public void calcular(Raices raiz){
        if (tieneRaices(raiz)){
            obtenerRaices(raiz);
        } else if (tieneRaiz(raiz)){
            obtenerRaiz(raiz);
        } else {
            System.out.println("Con estos valores, la ecuacion no tiene raices. No hay solucion para mostrar.");
        }
     }
}
