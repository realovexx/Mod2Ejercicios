/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejestructurascontrol;

import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
       /*Realizar un programa que simule el funcionamiento de
        un dispositivo RS232, este tipo de dispositivo lee cadenas 
        enviadas por el usuario. Las cadenas deben llegar con un 
        formato fijo: tienen que ser de un máximo de 5 caracteres 
        de largo, el primer carácter tiene que ser X y el último 
        tiene que ser una O.
        Las secuencias leídas que respeten el formato se consideran 
        correctas, la secuencia especial “&&&&&” marca el final de los 
        envíos (llamémosla FDE), y toda secuencia distinta de FDE, que 
        no respete el formato se considera incorrecta.
        Al finalizar el proceso, se imprime un informe indicando la 
        cantidad de lecturas correctas e incorrectas recibidas. Para 
        resolver el ejercicio deberá investigar cómo se utilizan las 
        siguientes funciones de Java Substring(), Length(), equals()*/ 

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cadena apta RS232, o FDE para salir.");
        String cadena = leer.nextLine();
        int largo;
        int contadorC = 0;
        int contadorI = 0;
              
        do {
            largo = cadena.length();

            if (cadena.length() == 5 && cadena.substring(0,1).equals("X") && cadena.substring(largo-1,largo).equals("O"))
            {
                System.out.println("Cadena Correcta");
                contadorC++;                
            }
            else if (!cadena.equals("&&&&&"))
                    {
                System.out.println("Cadena Incorrecta");
                contadorI++;
            }
            
            System.out.println("Ingrese una nueva cadena");
            cadena = leer.nextLine();
        } while (!cadena.equals("&&&&&"));
        
               System.out.println("Proceso terminado.");
               System.out.println("");
               System.out.println("Reporte:");
               System.out.println("______________________________");
               System.out.println("");
               System.out.println("Ingresos correctos: "+contadorC);
               System.out.println("");
               System.out.println("Ingresos incorrectos: "+contadorI);
               System.out.println("");
               System.out.println("______________________________");
               System.out.println("");
               System.out.println("Saliendo...");
        
}
}
