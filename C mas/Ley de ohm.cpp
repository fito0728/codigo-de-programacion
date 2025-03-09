#include <iostream> // Para entrada y salida de datos
using namespace std;

int main()
{
    int voltaje, resistencia; // Variables para almacenar los valores ingresados

    // Solicitar al usuario los valores del circuito
    cout << "Ingrese el valor del voltaje del circuito (V): ";
    cin >> voltaje;

    cout << "Ingrese el valor de la resistencia del circuito (Ω): ";
    cin >> resistencia;

    // Verificar que la resistencia no sea 0 para evitar error de división
    if (resistencia == 0)
    {
        cout << "Error: La resistencia no puede ser 0 (división indefinida)." << endl;
    }
    else
    {
        // Calcular la corriente (I = V / R)
        double intensidad = (double)voltaje / resistencia;

        // Mostrar el resultado con 2 decimales
        cout << "Al conectar un resistor de " << resistencia << " ohm a una fuente de "
             << voltaje << " volts, circulará una corriente de " << intensidad << " amperios." << endl;
    }

    return 0;
}
