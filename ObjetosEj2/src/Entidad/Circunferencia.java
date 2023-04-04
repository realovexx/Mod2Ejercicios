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
public class Circunferencia {
    private double radio;
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    public Circunferencia() {
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public void crearCircunferencia(){
        System.out.println("Ingrese el radio");
        Scanner leer = new Scanner (System.in);
        setRadio(leer.nextDouble());
    }
    public double Area(double radio){
        double pi = Math.PI;
        double area = Math.pow(pi*radio,2);
        return area;
    }
    public double Perimetro(double radio){
        double pi = Math.PI;
        double perimetro = 2*pi*radio;
        return perimetro;
    }
}
