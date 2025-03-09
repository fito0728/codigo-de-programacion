import java.util.ArrayList;
import java.util.HashMap;

public class BucleFor {
    public static void main(String[] args) {
        // Lista de nombres
        String[] nombres = {"Esteban", "Hans", "Jhon", "Juan Pablo\n\n"};
        
        // Iterar sobre la lista de nombres e imprimir cada nombre
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // Lista para almacenar diccionarios (HashMap)
        ArrayList<HashMap<String, Object>> Personas = new ArrayList<>();

        // Creación de diccionarios (HashMap) con nombres y edades
        HashMap<String, Object> a = new HashMap<>();
        a.put("nombre", "Esteban");
        a.put("Edad", 28);

        HashMap<String, Object> b = new HashMap<>();
        b.put("nombre", "Hans");
        b.put("Edad", 27);

        HashMap<String, Object> c = new HashMap<>();
        c.put("nombre", "Jhon");
        c.put("Edad", 41);

        HashMap<String, Object> d = new HashMap<>();
        d.put("nombre", "Juan Pablo");
        d.put("Edad", 23);

        // Agregar los diccionarios a la lista
        Personas.add(a);
        Personas.add(b);
        Personas.add(c);
        Personas.add(d);

        // Iterar sobre la lista e imprimir los valores
        for (HashMap<String, Object> persona : Personas) {
            System.out.println(persona.get("nombre") + " " + persona.get("Edad"));
        }
    }
}
