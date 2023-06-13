/*
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:

 */
package Entidades;

import java.util.ArrayList;


public class Juego {
    ArrayList<Jugador> listaJugadores;
    Revolver r ;

    public Juego() {
        listaJugadores = new ArrayList();
    }

    public Juego(ArrayList<Jugador> listaJugadores, Revolver r) {
        this.listaJugadores = listaJugadores;
        this.r = r;
    }

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public Revolver getR() {
        return r;
    }

    public void setR(Revolver r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Juego{" + "listaJugadores=" + listaJugadores + ", r=" + r + '}';
    }

    
    
    
}
