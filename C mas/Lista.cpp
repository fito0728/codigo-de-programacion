#include <iostream>
#include <vector>

using namespace std;

int main()
{
    // Definir un vector con los días de la semana
    vector<string> lista = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};

    // Imprimir el quinto elemento de la lista (índice 4)
    cout << lista[4] << endl; // Salida: Viernes

    // Imprimir la lista completa
    cout << "[ ";
    for (string dia : lista)
    {
        cout << dia << " ";
    }
    cout << "]" << endl;

    // Imprimir los primeros 3 elementos
    cout << "[ ";
    for (int i = 0; i < 3; i++)
    {
        cout << lista[i] << " ";
    }
    cout << "]" << endl;

    // Crear un vector con diferentes tipos de datos
    vector<string> listaMixta = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};
    vector<string> subLista = {"Esteban", "0.2", "2.25", "true"};

    // Imprimir los primeros 4 elementos de listaMixta
    cout << "[ ";
    for (int i = 0; i < 4; i++)
    {
        cout << listaMixta[i] << " ";
    }
    cout << "]" << endl;

    // Imprimir los primeros 3 elementos de la sublista
    cout << "[ ";
    for (int i = 0; i < 3; i++)
    {
        cout << subLista[i] << " ";
    }
    cout << "]" << endl;

    return 0;
}
