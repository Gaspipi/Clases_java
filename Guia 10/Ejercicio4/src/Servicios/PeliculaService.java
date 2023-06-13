/*
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package Servicios;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.reverse;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class PeliculaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ;
    ArrayList<Pelicula> listaPeliculas = new ArrayList();

    public void crearYguardarPelis() {
        String op = "s";
        while (!"n".equalsIgnoreCase(op)) {
            Pelicula p = new Pelicula();
            System.out.println("Ingrese el nombre de la pelicula: ");
            p.setNombre(leer.next());
            System.out.println("Ingrese el nombre del director: ");
            p.setDirector(leer.next());
            System.out.println("Ingrese la duracion de la peli: ");
            p.setDuracion(leer.nextDouble());
            listaPeliculas.add(p);
            System.out.println("Desea agregar otro ? S/N ");
            op = leer.next();
        }
        System.out.println(listaPeliculas);
    }

    public void pelisMayorUnahora() {
        ArrayList<Pelicula> masDe1h = new ArrayList();
        Iterator<Pelicula> itp = listaPeliculas.iterator();

        while (itp.hasNext()) {
            Pelicula p = itp.next();
            if (p.getDuracion() > 1) {
                masDe1h.add(p);
            }
        }
        System.out.println(masDe1h);
    }
     // comparator para la duracion
    public static Comparator<Pelicula> compararDuracion = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p2.getDuracion().compareTo(p1.getDuracion());
        }
    };

    public void ordenarDuracionPelisDesendente() {
        listaPeliculas.sort(compararDuracion);
        
        System.out.println(listaPeliculas);
    }

    public void ordenarDuracionPelisAscendente() {
        listaPeliculas.sort(compararDuracion);
        reverse(listaPeliculas);
        System.out.println(listaPeliculas);
    }
    // comparator para el nombre de las pelis
     public static Comparator<Pelicula> compararTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p2.getNombre().compareTo(p1.getNombre());
        }
    };
    public void ordenarPelisTituloAlfabe() {
      listaPeliculas.sort(compararTitulo);
      reverse(listaPeliculas);
      System.out.println(listaPeliculas);
    }
    // comparator para el director
 public static Comparator<Pelicula> compararDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p2.getDirector().compareTo(p1.getDirector());
        }
    };
    public void ordenarPelisDirectorAlfabe() {
     listaPeliculas.sort(compararDirector);
     reverse(listaPeliculas);
     System.out.println(listaPeliculas);
    }
}
