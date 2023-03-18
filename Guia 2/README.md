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

Lo primero que vemos es la clase `Main`, y dentro ded esta se encuentra el metodo `main`, por el momento solo vamos a escribir codigo dentro del metodo `main`.

```Java
public class Main {
	
	public static void main(String[] args) {
		int numero1, numero2, resultado;
		resultado = numero1 + numero2;
		System.out.println(resultado);
	}
}
```

En este programa podemos ver como definimos 3 variables de tipo entero o `int`, luego sumamos `numero1` con `numero2` y lo guardamos en `resultado` para mostrarlo en pantalla usando `System.out.println()`