/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtraestctrl;

import java.util.Scanner;

/**
 *
 * @author ovexx
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*Una obra social tiene tres clases de socios:
○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento 
  en todos los tipos de tratamientos.
○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento 
  para los mismos tratamientos que los socios del tipo A.
○ Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre 
  dichos tratamientos.
○ Solicite una letra (carácter) que representa la clase de un socio, y luego 
  un valor real que represente el costo del tratamiento (previo al descuento) 
  y determine el importe en efectivo a pagar por dicho socio.*/

Scanner leer = new Scanner(System.in);
        System.out.println("Web Obra Social");
        System.out.println("ingrese e valor del procedimiento a pasar por webOS");
        int monto = leer.nextInt();
        System.out.println("Ahora ingrese su plan S.O.B.A. - webOS (A, B, o C)");
        String plan = leer.next();
        plan = plan.toUpperCase();
        while (!plan.equals("A")&&!plan.equals("B")&&!plan.equals("C")){
            System.out.println("Plan invalido, intentelo nuevamnte");
            plan = leer.next();
            plan = plan.toUpperCase();
        }
        switch (plan){
                case "A":
                System.out.println("El monto final de su procedimiento sera");
                System.out.println("de $"+(monto*0.5)+" tras un 50% de descuento");
                break;
                case "B":
                System.out.println("El monto final de su procedimiento sera");
                System.out.println("de $"+(monto*0.65)+" tras un 35% de descuento");
                break;
                case "C":
                System.out.println("El monto final de su procedimiento sera");
                System.out.println("de $"+monto+" ya que el plan no posee descuentos");
                break;
        }
    }
    
}
