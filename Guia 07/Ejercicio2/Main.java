
package Poo.Ejercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Circunferencia nuevaCircunferencia = crearCircunferencia(leer);
        nuevaCircunferencia.area();
        nuevaCircunferencia.perimetro();
        nuevaCircunferencia.get();
    }

    public static Circunferencia crearCircunferencia(Scanner leer) {
        
        System.out.println("Ingrese el radio");
        Circunferencia elemento = new Circunferencia(leer.nextDouble());
        return elemento;
    }
}
