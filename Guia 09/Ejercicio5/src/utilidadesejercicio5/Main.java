/*

 */
package utilidadesejercicio5;

import Servicios.PersonaService;
import Entidades.Persona;
import java.util.Scanner;

public class Main {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonaService ps = new PersonaService();
        Persona p1 = ps.crearPersona();
        System.out.print("Ingrese la una edad para ver que la persona sea menor a esta: ");
        int edad=leer.nextInt();
        System.out.println("que la persona sea menor de "+edad+" es: "+ps.menorQue(p1, edad));
        ps.mostrarPersona(p1);
        
        
        
    }
    
}
