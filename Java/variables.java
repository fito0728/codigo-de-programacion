
public class variables {

    public static void main(String[] args) {
        // Definimos dos variables numéricas
        int a = 10;
        int b = 4;

        // Multiplicación
        System.out.println("La primera variable es: " + a);
        System.out.println("El signo de la operación es: * ");
        System.out.println("La segunda variable es: " + b);
        int c = a * b;
        System.out.println("El resultado es: " + c);
        System.out.println("El tipo de dato es: " + ((Object) c).getClass().getSimpleName());

        // División
        System.out.println("El signo de la operación es: / ");
        double d = (double) a / b; // Conversión a double para obtener resultado decimal
        System.out.println("El resultado es: " + d);
        System.out.println("El tipo de dato es: " + ((Object) d).getClass().getSimpleName());

        // Suma
        System.out.println("El signo de la operación es: + ");
        c = a + b;
        System.out.println("El resultado es: " + c);

        // Resta
        System.out.println("El signo de la operación es: - ");
        c = a - b;
        System.out.println("El resultado es: " + c);

        // Potencia
        System.out.println("El signo de la operación es: ** ");
        double potencia = Math.pow(a, b);
        System.out.println("El resultado es: " + potencia);

        // Módulo
        System.out.println("El signo de la operación es: % ");
        c = a % b;
        System.out.println("El resultado es: " + c);
    }
}
