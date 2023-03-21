import java.util.Scanner;

public class Eje {
    public static void ejer1 (){
        //Implementar un programa que le pida dos números
        // enteros al usuario y determine si ambos o alguno de ellos es mayor a 25.

        int num1, num2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese num1");
        num1 = leer.nextInt();
        System.out.println("Ingrese num2");
        num2 = leer.nextInt();

        if (num1 > 25 && num2 > 25) {
            System.out.println("num 1 y num 2 son mayores a 25");
        }
        else if (num1 > 25) {
            System.out.println("num 1 es mayor a 25");
        }
        else if (num2 > 25){
            System.out.println("num 2 es mayor a 25");
        }
        else {
            System.out.println("ninguno es mayor a 25");
        }
    }

    public static void ejer2 (){
        /* Considera que estás desarrollando una web para una empresa que fabrica motores
        (suponemos que se trata del tipo de motor de una bomba para mover fluidos). Definir una variable
        tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4. El programa debe mostrar lo siguiente:
        o	Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
        o	Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de gasolina”.
        o	Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de hormigón”.
        o	Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta alimenticia”.
        o	Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor válido
        para tipo de bomba” */

        int opcion;

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la opcion de motor de bomba");
        opcion = leer.nextInt();

        switch (opcion){
            case 1: System.out.println("La bomba es una bomba de agua");
                break;
            case 2:System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default: System.out.println("No existe un valor válido para tipo de bomba");
        }

    }
    public static void ejer3 (){
        Scanner leer = new Scanner(System.in);
        int note;

        do {
            System.out.println("Ingrese una nota entre 0 y 10");
            note = leer.nextInt();
        } while (note < 0 || note > 10);
    }
    public static void ejer4 (){
        Scanner leer = new Scanner(System.in);
        int num;
        int cont = 0;
        int aux = 0;

        do {
            num = leer.nextInt();
            if (num > 0) {
                aux += num;
                cont++;
            }
        } while (cont != 20 && num != 0);
        System.out.println(aux);
    }
    public static void ejer5 (){
        Scanner leer = new Scanner(System.in);
        int num;

        for (int i = 0; i < 4; i++) {
            num = leer.nextInt();
            System.out.print(num);
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void ejer6 (){}
}
