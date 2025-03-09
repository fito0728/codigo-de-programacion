#include <iostream> // Librería estándar para entrada y salida

using namespace std;

int main()
{
    int Contador = 0;

    // Primer bucle while: Se ejecuta mientras Contador sea menor que 30
    while (Contador < 30)
    {
        Contador++;                               // Incrementar el contador
        cout << "Iteración " << Contador << endl; // Imprimir la iteración
    }

    int a;

    // Segundo bucle while con condición dentro
    while (true)
    {
        cout << "Introduzca un valor mayor a 10: ";
        cin >> a; // Leer el valor ingresado

        if (a > 10)
        {
            cout << "Es correcto" << endl;
            break; // Salir del bucle si la condición es correcta
        }
        else
        {
            cout << "Es incorrecto, pruebe de nuevo" << endl;
        }
    }

    return 0;
}
