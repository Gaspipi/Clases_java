/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author ferre
 */
public class EdificioDeOficinas extends Edificio {
    int numOficinas, cantPersonasXOficinas, numPisos;

    public EdificioDeOficinas(int numOficinas,int cantPersonasXOficinas, int numPisos, double alto, double ancho, double largo) {
        super(alto, ancho, largo);
        this.numOficinas = numOficinas;
        this.cantPersonasXOficinas = cantPersonasXOficinas;
        this.numPisos = numPisos;
    }
    public EdificioDeOficinas(){
        super();
    }
    
     @Override
    public void calcularSuperficie() {
        System.out.println("La superficie de este edificio es: "+ (largo*ancho));
    }

    @Override
    public void calcularVolumen() {
        System.out.println("El volumen de este edificio es: "+ (largo*ancho*alto));
    }
    public void cantPersonas(){
        System.out.println("Personas x Piso: " + cantPersonasXOficinas);
        System.out.println("Personas en todo el edificio: " + (cantPersonasXOficinas*numOficinas*numPisos));
    }
}
