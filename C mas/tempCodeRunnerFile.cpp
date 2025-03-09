#include <iostream> // Biblioteca para entrada/salida
#include <cmath>    // Biblioteca para operaciones matemáticas como pow()

using namespace std;

int main()
{
    int A, C; // Declaramos variables para almacenar los valores ingresados

    // Solicitar el primer valor
    cout << "Ingrese el primer valor: ";
    cin >> A; // Leer el número entero

    // Solicitar el segundo valor
    cout << "Ingrese el segundo valor: ";
    cin >> C; // Leer el número entero

    // Calcular la potencia A^C usando pow()
    int potencia = pow(A, C);

    // Mostrar el resultado
    cout << "La potencia de " << A << " sobre " << C << " es: " << potencia << endl;

    return 0; // Indicar que el programa terminó correctamente
}
