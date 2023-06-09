
package Poo.Ejercicio2;


public class Circunferencia {
    //Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. 
    //A continuación, se deben crear los siguientes métodos:
//Método constructor que inicialice el radio pasado como parámetro.
//Métodos get y set para el atributo radio de la clase Circunferencia.
//Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
//Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
//Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

    private double radio;
    private double area;
    private double perimetro;
    
    public Circunferencia(double rad){ //Constructor
        radio = rad;
    }
    
    public void set(double rad){ //Metodo set
        radio = rad;
    }
    
    public void get(){ //Metodo get
        System.out.println("Radio: " + radio);
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
    }
    
    public void area(){
        area = Math.pow(Math.PI*radio, 2);
    }
    
    public void perimetro(){
        perimetro = 2*(Math.PI*radio);
    }
    
}
