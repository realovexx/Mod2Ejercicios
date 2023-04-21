/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidadesej1;

import entidad.Cadena;
import servicio.CadenaServicio;

/**
 *
 * @author OvExX
 */
public class UtilidadesEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CadenaServicio cs = new CadenaServicio();
        Cadena frase = new Cadena("casa blanca");
        cs.mostrarVocales(frase);
        System.out.println(cs.invertirFrase(frase));
        cs.vecesRepetido(frase);
        cs.compararLongitud(frase);
        cs.unirFrases(frase);
        cs.reemplazar(frase);
        System.out.println("La frase contiene esa letra? :"+cs.contiene(frase));
    }
    
}
