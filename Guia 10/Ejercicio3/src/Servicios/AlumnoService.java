/*
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package Servicios;

import java.util.Scanner;
import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class AlumnoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Alumno> listaDeAlumnos = new ArrayList();

    public ArrayList<Integer> llenarNotas() {
        Integer nota;
        ArrayList<Integer> aux = new ArrayList();
        System.out.println("Ingrese las notas del alumnos: ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Nota " + (i + 1));
            nota = leer.nextInt();
            aux.add(nota);
        }
        return aux;
    }

    public void crearAlumnos() {
        String op = "s";
        while (!op.equalsIgnoreCase("n")) {
            Alumno a = new Alumno();
            System.out.println("Ingrese el nombre del Alumno: ");
            a.setNombre(leer.next());
            a.setNotasAlumno(llenarNotas());
            listaDeAlumnos.add(a);
            System.out.println("Desea agregar otro ?");
            op = leer.next();
        }
    }

    public void notaFinal() {
        System.out.println("De que alumnos quiere calcular la nota final: ");
        String alumnoProm = leer.next();
        Alumno a = new Alumno();
        a.setNombre(alumnoProm);
        if (listaDeAlumnos.contains(a)) {
            ArrayList<Integer> notas = listaDeAlumnos.get(listaDeAlumnos.indexOf(a)).getNotasAlumno();
            double promedio = (notas.get(0) + notas.get(1) + notas.get(2)) / 3;
            System.out.println("El promedio del alumnos es de : "+promedio);
        }else{
            System.out.println("El alumno no esta en la lista.");
        }
    }
}
