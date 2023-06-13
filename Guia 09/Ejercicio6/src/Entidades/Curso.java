/*
Un profesor particular está dando cursos para grupos de cinco alumnos
y necesita un programa para organizar la información de cada curso.
Para ello, crearemos una clase entidad llamada Curso, cuyos atributos
serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana,
turno (mañana o tarde), precioPorHora y alumnos. Donde alumnos es un
arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno. A continuación, se implementarán los
siguientes métodos:
a) Un constructor por defecto.
b) Un constructor con todos los atributos como parámetro.
c) Métodos getters y setters de cada atributo.
d) Método cargarAlumnos(): este método le permitirá al usuario ingresar
los alumnos que asisten a las clases. Nosotros nos encargaremos de
almacenar esta información en un arreglo e iterar con un bucle,
solicitando en cada repetición que se ingrese el nombre de cada
alumno.**HECHO**
e) Método crearCurso(): el método crear curso, le pide los valores de
los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Curso. En este método invocamos al
método cargarAlumnos() para asignarle valor al atributo alumnos.**HECHO**

f) Método calcularGananciaSemanal(): este método se encarga de
calcular la ganancia en una semana por curso. Para ello, se deben
multiplicar la cantidad de horas por día, el precio por hora, la
cantidad de alumnos y la cantidad de días a la semana que se repite
el encuentro.
 */
package Entidades;

import java.util.Scanner;

public class Curso {

    Scanner leer = new Scanner(System.in);
    String nombreCurso;
    int cantidadHorasXdia;
    int cantidadDiasXsemana;
    String turno;
    int precioXhora;
    String[] alumnos = new String[5];

    public Curso() {
    }

    public Curso(String nombreCurso, int cantidadHorasXdia, int cantidadDiasXsemanas, String turno, int precioXhora) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasXdia = cantidadHorasXdia;
        this.cantidadDiasXsemana = cantidadDiasXsemanas;
        this.turno = turno;
        this.precioXhora = precioXhora;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasXdia() {
        return cantidadHorasXdia;
    }

    public void setCantidadHorasXdia(int cantidadHorasXdia) {
        this.cantidadHorasXdia = cantidadHorasXdia;
    }

    public int getCantidadDiasXsemanas() {
        return cantidadDiasXsemana;
    }

    public void setCantidadDiasXsemanas(int cantidadDiasXsemanas) {
        this.cantidadDiasXsemana = cantidadDiasXsemanas;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPrecioXhora() {
        return precioXhora;
    }

    public void setPrecioXhora(int precioXhora) {
        this.precioXhora = precioXhora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    public void cargarAlumnos() {
        for (int i = 0; i < alumnos.length; i++) {
            System.out.print("Ingrese nombre y apellido dl alumno " + (i + 1));
            alumnos[i] = leer.nextLine();
        }
    }

    public void crearCurso() {
        System.out.println("Para crear un curso necesitaremos los siguientes datos.");
        System.out.print("Nombre del curso a dar: ");
        nombreCurso = leer.nextLine();
        System.out.print("Cantidad de horas por dia: ");
        cantidadHorasXdia = leer.nextInt();
        System.out.print("Cantidad de dias por semana: ");
        cantidadDiasXsemana = leer.nextInt();
        System.out.print("Turno (mañana o tarde): ");
        turno = leer.nextLine();
        System.out.println("");
        System.out.print("Precio por hora: ");
        precioXhora = leer.nextInt();
        System.out.println("Ahora los alumnos(MAX 5): ");
        cargarAlumnos();
    }

    public int calcularGananciaSemanal() {

        return (cantidadHorasXdia * precioXhora * 5 * cantidadDiasXsemana); //el 5 son cantidad de alumnos
    }
}
