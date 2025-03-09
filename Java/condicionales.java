import java.util.Scanner;

public class condicionales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Objeto para recibir entrada del usuario

        // Mostrar opciones al usuario
        System.out.println("Seleccione la figura para calcular su área:");
        System.out.println("1 para Rombo");
        System.out.println("2 para Rectángulo");
        System.out.println("3 para Cuadrado");
        System.out.println("4 para Trapecio");
        System.out.print("Ingrese el número de la figura: ");

        int Figura = scanner.nextInt(); // Leer la opción ingresada por el usuario
        double Area; // Variable para almacenar el área calculada

        switch (Figura) {
            case 1: // Área del rombo
                System.out.print("Ingresa el valor de la diagonal mayor: ");
                double Dmayor = scanner.nextDouble();
                System.out.print("Ingresa el valor de la diagonal menor: ");
                double Dmenor = scanner.nextDouble();
                Area = (Dmayor * Dmenor) / 2;
                System.out.println("El área del rombo es: " + Area);
                break;

            case 2: // Área del rectángulo
                System.out.print("Ingresa el valor del largo: ");
                double Largo = scanner.nextDouble();
                System.out.print("Ingresa el valor del ancho: ");
                double Ancho = scanner.nextDouble();
                Area = Largo * Ancho;
                System.out.println("El área del rectángulo es: " + Area);
                break;

            case 3: // Área del cuadrado
                System.out.print("Ingresa el valor del lado: ");
                double Lado = scanner.nextDouble();
                Area = Lado * Lado;
                System.out.println("El área del cuadrado es: " + Area);
                break;

            case 4: // Área del trapecio
                System.out.print("Ingresa el valor de la base mayor: ");
                double Bmayor = scanner.nextDouble();
                System.out.print("Ingresa el valor de la base menor: ");
                double Bmenor = scanner.nextDouble();
                System.out.print("Ingrese la altura: ");
                double H = scanner.nextDouble();
                Area = ((Bmayor + Bmenor) * H) / 2;
                System.out.println("El área del trapecio es: " + Area);
                break;

            default: // Opción inválida
                System.out.println("Opción no válida. Por favor, seleccione un número entre 1 y 4.");
                break;
        }

        scanner.close(); // Cerrar el objeto Scanner
    }
}
