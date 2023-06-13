/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje4guia12;

import entidades.Circulo;
import entidades.Rectangulo;

/**
 *
 * @author Usuario
 */
public class Eje4guia12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo r = new Rectangulo(4, 10);
        Circulo c = new Circulo(8);

        System.out.println("Rectangulo");
        r.calcularArea();
        r.calcularPerimetro();
        System.out.println("Circulo");
        c.calcularArea();
        c.calcularPerimetro();
    }

}
