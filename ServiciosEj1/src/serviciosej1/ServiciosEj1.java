/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosej1;

import Entidad.CuentaBancaria;
import Servicios.CuentaBancariaServicio;
import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class ServiciosEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancariaServicio serv = new CuentaBancariaServicio();
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido! Antes de operar, es necesario crear su cuenta");
        CuentaBancaria nuevaCuenta = serv.crearCuenta();
        int opt = 0;
        do {
            System.out.println("Menu principal");
            System.out.println("Seleccione la opcion correspondiente");
            System.out.println("");
            System.out.println("1. Ingresar Dinero");
            System.out.println("2. Retirar Dinero");
            System.out.println("3. Extraccion Rapida");
            System.out.println("4. Consultar Saldo");
            System.out.println("5. Consultar Datos");
            System.out.println("6. Salir");
            opt = leer.nextInt();
            
            while (opt<1 || opt>6){
                System.out.println("Opción invalida, intentelo nuevamente");
                opt = leer.nextInt();
               
            }
            switch(opt){
                case 1:
                    serv.ingresar(nuevaCuenta);
                break;
                case 2:
                    serv.retirar(nuevaCuenta);
                break;
                case 3:
                    serv.extraccionRapida(nuevaCuenta);
                break;
                case 4:
                    System.out.println(serv.consultarSaldo(nuevaCuenta));
                break;
                case 5:
                    System.out.println(serv.consultarDatos(nuevaCuenta));
                break;
                default:
                    System.out.println("Saliendo...");
            }
        } while (opt != 6);

   
    }

}
