import java.util.ArrayList;
import java.util.Scanner;

// Clase que representa a un usuario del banco
class Usuario {
    String nombre;  // Nombre del usuario
    int pin;  // PIN de acceso
    double saldo;  // Saldo de la cuenta

    // Constructor para inicializar los datos del usuario
    public Usuario(String nombre, int pin, double saldo) {
        this.nombre = nombre;
        this.pin = pin;
        this.saldo = saldo;
    }
}

// Clase que representa el banco y sus operaciones
class Banco {
    private ArrayList<Usuario> usuarios;  // Lista de usuarios registrados

    // Constructor que inicializa la lista de usuarios
    public Banco() {
        this.usuarios = new ArrayList<>();
    }

    // Método para agregar usuarios al banco
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    // Método para autenticar a un usuario por su nombre y PIN
    public Usuario autenticar(String nombre, int pin) {
        for (Usuario usuario : usuarios) {  // Recorremos la lista de usuarios
            if (usuario.nombre.equals(nombre)) {  // Si el nombre coincide
                if (usuario.pin == pin) {  // Si el PIN también es correcto
                    System.out.println("✅ Autenticación exitosa.");
                    return usuario;  // Retorna el usuario autenticado
                } else {
                    System.out.println("❌ PIN incorrecto.");
                    return null;
                }
            }
        }
        System.out.println("❌ El usuario no existe.");
        return null;
    }

    // Método para retirar dinero de la cuenta del usuario
    public void retirarDinero(Usuario usuario, double cantidad) {
        if (usuario.saldo >= cantidad) {  // Si hay suficiente saldo
            usuario.saldo -= cantidad;  // Descontamos el saldo
            System.out.println("✅ Retiro exitoso. Nuevo saldo: $" + usuario.saldo);
        } else {
            System.out.println("❌ Saldo insuficiente. Saldo disponible: $" + usuario.saldo);
        }
    }

    // Método para consultar el saldo de un usuario
    public void consultarSaldo(Usuario usuario) {
        System.out.println("💰 Saldo actual: $" + usuario.saldo);
    }
}

// Clase principal que contiene el flujo del programa
public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();  // Se crea una instancia del banco

        // Se agregan usuarios con saldo inicial
        banco.agregarUsuario(new Usuario("ana", 9872, 450));
        banco.agregarUsuario(new Usuario("pablo", 5555, 200));
        banco.agregarUsuario(new Usuario("rodrigo", 2222, 900));

        // Bucle principal para la autenticación
        while (true) {
            System.out.println("\n💰 Bienvenido al banco. Por favor, identifíquese.");
            Usuario usuario = null;
            int intentos = 3;

            while (intentos > 0 && usuario == null) {
                System.out.print("Introduzca su nombre: ");
                String nombre = scanner.next();
                System.out.print("Introduzca su PIN: ");

                if (scanner.hasNextInt()) {
                    int pin = scanner.nextInt();
                    usuario = banco.autenticar(nombre, pin);
                } else {
                    System.out.println("❌ Error: El PIN debe ser un número.");
                    scanner.next();
                }

                if (usuario == null) {
                    intentos--;
                    if (intentos == 0) {
                        System.out.println("⛔ Demasiados intentos fallidos. Volviendo al inicio...");
                    } else {
                        System.out.println("⚠️ Intentos restantes: " + intentos);
                    }
                }
            }

            if (usuario != null) {
                while (true) {
                    System.out.println("\n📌 Opciones disponibles:");
                    System.out.println("1. Retirar dinero");
                    System.out.println("2. Consultar saldo");
                    System.out.println("3. Cerrar sesión");
                    System.out.print("Seleccione una opción: ");
                    String opcion = scanner.next();

                    switch (opcion) {
                        case "1":
                            System.out.print("💵 Introduzca cantidad a retirar: ");
                            if (scanner.hasNextDouble()) {
                                double cantidad = scanner.nextDouble();
                                banco.retirarDinero(usuario, cantidad);
                            } else {
                                System.out.println("❌ Error: Ingrese un valor numérico válido.");
                                scanner.next();
                            }
                            break;
                        case "2":
                            banco.consultarSaldo(usuario);
                            break;
                        case "3":
                            System.out.println("👋 Sesión cerrada. Volviendo al inicio...");
                            break;
                        default:
                            System.out.println("❌ Opción inválida, intente de nuevo.");
                    }

                    if (opcion.equals("3")) {
                        break;
                    }
                }
            }
        }
    }
}
