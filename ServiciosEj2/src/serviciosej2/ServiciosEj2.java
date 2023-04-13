/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosej2;

import Entidad.Cafetera;
import Servicios.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class ServiciosEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CafeteraServicio serv = new CafeteraServicio();
        Cafetera cafe = new Cafetera(1000.0,0.0);
        int opc;
        do {
            System.out.println("Cafetera!");
            System.out.println("");
            System.out.println("Menu: ingrese la opcion deseada");
            System.out.println("");
            System.out.println("1. Llenar la cafetera");
            System.out.println("2. Servir una taza");
            System.out.println("3. Vaciar la cafetera");
            System.out.println("4. Agregar cafe");
            System.out.println("5. Salir");
            opc = leer.nextInt();
            while (opc<0 || opc > 5){
                System.out.println("Opcion invalida, intentelo nuevamente");
                opc = leer.nextInt();
            }
            switch  (opc){
                case 1: 
                    serv.llenarCafetera(cafe);
                break;
                case 2: 
                    serv.servirTaza(cafe);
                break;
                case 3:
                    serv.vaciarCafetera(cafe);
                break;
                case 4: 
                    serv.agregarCafe(cafe);
                break;
                default:
                    System.out.println("Saliendo...");
            }
        } while (opc != 5);
        
    }
    
}
