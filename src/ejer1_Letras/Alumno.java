/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer1_Letras;

import java.util.Scanner;

/**
 *
 * @author ANDRES GARCES
 */
public class Alumno {

    //Declaro la Matriz
    String letras[][] = new String[4][2];

    Scanner scan = new Scanner(System.in);

    //Método para guardar las Letras
    void guardarLetras() {
        String Letra_1, Letra_2;
        System.out.println("Guardando 1 y 2 Letras para 4 Alumnos");
        for (int i = 0; i < letras.length; i++) {

            //Pido las Letras
            System.out.println("****ALUMNO****");
            System.out.println("Letra 1: ");
            Letra_1 = scan.nextLine();
            System.out.println("Letra 2: ");
            Letra_2 = scan.nextLine();

            //La guardó en la Matriz
            letras[i][0] = Letra_1;
            letras[i][1] = Letra_2;
        }
        System.out.println("Letras Guardadas!");
    }

    //Método para mostrar las Letras
    void mostrarLetras() {
        System.out.println("""           
                           ALUMNOS
                           Letra 1 / Letra 2""");
        for (int i = 0; i < letras.length; i++) {
            System.out.println(letras[i][0] + " / " + letras[i][1]);
        }
    }
}
