/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejarreglos;

/**
 *
 * @author OvExX
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
A se denota por B y se obtiene cambiando sus filas por columnas (o
viceversa).
         */
        System.out.println("Se generara automaticamente una matriz de 4x4");
        int[][] matriz = new int[4][4];
        int[][] matrizT = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int k = 0; k < 4; k++) {
            for (int l = 0; l < 4; l++) {
                matrizT[k][l] = matriz[l][k];
            }
        }

        System.out.println("A continuacion, se mostrara la matriz original, seguida de su traspuesta");
        System.out.println("");
        for (int m = 0; m < 4; m++) {
            for (int n = 0; n < 4; n++) {
                System.out.print("[" + matriz[m][n] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int o = 0; o < 4; o++) {
            for (int p = 0; p < 4; p++) {
                System.out.print("[" + matrizT[o][p] + "]");
            }
            System.out.println("");
        }
    }

}
