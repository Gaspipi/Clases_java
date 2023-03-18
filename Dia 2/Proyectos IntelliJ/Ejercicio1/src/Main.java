import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in); //
        int num1,num2;
        System.out.println("Ingrese un numero por teclado");
        num1 = Integer.parseInt(leer.next());
        System.out.println("Ingrese otro numero por teclado");
        num2 = Integer.parseInt(leer.next());

        System.out.println("La suma de los dos numeros ingresados da como resultado: " + (num1+num2));





    }
}