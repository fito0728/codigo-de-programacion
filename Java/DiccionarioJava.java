import java.util.HashMap;

public class DiccionarioJava {
    public static void main(String[] args) {
        // Creación de un diccionario en Java usando HashMap
        HashMap<String, String> coche = new HashMap<>();

        // Agregar pares clave-valor al diccionario
        coche.put("marca", "Ford");
        coche.put("color", "rojo");
        coche.put("modelo", "sedan");
        coche.put("placa", "ROS227");

        // Imprimir el color actual del coche
        System.out.println("Color actual: " + coche.get("color"));

        // Cambiar el valor del color
        coche.put("color", "verde");
        System.out.println("Nuevo color: " + coche.get("color")); // Ahora es verde

        // Imprimir la marca actual del coche
        System.out.println("Marca actual: " + coche.get("marca"));

        // Cambiar el valor de la marca
        coche.put("marca", "Renault");
        System.out.println("Nueva marca: " + coche.get("marca")); // Ahora es Renault

        // Mostrar el diccionario completo con los cambios realizados
        System.out.println("Diccionario actualizado: " + coche);
    }
}
