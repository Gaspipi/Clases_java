import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma

        Scanner leer = new Scanner(System.in); //
        int num1,num2;
        System.out.println("Ingrese un numero por teclado");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro numero por teclado");
        num2 = Integer.parseInt(leer.next());

        System.out.println("La suma de los dos numeros ingresados da como resultado: " + (num1+num2));





    }
}