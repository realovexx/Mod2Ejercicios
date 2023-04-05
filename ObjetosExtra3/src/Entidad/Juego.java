/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class Juego {
 private int numP1;
 private int numP2;

    public Juego() {
    }

    public Juego(int numP1, int numP2) {
        this.numP1 = numP1;
        this.numP2 = numP2;
    }

    public int getNumP1() {
        return numP1;
    }

    public void setNumP1(int numP1) {
        this.numP1 = numP1;
    }

    public int getNumP2() {
        return numP2;
    }

    public void setNumP2(int numP2) {
        this.numP2 = numP2;
    }
 
    public void iniciar_juego(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenidos!");
        System.out.println("");
        System.out.println("A continuacion, Jugador 1 ingresa un numero secreto!");
        setNumP1(leer.nextInt());
        System.out.println("");
        System.out.println("Perfecto! ahora, Jugador 2 deberá adivinar ese numero!");
        System.out.println("Comencemos...");
        int contador = 0;
        do {
            System.out.println("Jugador 2, adivina el numero!");
            setNumP2(leer.nextInt());
            if (getNumP1()==getNumP2()){
                contador++;
                System.out.println("Correcto!, adivinaste en "+contador+" intentos!");
                break;
            }else if (getNumP1()<getNumP2()){
                contador++;
                System.out.println("Incorrecto... es un poco mas abajo!");
            }else{
                contador++;
                System.out.println("Incorrecto... es un poco mas arriba!");
            }
        } while (contador<3);
        if (contador>=3){
            System.out.println("Se han acabado los intentos!");
            System.out.println("Lo siento, Jugador 2, has perdido...");
        }
    }
}
