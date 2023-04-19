/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosextra2.pkg2;

import entidad.Estudiante;
import servicios.EstudianteServicio;

/**
 *
 * @author OvExX
 */
public class ServiciosExtra22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EstudianteServicio ES = new EstudianteServicio();
        Estudiante pibe = ES.crearEstudiante();
        System.out.println(ES.mostrarEstudiante(pibe));
        ES.checkAprobado(pibe);
    }
    
}
