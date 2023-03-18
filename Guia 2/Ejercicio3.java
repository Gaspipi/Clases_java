import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas.

        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe una frase");
        String frase = leer.nextLine();
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());

    }
}