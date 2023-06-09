package Guia5;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        int[][] matriz = new int[3][3];

        Scanner read = new Scanner(System.in);
        int num;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("escriba un numero para colocar en la poscion" + i + j);
                    num = read.nextInt();
                } while (num < 1 || num > 9);
                matriz[i][j] = num;
            }
        }

        sumafila(matriz);
        sumaC(matriz);
        diag(matriz);

        if (sumafila(matriz) && sumaC(matriz) && diag(matriz)) {
            System.out.println("es una matriz magica");
        } else {
            System.out.println("no es matriz magica");
        }

    }

    public static boolean sumafila(int[][] matriz) {
        boolean flag = false;
        int valor = matriz[0][0] + matriz[0][1] + matriz[0][2];
        for (int i = 1; i < 3; i++) {
            if (valor == matriz[i][0] + matriz[i][1] + matriz[i][2]) {
                flag = true;
            } else {
                return false;
            }
        }
        return flag;
    }

    public static boolean sumaC(int[][] matriz) {
        boolean flag = false;
        int valor = matriz[0][0] + matriz[0][1] + matriz[0][2];
        for (int i = 1; i < 3; i++) {
            if (valor == matriz[0][i] + matriz[1][i] + matriz[2][i]) {
                flag = true;
            } else {
                return false;
            }
        }
        return flag;
    }

    public static boolean diag(int[][] matriz) {
        int valor;
        valor = matriz[0][0] + matriz[1][1] + matriz[2][2];
        int valor1;
        valor1 = matriz[0][2] + matriz[1][1] + matriz[2][0];
        return valor == valor1;
    }
}