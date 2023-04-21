/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class PersonaService {
  public Persona crearPersona(){
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
      Persona p = new Persona();
      System.out.println("Ingrese su nombre");
      p.setNombre(leer.nextLine());
      System.out.println("Su año de nacimiento");
      int aaaa = leer.nextInt()-1900;
      System.out.println("Ahora el mes");
      int mm = leer.nextInt()-1;
      System.out.println("Por ultimo, el día");
      int dd = leer.nextInt();
      Date fecha = new Date(aaaa,mm,dd);
      p.setfNac(fecha);
      return p;
  }  
  public int calcularEdad(Persona p){
        Date hoy = new Date();
        long edadMS = hoy.getTime()-p.getfNac().getTime(); // getTime trae la fecha reducida a milisegundos
        long edadSEG = edadMS/1000; //paso los ms a segundos
        int edad = (int) (edadSEG/(60*60*24*365)); //paso los segundos a años
        return edad;
  }
  public boolean menorQue(Persona p,int edad){
        return calcularEdad(p)<edad;
  }
  public String mostrarPersona(Persona p){
      return "Nombre: "+p.getNombre()+". Fecha de nacimiento: "+p.getfNac();
  }
  
}
