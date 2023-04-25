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
public class AhoracadoService {
    public Ahorcado crearJuego(){
        Scanner leer = new Scanner(System.in);
        Ahorcado a = new Ahorcado();
        System.out.println("Ingrese la palabra secreta!");
        String palabraS = leer.next();
        String[] vector = new String[palabraS.length()];
        for (int i = 0 ; i < palabraS.length(); i++){
            vector[i] = palabraS.substring(i,i+1);
        }
        System.out.println("Ahora ingrese el numero de intentos");
        a.setJugadasMax(leer.nextByte());
        return a;
    }
    public String longitud(Ahorcado a){
    return "La palabra tiene "+a.getPalabra().length+" caracteres.";    
    }
    public void buscar(Ahorcado a){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra a buscar");
        String letra = leer.next();
        int cont = 0;
        for (int i = 0 ; i < a.getPalabra().length ; i++){
            if (a.getPalabra()[i] == letra){
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
    public void encontradas(Ahorcado a){
              Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra a buscar");
        String letra = leer.next();
        int cont = 0;
        boolean encontrada;
        for (int i = 0 ; i < a.getPalabra().length ; i++){
            if (a.getPalabra()[i] == letra){
                cont++;
            }
        }
        if (cont==0){
            System.out.println("La letra no pertenece a la palabra");
            encontrada = false;
            
            
        }else{
            System.out.println("La letra pertenece a la palabra");
            System.out.println("La letra se encuentra "+cont+" veces");
            encontrada = true;
        }
        if encontrada = false
    }
    public void intentos(Ahorcado a){
        System.out.println("Numero de oportunidades restantes: "+a.getJugadasMax());
    }
}
