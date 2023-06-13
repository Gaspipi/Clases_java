/*
Crear una clase PersonaService,
en el paquete servicio, con los siguientes métodos:
a) Método crearPersona que pida al usuario Nombre y fecha de
nacimiento de la persona a crear. Retornar el objeto Persona creado.**HECHO pero capaz puedo hacerlo mas optimo.**
b) Método calcularEdad que calcule la edad del usuario utilizando el
atributo de fecha de nacimiento y la fecha actual.**HECHO**
c) Método menorQue recibe como parámetro una Persona y una edad.
Retorna true si la persona es menor que la edad consultada o false
en caso contrario.
d) Método mostrarPersona que muestra la información de la persona
deseada.
 */
package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
        Persona p = new Persona();
        System.out.print("Ingrese el nombre de una persona: ");
        p.setNombre(leer.next());
        System.out.println("Ahora su fecha de nacimiento: ");
        System.out.print("Dia: ");
        int dia = leer.nextInt();
        System.out.print("Mes: ");
        int mes = leer.nextInt() - 1;
        System.out.print("Año: ");
        int anno = leer.nextInt() - 1900;
        Date newFechaNacimiento = new Date(anno, mes, dia);
        p.setFechaNacimiento(newFechaNacimiento);
        return p;
    }

    public int calcularEdad(Persona p) {
        Date fechaActual = new Date();
        int edad = fechaActual.getYear() - p.getFechaNacimiento().getYear();
        return edad;
    }

    public boolean menorQue(Persona p, int edadConsultada) {
        boolean esMenor = false;
        if (calcularEdad(p) < edadConsultada) {
            esMenor = true;
        }
        return esMenor;
    }

    public void mostrarPersona(Persona p) {
        System.out.print("Nombre: ");
        p.getNombre();
        System.out.print("Fecha de Nacimiento :"+p.getFechaNacimiento().getDate()+"/"+(p.getFechaNacimiento().getMonth()+1)+"/"+(p.getFechaNacimiento().getYear()+1900));
        System.out.println(""); 
        System.out.println("Edad:" + calcularEdad(p) + " Años");
    }
}
