/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class CuentaBancariaServicio {

    private Scanner leer = new Scanner(System.in);//.useDelimiter("\n");

    public CuentaBancaria crearCuenta() {
        System.out.println("A continuación, ingrese sus datos");
        System.out.println("Ingrese su numero de cuenta");
        int numeroCuenta = leer.nextInt();
        System.out.println("Ingrese su numero de DNI");
        long dniCliente = leer.nextLong();
        System.out.println("Por ultimo, ingrese el saldo inicial a depositar");
        double saldoActual = leer.nextDouble();
        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
    }

    public void ingresar(CuentaBancaria cuenta) {
        double saldo = cuenta.getSaldoActual();
        System.out.println("Su saldo actual es de $" + saldo);
        System.out.println("Ingrese el monto a depositar");
        double ingreso = leer.nextDouble();
        saldo = saldo + ingreso;
        cuenta.setSaldoActual(saldo);
        System.out.println("Deposito exitoso");
        System.out.println("Su saldo actual es de $" + saldo);
    }

    public void retirar(CuentaBancaria cuenta) {
        System.out.println("Su saldo actual es de $" + cuenta.getSaldoActual());
        System.out.println("Ingrese el monto a retirar");
        double retiro = leer.nextDouble();
        if (retiro > cuenta.getSaldoActual()) {
            System.out.println("Fondos insuficientes, se retirará el remanente");
            System.out.println("Ha retirado $" + cuenta.getSaldoActual());
            cuenta.setSaldoActual(0.0);
            System.out.println("Su saldo actual es de " + cuenta.getSaldoActual());
        } else {
            System.out.println("Ha retirado $" + retiro);
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
            System.out.println("Su saldo actual es de $" + cuenta.getSaldoActual());
        }
    }

    public void extraccionRapida(CuentaBancaria cuenta) {
        System.out.println("Ingrese el monto a retirar");
        double retiro = leer.nextDouble();
        while (retiro > cuenta.getSaldoActual() * 0.2) {
            System.out.println("Puede retirar HASTA el 20% del saldo actual");
            System.out.println("Ingrese otro monto");
            retiro = leer.nextDouble();
        }
        System.out.println("Ha retirado $" + retiro);
        cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
        System.out.println("Su saldo actual es de $"+cuenta.getSaldoActual());
    }
    
    public String consultarSaldo(CuentaBancaria cuenta){
        return "Su saldo actual es de $"+cuenta.getSaldoActual();
    }
    
    public String consultarDatos(CuentaBancaria cuenta){
        return "La cuenta "+cuenta.getNumeroCuenta()+", perteneciente al cliente"
                + "con DNI "+cuenta.getDniCliente()+" posee un saldo de $"+cuenta.getSaldoActual();
    }
}
