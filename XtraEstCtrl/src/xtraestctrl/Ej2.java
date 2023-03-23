/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtraestctrl;

/**
 *
 * @author ovexx
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un 
      valor diferente a cada una. A continuación, realizar las instrucciones 
      necesarias para que: B tome el valor de C, C tome el valor de A, A 
      tome el valor de D y D tome el valor de B. Mostrar los valores iniciales 
      y los valores finales de cada variable. Utilizar sólo una variable 
      auxiliar.*/
    
     int a = 1;
     int b = 2;
     int c = 3;
     int d = 4;
     int aux;
     
        System.out.println("La variable A es "+a+", la variable B es "+b+" la");
        System.out.println("variable C es "+c+" y la variable D es "+d);
        
     aux = b;
     b = c;
     c = a;
     a = d;
     d = aux;
     
        System.out.println("Ahora las variables han sido movidas, la siguiente");
        System.out.println("sentencia esta copiada de la anteior");
        System.out.println("");
        System.out.println("La variable A es "+a+", la variable B es "+b+" la");
        System.out.println("variable C es "+c+" y la variable D es "+d);
        
    }
    
}
