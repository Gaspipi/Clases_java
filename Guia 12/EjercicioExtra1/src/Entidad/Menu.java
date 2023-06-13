/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Menu {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cargarAlquiler() {
        int opcion;
        Alquiler alq;
        do {
            System.out.println("Elija una opción:");
            System.out.println("1. Velero");
            System.out.println("2. Barco a motor");
            System.out.println("3. Yate de lujo");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ha seleccionado Velero.");
                    Barcos v = new Veleros();
                    v.cargarBarco();
                    alq = new Alquiler();
                    alq.cargarAlquiler(v);
                    alq.calcularAlquiler();
                    break;
                case 2:
                    System.out.println("Ha seleccionado Barco a motor.");
                    Barcos bm = new BarcosAmotor();
                    bm.cargarBarco();
                    alq = new Alquiler();
                    alq.cargarAlquiler(bm);
                    alq.calcularAlquiler();
                    break;
                case 3:
                    System.out.println("Ha seleccionado Yate de lujo.");
                    Barcos yl = new YatesDeLujo();
                    yl.cargarBarco();
                    alq = new Alquiler();
                    alq.cargarAlquiler(yl);
                    alq.calcularAlquiler();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }

            System.out.println();
        } while (opcion != 0);

        
    }
}
