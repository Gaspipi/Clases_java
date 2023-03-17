import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double F;
        double C;


        System.out.println("Ingrese temperatura en C");
        Scanner leer = new Scanner(System.in);
        C = leer.nextDouble();
        F = 32 + (9 * C/5);

        System.out.println("La temperatura en F es de: " + F);

    }
}