/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class Rectangulo {
   private int base;
   private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
   
   public void crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la base");
        setBase(leer.nextInt());
        System.out.println("Ahora ingrese el tamaño de la altura");
        setAltura(leer.nextInt());
    }
   
   public int superficie(){
       int resultado = getBase()*getAltura();
       return resultado;
   }
   
   public int perimetro(){
       int resultado = (getBase()+getAltura())*2;
       return resultado;
   }
   
   public void dibujarRectangulo(){
       for (int i = 0 ; i < getAltura() ; i++){
           for (int j = 0 ; j < getBase() ; j++){
               if ( i==0 || j==0 || i==(getAltura()-1) || (j==getBase()-1) ){
                   System.out.print(" * "); 
               }else{ 
                   System.out.print("   ");
               }
           }
           System.out.println("");
       }
   }
   
   @Override
   public String toString(){
       return "La superficie del rectangulo da "+superficie()+", y el perimetro es "+perimetro();
   }
}
