import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         //Escriba un programa en el cual se ingrese un valor límite positivo, y
        // a continuación solicite números al usuario hasta que la suma de los números
        // introducidos supere el límite inicial.

        System.out.println("Ingrese un limite");
        Scanner leer = new Scanner(System.in);
        int limite = leer.nextInt();
        int suma, num;
        suma = 0;

        do {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            suma += num; // suma = suma + num
        }while (suma <= limite);

        System.out.println("El limite es " + limite + " y la suma es " + suma);
    }

}