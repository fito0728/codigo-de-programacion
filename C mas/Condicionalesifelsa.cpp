#include <iostream>
#include <string>

using namespace std;

int main()
{
    // Definir una variable con valor 2
    int a = 2;

    // Comprobar si 'a' es igual a 2
    if (a == 2)
    {
        cout << "a vale 2" << endl; // Se ejecuta esta línea porque 'a' es igual a 2
    }
    else
    {
        cout << "a es diferente de 2" << endl;
    }

    // ------------------------------------------------

    // Definir variables con información personal
    string Nombre = "Esteban";
    int Edad = 28;
    string Pais = "Colombia";

    // Primera condición: Verifica si todas las condiciones son verdaderas
    if (Nombre == "Esteban" && Edad == 28 && Pais == "Colombia")
    {
        cout << "Su nombre es " << Nombre << ", tiene " << Edad << " años y es de " << Pais << endl;
    }
    // Segunda condición: Verifica si el nombre es 'Esteban', pero la edad NO es 28
    else if (Nombre == "Esteban" && Edad != 28)
    {
        cout << "Su nombre es Esteban y no tiene 28 años" << endl;
    }
    // Tercera condición: Verifica si el nombre NO es 'Esteban', pero la edad es 28
    else if (Nombre != "Esteban" && Edad == 28)
    {
        cout << "Su nombre no es Esteban y tiene 28 años" << endl;
    }
    // Si ninguna condición anterior se cumple, entra en el bloque 'else'
    else
    {
        cout << "No se llama Esteban ni tiene 28 años" << endl;
    }

    return 0;
}
