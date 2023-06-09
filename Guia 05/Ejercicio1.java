package Guia5;

public class Ejercicio1 {

    public static void main(String args[]) {
        //Realizar un algoritmo que llene un vector 
        //con los 100 primeros números enteros y los muestre por 
        //pantalla en orden descendente.
        int[] array = new int[100];
        array = devolverArreglo();
        mostrarArreglo(array);

        System.out.println("Se termino");

    }

    public static int[] devolverArreglo() {
        int[] arr = new int[100];
        int j = 0;
        for (int i = 99; i >= 0; i--) {
            arr[j] = i;
            j++;
        }
        return arr;
    }

    public static void mostrarArreglo(int[] arr) {
        for (int e : arr) {
            System.out.println(e);
        }
    }
}
