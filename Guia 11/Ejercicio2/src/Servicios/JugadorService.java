/*
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a true y el método
devuelve true, sino false.
 */
package Servicios;

import Entidades.Revolver;

public class JugadorService {

    public Boolean disparo(Revolver r) {
        RevolverService rs = new RevolverService();
        boolean aux = false;
        if (rs.mojar(r)) {
            System.out.println("Perdiste :(");
            aux = true;
        } else {
            System.out.println("La fortuna te sonrie");
            rs.siguienteRecamara(r);
        }
        return aux;
    }

}
