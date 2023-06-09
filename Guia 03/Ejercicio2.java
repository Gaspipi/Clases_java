import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       //Crear un programa que pida una frase y si esa frase es igual a “eureka”
        // el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
        // Nota: investigar la función equals() en Java.

        System.out.println("Ingrese una frase");
        Scanner leer = new Scanner(System.in);
        String frase = leer.nextLine();

        if (frase.equals("eureka")){
            System.out.println("Correcto");
        }
        else {
            System.out.println("Incorrecto");
        }
    }

    
}
