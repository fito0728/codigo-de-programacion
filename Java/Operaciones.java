import java.util.Scanner; // Importar Scanner para leer entrada de usuario

public class Operaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Crear un objeto Scanner

        // Solicitar valores al usuario
        System.out.print("Ingrese el primer valor: ");
        int A = sc.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        int B = sc.nextInt();

        // Realizar operaciones matemáticas básicas
        int suma = A + B;
        int resta = A - B;
        int multi = A * B;
        double div = (B != 0) ? (double) A / B : 0; // Manejo de división evitando división por 0

        // Comparaciones entre los números
        boolean igual = (A == B);
        boolean mayor = (A > B);
        boolean menor = (A < B);

        // Mostrar los resultados en consola
        System.out.println("\n--- Resultados ---");
        System.out.println("La suma de los números es: " + suma);
        System.out.println("La resta de los números es: " + resta);
        System.out.println("La multiplicación de los números es: " + multi);
        System.out.println("La división de los números es: " + (B != 0 ? div : "No se puede dividir por 0"));

        if (igual) {
            System.out.println("Ambos números son iguales.");
        } else {
            System.out.println("El número menor es: " + (menor ? A : B));
            System.out.println("El número mayor es: " + (mayor ? A : B));
        }

        sc.close(); // Cerrar el Scanner para evitar fugas de memoria
    }
}
