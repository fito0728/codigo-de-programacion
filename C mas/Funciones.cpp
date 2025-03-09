#include <iostream>
#include <vector>

using namespace std;

// Función sin parámetros ni retorno
void mostrarTexto()
{
    cout << "Hola" << endl;
}

// Función sin parámetros que multiplica dos números y muestra el resultado
void multiplicar()
{
    int a = 5, b = 8;
    cout << (a * b) << endl;
}

// Función con retorno de un valor entero
int multiplicarConRetorno()
{
    int a = 5, b = 8;
    return a * b;
}

// Función que devuelve un booleano
bool validarDato(int a)
{
    return a == 5;
}

int main()
{
    // Definir arreglos en C++ (equivalente a las tuplas en Python)
    int a[] = {1, 2, 3, 4, 5};
    int b[] = {6, 7, 8, 9, 10};
    vector<int> c;

    // Multiplicar elementos correspondientes de los arreglos
    for (int i = 0; i < 5; i++)
    {
        c.push_back(a[i] * b[i]);
    }

    // Mostrar el resultado de la multiplicación
    cout << "Resultado de la multiplicación de listas: ";
    for (int i : c)
    {
        cout << i << " ";
    }
    cout << endl;

    // Llamadas a las funciones
    mostrarTexto();
    multiplicar();

    // Ejemplo de return en funciones
    int resultado = multiplicarConRetorno();
    cout << "Resultado + 5: " << resultado + 5 << endl;

    // Ejemplo de función que devuelve un booleano
    int x = 5; // Variable global
    bool dato = validarDato(x);
    cout << "El valor devuelto por validarDato es: " << boolalpha << dato << endl;

    return 0;
}
