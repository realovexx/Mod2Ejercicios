/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integradormod2;

import entidades.Estudiante;
import servicios.EstudianteServicio;

/**
 *
 * @author OvExX
 */
public class IntegradorMod2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EstudianteServicio es = new EstudianteServicio();
        Estudiante[] vEstudiantes = es.crearCurso();
        System.out.println(es.showAVG(vEstudiantes));
        es.showOverAVG(vEstudiantes);
    }
    
}
