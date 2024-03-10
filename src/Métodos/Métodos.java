/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Métodos;

import java.util.Scanner;

/**
 *
 * @author ANDRES GARCES
 */
public class Métodos {
    
    //Declaro la Matriz que contiene tipos String y Double
    String NombreMatriz[][] = new String[4][4];

    Scanner scan = new Scanner(System.in);

    //Método para guardar la Información del Estudiante
    void registrar() {
        for (int i = 0; i < NombreMatriz.length; i++) {

            //Pido los datos
            System.out.print("Digite el Código del Estudiante " + (i + 1) + ": ");
            String código = scan.next();
            System.out.print("Digite el Apellido del Estudiante " + (i + 1) + ": ");
            String apellido = scan.next();
            System.out.print("Digite el Nombre del Estudiante " + (i + 1) + ": ");
            String nombre = scan.next();
            System.out.print("Digite la Definitiva del Estudiante " + (i + 1) + ": ");
            String definitiva = scan.next();
            System.out.println();

            //Guardó los datos en la Matriz
            NombreMatriz[i][0] = código;
            NombreMatriz[i][1] = apellido;
            NombreMatriz[i][2] = nombre;
            NombreMatriz[i][3] = definitiva;
        }
        System.out.println("Información Registrada exitosamente!");
    }

    //Método para Listar la Información del Estudiante
    void listar() {
        System.out.println("\n**Estudiantes**");
        System.out.println("Código / Apellido / Nombre / Definitiva");
        for (int i = 0; i < NombreMatriz.length; i++) {
            System.out.println(NombreMatriz[i][0] + " / "
                    + NombreMatriz[i][1] + " / "
                    + NombreMatriz[i][2] + " / "
                    + NombreMatriz[i][3]);
        }
    }

    //Método para Buscar al Estudiante por el Código (String)
    void buscar() {

        //Pido el Código a Buscar
        System.out.print("Digite el Código para Buscar al Estudiante: ");
        String códigoBuscar = scan.next();
        System.out.println();

        boolean bandera = false; //Variable Auxiliar
        for (int i = 0; i < NombreMatriz.length; i++) {

            //Comparo
            if (códigoBuscar.equals(NombreMatriz[i][0])) {
                System.out.println("Código del Estudiante: " + NombreMatriz[i][0]
                        + " / " + "Apellido del Estudiante: " + NombreMatriz[i][1]
                        + " / " + "Nombre del Estudiante: " + NombreMatriz[i][2]
                        + " / " + "Definitiva del Estudiante: " + NombreMatriz[i][3]);
                bandera = true;
            }
        }
        //Revisó la bandera
        if (bandera == false) {
            System.out.println("No se encontró ningún Estudiante con el Código digitado");
        }
    }

    // Método para Hallar el Promedio de las Definitivas de los Estudiantes
    void promediar() {
        double suma = 0;
        System.out.println("Promedio de las Notas Definitivas de los Estudiantes");
        for (int i = 0; i < NombreMatriz.length; i++) {
            
            // Convertir el valor de la columna de definitivas a double
            double definitiva = Double.parseDouble(NombreMatriz[i][3]);
            suma += definitiva;
        }
        double promedio = suma / NombreMatriz.length;
        System.out.println("El Promedio de las Definitivas de los Estudiantes es: " + promedio);
    }
   
    //Declaro la Matriz
    double NombreMatriz2[][] = new double[3][2];
    
    //Método para Mostrar quiénes perdieron la Asignatura y Contarlos
    void mostrarReprobados() {
        int contadorReprobados = 0;
        System.out.println("ESTUDIANTES QUE REPROBARON ED");
        System.out.println("CÓDIGO / NOTA DEFINITIVA");
        for (int i = 0; i < NombreMatriz2.length; i++) {
            if (NombreMatriz2[i][1] < 3) { //Reprobó
                System.out.println(NombreMatriz2[i][0] + " / " + NombreMatriz2[i][1]);
                contadorReprobados++; //Incremento los Reprobados
            }
        }
        System.out.println("Total de Reprobados: " + contadorReprobados);
    }
    
    //Método para Sumar las Filas de la Matriz
    void sumarFilas() {
        double Fila_0 = 0, Fila_1 = 0, Fila_2 = 0;
        System.out.println("Suma de Notas por cada Fila");
        for (int i = 0; i < NombreMatriz2.length; i++) {
            Fila_0 = NombreMatriz2[0][0] + NombreMatriz2[0][1];
            Fila_1 = NombreMatriz2[1][0] + NombreMatriz2[1][1];
            Fila_2 = NombreMatriz2[2][0] + NombreMatriz2[2][1];
        }
        System.out.println("La Suma de la Fila 0 es: " + Fila_0);
        System.out.println("La Suma de la Fila 1 es: " + Fila_1);
        System.out.println("La Suma de la Fila 2 es: " + Fila_2);
    }
}
