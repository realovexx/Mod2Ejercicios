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
public class Operacion {

    private int numero1;
    private int numero2;

    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        setNumero1(leer.nextInt());
        System.out.println("Ahora ingrese el segundo numero");
        setNumero2(leer.nextInt());
    }
    
    public int sumar(){
        int resultado = getNumero1()+getNumero2();
        return resultado;
    }
    
    public int restar(){
        int resultado = getNumero1()-getNumero2();
        return resultado;
    }
    
    public int multiplicar(){
        int resultado = getNumero1()*getNumero2();
        return resultado;
    }
    
    public double dividir(){
        double resultado;
        if (getNumero2()==0){
            System.out.println("Error: No se puede dividir por Cero");
            resultado = 0;
        }else{
            resultado = (double)(getNumero1()/getNumero2());
        }
        return resultado;
    }
}
