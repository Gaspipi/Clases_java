
package Servicios;

import Entidades.Raices;

public class RaicesServicio {
    
    public Raices crearRaiz() {
        
    return new Raices(3,4,-2);
}

    public double getDiscriminante(Raices r){
        double dis = Math.pow(r.getB(), 2)-4*r.getA()*r.getC();
    return dis;
    }
public boolean tieneRaices(double dis){
    return dis>=0;
}    
   public boolean tieneRaiz(double dis){
    return dis==0;
   }

   public void obtenerRaices(Raices r){
       double disc = getDiscriminante(r);
       if (tieneRaices(disc)) {
           //System.out.println(-r.getB() + (Math.sqrt(disc)))/(2*r.getA());
           
           double aux = Math.sqrt(disc);
           double resolvente1 = (-r.getB()+aux)/2*r.getA();
           double resolvente2 = (-r.getB()-aux)/2*r.getA();
           
           
           System.out.println(resolvente1);
           System.out.println(resolvente2);
       } else {
           System.out.println("No tiene raices");
       }
       
      }
   public void obtenerRaiz(Raices r){
       double disc = getDiscriminante(r);
       if (tieneRaices(disc)) {
       double resolvente1 = (-r.getB())/2*r.getA();
           System.out.println(resolvente1);
       } else{
           System.out.println("No tiene raiz");   
       }
   }
   
   public void calcular(Raices r){
       double disc = getDiscriminante(r);
       if (tieneRaices(disc)) {
           obtenerRaices(r);
           
       } else if (tieneRaiz(disc)) {
           obtenerRaiz(r);
       }
       else{
           System.out.println("La función no tiene raiz");
       }
       
       
   }
}
