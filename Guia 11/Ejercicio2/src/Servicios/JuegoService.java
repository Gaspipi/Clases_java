/*
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
10
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package Servicios;

import Entidades.Juego;
import Entidades.Jugador;
import java.util.Scanner;

public class JuegoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Juego llenarJuego() {
        RevolverService rs = new RevolverService();
        Juego juego = new Juego();
        System.out.println("Cuantos jugadores van a jugar ?");
        int cantJugadores = leer.nextInt();
        if (cantJugadores < 0 || cantJugadores > 6) {
            cantJugadores = 6;
        }
        System.out.println("Que nombres van a tener los Jugadores?");
        String nombreJugadores = leer.next();
        if (nombreJugadores.equals("") || nombreJugadores.equals(" ")) {
            nombreJugadores = "jugador";
        }

        for (int i = 0; i < cantJugadores; i++) {
            juego.getListaJugadores().add(new Jugador(i + 1, nombreJugadores, false));
        }

        juego.setR(rs.llenarRevolver());

        return juego;
    }

    public Boolean ronda(Juego j) {
      JugadorService js = new JugadorService();
      RevolverService rs = new RevolverService();
        for (Jugador jugador :j.getListaJugadores()) {
            System.out.println("Es el turno del "+jugador.getNombre()+jugador.getId());
            rs.mostrar(j.getR());
            if(js.disparo(j.getR())){
              jugador.setMojado(true);
              return true;
            }   
        }
        return false;
    }

}
