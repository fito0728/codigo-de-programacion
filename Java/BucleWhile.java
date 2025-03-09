import java.util.Scanner; // Importar Scanner para leer entrada del usuario

public class BucleWhile {
    public static void main(String[] args) {
        int Contador = 0;

        // Primer bucle while: Se ejecuta mientras Contador sea menor que 30
        while (Contador < 30) {
            Contador++; // Incrementar el contador
            System.out.println("Iteración " + Contador); // Imprimir la iteración
        }

        Scanner scanner = new Scanner(System.in); // Crear Scanner para leer input

        // Segundo bucle while con condición dentro
        while (true) {
            System.out.println("Introduzca un valor mayor a 10:");
            int a = scanner.nextInt(); // Leer el valor ingresado

            if (a > 10) {
                System.out.println("Es correcto");
                break; // Salir del bucle si la condición es correcta
            } else {
                System.out.println("Es incorrecto, pruebe de nuevo");
            }
        }

        scanner.close(); // Cerrar el Scanner
    }
}
