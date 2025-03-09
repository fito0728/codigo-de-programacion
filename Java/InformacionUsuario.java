import java.util.Scanner;  // Importamos Scanner para leer los datos del usuario

public class InformacionUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Creamos un objeto Scanner para entrada de datos
        
        // Solicitar al usuario su nombre completo
        System.out.print("Escriba sus nombres completos: ");
        String nombre = scanner.nextLine();
        
        // Solicitar su apellido completo
        System.out.print("Escriba sus apellidos completos: ");
        String apellido = scanner.nextLine();
        
        // Solicitar su profesión
        System.out.print("Escriba su profesión: ");
        String profesion = scanner.nextLine();
        
        // Solicitar su año de nacimiento
        System.out.print("Escriba su año de nacimiento: ");
        int anioNacimiento = scanner.nextInt();
        
        // Calcular la edad en el año 2025
        int edad = 2025 - anioNacimiento;

        // Mostrar el resultado
        System.out.println("El(La) " + profesion + " " + nombre + " " + apellido + " tiene " + edad + " años.");

        scanner.close(); // Cerramos el Scanner
    }
}
