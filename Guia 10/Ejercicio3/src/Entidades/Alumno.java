/*
La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
 */
package Entidades;

import java.util.ArrayList;


public class Alumno {
  String nombre;
  ArrayList<Integer> notasAlumno = new ArrayList(); 

    public Alumno() {
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotasAlumno() {
        return notasAlumno;
    }

    public void setNotasAlumno(ArrayList<Integer> notasAlumno) {
        this.notasAlumno = notasAlumno;
    }
  
}
