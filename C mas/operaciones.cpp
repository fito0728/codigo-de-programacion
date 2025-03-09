#include <iostream>
using namespace std;

int main()
{
    int A, B;

    cout << "Ingrese valor: ";
    cin >> A;
    cout << "Ingrese valor: ";
    cin >> B;

    int suma = A + B;
    cout << "La suma de los números es: " << suma << endl;

    int res = A - B;
    cout << "La resta de los números es: " << res << endl;

    int multi = A * B;
    cout << "La multiplicación de los números es: " << multi << endl;

    double div = (double)A / B;
    cout << "La división de los números es: " << div << endl;

    bool igual = (A == B);
    cout << "Los números son iguales: " << (igual ? "Sí" : "No") << endl;

    bool mayor = (A > B);
    cout << "El número menor es: " << (mayor ? B : A) << endl;
    cout << "El número mayor es: " << (mayor ? A : B) << endl;

    return 0;
}