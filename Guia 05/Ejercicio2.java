
package Guia5;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String args[]) {
        System.out.println("-----------------EJERCICIO 2------------------");
        int N;
        Scanner read = new Scanner(System.in);
        System.out.println("coloque la dimension del vector");
        N = read.nextInt();
        int vector2[] = new int[N];
        for (int i = 0; i < N; i++) {
            int numeroAleatorio = (int) Math.round(Math.random() * 99 + 1);
            vector2[i] = numeroAleatorio;
        }

        System.out.println("Escriba un numero a buscar:");
        int num = read.nextInt();
        int cant = busqueda(vector2, N, num);
        System.out.println("El numero ingresado se encontro " + cant + " veces");
    }

    public static int busqueda(int[] vector, int n, int num) {
        int contador = 0;
        for (int i = 0; i < n; i++) {
            if (num == vector[i]) {
                contador++;
                System.out.println(num + " encontrado en " + i + " posicion");
            }
        }
        return contador;
    }

}
