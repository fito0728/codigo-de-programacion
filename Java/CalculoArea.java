import java.util.Scanner;

public class CalculoArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita al usuario que seleccione la figura
        System.out.println("Seleccione la figura a calcular:");
        System.out.println("1. Rombo\n2. Rectángulo\n3. Cuadrado\n4. Trapecio");
        int figura = scanner.nextInt();
        
        double res = 0; // Variable para almacenar el resultado
        
        switch (figura) {
            case 1: // Área del Rombo
                System.out.print("Ingrese la diagonal mayor: ");
                double dMayor = scanner.nextDouble();
                System.out.print("Ingrese la diagonal menor: ");
                double dMenor = scanner.nextDouble();
                res = (dMayor * dMenor) / 2;
                System.out.println("El Área del Rombo es: " + res);
                break;
            
            case 2: // Área del Rectángulo
                System.out.print("Ingrese la base: ");
                double base = scanner.nextDouble();
                System.out.print("Ingrese la altura: ");
                double altura = scanner.nextDouble();
                res = base * altura;
                System.out.println("El Área del Rectángulo es: " + res);
                break;
                
            case 3: // Área del Cuadrado
                System.out.print("Ingrese el lado del cuadrado: ");
                double lado = scanner.nextDouble();
                res = lado * lado;
                System.out.println("El Área del Cuadrado es: " + res);
                break;
                
            case 4: // Área del Trapecio
                System.out.print("Ingrese la base mayor: ");
                double baseMayor = scanner.nextDouble();
                System.out.print("Ingrese la base menor: ");
                double baseMenor = scanner.nextDouble();
                System.out.print("Ingrese la altura: ");
                double alturaTrapecio = scanner.nextDouble();
                res = ((baseMayor + baseMenor) * alturaTrapecio) / 2;
                System.out.println("El Área del Trapecio es: " + res);
                break;
                
            default:
                System.out.println("Opción no válida. Por favor, seleccione una opción correcta.");
        }
        
        scanner.close();
    }
}
