/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Cadena;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class CadenaServicio {
    public void mostrarVocales(Cadena c){
       int vocal = 0;
       /*  for (int i = 0; i < obj.getLongitud(); i++) {
            switch (obj.getFrase().substring(i, i+1).toLowerCase()){
                case "a": case"e": case"i": case"o": case"u": 
                    vocal++; 
                    break;
            }
        }*/
        for (int j = 0 ; j < c.getLongitud() ; j++){
            if (c.getFrase().substring(j,j+1).equalsIgnoreCase("a")||c.getFrase().substring(j,j+1).equalsIgnoreCase("e")||c.getFrase().substring(j,j+1).equalsIgnoreCase("i")||c.getFrase().substring(j,j+1).equalsIgnoreCase("o")||c.getFrase().substring(j,j+1).equalsIgnoreCase("u")){
                vocal++;
            }
        }
        System.out.println("La frase tiene "+vocal+" vocales.");
    }
    
    public String invertirFrase(Cadena c){
        String[] fraseInv = new String[c.getLongitud()];
        String frase = "";
        /*        for (int i = c.frase.length() - 1; i >= 0; i--) {
            frase += c.getFrase().charAt(i);
        }*/
        for (int i=0;i<c.getLongitud();i++){
            fraseInv[i] = c.getFrase().substring(c.getLongitud()-i-1,c.getLongitud()-i);
        }
        for (int i=0;i<c.getLongitud();i++){
          frase = frase.concat(fraseInv[i]);  
        }
        return frase;
    }
    
    public void vecesRepetido(Cadena c){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un caracter, veremos cuantas veces se repite en la frase.");
        String letra = leer.next();
        while (letra.length()>1){
            System.out.println("Ingreso invalido, ingrese un solo caracter");
            letra = leer.next();
        }
        int cont = 0;
        for (int i = 0 ; i < c.getLongitud() ; i++){
            if (c.getFrase().substring(i,i+1).equalsIgnoreCase(letra)){
                cont++;
            }
        }
        System.out.println("El caracter '"+letra+"' aparece "+cont+" veces.");
    }
    
    public void compararLongitud(Cadena c){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una nueva frase, la compararemos con la anterior");
        String frase2 = leer.nextLine();
        int comp = c.getFrase().compareTo(frase2);
        if(comp>0){
            System.out.println("La frase original es mas larga");
        }else if (comp==0){
            System.out.println("Las frases tienen longitudes iguales");
        }else{
            System.out.println("La nueva frase es mas larga");
        }
    }
    public void unirFrases(Cadena c){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una nueva frase para agregar a la anterior");
        String frase2 = leer.next();
        c.setFrase(c.getFrase().concat(frase2));
        System.out.println("quedó: "+c.getFrase());
        
    }
    
    public void reemplazar(Cadena c){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un nuevo caracter para reemplazar todas las a");
        System.out.println("Quedó: "+c.getFrase().replace("a", leer.next()));
    }
    
    public boolean contiene(Cadena c){
        System.out.println("Ingrese un caracter, veremos si la frase lo contiene");
        Scanner leer = new Scanner(System.in);
        String letra = leer.next();
        while (letra.length()>1){
            System.out.println("Ingreso invalido, ingrese un solo caracter");
            letra = leer.next();
        }
        return c.getFrase().contains(letra);
    }
    
}
