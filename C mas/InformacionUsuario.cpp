#include <iostream> // Para entrada y salida de datos
#include <string>   // Para manejar cadenas de texto
using namespace std;

int main()
{
    string nombre, apellido, profesion; // Variables para almacenar los datos del usuario
    int anioNacimiento, edad;

    // Solicitar al usuario su nombre completo
    cout << "Escriba sus nombres completos: ";
    getline(cin, nombre); // Leer toda la línea con espacios incluidos

    // Solicitar su apellido completo
    cout << "Escriba sus apellidos completos: ";
    getline(cin, apellido);

    // Solicitar su profesión
    cout << "Escriba su profesión: ";
    getline(cin, profesion);

    // Solicitar su año de nacimiento
    cout << "Escriba su año de nacimiento: ";
    cin >> anioNacimiento;

    // Calcular la edad en el año 2025
    edad = 2025 - anioNacimiento;

    // Mostrar el resultado
    cout << "El(La) " << profesion << " " << nombre << " " << apellido << " tiene " << edad << " años." << endl;

    return 0;
}
