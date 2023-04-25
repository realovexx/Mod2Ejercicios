/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author OvExX
 */
public class Ahorcado {
    private String[] palabra;
    private byte encontradas;
    private byte jugadasMax;

    public Ahorcado() {
               
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public byte getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(byte encontradas) {
        this.encontradas = encontradas;
    }

    public byte getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(byte jugadasMax) {
        this.jugadasMax = jugadasMax;
    }
     
    
}
