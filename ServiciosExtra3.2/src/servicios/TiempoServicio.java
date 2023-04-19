/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.Tiempo;
import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class TiempoServicio {
    /*Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos constructores: un
constructor vacío y otro con la hora, minutos y segundos ingresado por el usuario. Deberá definir
además, los métodos getters y setters correspondientes, y el método imprimirHoraCompleta().
Recordar crear una validación sobre las horas, minutos y segundos ingresados por el usuario. Te
animas a simular el paso del tiempo en consola??????
*/
    public Tiempo crearHora(){
        Scanner leer = new Scanner(System.in);
        System.out.println("que hora es?");        
        int hora = leer.nextInt();
        while (hora<0 || hora>23){
            System.out.println("hora invalida, ingrese nuevamente");
            hora = leer.nextInt();
        }
        System.out.println("y los minutos?");
        int minutos = leer.nextInt();
        while (minutos<0 || minutos>59){
            System.out.println("ingreso invalido, ingrese nuevamente");
            minutos = leer.nextInt();
        }
        System.out.println("por ultimo, los segundos!");
        int segundos = leer.nextInt();
        while (segundos<0 || segundos>59){
            System.out.println("ingreso invalido, ingrese nuevamente");
            segundos = leer.nextInt();
        }
        return new Tiempo(hora,minutos,segundos);
    }
    
    public String imprimirHoraCompleta(Tiempo t){
        return "Son las: "+t.getHora()+":"+t.getMinutos()+":"+t.getSegundos()+".";
    }
    
    public void modificarHora(Tiempo t){
       Scanner leer = new Scanner(System.in);
        System.out.println("ingrese hora");        
        t.setHora(leer.nextInt());
        while (t.getHora()<0 || t.getHora()>23){
            System.out.println("hora invalida, ingrese nuevamente");
            t.setHora(leer.nextInt());
        }
        System.out.println("minutos");
       t.setMinutos(leer.nextInt());
        while (t.getMinutos()<0 || t.getMinutos()>59){
            System.out.println("ingreso invalido, ingrese nuevamente");
             t.setMinutos(leer.nextInt());
        }
        System.out.println("segundos");
        t.setSegundos(leer.nextInt());
        while (t.getSegundos()<0 || t.getSegundos()>59){
            System.out.println("ingreso invalido, ingrese nuevamente");
            t.setSegundos(leer.nextInt());
        } 
        System.out.println("Son las: "+t.getHora()+":"+t.getMinutos()+":"+t.getSegundos()+".");
    }
}
