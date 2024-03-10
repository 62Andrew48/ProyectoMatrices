/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author ANDRES GARCES
 */
public class Definitivas {

    //Declaro la Matriz
    double notas[][] = new double[3][2];

    Scanner scan = new Scanner(System.in);

    //Método para registrar las Notas
    void registrar() {
        double código, valor;
        System.out.println("Registrando Código de Estudiantes");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Código: ");
            código = scan.nextDouble();
            System.out.print("Nota definitiva de ED: ");
            valor = scan.nextDouble();

            //Guardó en la Matriz
            notas[i][0] = código;
            notas[i][1] = valor;
        }
        System.out.println("Datos Registrados!");
    }

    //Método para listar las Notas
    void listar() {
        System.out.println("Listando los Datos Guardados");
        System.out.println("MATERIA: ESTRUCTURAS DE DATOS");
        System.out.println("CÓDIGO / NOTA DEFINITIVA");
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i][0] + " / " + notas[i][1]);
        }
    }

    //Método para Mostrar quiénes perdieron la Asignatura y Contarlos
    void mostrarReprobados() {
        int contadorReprobados = 0;
        System.out.println("ESTUDIANTES QUE REPROBARON ED");
        System.out.println("CÓDIGO / NOTA DEFINITIVA");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i][1] < 3) { //Reprobó
                System.out.println(notas[i][0] + " / " + notas[i][1]);
                contadorReprobados++; //Incremento los Reprobados
            }
        }
        System.out.println("Total de Reprobados: " + contadorReprobados);
    }
    
    //Menú
    void menu() {
        int opcion = 0;
        do {
            System.out.println("""
                               \n**MENÚ DE OPCIONES**
                               **GESTIÓN DE NOTAS**
                               
                               1. Registrar Notas
                               2. Listar Notas
                               3. Mostrar Reprobados
                               4. Salir
                               
                               Opción:""");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    this.registrar();
                    break;
                case 2:
                    this.listar();
                    break;
                case 3:
                    this.mostrarReprobados();
                    break;
            }
        } while (opcion > 0 && opcion < 4);
    }
}
