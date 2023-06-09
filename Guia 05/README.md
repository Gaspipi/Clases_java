## Arreglos en Java

En Java, un arreglo es una estructura de datos que permite almacenar un conjunto de valores del mismo tipo en una única variable. Cada elemento del arreglo está identificado por un índice numérico y se accede a él mediante este índice.

### Declaración de un arreglo

Para declarar un arreglo en Java, se utiliza la siguiente sintaxis:

```Java
tipo[] nombreArreglo;
```

Donde "tipo" es el tipo de dato de los elementos que se van a almacenar en el arreglo y "nombreArreglo" es el nombre que se le asigna al arreglo.

### Creación de un arreglo

Para crear un arreglo en Java, se utiliza la siguiente sintaxis:

```Java
nombreArreglo = new tipo[tamaño];
```

Donde "nombreArreglo" es el nombre del arreglo, "tipo" es el tipo de dato de los elementos que se van a almacenar en el arreglo y "tamaño" es la cantidad de elementos que se desea almacenar.

### Inicialización de un arreglo

Existen varias formas de inicializar un arreglo en Java:

1.  Inicialización en línea: se utiliza la siguiente sintaxis para inicializar un arreglo con valores predefinidos:

```Java
tipo[] nombreArreglo = {valor1, valor2, valor3, ..., valorN};
```

2.  Inicialización por asignación: se utiliza la siguiente sintaxis para inicializar un arreglo con valores asignados en tiempo de ejecución:

```Java
tipo[] nombreArreglo = new tipo[tamaño]; 
nombreArreglo[0] = valor1;
nombreArreglo[1] = valor2;
  ... nombreArreglo[N-1] = valorN;
```

Donde "nombreArreglo" es el nombre del arreglo, "tipo" es el tipo de dato de los elementos que se van a almacenar en el arreglo, "tamaño" es la cantidad de elementos que se desea almacenar y "valor1", "valor2", ..., "valorN" son los valores que se desean asignar a cada elemento del arreglo.

### Acceso a los elementos de un arreglo

Para acceder a los elementos de un arreglo en Java, se utiliza la siguiente sintaxis:

```Java
nombreArreglo[indice];
```

Donde "nombreArreglo" es el nombre del arreglo e "indice" es el número que identifica al elemento que se desea acceder. Los índices en Java comienzan desde cero, es decir, el primer elemento del arreglo tiene un índice de cero, el segundo tiene un índice de uno, y así sucesivamente.

### Ejemplo

A continuación, se muestra un ejemplo de cómo declarar, crear, inicializar y acceder a los elementos de un arreglo en Java:
```Java
public class EjemploArreglo {
    public static void main(String[] args) {
        // Declaración de un arreglo de enteros
        int[] numeros;

        // Creación de un arreglo de enteros con cinco elementos
        numeros = new int[5];

        // Inicialización de los elementos del arreglo
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        // Acceso a los elementos del arreglo
        System.out.println("El primer elemento del arreglo es: " + numeros[0]);
        System.out.println("El tercer elemento del arreglo es: " + numeros[2

    }
}
```

En este ejemplo, se crea un arreglo de enteros con cinco elementos y se inicializan los valores del arreglo con los números del 1 al 5. Luego, se accede a los elementos del arreglo utilizando su índice y se imprimen en la consola. El resultado sería el siguiente:

```bash
El primer elemento del arreglo es: 1 
El tercer elemento del arreglo es: 3
```

## Bucle for-each

En Java, un `for-each` (o `for mejorado`) es una forma simplificada de recorrer elementos de una estructura de datos como un array, una lista o un conjunto. La sintaxis de un `for-each` es la siguiente:



```Java
for (TipoDeDato nombreDeVariable : estructuraDeDatos) {
// cuerpo del bucle 
}
```
En este bucle `for-each`, `TipoDeDato` es el tipo de dato de los elementos de la estructura de datos, `nombreDeVariable` es el nombre de la variable que se utiliza para hacer referencia a cada elemento de la estructura de datos y `estructuraDeDatos` es la estructura de datos que se va a recorrer.

Para recorrer un array con un `for-each`, se utiliza la siguiente sintaxis:


```Java
int[] numeros = {1, 2, 3, 4, 5};
for (int numero : numeros) {
	System.out.println(numero);
}
```

En este ejemplo, se define un array de números y se utiliza un `for-each` para recorrer cada elemento del array y mostrarlo por pantalla. La variable `numero` se utiliza para hacer referencia a cada elemento del array en cada iteración del bucle.