public class tablaverdad {
    public static void main(String[] args) {
        // Declaración de variables booleanas
        boolean a = true;
        boolean b = false;

        // Operación lógica AND: Solo es True si ambas son True
        System.out.println(a && b); // False, porque b es False

        // Declaración de variables numéricas
        int aNum = 2, bNum = 3, c = 4, d = 10;

        // Evaluación de condiciones con operadores lógicos
        System.out.println((aNum == bNum) && (c < d));
        // False, porque aNum == bNum (2 == 3) es False, aunque c < d (4 < 10) es True.

        System.out.println(!(aNum == bNum) && (c > d));
        // False, porque !(aNum == bNum) (not 2 == 3) es True, pero c > d (4 > 10) es False.
    }
}
