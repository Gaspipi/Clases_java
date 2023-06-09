import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        double num1 = leer.nextDouble();
        System.out.println("Ingrese otro numero");
        double num2 = leer.nextDouble();
        EsMultiplo(num1, num2);
    }
    public static void EsMultiplo(double num1,double num2){
        if ((num1 % num2) == 0){
            System.out.println(num1 + " es multiplo de " + num2);
        }
        else {
            System.out.println(num1 + " no es multiplo de " + num2);
        }
    }
}