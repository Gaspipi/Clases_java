/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author ferre
 */
public abstract class Edificio {

    public Edificio() {
    }

    public Edificio(double alto, double ancho, double largo) {
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }
    protected double alto, ancho, largo;
    
    public abstract void calcularSuperficie();
    
    public abstract void calcularVolumen();
}
