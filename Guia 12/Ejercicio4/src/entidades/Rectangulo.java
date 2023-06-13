/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import servicio.IcalculoFormas;

/**
 *
 * @author Usuario
 */
public class Rectangulo implements IcalculoFormas {

    public double base, altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        System.out.println("Area rectangulo: " + (base * altura));
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("Perímetro rectángulo: " + ((base + altura) * 2));
    }

}
