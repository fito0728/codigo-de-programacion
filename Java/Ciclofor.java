import java.util.Scanner; // Importar Scanner para leer la entrada del usuario

public class Ciclofor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner

        // Solicitar al usuario que ingrese el primer valor
        System.out.print("Ingrese el primer valor: ");
        int A = scanner.nextInt(); // Leer el primer número como entero

        // Solicitar al usuario que ingrese el segundo valor
        System.out.print("Ingrese el segundo valor: ");
        int C = scanner.nextInt(); // Leer el segundo número como entero

        // Calcular la potencia de A elevado a C
        double valor = Math.pow(A, C); // Se usa Math.pow() para calcular la potencia

        // Mostrar el resultado
        System.out.println("La potencia de " + A + " sobre " + C + " es: " + valor);

        scanner.close(); // Cerrar el scanner
    }
}
