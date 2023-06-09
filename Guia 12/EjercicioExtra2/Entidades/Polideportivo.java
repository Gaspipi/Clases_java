/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author ferre
 */
public class Polideportivo extends Edificio {

    String nombre;
    boolean techado;

    public Polideportivo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }

    public Polideportivo(String nombre, boolean techado, double alto, double ancho, double largo) {
        super(alto, ancho, largo);
        this.nombre = nombre;
        this.techado = techado;
    }

     @Override
    public void calcularSuperficie() {
        System.out.println("La superficie de este Polideportivo es: "+ (largo*ancho));
    }

    @Override
    public void calcularVolumen() {
        System.out.println("El volumen de este Polideportivo es: "+ (largo*ancho*alto));
    }


}
