import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      //Crea una aplicación que le pida dos números al usuario y este
        // pueda elegir entre sumar, restar, multiplicar y dividir.
        // La aplicación debe tener una función para cada operación matemática y
        // deben devolver sus resultados para imprimirlos en el main.

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro numero");
        int num2 = leer.nextInt();
        
        System.out.println("Ingrese una opcion");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        int op = leer.nextInt();

        switch (op){
            case 1:
                System.out.println(sumar(num1,num2));
                break;
            case 2:
                System.out.println(restar(num1,num2));
                break;
            case 3:
                System.out.println(multiplicar(num1,num2));
                break;
            case 4:
                System.out.println(dividir(num1,num2));
                break;
        }

    }

    public static String sumar(int num1, int num2){
        int resultado = num1 + num2;
        return ("La suma de " + num1 + " + " +  num2 + " es: " + resultado);
    }

    public static String restar(int num1, int num2){
        int resultado = num1 - num2;
        return ("La diferencia entre " + num1 + " - " +  num2 + " es: " + resultado);
    }

    public static String multiplicar(int num1, int num2){
        int resultado = num1 * num2;
        return ("La multiplicacion entre " + num1 + " * " +  num2 + " es: " + resultado);
    }

    public static String dividir(double num1, double num2){
        double resultado = num1 / num2;
        return ("La division entre " + num1 + " / " +  num2 + " es: " + resultado);
    }
}