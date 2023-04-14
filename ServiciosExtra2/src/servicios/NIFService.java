/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class NIFService {
    public NIF crearNif(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Se creará su NIF");
        System.out.println("Ingrese su numero de DNI");
        long dni = leer.nextLong();
        String[] letras = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        int pos = (int) dni%23;
        String letra = letras[pos];
        return new NIF(dni,letra);
    }
    public String mostrar(NIF verif){
        return "NIF: "+verif.getDni()+"-"+verif.getLetra();
    }
    
}
