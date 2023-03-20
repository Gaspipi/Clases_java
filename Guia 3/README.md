structuras de control de flujo

Java proporciona una variedad de estructuras de control de flujo, como condicionales (`if-else`), bucles (`for`, `while`, `do-while`) y sentencias de control (`break`, `continue`, `return`). Estas estructuras permiten al programador controlar el flujo de ejecución de un programa y tomar decisiones basadas en las condiciones del mismo.

1.  Estructura de control `if-else`:

La estructura "if-else" es utilizada para ejecutar ciertas acciones dependiendo de si se cumple o no una condición. Si la condición es verdadera, se ejecuta el código dentro del bloque "if". Si la condición es falsa, se ejecuta el código dentro del bloque "else".

```Java
int edad = 18;

if (edad >= 18) {
    System.out.println("Eres mayor de edad");
} else {
    System.out.println("Eres menor de edad");
}
```

2.  Estructura de control `switch-case`:

La estructura `switch-case` permite seleccionar una de varias opciones basadas en el valor de una variable. Si el valor de la variable coincide con uno de los casos, se ejecuta el código dentro de ese caso.

```Java
char operador = '*';
int num1 = 10;
int num2 = 5;
int resultado = 0;

switch (operador) {
    case '+':
        resultado = num1 + num2;
        break;
    case '-':
        resultado = num1 - num2;
        break;
    case '*':
        resultado = num1 * num2;
        break;
    case '/':
        resultado = num1 / num2;
        break;
    default:
        System.out.println("Operador inválido");
        break;
}

System.out.println("El resultado es: " + resultado);
```

3.  Estructura de control `for`:

La estructura "for" es utilizada para iterar sobre una secuencia de valores. Se compone de una variable inicial, una condición de finalización y un incremento. El código dentro del bloque "for" se ejecuta una vez por cada valor en la secuencia.

```Java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```

4.  Estructura de control `while`:

La estructura "while" es utilizada para repetir una serie de instrucciones mientras se cumple una condición. El código dentro del bloque "while" se ejecuta siempre que la condición sea verdadera.

```Java
int i = 0;
while (i < 10) {
    System.out.println(i);
    i++;
}
```

5.  Estructura de control `do-while`:

La estructura "do-while" es similar a la estructura "while", pero garantiza que el código dentro del bloque se ejecutará al menos una vez antes de que se compruebe la condición.

```Java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 10);
```

6.  Estructura de control "foreach":

La estructura "foreach" se utiliza para iterar sobre una colección de elementos, como un arreglo o una lista. En lugar de especificar una variable de control de bucle y un límite, como en un bucle "for" tradicional, la estructura "foreach" utiliza una variable para iterar sobre cada elemento de la colección.

```Java
String[] nombres = {"Juan", "María", "Pedro", "Sofía"};

for (String nombre : nombres) {
    System.out.println(nombre);
}
```

7.  Estructura de control "break":

La estructura "break" se utiliza para salir de un bucle o una estructura de control "switch" antes de que se haya completado. Cuando se encuentra una declaración "break", la ejecución del bucle o estructura de control "switch" se detiene y se pasa al siguiente bloque de código.

```Java
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break;
    }
    System.out.println(i);
}
```

8.  Estructura de control "continue":

La estructura "continue" se utiliza para saltar a la siguiente iteración de un bucle sin salir del bucle por completo. Cuando se encuentra una declaración "continue", el bucle pasa a la siguiente iteración y salta cualquier código restante en el bloque actual.

```Java
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        continue;
    }
    System.out.println(i);
}
```
