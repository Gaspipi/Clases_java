/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Poo.Ejercicio2.Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author ferre
 */
public class Operacion {

    int numero1; // 0
    int numero2; // 0

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {

    }

    public void set(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void get() {
        System.out.println("Nuemro 1 " + numero1);
        System.out.println("Nuemro 2 " + numero2);
    }

    public void crearOperacion() {
        int num1, num2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese num1");
        num1 = leer.nextInt();
        System.out.println("Ingrese num2");
        num2 = leer.nextInt();
        set(num1, num2);
    }

    public int sumar() {
        int suma = numero1 + numero2;
        return suma;
    }

    public int restar() {
        int resta = numero1 - numero2;
        return resta;
    }

    public int multiplicar() {
        int multi;
        if (numero1 != 0 && numero2 != 0) {
            multi = numero1 * numero2;
            return multi;
        } else {
            System.out.println("No se pudo realizar la multiplicacion porque uno de los numeros es 0");
            return 0;
        }

    }

    public double dividir() {
        if (numero1 != 0 && numero2 != 0) {
            double divi = numero1 / numero2;
            return divi;
        } else {
            System.out.println("No se pudo realizar la division porque uno de los numeros es 0");
            return 0;
        }
    }

}
