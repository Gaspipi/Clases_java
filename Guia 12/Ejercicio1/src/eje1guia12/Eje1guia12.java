/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje1guia12;

import atributos.Animal;
import atributos.Caballo;
import atributos.Gato;
import atributos.Perro;

/**
 *
 * @author Usuario
 */
public class Eje1guia12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perro = new Perro("Ayudante de Santa", "galletas",10, "dogo");
        Animal gato = new Gato("Bola de Nuieve", "croquetas",5, "chico");
        Animal caballo = new Caballo("El Veloz", "pasto",15, "no se");
        perro.alimentar();
        gato.alimentar();
        caballo.alimentar();
    }
    
}
