public class Condicionesifelsa {
    public static void main(String[] args) {
        // Definir una variable con valor 2
        int a = 2;

        // Comprobar si 'a' es igual a 2
        if (a == 2) {
            System.out.println("a vale 2"); // Se ejecuta esta línea porque 'a' es igual a 2
        } else {
            System.out.println("a es diferente de 2");
        }

        // ------------------------------------------------

        // Definir variables con información personal
        String Nombre = "Esteban";
        int Edad = 28;
        String Pais = "Colombia";

        // Primera condición: Verifica si todas las condiciones son verdaderas
        if (Nombre.equals("Esteban") && Edad == 28 && Pais.equals("Colombia")) {
            System.out.println("Su nombre es " + Nombre + ", tiene " + Edad + " años y es de " + Pais);
        }
        // Segunda condición: Verifica si el nombre es 'Esteban', pero la edad NO es 28
        else if (Nombre.equals("Esteban") && Edad != 28) {
            System.out.println("Su nombre es Esteban y no tiene 28 años");
        }
        // Tercera condición: Verifica si el nombre NO es 'Esteban', pero la edad es 28
        else if (!Nombre.equals("Esteban") && Edad == 28) {
            System.out.println("Su nombre no es Esteban y tiene 28 años");
        }
        // Si ninguna condición anterior se cumple, entra en el bloque 'else'
        else {
            System.out.println("No se llama Esteban ni tiene 28 años");
        }
    }
}
