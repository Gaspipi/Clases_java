package Servicios;

import Entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {

    private Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
        Persona p1 = new Persona();
        System.out.print("Ingrese el nombre: ");
        p1.setNombre(leer.next());
        System.out.print("Ingrese la edad: ");
        p1.setEdad(leer.nextInt());
        System.out.print("Ingrese el peso: ");
        p1.setPeso(leer.nextDouble());
        System.out.print("Ingrese la altura: ");
        p1.setAltura(leer.nextDouble());

        do {

            System.out.println("Ingrese el sexo: ");
            String se = (leer.next());

            if ("f".equalsIgnoreCase(se) || "m".equalsIgnoreCase(se) || "o".equalsIgnoreCase(se)) {
                p1.setSexo(se);
            } else {
                System.out.println("Dato no válido, reintente");
            }

        } while (!"f".equalsIgnoreCase(p1.getSexo()) && !"m".equalsIgnoreCase(p1.getSexo()) && !"o".equalsIgnoreCase(p1.getSexo()));
        return p1;
    }

    public Persona crearPersona(String nombre, int edad, String sexo, double peso, double altura) {
        Persona p1 = new Persona(nombre,edad,sexo,peso,altura);
//        System.out.print("Ingrese el nombre: ");
          //p1.setNombre(nombre);
//        System.out.print("Ingrese la edad: ");
          //p1.setEdad(edad);
//        System.out.print("Ingrese el peso: ");
          //p1.setSexo(sexo);
//        System.out.print("Ingrese la altura: ");
          //p1.setAltura(peso);
          //p1.setAltura(altura);

        
        return p1;
    }
    
    public boolean esMayorDeEdad(Persona p1){
        //boolean mayor = false;
        if (p1.getEdad() >= 18) {
            return true;
        } else {
            return false;

        }

    }

    public int calcularIMC(Persona p1) {
        double IMC = p1.getPeso() / (p1.getAltura()*p1.getAltura());
        
        if (IMC < 20.0) {
            return -1;
        } else if (IMC >= 20.0 && IMC <= 25.0) {
            return 0;
        } else {
            return 1;
        }
    }
}