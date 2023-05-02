/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Estudiante;
import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class EstudianteServicio {
   public Estudiante[] crearCurso(){
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
     Estudiante vectorE[] = new Estudiante[8];
     for (int i = 0 ; i < vectorE.length ; i++){
         vectorE[i] = new Estudiante();
         System.out.println("Ingrese el nombre del/la estudiante "+(i+1));
         vectorE[i].setNombre(leer.nextLine());
         System.out.println("Ahora ingrese la nota de su final (0.0-100.0)");
         double nota = Double.parseDouble(leer.nextLine()); //uso parseDouble() para evitar conflicto de Scanners. Leo como string, pero lo convierto a double para ingresarlo en nota.
         vectorE[i].setNota(nota);
     }
     return vectorE;
   } 
   
   public double calcAVG(Estudiante[] v){
     double suma = 0;
     for (int i = 0 ; i < v.length ; i ++){
         suma += v[i].getNota();
     }
     return suma/v.length; 
   }
   
   public String showAVG(Estudiante[] v){
       return "El promedio del curso es: "+calcAVG(v);
   }
   
   public String[] stOverAVG(Estudiante[] v){
       String vectorOA[] = new String[8];
       for (int i = 0 ; i < v.length ; i++){
           if (v[i].getNota()>calcAVG(v)){
               vectorOA[i] = v[i].getNombre();
           }
       }
       return vectorOA;
   }
   public void showOverAVG(Estudiante[] v){
       String oa[] = stOverAVG(v);
       System.out.print("Estudiantes con nota final por encima del promedio: ");
       for (int i = 0 ; i < oa.length ; i++){
           if (oa[i]!=null){
               System.out.print(oa[i]+", ");
           }
       }
       System.out.println("");
   }
}
