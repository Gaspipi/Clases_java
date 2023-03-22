import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
        // Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
        //  * * * *
        //  *     *
        //  *     *
        //  * * * *
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la medida del cuadrado");
        int limite = leer.nextInt();
        for (int i =0; i < limite; i++){
            for (int j = 0; j < limite; j++){
                if (i == 0 || i == limite-1 || j ==0 || j == limite-1){
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }
}
