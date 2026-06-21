public class Main {
    public static void main(String[] args) {

        // PASO 1: SENTENCIA IF-ELSE
        // Comprueba si la nota es suficiente para aprobar
        int nota = 14;

        if (nota >= 11) {
            System.out.println("Aprobado con " + nota);
        } else {
            System.out.println("Desaprobado con " + nota);
        }

        // PASO 2: BUCLE FOR
        // Imprime la tabla de multiplicar del número dado
        // for (inicio ; condición ; cambio)
        int numero = 3;
        System.out.println("Tabla del " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        // PASO 3: BUCLE WHILE
        // Repite mientras la condición sea verdadera
        // IMPORTANTE: contador-- evita el bucle infinito
        int contador = 5;
        System.out.println("Cuenta regresiva:");

        while (contador > 0) {
            System.out.println(contador);
            contador--;
        }

        System.out.println("¡Despegue!");
    }
}
