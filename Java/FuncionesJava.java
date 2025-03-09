import java.util.ArrayList;

public class FuncionesJava {
    public static void main(String[] args) {
        // Definir dos arreglos (equivalente a las tuplas en Python)
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8, 9, 10};
        ArrayList<Integer> c = new ArrayList<>();

        // Multiplicar elementos correspondientes de los arreglos
        for (int i = 0; i < a.length; i++) {
            c.add(a[i] * b[i]);
        }
        
        // Mostrar el resultado de la multiplicación
        System.out.println(c);

        // Llamada a funciones
        mostrarTexto();
        multiplicar();
        
        // Ejemplo de return en funciones
        int resultado = multiplicarConRetorno();
        System.out.println(resultado + 5);

        // Ejemplo de función que devuelve un booleano
        int x = 5;  // Variable global
        boolean dato = validarDato(x);
        System.out.println(dato);
    }

    // Función sin parámetros ni retorno
    public static void mostrarTexto() {
        System.out.println("Hola");
    }

    // Función sin parámetros ni retorno que multiplica dos números
    public static void multiplicar() {
        int a = 5;
        int b = 8;
        System.out.println(a * b);
    }

    // Función con retorno de un valor entero
    public static int multiplicarConRetorno() {
        int a = 5;
        int b = 8;
        return a * b;
    }

    // Función que devuelve un booleano
    public static boolean validarDato(int a) {
        return a == 5;
    }
}
