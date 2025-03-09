#include <iostream>
#include <map>

using namespace std;

int main()
{
    // Creación de un diccionario en C++ usando map
    map<string, string> coche;

    // Agregar pares clave-valor al diccionario
    coche["marca"] = "Ford";
    coche["color"] = "rojo";
    coche["modelo"] = "sedan";
    coche["placa"] = "ROS227";

    // Imprimir el color actual del coche
    cout << "Color actual: " << coche["color"] << endl;

    // Cambiar el valor del color
    coche["color"] = "verde";
    cout << "Nuevo color: " << coche["color"] << endl; // Ahora es verde

    // Imprimir la marca actual del coche
    cout << "Marca actual: " << coche["marca"] << endl;

    // Cambiar el valor de la marca
    coche["marca"] = "Renault";
    cout << "Nueva marca: " << coche["marca"] << endl; // Ahora es Renault

    // Mostrar el diccionario completo con los cambios realizados
    cout << "Diccionario actualizado:" << endl;
    for (const auto &par : coche)
    {
        cout << par.first << ": " << par.second << endl;
    }

    return 0;
}
