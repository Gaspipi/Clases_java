import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.

        String nombre;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre = leer.nextLine();
        System.out.println("Hola, " + nombre);
    }
}