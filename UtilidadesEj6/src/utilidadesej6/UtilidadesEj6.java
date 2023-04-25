/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidadesej6;

import entidades.Curso;
import servicios.CursoServicio;

/**
 *
 * @author OvExX
 */
public class UtilidadesEj6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 CursoServicio cs = new CursoServicio();
 Curso c = cs.crearCurso();
 cs.calcularGananciaSemanal(c);
        System.out.println(cs.mostrarCurso(c));
    }
    
}
