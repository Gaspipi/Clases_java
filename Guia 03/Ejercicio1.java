import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ejer4();
    }

    public static void ejer1(){
        //Crear un programa que dado un número determine si es par o impar.

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();

        if (num %2 == 0 ){
            System.out.println("El numero es par");
        }
        else {
            System.out.println("El numero es impar");
        }
    }

    public static void ejer2(){
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

    public static void ejer3() {
        //Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo.
        // Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
        // por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
        // Nota: investigar la función Lenght() en Java.

        System.out.println("Ingrese una frase");
        Scanner leer = new Scanner(System.in);
        String frase = leer.nextLine();

        if (frase.length() == 8){
            System.out.println("Correcto");
        }
        else {
            System.out.println("Incorrecto");
        }


        }
    public static void ejer4(){
        // Escriba un programa que pida una frase o palabra y valide si la primera letra
        // de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje
        // por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
        // Nota: investigar la función Substring y equals() de Java.
        System.out.println("Ingrese una frase");
        Scanner leer = new Scanner(System.in);
        String frase = leer.nextLine();

        if ("A".equals(frase.substring(0,1)) ){ // substring(inicio, fin) [0,1)
            System.out.println("Correcto");
        }
        else {
            System.out.println("Incorrecto");
        }
    }
}
