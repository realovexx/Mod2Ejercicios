/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class AhorcadoService {
    public Ahorcado crearJuego(){
        Scanner leer = new Scanner(System.in);
        Ahorcado a = new Ahorcado();
        System.out.println("Ingrese la palabra secreta!");
        String palabraS = leer.next();
        String[] vector = new String[palabraS.length()];
        for (int i = 0 ; i < palabraS.length(); i++){
            vector[i] = palabraS.substring(i,i+1);
        }
        a.setPalabra(vector);
        System.out.println("Ahora ingrese el numero de intentos");
        a.setJugadasMax(leer.nextByte());
        return a;
    }
    public String longitud(Ahorcado a){
    return "La palabra tiene "+a.getPalabra().length+" caracteres."; 
    }
    public void buscar(Ahorcado a, String letra){
        int cont = 0;
        for (int i = 0 ; i < a.getPalabra().length ; i++){
            if (a.getPalabra()[i].equalsIgnoreCase(letra)){
                a.setEncontradas((byte) (a.getEncontradas()+1));
                cont++;
            }
        }
        if (cont==0){
            System.out.println("La letra no pertenece a la palabra");
        }else{
            System.out.println("La letra pertenece a la palabra");
            System.out.println("La letra se encuentra "+cont+" veces");
        }
    }
    public boolean encontradas(Ahorcado a, String letra){

        System.out.println(longitud(a));
        int faltantes = a.getPalabra().length;
        boolean encontrada = false;
        for (int i = 0 ; i < a.getPalabra().length ; i++){
            if (a.getPalabra()[i].equalsIgnoreCase(letra)){
                encontrada = true;
            }
        }
        
        if (!encontrada){ 
        a.setJugadasMax((byte) (a.getJugadasMax()-1));
        }
        System.out.println("Numero de letras (encontradas, faltantes): ("+a.getEncontradas()+" , "+(a.getPalabra().length-a.getEncontradas())+")");
       return encontrada;
    }
    public void intentos(Ahorcado a){
        if (a.getJugadasMax()>0){
        System.out.println("Numero de oportunidades restantes: "+a.getJugadasMax());
        }else{
            System.out.println("Lo sentimos, no hay mas oportunidades.");
        }
    }
    public void juego(){
         Scanner leer = new Scanner(System.in);
        Ahorcado a = crearJuego();
        String letra;
   while(a.getJugadasMax()>0&&a.getEncontradas()<a.getPalabra().length){
             System.out.println("ingrese una letra");
             letra = leer.nextLine();
             longitud(a);
             buscar(a, letra);
             encontradas(a, letra);
             intentos(a);
    }
            if(a.getEncontradas()==a.getPalabra().length){
             System.out.println("ganaste!!!");
         }else{
             System.out.println("perdiste.");
         }
    }
}
