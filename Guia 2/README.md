# Tipos de datos primitivos:

`byte`: un número entero de 8 bits con signo

`short`: un número entero de 16 bits con signo

`int`: un número entero de 32 bits con signo

`long`: un número entero de 64 bits con signo

`float`: un número decimal de 32 bits de precisión simple

`double`: un número decimal de 64 bits de precisión doble

`char`: un solo carácter Unicode de 16 bits

`boolean`: un valor verdadero o falso (`true` o `false`)

# Estructura de un programa Java


```Java
public class Main {
	
	public static void main(String[] args) {
	//
	// CODIGO
	//
	}
}
```

Lo primero que vemos es la clase `Main`, y dentro de esta se encuentra el metodo `main`, por el momento solo vamos a escribir codigo dentro este metodo.

```Java
public class Main {
	
	public static void main(String[] args) {
		int numero1, numero2, resultado;
		numero1 = 5;
		numero2 = 10;
		resultado = numero1 + numero2;
		System.out.println(resultado); //Se imprime el resultado de 10 + 5, o sea 15
	}
}
```

En este programa podemos ver como declaramos 3 variables de tipo entero o `int`, a `numero1` y `numero2` le damos valores (5 y 10 respectivamente), luego sumamos `numero1` con `numero2` y lo guardamos en `resultado` para mostrarlo en pantalla usando `System.out.println()`

Como podemos ver, todo lo que se encuentre dentro del metodo `main` se ejecuta, por tanto todo nuestro codigo debe escribirse dentro de ese metodo.