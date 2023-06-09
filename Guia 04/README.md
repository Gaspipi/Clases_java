## Métodos en Java

En Java, un método es un bloque de código que realiza una tarea específica y puede ser llamado desde otras partes del programa. Los métodos tienen un nombre y pueden tener cero o más parámetros de entrada.

Los métodos pueden ser de dos tipos:

-   **Métodos con retorno de valor:** Estos métodos devuelven un valor al lugar donde se los llama. El tipo de valor devuelto debe ser especificado en la declaración del método utilizando una palabra clave, como `int`, `double`, `String`, etc.
    
-   **Métodos sin retorno de valor:** Estos métodos no devuelven ningún valor. En lugar de eso, realizan una tarea y finalizan su ejecución.


## Diferencia entre retornar un valor y retornar void

La principal diferencia entre un método con retorno de valor y un método sin retorno de valor es que el primero devuelve un valor específico, mientras que el segundo no devuelve nada.

Cuando se declara un método con un tipo de retorno, como `int` o `String`, el método debe terminar con una sentencia `return` que devuelve un valor del tipo especificado. Por ejemplo:

```Java
public int suma(int num1, int num2) {
	int resultado = num1 + num2;
	return resultado;
 }
```

En este ejemplo, el método `suma` recibe dos números enteros y devuelve su suma como un valor entero.

Por otro lado, cuando se declara un método con la palabra clave `void`, no se espera que el método devuelva ningún valor. Por ejemplo:

```java
public void imprimirMensaje(String mensaje) {
	System.out.println(mensaje);
 }
```
En este ejemplo, el método `imprimirMensaje` recibe un parámetro de tipo `String` y lo imprime en la consola, pero no devuelve ningún valor.

En resumen, la diferencia entre retornar un valor y retornar `void` en Java es que un método con retorno de valor devuelve un valor específico del tipo especificado, mientras que un método sin retorno de valor simplemente realiza una tarea y finaliza su ejecución sin devolver nada.