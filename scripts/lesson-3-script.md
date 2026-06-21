# Script — Lección 3: Estructuras de control y bucles (10 minutos)

---

## [INTRO — 0:00 a 0:30]

*Pantalla: título "Estructuras de control y bucles"*

**Narración:**
En las lecciones anteriores aprendiste a declarar variables y a mostrar datos en pantalla.
Pero los programas reales no hacen siempre lo mismo: a veces toman decisiones,
y a veces repiten acciones muchas veces.
Hoy aprenderemos cómo hacer eso en Java.

---

## [SECCIÓN 1 — 0:30 a 3:00]

### Tomar decisiones con `if-else`

*Pantalla: abrir JDoodle con el archivo `Main.java`, cursor en el método `main`*

**Narración:**
Imagina que quieres saber si un estudiante aprobó o no según su nota.
Para eso usamos `if-else`, que en español significa "si... de lo contrario".

```java
int nota = 14;

if (nota >= 11) {
    System.out.println("Aprobado con " + nota);
} else {
    System.out.println("Desaprobado con " + nota);
}
```

*Pantalla: escribir el bloque `if-else` paso a paso y resaltar cada parte*

**Narración:**
`if` evalúa una condición entre paréntesis.
Si esa condición es verdadera, ejecuta el bloque entre llaves.
Si es falsa, ejecuta el bloque del `else`.

*Pantalla: cambiar el valor de `nota` a 8 y ejecutar*

**Narración:**
Prueba cambiando la nota a 8. ¿Qué mensaje aparece ahora?
Eso es lo más poderoso del `if-else`: el programa decide solo qué hacer.

---

## [SECCIÓN 2 — 3:00 a 5:30]

### Repetir con el bucle `for`

*Pantalla: agregar código debajo del `if-else`*

**Narración:**
Ahora imagina que quieres imprimir la tabla de multiplicar del 3.
¿Lo harías con diez líneas de `System.out.println`?
Con un bucle `for` lo haces en tres:

```java
int numero = 3;
System.out.println("Tabla del " + numero + ":");

for (int i = 1; i <= 10; i++) {
    System.out.println(numero + " x " + i + " = " + (numero * i));
}
```

*Pantalla: escribir el bucle `for` y resaltar sus tres partes*

**Narración:**
El `for` tiene tres partes separadas por punto y coma.
La primera — `int i = 1` — es el punto de inicio.
La segunda — `i <= 10` — es la condición: el bucle continúa mientras sea verdadera.
La tercera — `i++` — es lo que cambia en cada repetición: `i` aumenta en 1.

*Pantalla: ejecutar y mostrar la tabla completa en consola*

**Narración:**
Con solo tres líneas, Java calculó e imprimió los diez resultados.
Prueba cambiando `numero` a 5 y mira qué pasa.

---

## [SECCIÓN 3 — 5:30 a 8:00]

### Repetir con el bucle `while`

*Pantalla: agregar código debajo del `for`*

**Narración:**
El bucle `while` también repite código, pero se usa cuando no sabes exactamente
cuántas veces necesitas repetir. Solo necesitas una condición.
Vamos a hacer una cuenta regresiva:

```java
int contador = 5;
System.out.println("Cuenta regresiva:");

while (contador > 0) {
    System.out.println(contador);
    contador--;
}
System.out.println("¡Despegue!");
```

*Pantalla: escribir el bucle `while` y resaltar la condición y el `contador--`*

**Narración:**
`while` repite el bloque mientras `contador` sea mayor que cero.
Dentro del bucle, `contador--` reduce el valor en 1 cada vez.
Si olvidaras esa línea, el bucle nunca terminaría. Eso se llama bucle infinito.
¡Siempre asegúrate de que la condición eventualmente sea falsa!

*Pantalla: ejecutar y mostrar la cuenta regresiva en consola*

---

## [SECCIÓN 4 — 8:00 a 9:30]

### ¿`for` o `while`? ¿Cuándo usar cada uno?

*Pantalla: mostrar ambos bucles lado a lado*

**Narración:**
Una regla simple para recordar:
Usa `for` cuando sabes de antemano cuántas veces vas a repetir,
como recorrer una tabla del 1 al 10.
Usa `while` cuando repites hasta que algo cambie,
como una cuenta regresiva o esperar la respuesta del usuario.

Los dos hacen lo mismo, pero cada uno es más claro en su contexto.

---

## [CIERRE — 9:30 a 10:00]

*Pantalla: resumen en texto*

> `if (condición) { } else { }` ejecuta código según una decisión
> El bucle `for` repite cuando sabes cuántas veces: `for (inicio; condición; cambio)`
> El bucle `while` repite mientras una condición sea verdadera
> Siempre modifica la variable de control del `while` para evitar bucles infinitos

**Narración:**
Ahora tu programa puede tomar decisiones y repetir acciones automáticamente.
En la siguiente lección aprenderás a organizar tu código en métodos,
para no repetir lo mismo en distintas partes del programa.
Hasta pronto.
