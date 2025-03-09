#include <iostream>

using namespace std;

int main()
{
    int Figura;  // Variable para almacenar la opción ingresada por el usuario
    double Area; // Variable para almacenar el área calculada

    // Mostrar opciones al usuario
    cout << "Seleccione la figura para calcular su área:" << endl;
    cout << "1 para Rombo" << endl;
    cout << "2 para Rectángulo" << endl;
    cout << "3 para Cuadrado" << endl;
    cout << "4 para Trapecio" << endl;
    cout << "Ingrese el número de la figura: ";
    cin >> Figura;

    switch (Figura)
    {
    case 1:
    { // Área del rombo
        double Dmayor, Dmenor;
        cout << "Ingresa el valor de la diagonal mayor: ";
        cin >> Dmayor;
        cout << "Ingresa el valor de la diagonal menor: ";
        cin >> Dmenor;
        Area = (Dmayor * Dmenor) / 2;
        cout << "El área del rombo es: " << Area << endl;
        break;
    }

    case 2:
    { // Área del rectángulo
        double Largo, Ancho;
        cout << "Ingresa el valor del largo: ";
        cin >> Largo;
        cout << "Ingresa el valor del ancho: ";
        cin >> Ancho;
        Area = Largo * Ancho;
        cout << "El área del rectángulo es: " << Area << endl;
        break;
    }

    case 3:
    { // Área del cuadrado
        double Lado;
        cout << "Ingresa el valor del lado: ";
        cin >> Lado;
        Area = Lado * Lado;
        cout << "El área del cuadrado es: " << Area << endl;
        break;
    }

    case 4:
    { // Área del trapecio
        double Bmayor, Bmenor, H;
        cout << "Ingresa el valor de la base mayor: ";
        cin >> Bmayor;
        cout << "Ingresa el valor de la base menor: ";
        cin >> Bmenor;
        cout << "Ingrese la altura: ";
        cin >> H;
        Area = ((Bmayor + Bmenor) * H) / 2;
        cout << "El área del trapecio es: " << Area << endl;
        break;
    }

    default: // Opción inválida
        cout << "Opción no válida. Por favor, seleccione un número entre 1 y 4." << endl;
        break;
    }

    return 0;
}
