/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer2_Notas;

import java.util.Scanner;

/**
 *
 * @author ANDRES GARCES
 */
public class Pupilo {

    //Declaro la Matriz
    double notas[][] = new double[3][2];

    Scanner scan = new Scanner(System.in);

    //Método para guardar las Notas
    void guardarNotas() {
        double Nota_1, Nota_2;
        System.out.println("Guardando 1 y 2 Notas de 3 Estudiantes");
        for (int i = 0; i < notas.length; i++) {

            //Pido las Notas
            System.out.println("****PUPILO****");
            System.out.println("Nota 1: ");
            Nota_1 = scan.nextDouble();
            System.out.println("Nota 2: ");
            Nota_2 = scan.nextDouble();

            //La guardó en la Matriz
            notas[i][0] = Nota_1;
            notas[i][1] = Nota_2;
        }
        System.out.println("Notas guardadas!");
    }

    //Método para Sumar las Filas de la Matriz
    void sumarFilas() {
        double Fila_0 = 0, Fila_1 = 0, Fila_2 = 0;
        System.out.println("Suma de Notas por cada Fila");
        for (int i = 0; i < notas.length; i++) {
            Fila_0 = notas[0][0] + notas[0][1];
            Fila_1 = notas[1][0] + notas[1][1];
            Fila_2 = notas[2][0] + notas[2][1];
        }
        System.out.println("La Suma de la Fila 0 es: " + Fila_0);
        System.out.println("La Suma de la Fila 1 es: " + Fila_1);
        System.out.println("La Suma de la Fila 2 es: " + Fila_2);
    }

    //Método para Hallar el Promedio de las Notas
    void promediar() {

        //Debo usar un acumulador
        double suma = 0; //Acumulador
        double promedio;
        System.out.println("Promedio de las Notas");
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i][0] + notas[i][1];
        }

        //Hallo el Promedio
        promedio = suma / (notas.length * 2); //notas.length * 2 ya que hay dos notas por cada Pupilo
        System.out.println("El Promedio de las Notas es: " + promedio);
    }

    //Menú
    void menu() {
        int opcion = 0;
        do {
            System.out.println("""
                               \n****MENU DE OPCIONES****
                               *****GESTION DE NOTAS*****
                               
                               1. Guardar Notas
                               2. Suma de Filas
                               3. Promedio de las Notas
                               4. Salir
                               
                               Opcion:""");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    this.guardarNotas();
                    break;
                case 2:
                    this.sumarFilas();
                    break;
                case 3:
                    this.promediar();
                    break;
            }
        } while (opcion > 0 && opcion < 4);
    }
}
