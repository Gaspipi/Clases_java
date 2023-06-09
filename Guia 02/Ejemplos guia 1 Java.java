public class Main {
    public static void main(String[] args) {
    //Crear un proyecto de Java y definir al menos 6 variables en tu IDE de distintos tipos de datos.
    // Ahora deberás asignarles un valor.
    //Define variables donde puedas alojar los resultados y prueba usar dos operadores de cada tipo.

    
    int numEntero = 400000; //Int -> Integer / entero
                short numChico = 400;
                long numGrandes = 5000234L;
                String palabra = "gallo" // Cadena de caracteres
                Character letra = 'C'; // Caracter
                boolean bool = Boolean.TRUE; //V - F
                float flotante = 5.7346346373474373743573457f; //Numero Flotante
                double numConComas = 4.567456454; //Numero decimal
            
                double resultado;
                resultado = numChico*numConComas
             System.out.println(numChico + " * " + numConComas + "=" + resultado);
             resultado = numChico+numConComas
             System.out.println(numChico + " + " + numConComas + "=" + resultado);
             resultado = numChico/numConComas
             System.out.println(numChico + " / " + numConComas + "=" + resultado);
             resultado = numChico-numConComas
             System.out.println(numChico + " - " + numConComas + "=" + resultado);
             
             //Define una variable que aloje tu nombre y otra que guarde tu edad. Imprime ambas variables por pantalla.
             int edad = 23;
             String nombre = "Roman";
        System.out.println("Mi nombre es " + nombre + " y mi edad es: " + edad);
}
}