package guia_8_ejercicio_3;

import Entidades.Persona;
import Servicios.PersonaServicio;

public class Guia_8_Ejercicio_3 {

    public static void main(String[] args) {

        PersonaServicio ps = new PersonaServicio();
        
        
        
        //Persona p88 = ps.crearPersona();

        //System.out.println("Es mayor de edad: "+ps.esMayorDeEdad(p88));
        //System.out.println(ps.calcularIMC(p88));
        Persona p1 = ps.crearPersona("Alejandro", 17, "m", 85, 1.75);
        Persona p2 = ps.crearPersona("Roberto", 21, "m", 56, 1.60);
        Persona p3 = ps.crearPersona("Alicia", 39, "f", 60, 1.65);
        Persona p4 = ps.crearPersona("Viviana", 35, "o", 120, 1.55);

        
        
        if (ps.esMayorDeEdad(p1)) {
            System.out.println("Persona p1 es mayor de edad");
        } else {
            System.out.println("Persona p1 no es mayor de edad");
        }

        System.out.println("Persona p1 es mayor de edad: " + ps.esMayorDeEdad(p1));

        Persona[] lista = {p1, p2, p3, p4};
        boolean[] mamon = new boolean[4];
        int[] imc = new int[4];

        for (Persona p : lista) {
            if (ps.calcularIMC(p) == 1) {
                System.out.println("Persona " + p.getNombre() + " no está en su peso ideal, tiene sobrepeso ");
            }
            else if (ps.calcularIMC(p) == 0) {
                System.out.println("Persona " + p.getNombre() + " está en su peso ideal");
            } else {
                System.out.println("Persona " + p.getNombre() + " no está en su peso ideal, está por debajo.");
            }
        }
        Persona p;
        for (int i = 0; i < 4; i++) {
            p = lista[i];
            imc[i] = ps.calcularIMC(p);
            mamon[i] = ps.esMayorDeEdad(p);
        }
        double contImc1 = 0;
        double contImc0 = 0;
        double contImc_1 = 0;
        double mayor = 0;
        double menor = 0;

        for (int i = 0; i < 4; i++) {
            switch (imc[i]) {
                case 1:
                    contImc1++;
                    break;
                case -1:
                    contImc_1++;
                    break;
                case 0:
                    contImc0++;
                    break;
            }

            if (mamon[i]) {
                mayor++;
            } else {
                menor++;
            }
        }

        System.out.println("El porcentaje de las personas por debajo de su peso ideal es: "+ (contImc_1/4)*100);
        System.out.println("El porcentaje de las personas en su peso ideal es: "+ (contImc0/4)*100);
        System.out.println("El porcentaje de las personas con sobrepeso es: "+ (contImc1/4)*100);
        
        System.out.println((mayor/4)*100 + " % es mayor de edad");
        System.out.println((menor/4)*100 + " % es menor de edad");

ps.esMayorDeEdad(p2);
        ps.calcularIMC(p2);
        ps.esMayorDeEdad(p3);
        ps.calcularIMC(p3);
        ps.esMayorDeEdad(p4);
        ps.calcularIMC(p4);


        

    }

}