import java.util.Random;
import java.util.Scanner;

public class Octavosfinal {
    // Lista de equipos en los octavos de final del torneo
    static String[] equipos = {
        "Brasil", "Corea del Sur", "Francia", "Dinamarca",
        "Argentina", "México", "España", "Alemania",
        "Japón", "Inglaterra", "Perú", "USA",
        "Nigeria", "Chile", "Portugal", "Colombia"
    };

    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    // Método para obtener los goles ingresados por el usuario
    static int obtenerGoles(String equipo) {
        System.out.print("Ingrese goles de " + equipo + ": ");
        return sc.nextInt();
    }

    // Método para jugar el tiempo extra en caso de empate
    static String jugar_tiempo_extra(String equipo1, String equipo2) {
        int goles1 = obtenerGoles(equipo1);
        int goles2 = obtenerGoles(equipo2);

        if (goles1 > goles2) {
            System.out.println(equipo1 + " gana en tiempo extra!");
            return equipo1;
        } else if (goles2 > goles1) {
            System.out.println(equipo2 + " gana en tiempo extra!");
            return equipo2;
        } else {
            System.out.println("¡Sigue el empate! Se define por penales...");
            return jugar_penales(equipo1, equipo2);
        }
    }

    // Método para jugar un partido entre dos equipos
    static String jugar_partido(String equipo1, String equipo2) {
        System.out.println("\n" + equipo1 + " vs " + equipo2);
        int goles1 = obtenerGoles(equipo1);
        int goles2 = obtenerGoles(equipo2);

        if (goles1 > goles2) {
            System.out.println(equipo1 + " gana y avanza a la siguiente ronda!");
            return equipo1;
        } else if (goles2 > goles1) {
            System.out.println(equipo2 + " gana y avanza a la siguiente ronda!");
            return equipo2;
        } else {
            System.out.println("EMPATE! Se jugará tiempo extra...");
            return jugar_tiempo_extra(equipo1, equipo2);
        }
    }

    // Método para simular tanda de penales
    static String jugar_penales(String equipo1, String equipo2) {
        while (true) {
            int penales1 = rand.nextInt(5) + 1; // Genera goles aleatorios entre 1 y 5
            int penales2 = rand.nextInt(5) + 1;

            System.out.println("Penales: " + equipo1 + " " + penales1 + " - " + penales2 + " " + equipo2);

            if (penales1 > penales2) {
                System.out.println(equipo1 + " gana por penales!");
                return equipo1;
            } else if (penales2 > penales1) {
                System.out.println(equipo2 + " gana por penales!");
                return equipo2;
            } else {
                System.out.println("Sigue el empate en penales... ¡Se repiten los tiros!");
            }
        }
    }

    // Método para simular cada ronda del torneo
    static String[] simular_ronda(String[] equipos, String nombre_ronda) {
        System.out.println("\n===== " + nombre_ronda + " =====");
        String[] ganadores = new String[equipos.length / 2];

        for (int i = 0; i < equipos.length; i += 2) {
            ganadores[i / 2] = jugar_partido(equipos[i], equipos[i + 1]);
        }

        return ganadores;
    }

    // Método principal del programa
    public static void main(String[] args) {
        String[] ronda_actual = equipos;
        String[] rondas = {"Octavos de Final", "Cuartos de Final", "Semifinal", "Final"};

        for (String nombre_ronda : rondas) {
            ronda_actual = simular_ronda(ronda_actual, nombre_ronda);
        }

        System.out.println("\nEL CAMPEÓN DEL MUNDIAL ES: " + ronda_actual[0] + "!");
        sc.close();
    }
}
