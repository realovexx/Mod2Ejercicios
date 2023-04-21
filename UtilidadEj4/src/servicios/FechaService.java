/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class FechaService {
    public Date fechaNacimiento(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese su año de nacimiento");
        int aaaa = leer.nextInt();
        System.out.println("Ahora el mes");
        int mm = leer.nextInt();
        System.out.println("Por ultimo, el día");
        int dd = leer.nextInt();        
       return new Date(aaaa-1900,mm-1,dd); 
    }
    public Date fechaActual(){
        return new Date();
    }
    public int diferencia(Date hoy, Date nac){
        long edadMS = hoy.getTime()-nac.getTime(); // getTime trae la fecha reducida a milisegundos
        long edadSEG = edadMS/1000; //paso los ms a segundos
        int edad = (int) (edadSEG/(60*60*24*365)); //paso los segundos a años
        return edad;
    }
}
