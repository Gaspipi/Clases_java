/*

 */
package utilidadesejercicio4;

import Servicios.FechaService;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        FechaService fs = new FechaService();
        Date fechaNacimiento = fs.fechaNacimiento();
        Date fechaDeHoy = fs.fechaActual();
        System.out.println(fechaNacimiento.toString());
        System.out.println(fechaDeHoy.toString());
        System.out.println("su edad hasta la fecha de" + fechaDeHoy.getDate() + "/" + (fechaDeHoy.getMonth()+1) + "/" + (fechaDeHoy.getYear()+1900) + " es de: " + fs.diferencia(fechaNacimiento, fechaDeHoy));
        System.out.println("fecha Actual: "+fs.fechaActual());
    }

}
