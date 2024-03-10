/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 * Realice un programa para guardar las notas del I y II cohorte para tres
 * estudiantes de un curso. Luego mostrarlas por pantalla
 *
 * @author ANDRES GARCES
 */
public class Estudiante {

    //Declaro la Matriz
    double notas[][] = new double[3][2];

    Scanner scan = new Scanner(System.in);

    //Método para guardar las Notas
    void guardarNotas() {
        double nota1, nota2;
        System.out.println("GUARDANDO I y II NOTA DE 3 ESTUDIANTES");
        for (int i = 0; i < notas.length; i++) {

            //Pido las Notas
            System.out.println("******ESTUDIANTE ");
            System.out.println("Nota 1: ");
            nota1 = scan.nextDouble();
            System.out.println("Nota 2: ");
            nota2 = scan.nextDouble();

            //Las guardó en la Matriz
            //Note que le fila la maneja la variable i
            notas[i][0] = nota1;
            notas[i][1] = nota2;
        }
        System.out.println("DATOS GUARDADOS!");
    }

    //Método para Mostrar las Notas
    void mostrarNotas() {
        System.out.println("""
                           --------------------
                           ESTUDIANTES
                           NOTA 1 / NOTA 2""");

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i][0] + " / " + notas[i][1]);
        }
    }
    
    void menu() {
        int opcion = 0;
        do {
            System.out.println("""
                               ****MENU DE OPCIONES****
                               **GESTION DE NOTAS**
                               
                               1. Guardar Notas
                               2. Mostrar Notas
                               3. Salir
                               
                               Opcion:""");
            opcion = scan.nextInt();
            switch(opcion) {
                case 1:
                    this.guardarNotas();
                    break;
                case 2:
                    this.mostrarNotas();
                    break;
            }
        } while(opcion > 0 && opcion < 3);
    }
}
