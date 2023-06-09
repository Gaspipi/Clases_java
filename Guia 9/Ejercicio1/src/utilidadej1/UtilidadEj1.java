/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidadej1;

import Entidades.Cadena;
import Service.CadenaServicio;
import java.util.Scanner;

/**
 *
 * @author Peluso
 */
public class UtilidadEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CadenaServicio cs = new CadenaServicio();
        Cadena c1 = cs.crearCadena();
        System.out.println("--------------------------------");
        System.out.println("mostrar Vocales");
        System.out.println(cs.mostrarVocales(c1));
        System.out.println("--------------------------------");
        System.out.println("invirtiendo frase");
        cs.invertirFrase(c1);
        System.out.println("--------------------------------");
        System.out.println("Veces repetido");
        System.out.println("ingrese una letra para buscar cuantas veces se repite");
        cs.vecesRepetido(c1, leer.next());
        System.out.println("---------------------------------");
        System.out.println("Comparar longitud");
        System.out.println("Ingrese una frase");
        cs.compararLongitud(c1, leer.next());
        System.out.println("---------------------------------");
        System.out.println("Unir Frases");
        System.out.println("Ingrese una frase");
        System.out.println(cs.unirFrase(c1, leer.next())); 
        System.out.println("---------------------------------");
        System.out.println("Reemplazar");
        System.out.println("ingrese letra para reemplazar");
        cs.reemplazar(c1, leer.next());
        System.out.println("---------------------------------");
        System.out.println("Contiene");
        System.out.println("Ingrese una letra  para saber si esta en la frase");
        System.out.println(cs.contiene(c1, leer.next()));
        
        
    }
    
}
