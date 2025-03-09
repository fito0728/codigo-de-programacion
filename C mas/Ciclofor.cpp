#include <iostream>
#include <cmath> // Importar librería para usar la función pow()

using namespace std;

int main()
{
    // Declarar variables
    int A, C;

    // Solicitar al usuario que ingrese el primer valor
    cout << "Ingrese el primer valor: ";
    cin >> A; // Leer el primer número como entero

    // Solicitar al usuario que ingrese el segundo valor
    cout << "Ingrese el segundo valor: ";
    cin >> C; // Leer el segundo número como entero

    // Calcular la potencia de A elevado a C
    double valor = pow(A, C); // Se usa pow() de la librería cmath

    // Mostrar el resultado
    cout << "La potencia de " << A << " sobre " << C << " es: " << valor << endl;

    return 0;
}
