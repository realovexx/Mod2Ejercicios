/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtrasarreglos;

import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*Los profesores del curso de programación de Egg necesitan llevar un
registro de las notas adquiridas por sus 10 alumnos para luego obtener
una cantidad de aprobados y desaprobados. Durante el período de
cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos
evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el
arreglo. Al final del programa los profesores necesitan obtener por
pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta
que solo aprueban los alumnos con promedio mayor o igual al 7 de sus
notas del curso.*/
Scanner leer = new Scanner(System.in);
        System.out.println("Registro de calificaciones");
        System.out.println("Ingrese a continuacion");
        int calificaciones [][] = new int [10][5];
        for (int i = 0 ; i < 10 ; i++){
            System.out.println("Para el alumno "+(i+1)+" la nota de:");
            System.out.println("Primer trabajo practico");
            calificaciones[i][0] = leer.nextInt();
            System.out.println("Segundo trabajo practici");
            calificaciones[i][1] = leer.nextInt();
            System.out.println("Primer integrador");
            calificaciones[i][2] = leer.nextInt();
            System.out.println("Segundo integrador");
            calificaciones[i][3] = leer.nextInt();
            /*for (int l = 0 ; l < 4 ; l++){
            calificaciones[i][l] = (int)(Math.random()*10);   
        }*/                                                     //Para llenar automaticamente la matriz
        }
        for (int j = 0 ; j < 10 ; j++){
            calificaciones[j][4] = (calificaciones[j][0]+calificaciones[j][1]+calificaciones[j][2]+calificaciones[j][3])/4;
        }
        int aprobados = 0;
        int reprobados = 0;
        
        for (int k = 0 ; k < 10 ; k++){
            if (calificaciones [k][4] >= 7) {
                aprobados++;
            }else{
                reprobados++;
            }
        }
        System.out.println("");
        System.out.println("Reporte:");
        System.out.println("");
        System.out.println("Alumnos aprobado: "+aprobados);
        System.out.println("Alumnos reprobados: "+reprobados);
        
      /*  for (int m=0 ; m < 10 ; m++){
            for (int n=0 ; n<5 ; n++){
                System.out.print("["+calificaciones[m][n]+"]");  // Para mostrar la matriz llena y corroborar resultados
            }
            System.out.println("");
        }*/
        
    }
    
}
