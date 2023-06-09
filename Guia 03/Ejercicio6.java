import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Realizar un programa que pida dos números enteros
        // positivos por teclado y muestre por pantalla el siguiente menú:
        // El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
        // pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
        // opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
        // programa directamente, se debe mostrar el siguiente mensaje de confirmación:
        // ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’
        // se sale del programa, caso contrario se vuelve a mostrar el menú.

        double num1, num2;
        int opcion;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        num1 = leer.nextDouble();
        System.out.println("Ingrese otro numero entero");
        num2 = leer.nextDouble();
        boolean salir = false;
do {
    System.out.println("MENU");
    System.out.println("1. Sumar");
    System.out.println("2. Restar");
    System.out.println("3. Multiplicar");
    System.out.println("4. Dividir");
    System.out.println("5. Salir");
    System.out.println("Elija una opcion:");

    opcion = leer.nextInt();
    switch (opcion){
        case 1:
            System.out.println("La suma de los numeros es: " + (num1 + num2));
            break;
        case 2: System.out.println("La resta de los numeros es: " + (num1 - num2));
            break;
        case 3: System.out.println("La multiplicacion de los numeros es: " + (num1 * num2));
            break;
        case 4: System.out.println("La division de los numeros es: " + (num1 / num2));
            break;
        case 5:
            System.out.println("Seguro que desea salir? S/n");
            System.out.print(leer.nextLine());
            String linea = leer.nextLine();
            if (linea.equals("S")){
                salir = true;
            }
            break;
        default:
            System.out.println("Ingrese un valor correcto");
    }
}while (!salir);

    }

    
}
