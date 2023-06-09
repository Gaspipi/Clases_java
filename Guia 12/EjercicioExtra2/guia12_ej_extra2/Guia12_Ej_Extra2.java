/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package guia12_ej_extra2;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ferre
 */
public class Guia12_Ej_Extra2 {

    public static void main(String[] args) {
        ArrayList<Edificio> lista = new ArrayList();
//        Edificio a = new Polideportivo("Poli1", true, 4,4,4);
//        Edificio b = new Polideportivo("Poli2", false, 8,10,4);
//        Edificio c = new EdificioDeOficinas(3,10,4,10,5,20);
//        Edificio d = new EdificioDeOficinas(2,5,20,50,5,20);
//        lista.add(a);
//        lista.add(b);
//        lista.add(c);
//        lista.add(d);
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Edificio a;
        String nombre;
        boolean techado = false;
        int cantPxO, cantO, cantPisos;
        double ancho, alto, largo;
        char c;
        for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese nombre");
            nombre = leer.next();
            System.out.println("Ingrese si es techado");
            c = leer.next().charAt(0);
            if (c == 's' || c == 'S') {
                techado = true;
            }
            System.out.println("Ingrese el ancho");
            ancho = leer.nextInt();
            System.out.println("Ingrese el alto");
            alto = leer.nextInt();
            System.out.println("Ingrese el largo");
            largo = leer.nextInt();
            lista.add(new Polideportivo(nombre,techado,alto,ancho,largo));
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese cantidad de OficinasxPiso");
            cantO = leer.nextInt();
            System.out.println("Ingrese cantidad de Personas x Oficina");
            cantPxO = leer.nextInt();
            System.out.println("Ingrese cantidad de Pisos");
            cantPisos = leer.nextInt();
            System.out.println("Ingrese el ancho");
            ancho = leer.nextInt();
            System.out.println("Ingrese el alto");
            alto = leer.nextInt();
            System.out.println("Ingrese el largo");
            largo = leer.nextInt();
            lista.add(new EdificioDeOficinas(cantO,cantPxO,cantPisos,alto,ancho,largo));  
        }

        for (Edificio edificio : lista) {
            System.out.println("-------------------------");
            edificio.calcularSuperficie();
            edificio.calcularVolumen();
            if (edificio instanceof Polideportivo) {
                Polideportivo p = (Polideportivo) edificio;
                System.out.println("Es techado: " + p.isTechado());
                continue;
            }
            if (edificio instanceof EdificioDeOficinas) {
                EdificioDeOficinas p = (EdificioDeOficinas) edificio;
                p.cantPersonas();
            }
        }
    }
}
