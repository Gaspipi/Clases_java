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
public class Circulo implements IcalculoFormas {

    private double diametro, radio;

    public Circulo() {
    }

    public Circulo(double diametro) {
        this.diametro = diametro;
        this.radio = diametro / 2;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        System.out.println("Área circulo: " + (PI * radio * radio));

    }

    @Override
    public void calcularPerimetro() {
        System.out.println("Perímetro circulo: " + (PI * diametro));

    }

}
