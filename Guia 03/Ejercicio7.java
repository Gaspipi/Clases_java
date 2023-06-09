import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            //Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
        // tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
        // con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
        // carácter tiene que ser X y el último tiene que ser una O.
        //Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial
        // “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE,
        // que no respete el formato se considera incorrecta.
        //Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
        // e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
        // siguientes funciones de Java Substring(), Length(), equals().

        // leer frases de formato "X___O" o "&&&&&" que significa final.
        //contador con frases correctas e incorrectas

        Scanner leer = new Scanner(System.in);
        String frase = "";
        int correcto, incorrecto;
        correcto = 0;
        incorrecto = 0;
        do {
            System.out.println("Ingrese una frase de 5 caracteres");
            frase = leer.nextLine();
            if (frase.length() == 5){
                if (frase.substring(0,1).equals("X")){
                    if (frase.substring(4,5).equals("O")) {
                        correcto++;
                    }
                    else {
                        incorrecto++;
                    }
                }
                else if (!frase.equals("&&&&&")){
                    incorrecto++;
                }
            }
            else {incorrecto++;}
        }while (!frase.equals("&&&&&"));

        System.out.println("Correctos: " + correcto + ", incorrectos: " + incorrecto);
    }

}