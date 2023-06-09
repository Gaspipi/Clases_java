
package guia_8_extras1;

import Entidades.Raices;
import Servicios.RaicesServicio;

public class Guia_8_Extras1 {

    public static void main(String[] args) {
        
    RaicesServicio rs = new RaicesServicio();
    Raices r = rs.crearRaiz();
    
    rs.calcular(r);
    
    
    }
    
}
