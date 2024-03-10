/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control_Electrodoméstico;

import java.util.Scanner;

/**
 *
 * @author ANDRES GARCES
 */
public class Electrodoméstico {

    //Declaro la Matriz
    String electrodomesticos[][] = new String[4][3];

    Scanner scan = new Scanner(System.in);

    int i = 0;

    //Método para guardar los Electrodomésticos
    void guardarElectrodomestico() {
        String Nro_Serie, Tipo, Precio;
        for (int i = 0; i < 4; i++) {

            //1. Pedir los Datos de 1 Electrodoméstico
            System.out.println("Dígite el Número de Serie del Electrodoméstico " + (i + 1) + ": ");
            Nro_Serie = scan.next();
            System.out.println("Dígite el Tipo de Electrodoméstico " + (i + 1) + ": ");
            Tipo = scan.next();
            System.out.println("Dígite el Precio del Electrodoméstico " + (i + 1) + ": ");
            Precio = scan.next();
            System.out.println();

            //2. Las guardó en la Matriz
            electrodomesticos[i][0] = Nro_Serie;
            electrodomesticos[i][1] = Tipo;
            electrodomesticos[i][2] = Precio;
        }
        System.out.println("Productos Almacenados Exitosamente!");
        System.out.println();
    }

    //Método para Listar
    void listarElectrodomestico() {
        System.out.println(""" 
                           \n**Electrodomésticos**
                           Nro. SERIE / TIPO / PRECIO""");
        for (int i = 0; i < electrodomesticos.length; i++) {
            System.out.println(electrodomesticos[i][0] + " / "
                    + electrodomesticos[i][1] + " / "
                    + electrodomesticos[i][2]);
        }
        System.out.println();
    }

    //Método para Buscar el Electrodoméstico por el Nro. Serie
    void buscarElectrodomestico() {
        String NroSerie_Buscar;
        System.out.println("Buscar el Electrodoméstico");

        //Pido el Nro. Serie a Buscar
        System.out.print("Dígite el Nro de Serie para buscar el Electrodoméstico: ");
        NroSerie_Buscar = scan.next();
        System.out.println();

        boolean bandera = false; //Variable Auxiliar
        for (int i = 0; i < electrodomesticos.length; i++) {

            //Comparo
            if (NroSerie_Buscar.equals(electrodomesticos[i][0])) {
                System.out.println("El Número de Serie del Electrododmestico es: " + electrodomesticos[i][0]);
                System.out.println("El Tipo de Electrodomestico es: " + electrodomesticos[i][1]);
                System.out.println("El Precio del Electrodomestico es: " + electrodomesticos[i][2]);
                bandera = true; //Cambió el estado de la bandera
                System.out.println();
            }
        }
        if (bandera == false) {
            System.out.println("El Nro. Serie no coincide con ningún Electrodoméstico");
            System.out.println();
        }
    }

    //Menú
    void menu() {
        int opcion;
        do {
            System.out.println("""
                               *********MENU OPCIONES*********
                               **GESION DE ELECTRODOMÉSTICOS**
                               
                               1. Guardar Electrodomésticos
                               2. Listar Electrodomésticos
                               3. Buscar Electrodoméstico por Nro. Serie
                               4. Salir
                               
                               Opcion:""");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    this.guardarElectrodomestico();
                    break;
                case 2:
                    this.listarElectrodomestico();
                    break;
                case 3:
                    this.buscarElectrodomestico();
                    break;
            }
        } while (opcion > 0 && opcion < 4);
    }
}
