import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       //Escribir un programa que procese una secuencia de caracteres
        // ingresada por teclado y terminada en punto, y luego codifique la
        // palabra o frase ingresada de la siguiente manera: cada vocal se reemplaza
        // por el carácter que se indica en la tabla y el resto de los caracteres
        // (incluyendo a las vocales acentuadas) se mantienen sin cambios.
        //Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente. Utilice la estructura “según” para la transformación.
        //Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
        //La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe una frase:");
        String unaFrase = leer.nextLine();
        if(unaFrase.substring(unaFrase.length()-1, unaFrase.length()).equals("."))
        System.out.println(codificar(unaFrase));

    }

    public static String codificar(String frase){
        String nuevaFrase = "";

        for (int i = 0; i < frase.length(); i++)
        {
            frase = frase.toLowerCase();
            switch (frase.substring(i,i+1)){
                case "a":nuevaFrase += "@";
                break;
                case "e":nuevaFrase += "#";
                    break;
                case "i":nuevaFrase += "$";
                    break;
                case "o":nuevaFrase += "%";
                    break;
                case "u":nuevaFrase += "*";
                    break;
                default: nuevaFrase += frase.substring(i,i+1);
                    break;
            }
        }

        return nuevaFrase;
    }
}