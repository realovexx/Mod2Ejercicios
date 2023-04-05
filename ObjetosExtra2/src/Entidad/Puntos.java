/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class Puntos {
  private int x1;
  private int y1;
  private int x2;
  private int y2;

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

public void crearPuntos(){
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese las cordenadas X e Y del primer punto, en ese orden");
    setX1(leer.nextInt());
    setY1(leer.nextInt());
    System.out.println("Ahora, ingrese las cordenadas X e Y del segundo punto.");
    setX2(leer.nextInt());
    setY2(leer.nextInt());
}

public double distancia(){
   double dist = (double) sqrt(((Math.pow((getX2()-getX1()),2))+(Math.pow((getY2()-getY1()),2))));
   return dist;
   }

  @Override
  public String toString(){
    return "La distancia entre punto 1 y punto 2 es de "+distancia();
}
}
