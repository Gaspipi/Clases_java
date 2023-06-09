
package Poo.Ejercicio2.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Operacion elemento = new Operacion();
        elemento.crearOperacion();
        System.out.println(elemento.sumar());
        System.out.println(elemento.restar());
        System.out.println(elemento.multiplicar());
        System.out.println(elemento.dividir());
        
        elemento.get();
    }
    
}
