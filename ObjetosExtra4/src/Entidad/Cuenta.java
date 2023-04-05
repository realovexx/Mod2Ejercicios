/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro.
 * @author OvExX
 */
public class Cuenta {
    private double saldo;
    private String titular;
        
    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public void retirar_dinero(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola "+getTitular()+"!");
        System.out.println("El saldo actual es de $"+getSaldo());
        System.out.println("Ingrese el monto a retirar");
        double retiro = leer.nextDouble();
        while (getSaldo()<retiro){
            System.out.println("fondos insuficientes, ingrese un nuevo monto");
            retiro = leer.nextDouble();
        }
        setSaldo(getSaldo()-retiro);
        System.out.println("Retiro completo.");
        System.out.println(getTitular()+", su saldo actual es de $"+getSaldo());
    }
    
}
