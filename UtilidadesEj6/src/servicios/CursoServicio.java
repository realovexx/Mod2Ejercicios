/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class CursoServicio {
   public void cargarAlumnos(Curso c){
        Scanner leer = new Scanner(System.in);
        String vector[] = new String[5];
        for(int i = 0 ; i < 5 ; i++){
        System.out.println("Ingrese el nombre de un alumno");
        vector[i] = leer.nextLine();
        }
        c.setAlumnos(vector);
    }
    
    public Curso crearCurso(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Curso c = new Curso();
        System.out.println("Ingresar el nombre del Curso");
        c.setNombreCurso(leer.nextLine());
        System.out.println("Ingresar cantidad de horas diarias");
        c.setCantidadHorasPorDia(leer.nextByte());
        System.out.println("Ingresar cantidad de dias semanales");
        c.setCantidadDiasPorSemana(leer.nextByte());
        System.out.println("Ingresar el precio por hora");
        c.setPrecioPorHora(leer.nextDouble());
        System.out.println("Ingrese el turno (M para mañana o T para tarde)");
        c.setTurno(leer.next());
        while (!c.getTurno().equalsIgnoreCase("m")&&!c.getTurno().equalsIgnoreCase("t")){
            System.out.println("Ingreso invalido, intentelo nuevamente");
            c.setTurno(leer.next());
        }
        System.out.println("A continuación, se ingresarán los nombres de los alumnos:");
        cargarAlumnos(c);
        return c;
    }
    public void calcularGananciaSemanal(Curso c){
        double ganancia = c.getCantidadHorasPorDia()*c.getCantidadDiasPorSemana()*c.getPrecioPorHora()*5;
        System.out.println("La ganancia semanal es de: $"+ganancia);
    }
    
    public String mostrarCurso(Curso c){
        return "El curso de "+c.getNombreCurso()+" ocupa "+c.getCantidadHorasPorDia()+" horas diarias, "
                +c.getCantidadDiasPorSemana()+" dias a la semana. El curso contiene 5 alumnos: "+c.getAlumnos()[0]+", "+c.getAlumnos()[1]+", "+c.getAlumnos()[2]+", "+c.getAlumnos()[3]+", y "+c.getAlumnos()[4]+".";
    }
}
