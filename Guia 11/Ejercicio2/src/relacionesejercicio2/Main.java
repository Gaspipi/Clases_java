/*
Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
se dispara y se moja. Las clases por hacer del juego son las siguientes:
 */
package relacionesejercicio2;

import Entidades.Juego;
import Servicios.JuegoService;
import java.util.Scanner;




public class Main {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
       JuegoService js = new JuegoService();
       Juego RuletaRusa = js.llenarJuego();
  
       while(!js.ronda(RuletaRusa)){
          
           
       }
       
       
       
        
    }
    
}
