/*
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.HECHO  
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
package Servicios;

import Entidades.Revolver;

public class RevolverService {

    public Revolver llenarRevolver() {
        Revolver r = new Revolver();
        r.setPosicionActual((int) (Math.random() * 6 + 1));
        r.setPosicionAgua((int) (Math.random() * 6 + 1));
        return r;
    }

    public boolean mojar(Revolver r) {

        return r.getPosicionActual() == r.getPosicionAgua();
    }

    public void siguienteRecamara(Revolver r) {

        r.setPosicionActual(r.getPosicionActual() + 1);

        if (r.getPosicionActual() >= 7) {
            r.setPosicionActual(1);
        }
    }

    public void mostrar(Revolver r) {
        System.out.println(r);
    }
}
