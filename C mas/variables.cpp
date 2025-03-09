#include <iostream>
using namespace std;

int main()
{
    int a = 10;
    int b = 4;

    cout << "La primera variable es: " << a << endl;
    cout << "El signo de la operación es: * " << endl;
    cout << "La segunda variable es: " << b << endl;
    int c = a * b;
    cout << "El resultado es: " << c << endl;
    cout << "Tipo de dato: " << typeid(c).name() << endl;

    cout << "La primera variable es: " << a << endl;
    cout << "El signo de la operación es: / " << endl;
    cout << "La segunda variable es: " << b << endl;
    double d = (double)a / b;
    cout << "El resultado es: " << d << endl;
    cout << "Tipo de dato: " << typeid(d).name() << endl;

    cout << "La primera variable es: " << a << endl;
    cout << "El signo de la operación es: + " << endl;
    cout << "La segunda variable es: " << b << endl;
    c = a + b;
    cout << "El resultado es: " << c << endl;
    cout << "Tipo de dato: " << typeid(c).name() << endl;

    cout << "La primera variable es: " << a << endl;
    cout << "El signo de la operación es: - " << endl;
    cout << "La segunda variable es: " << b << endl;
    c = a - b;
    cout << "El resultado es: " << c << endl;
    cout << "Tipo de dato: " << typeid(c).name() << endl;

    cout << "La primera variable es: " << a << endl;
    cout << "El signo de la operación es: ** " << endl;
    cout << "La segunda variable es: " << b << endl;
    c = 1;
    for (int i = 0; i < b; i++)
    {
        c *= a;
    }
    cout << "El resultado es: " << c << endl;
    cout << "Tipo de dato: " << typeid(c).name() << endl;

    cout << "La primera variable es: " << a << endl;
    cout << "El signo de la operación es: % " << endl;
    cout << "La segunda variable es: " << b << endl;
    c = a % b;
    cout << "El resultado es: " << c << endl;
    cout << "Tipo de dato: " << typeid(c).name() << endl;

    return 0;
}