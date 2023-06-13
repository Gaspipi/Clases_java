/*
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package coleccionesejercicio4;

import Servicios.PeliculaService;

public class Main {

 
    public static void main(String[] args) {
      PeliculaService ps = new PeliculaService(); 
      ps.crearYguardarPelis();
      ps.pelisMayorUnahora();
      ps.ordenarDuracionPelisDesendente();
      ps.ordenarDuracionPelisAscendente();
      ps.ordenarPelisTituloAlfabe();
      ps.ordenarPelisDirectorAlfabe();
    }
    
}
