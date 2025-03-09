#include <iostream>
#include <vector>
#include <cstdlib>
#include <ctime>

using namespace std;

// Lista de equipos en los octavos de final del torneo
vector<string> equipos = {
    "Brasil", "Corea del Sur", "Francia", "Dinamarca",
    "Argentina", "México", "España", "Alemania",
    "Japón", "Inglaterra", "Perú", "USA",
    "Nigeria", "Chile", "Portugal", "Colombia"};

// Función para obtener los goles ingresados por el usuario
int obtenerGoles(string equipo)
{
    int goles;
    cout << "Ingrese goles de " << equipo << ": ";
    cin >> goles;
    return goles;
}

// Función para jugar el tiempo extra si hay empate
string jugar_tiempo_extra(string equipo1, string equipo2);
string jugar_penales(string equipo1, string equipo2);

// Función para jugar un partido entre dos equipos
string jugar_partido(string equipo1, string equipo2)
{
    cout << "\n"
         << equipo1 << " vs " << equipo2 << endl;

    int goles1 = obtenerGoles(equipo1);
    int goles2 = obtenerGoles(equipo2);

    // Determina el ganador del partido
    if (goles1 > goles2)
    {
        cout << equipo1 << " gana y avanza a la siguiente ronda!\n";
        return equipo1;
    }
    else if (goles2 > goles1)
    {
        cout << equipo2 << " gana y avanza a la siguiente ronda!\n";
        return equipo2;
    }
    else
    {
        cout << "EMPATE! Se jugará tiempo extra...\n";
        return jugar_tiempo_extra(equipo1, equipo2);
    }
}

// Función para jugar tiempo extra en caso de empate
string jugar_tiempo_extra(string equipo1, string equipo2)
{
    int goles1 = obtenerGoles(equipo1);
    int goles2 = obtenerGoles(equipo2);

    if (goles1 > goles2)
    {
        cout << equipo1 << " gana en tiempo extra!\n";
        return equipo1;
    }
    else if (goles2 > goles1)
    {
        cout << equipo2 << " gana en tiempo extra!\n";
        return equipo2;
    }
    else
    {
        cout << "¡Sigue el empate! Se define por penales...\n";
        return jugar_penales(equipo1, equipo2);
    }
}

// Función para simular tanda de penales
string jugar_penales(string equipo1, string equipo2)
{
    srand(time(0)); // Semilla para la generación aleatoria de números

    while (true)
    {
        int penales1 = rand() % 5 + 1; // Goles entre 1 y 5
        int penales2 = rand() % 5 + 1;

        cout << "Penales: " << equipo1 << " " << penales1 << " - " << penales2 << " " << equipo2 << endl;

        if (penales1 > penales2)
        {
            cout << equipo1 << " gana por penales!\n";
            return equipo1;
        }
        else if (penales2 > penales1)
        {
            cout << equipo2 << " gana por penales!\n";
            return equipo2;
        }
        else
        {
            cout << "Sigue el empate en penales... ¡Se repiten los tiros!\n";
        }
    }
}

// Función para simular cada ronda del torneo
vector<string> simular_ronda(vector<string> equipos, string nombre_ronda)
{
    cout << "\n===== " << nombre_ronda << " =====\n";
    vector<string> ganadores;

    // Se enfrentan los equipos de dos en dos
    for (size_t i = 0; i < equipos.size(); i += 2)
    {
        string ganador = jugar_partido(equipos[i], equipos[i + 1]);
        ganadores.push_back(ganador);
    }

    return ganadores;
}

// Función principal del programa
int main()
{
    vector<string> ronda_actual = equipos;
    vector<string> rondas = {"Octavos de Final", "Cuartos de Final", "Semifinal", "Final"};

    for (string nombre_ronda : rondas)
    {
        ronda_actual = simular_ronda(ronda_actual, nombre_ronda);
    }

    cout << "\nEL CAMPEÓN DEL MUNDIAL ES: " << ronda_actual[0] << "!\n";
    return 0;
}
