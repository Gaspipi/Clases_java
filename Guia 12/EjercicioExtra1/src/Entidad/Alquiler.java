/*
En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
 */
package Entidad;

import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Karen
 */
public class Alquiler {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String nombre, posicionAmarre;
    private int numDocumento;
    private Date fechaAlquiler, fechaDevolucion;
    private Barcos barcoOcupado;

    public Alquiler() {
    }

    public Alquiler(String nombre, String posicionAmarre, int numDocumento, Date fechaAlquiler, Date fechaDevolucion, Barcos barcoOcupado) {
        this.nombre = nombre;
        this.posicionAmarre = posicionAmarre;
        this.numDocumento = numDocumento;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.barcoOcupado = barcoOcupado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(String posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public int getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(int numDocumento) {
        this.numDocumento = numDocumento;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Barcos getBarcoOcupado() {
        return barcoOcupado;
    }

    public void setBarcoOcupado(Barcos barcoOcupado) {
        this.barcoOcupado = barcoOcupado;
    }

    /*Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).*/
    public void calcularAlquiler() {
        System.out.println("Ingrese fecha de alquiler");
        System.out.println("Dia");
        int dia = leer.nextInt();
        System.out.println("Mes");
        int mes = leer.nextInt();
        System.out.println("año");
        int anio = leer.nextInt();
        System.out.println("Ingrese fecha de devolucion");
        System.out.println("Dia");
        int dia2 = leer.nextInt();
        System.out.println("Mes");
        int mes2 = leer.nextInt();
        System.out.println("año");
        int anio2 = leer.nextInt();

        fechaAlquiler = new Date(anio, mes, dia);
        fechaDevolucion = new Date(anio2, mes2, dia2);

        long dias = ChronoUnit.DAYS.between(fechaAlquiler.toInstant(), fechaDevolucion.toInstant());

        double modulo = 10 * barcoOcupado.getEslora();
        double alquiler = dias * modulo;

        if (barcoOcupado instanceof Veleros) {
            Veleros v = (Veleros) barcoOcupado;
            alquiler = dias * (modulo + v.getNumMastiles());

        }
        if (barcoOcupado instanceof BarcosAmotor) {
            BarcosAmotor bm = (BarcosAmotor) barcoOcupado;
            alquiler = dias * (modulo + bm.getPotenciaEnCV());

        }
        if (barcoOcupado instanceof YatesDeLujo) {
            YatesDeLujo yl = (YatesDeLujo) barcoOcupado;
            alquiler = dias * (modulo + yl.getPotenciaEnCV() + yl.getNumCamarotes());

        }
        System.out.println(dias);

        System.out.println("El total a pagar es: $" + alquiler);

    }

    public void cargarAlquiler(Barcos barco) {
        System.out.println("Ingrese su nombre completo");
        nombre = leer.next();
        System.out.println("Ingrese su numero de DNI");
        numDocumento = leer.nextInt();
        System.out.println("Ingrese la posicion de amarre");
        posicionAmarre = leer.next();

        barcoOcupado = barco;

    }

}
