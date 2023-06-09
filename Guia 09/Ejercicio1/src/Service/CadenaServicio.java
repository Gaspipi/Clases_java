/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene
 * la frase ingresada. Método invertirFrase(), deberá invertir la frase
 * ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca",
 * Salida: "acnalb asac". Método vecesRepetido(String letra), recibirá un
 * carácter ingresado por el usuario y contabilizar cuántas veces se repite el
 * carácter en la frase, por ejemplo: Entrada: frase = "casa blanca". Salida: El
 * carácter 'a' se repite 4 veces. Método compararLongitud(String frase), deberá
 * comparar la longitud de la frase que compone la clase con otra nueva frase
 * ingresada por el usuario. Método unirFrases(String frase), deberá unir la
 * frase contenida en la clase Cadena con una nueva frase ingresada por el
 * usuario y mostrar la frase resultante. Método reemplazar(String letra),
 * deberá reemplazar todas las letras “a” que se encuentren en la frase, por
 * algún otro carácter seleccionado por el usuario y mostrar la frase
 * resultante. Método contiene(String letra), deberá comprobar si la frase
 * contiene una letra que ingresa el usuario y devuelve verdadero si la contiene
 * y falso si no.
 *
 *
 *
 * @author Peluso
 */
public class CadenaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearCadena() {
        System.out.println("ingrese una frase");
        String frase = leer.next();
        return new Cadena(frase);

    }

    public int mostrarVocales(Cadena c1) {
        int cont = 0;
        String letra;
        for (int i = 0; i < c1.getLongitud(); i++) {
            letra = c1.getFrase().substring(i, i + 1).toLowerCase();
            if (letra.equals("a") ||letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
                cont++;
            }

        }

        return cont;
    }

    // Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. 
    //   Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    public void invertirFrase(Cadena c1) {
        String letra;
        String frase = "";

        for (int i = c1.getLongitud() - 1; i >= 0; i--) {
            letra = c1.getFrase().substring(i, i + 1);
            frase += letra;
        }
        System.out.println("la frase dada vuelta es: " + frase);

    }
    //  Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y 
    //   contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
//Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.

    public void vecesRepetido(Cadena c1, String letra) {
        int cont = 0;
        for (int i = 0; i < c1.getLongitud(); i++) {
            if (letra.equals(c1.getFrase().substring(i, i + 1)) ) {
                cont++;
            }
        }
        System.out.println("la letra se repite " + cont + " veces");

    }
//    Método compararLongitud(String frase), deberá comparar la longitud de 
    //la frase que compone la clase con otra nueva frase ingresada por el usuario.

    public void compararLongitud(Cadena c1, String frase) {
        Integer longitud = frase.length();
        Integer longc1 = c1.getLongitud();
        int opcion = longitud.compareTo(longc1);
        switch (opcion) {
            case 1:
                System.out.println("la longitud de la nueva frase es mas larga");
                break;
            case 0:
                System.out.println("la longitud es igual");
                break;
            case -1:
                System.out.println("la frase nueva es mas corta");
                break;

        }

    }

    public String unirFrase(Cadena c1, String frase) {
        return c1.getFrase().concat(frase);

    }

    public void reemplazar(Cadena c1, String letra) {
        String frase = "";
        for (int i = 0; i < c1.getLongitud(); i++) {
            if ("a".equals(c1.getFrase().substring(i, i + 1)) ) {
                frase += letra;
            } else {
                frase += c1.getFrase().substring(i, i + 1);
            }
        }
        System.out.println("la frase queda asi: " + frase);
    }

    public boolean contiene(Cadena c1, String letra) {
        for (int i = 0; i < c1.getLongitud(); i++) {
            if (letra.equals(c1.getFrase().substring(i, i + 1)) ) {
                return true;
            }

        }
        return false;
    }

}
