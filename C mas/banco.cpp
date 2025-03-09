#include <iostream>
#include <vector>
using namespace std;

// Clase que representa un usuario del banco
class Usuario
{
public:
    string nombre; // Nombre del usuario
    int pin;       // PIN de acceso
    double saldo;  // Saldo de la cuenta

    // Constructor para inicializar los atributos del usuario
    Usuario(string n, int p, double s)
    {
        nombre = n;
        pin = p;
        saldo = s;
    }
};

// Clase que representa el banco y sus operaciones
class Banco
{
private:
    vector<Usuario> usuarios; // Lista de usuarios

public:
    // Método para agregar usuarios al banco
    void agregarUsuario(Usuario usuario)
    {
        usuarios.push_back(usuario);
    }

    // Método para autenticar un usuario por nombre y PIN
    Usuario *autenticar(string nombre, int pin)
    {
        for (auto &usuario : usuarios)
        {
            if (usuario.nombre == nombre)
            {
                if (usuario.pin == pin)
                {
                    cout << "✅ Autenticación exitosa." << endl;
                    return &usuario;
                }
                else
                {
                    cout << "❌ PIN incorrecto." << endl;
                    return nullptr;
                }
            }
        }
        cout << "❌ El usuario no existe." << endl;
        return nullptr;
    }

    // Método para retirar dinero del usuario autenticado
    void retirarDinero(Usuario *usuario, double cantidad)
    {
        if (usuario->saldo >= cantidad)
        {
            usuario->saldo -= cantidad;
            cout << "✅ Retiro exitoso. Nuevo saldo: $" << usuario->saldo << endl;
        }
        else
        {
            cout << "❌ Saldo insuficiente. Saldo disponible: $" << usuario->saldo << endl;
        }
    }

    // Método para consultar el saldo del usuario
    void consultarSaldo(Usuario *usuario)
    {
        cout << "💰 Saldo actual: $" << usuario->saldo << endl;
    }
};

int main()
{
    Banco banco;

    // Se agregan usuarios al banco
    banco.agregarUsuario(Usuario("ana", 9872, 450));
    banco.agregarUsuario(Usuario("pablo", 5555, 200));
    banco.agregarUsuario(Usuario("rodrigo", 2222, 900));

    while (true)
    {
        cout << "\n💰 Bienvenido al banco. Por favor, identifíquese." << endl;
        Usuario *usuario = nullptr;
        string nombre;
        int pin, intentos = 3;

        while (intentos > 0 && usuario == nullptr)
        {
            cout << "Introduzca su nombre: ";
            cin >> nombre;
            cout << "Introduzca su PIN: ";
            cin >> pin;

            usuario = banco.autenticar(nombre, pin);

            if (usuario == nullptr)
            {
                intentos--;
                if (intentos == 0)
                {
                    cout << "⛔ Demasiados intentos fallidos. Volviendo al inicio..." << endl;
                }
            }
        }

        if (usuario != nullptr)
        {
            while (true)
            {
                cout << "\n📌 Opciones: 1. Retirar dinero  2. Consultar saldo  3. Salir\n";
                string opcion;
                cin >> opcion;

                if (opcion == "1")
                {
                    double cantidad;
                    cout << "💵 Cantidad a retirar: ";
                    cin >> cantidad;
                    banco.retirarDinero(usuario, cantidad);
                }
                else if (opcion == "2")
                {
                    banco.consultarSaldo(usuario);
                }
                else if (opcion == "3")
                {
                    cout << "👋 Sesión cerrada.\n";
                    break;
                }
            }
        }
    }
    return 0;
}
