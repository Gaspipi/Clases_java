import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese numero");
        num = leer.nextInt();

        System.out.println("Doble: " + num*2);
        System.out.println("Triple: " + num*3);
        System.out.println("Sqrt: " + Math.sqrt(num));
    }
}