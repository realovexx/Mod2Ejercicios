/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.Fraccion;
import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class FraccionServicios {
    /*Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
*/
    
    public Fraccion crearFraccion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numerador de la primera fraccion, y luego el denominador");
        int numerador1 = leer.nextInt();
        int denominador1 = leer.nextInt();
        System.out.println("Ahora ingrese el numerador de la segunda fraccion, y luego el denominador");
        int numerador2 = leer.nextInt();
        int denominador2 = leer.nextInt();
        System.out.println("Las fracciones son: "+numerador1+"/"+denominador1+" y "+numerador2+"/"+denominador2+".");
        return new Fraccion(numerador1, numerador2, denominador1, denominador2);      
    }
    
     public String suma(Fraccion f){
       if (f.getDenominador1() == 0 || f.getDenominador2() == 0){
           return "No se puede fraccionar en cero, la suma es indefinida";
       }else if(f.getDenominador1() == f.getDenominador2()){
           return "La suma da "+(f.getNumerador1()+f.getNumerador2())+"/"+f.getDenominador1();
       }else{
         return "La suma da "+((f.getNumerador1()*f.getDenominador2())+(f.getNumerador2()*f.getDenominador1()))+"/"+(f.getDenominador1()*f.getDenominador2());  
       }
    }
    
     public String resta(Fraccion f){
       if (f.getDenominador1() == 0 || f.getDenominador2() == 0){
           return "No se puede fraccionar en cero, la resta es indefinida";
       }else if(f.getDenominador1() == f.getDenominador2()){
           return "La resta da "+(f.getNumerador1()-f.getNumerador2())+"/"+f.getDenominador1();
       }else{
         return "La resta da "+((f.getNumerador1()*f.getDenominador2())-(f.getNumerador2()*f.getDenominador1()))+"/"+(f.getDenominador1()*f.getDenominador2());  
       }
    }
     
     public String multiplicacion(Fraccion f){
        if (f.getDenominador1() == 0 || f.getDenominador2() == 0){
           return "No se puede fraccionar en cero, la multiplicacion es indefinida";
       }else{
            return "La multiplicacion da "+(f.getNumerador1()*f.getNumerador2())+"/"+(f.getDenominador1()*f.getDenominador2());
        }
     }
     
     public String division(Fraccion f){
         if (f.getDenominador1() == 0 || f.getDenominador2() == 0){
           return "No se puede fraccionar en cero, la division es indefinida";
       }else{
            return "La division da "+(f.getNumerador1()*f.getDenominador2())+"/"+(f.getDenominador1()*f.getNumerador2());
        } 
     }
     
     public void menu(Fraccion f){
         int opc = 0;
         do{
         Scanner leer = new Scanner(System.in);
         System.out.println("");
         System.out.println("Menu");
         System.out.println("");
         System.out.println("Seleccione la opcion deseada");
         System.out.println("");
         System.out.println("1. Suma");
         System.out.println("2. Resta");
         System.out.println("3. Multiplicacion");
         System.out.println("4. Division");
         System.out.println("5. Salir");
         System.out.println("");
         opc = leer.nextInt();
         while (opc<1 || opc>5){
             System.out.println("Ingreso invalido, intentelo nuevamente");
             opc = leer.nextInt();
         }
         switch (opc){
             case 1:
                 System.out.println(suma(f));
                 break;
             case 2:
                 System.out.println(resta(f));
                 break;
             case 3:
                 System.out.println(multiplicacion(f));
                 break;
             case 4:
                 System.out.println(division(f));
                 break;
             default:
                 System.out.println("Saliendo...");
         }
         }while (opc != 5);
     }
}
