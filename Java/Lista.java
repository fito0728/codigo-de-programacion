import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        // Definir una lista con los días de la semana
        List<String> lista = new ArrayList<>();
        lista.add("Lunes");
        lista.add("Martes");
        lista.add("Miércoles");
        lista.add("Jueves");
        lista.add("Viernes");
        lista.add("Sábado");

        // Imprimir el quinto elemento de la lista (índice 4)
        System.out.println(lista.get(4)); // Salida: Viernes

        // Imprimir la lista completa
        System.out.println(lista); // Salida: [Lunes, Martes, Miércoles, Jueves, Viernes, Sábado]

        // Imprimir los primeros 3 elementos (sublista de 0 a 2)
        System.out.println(lista.subList(0, 3)); // Salida: [Lunes, Martes, Miércoles]

        // Crear una lista con diferentes tipos de datos
        List<Object> listaMixta = new ArrayList<>();
        listaMixta.add("Lunes");
        listaMixta.add("Martes");
        listaMixta.add("Miércoles");
        listaMixta.add("Jueves");
        listaMixta.add("Viernes");
        listaMixta.add("Sábado");
        listaMixta.add(1);
        listaMixta.add(2);
        listaMixta.add(3);

        // Crear una sublista dentro de la lista principal
        List<Object> subLista = new ArrayList<>();
        subLista.add("Esteban");
        subLista.add(0.2);
        subLista.add(2.25);
        subLista.add(true);

        listaMixta.add(subLista); // Agregamos la sublista a la lista principal

        // Imprimir los primeros 4 elementos de listaMixta
        System.out.println(listaMixta.subList(0, 4));

        // Imprimir los primeros 3 elementos de la sublista (posición 9)
        System.out.println(subLista.subList(0, 3));
    }
}
