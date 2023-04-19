/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.Estudiante;
import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class EstudianteServicio {
    public Estudiante crearEstudiante(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre del estudiante");
        String nombre = leer.nextLine();
        System.out.println("Ingrese la edad del estudiante");
        int edad = leer.nextInt();
        System.out.println("Por ultimo, su nota promedio");
        double nota = leer.nextDouble();
        return new Estudiante(nombre, edad, nota);
    }
    
    public String mostrarEstudiante(Estudiante e){
        return "Nombre: "+e.getNombre()+". Edad: "+e.getEdad()+". Nota promedio: "+e.getNota();
    }
    
    public void checkAprobado(Estudiante e){
        if (e.getNota()>=7){
            System.out.println("El estudiante "+e.getNombre()+" ha aprobado.");
        }else{
            System.out.println("El estudiante "+e.getNombre()+" ha reprobado.");
        }
    }
}
