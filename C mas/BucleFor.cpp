#include <iostream>
#include <vector>
#include <map>

using namespace std;

int main()
{
    // Lista de nombres
    vector<string> nombres = {"Esteban", "Hans", "Jhon", "Juan Pablo\n\n"};

    // Iterar sobre la lista de nombres e imprimir cada nombre
    for (const string &nombre : nombres)
    {
        cout << nombre << endl;
    }

    // Lista para almacenar diccionarios (map)
    vector<map<string, int>> Personas;

    // Creación de diccionarios (map) con nombres y edades
    map<string, int> a = {{"Esteban", 28}};
    map<string, int> b = {{"Hans", 27}};
    map<string, int> c = {{"Jhon", 41}};
    map<string, int> d = {{"Juan Pablo", 23}};

    // Agregar los diccionarios a la lista
    Personas.push_back(a);
    Personas.push_back(b);
    Personas.push_back(c);
    Personas.push_back(d);

    // Iterar sobre la lista e imprimir los valores
    for (const auto &persona : Personas)
    {
        for (const auto &p : persona)
        {
            cout << p.first << " " << p.second << endl;
        }
    }

    return 0;
}
