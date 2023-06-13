/*

 */
package utilidadesejercicio6;

import Entidades.Curso;


public class Main {

   
    public static void main(String[] args) {
        Curso c1 = new Curso();
        c1.crearCurso();
        System.out.println("Las ganancias semanales del curso es de: "+c1.calcularGananciaSemanal());
    }
    
}
