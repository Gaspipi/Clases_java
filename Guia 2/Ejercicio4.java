import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).


        double F;
        double C;


        System.out.println("Ingrese temperatura en C");
        Scanner leer = new Scanner(System.in);
        C = leer.nextDouble();
        F = 32 + (9 * C/5);

        System.out.println("La temperatura en F es de: " + F);

    }
}