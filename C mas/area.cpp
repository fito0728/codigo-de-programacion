#include <iostream>
using namespace std;

int main()
{
    int figura;
    cout << "Seleccione la figura a calcular:\n1. Rombo\n2. Rectángulo\n3. Cuadrado\n4. Trapecio\n";
    cin >> figura;

    double var1, var2, var3, res;
    cout << "Ingrese el primer valor: ";
    cin >> var1;
    cout << "Ingrese el segundo valor: ";
    cin >> var2;

    switch (figura)
    {
    case 1: // Rombo (Área = (D1 * D2) / 2)
        res = (var1 * var2) / 2;
        cout << "El área del rombo es: " << res << endl;
        break;

    case 2: // Rectángulo (Área = base * altura)
        res = var1 * var2;
        cout << "El área del rectángulo es: " << res << endl;
        break;

    case 3:                // Cuadrado (Área = lado^2)
        res = var1 * var2; // Ambos valores deberían ser iguales
        cout << "El área del cuadrado es: " << res << endl;
        break;

    case 4: // Trapecio (Área = (B1 + B2) * altura / 2)
        cout << "Ingrese la altura del trapecio: ";
        cin >> var3;
        res = ((var1 + var2) * var3) / 2;
        cout << "El área del trapecio es: " << res << endl;
        break;

    default:
        cout << "Opción no válida, seleccione un número del 1 al 4." << endl;
    }
    return 0;
}
