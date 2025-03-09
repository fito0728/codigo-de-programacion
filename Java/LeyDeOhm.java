import java.util.Scanner;  // Importamos Scanner para leer datos del usuario

public class LeyDeOhm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Creamos un objeto Scanner para entrada de datos
        
        // Solicitar al usuario el voltaje y la resistencia
        System.out.print("Ingrese el valor del voltaje del circuito (V): ");
        int voltaje = scanner.nextInt();
        
        System.out.print("Ingrese el valor de la resistencia del circuito (Ω): ");
        int resistencia = scanner.nextInt();
        
        // Verificamos que la resistencia no sea 0 para evitar división por cero
        if (resistencia == 0) {
            System.out.println("Error: La resistencia no puede ser 0 (división indefinida).");
        } else {
            // Calcular la intensidad de corriente (I = V / R)
            double intensidad = (double) voltaje / resistencia;
            
            // Mostrar el resultado
            System.out.printf("Al conectar un resistor de %d ohm a una fuente de %d volts, circulará una corriente de %.2f amperios.\n",
                              resistencia, voltaje, intensidad);
        }

        scanner.close(); // Cerramos el Scanner
    }
}
