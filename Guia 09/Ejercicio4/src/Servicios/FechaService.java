/*
FechaService, en paquete Servicios, que tenga los siguientes métodos:
a) Método fechaNacimiento que pregunte al usuario día, mes y año de
su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
new Date(anio, mes, dia);**HECHO**
b) Método fechaActual que cree un objeto fecha con el día actual. Para
esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
fechaActual = new Date();**Hecho?**
El método debe retornar el objeto Date.
c) Método diferencia que reciba las dos fechas por parámetro y retorna
la diferencia de años entre una y otra (edad del usuario).
 */
package Servicios;

import java.util.Date;
import java.util.Scanner;

public class FechaService {
    Scanner leer = new Scanner(System.in);
    public Date fechaNacimiento(){
        int dia,mes,anno;
        System.out.println("Ingrese su Fecha de nacimiento: ");
        System.out.print("Dia: ");
        dia=leer.nextInt();
        System.out.print("Mes: ");
        mes=leer.nextInt()-1;
        System.out.print("Año: ");
        anno=leer.nextInt()-1900;
        Date d = new Date(anno,mes,dia);
        return  d;
    }
    public Date fechaActual(){
        Date fechaActual = new Date();
        return fechaActual;
    }
    public int diferencia(Date fn,Date fa ){
        int edad=fa.getYear()-fn.getYear(); 
      return edad;  
    }
}
