# Fundamentos de Java

Java es un lenguaje de programación de alto nivel, orientado a objetos y multiplataforma. Fue desarrollado por Sun Microsystems en la década de 1990 y actualmente es propiedad de Oracle Corporation.

## Estructura de un programa Java

Un programa Java se compone de una o más clases. Cada clase define un conjunto de variables y métodos que describen el comportamiento de un objeto. El siguiente es un ejemplo de la estructura básica de una clase Java:


```Java

public class MiClase {          

	// Variables     
	private int miVariable;         
	
	// Constructor
	public MiClase() {
		miVariable = 0;     
	}
	
	// Métodos     
	public int getMiVariable() {         
		return miVariable;     
	}          
	
	public void setMiVariable(int valor) {
		miVariable = valor;     
	} 
}
```

En este ejemplo, la clase `MiClase` define una variable privada llamada `miVariable`, un constructor que inicializa la variable en cero, y dos métodos públicos para obtener y establecer el valor de la variable.

## Variables y tipos de datos

En Java, las variables deben ser declaradas con un tipo de datos específico. Los tipos de datos primitivos en Java incluyen:

-   `byte`: un número entero de 8 bits con signo
-   `short`: un número entero de 16 bits con signo
-   `int`: un número entero de 32 bits con signo
-   `long`: un número entero de 64 bits con signo
-   `float`: un número decimal de 32 bits de precisión simple
-   `double`: un número decimal de 64 bits de precisión doble
-   `char`: un solo carácter Unicode de 16 bits
-   `boolean`: un valor verdadero o falso (`true` o `false`)

Además de los tipos de datos primitivos, Java también tiene tipos de datos de referencia, que incluyen objetos, arrays, clases, interfaces y enumeraciones.

## Operadores y expresiones

Java admite una variedad de operadores, como aritméticos, lógicos, relacionales y de asignación. Las expresiones en Java están formadas por variables, valores literales, llamadas a métodos y operadores. Por ejemplo:

```Java
int resultado = 5 + 3 * 2; // resultado es igual a 11 
boolean esVerdadero = resultado > 10; // esVerdadero es igual a true
```