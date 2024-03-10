/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer3_Diagonal;

/**
 *
 * @author ANDRES GARCES
 */
public class Diagonal_Principal {

    //Declaro la Matriz
    int num[][] = new int[3][3];

    //Método para Colocar los 0 y 1
    void agregarNúmeros() {
        for (int i = 0; i < num.length; i++) {

            //Fila 0
            num[0][0] = 1;
            num[0][1] = 0;
            num[0][2] = 0;

            //Fila 1
            num[1][0] = 0;
            num[1][1] = 1;
            num[1][2] = 0;

            //Fila 2
            num[2][0] = 0;
            num[2][1] = 0;
            num[2][2] = 1;
        }
    }

    //Método para Mostrar la Matriz
    void mostrar() {
        for (int i = 0; i < num.length; i++) {
            System.out.println("_____________");
            System.out.println("| " + num[i][0] + " | " + num[i][1] + " | " + num[i][2] + " |");
        }
        System.out.println("_____________");
        System.out.println("La Diagonal Principal son los 1");
    }
}
