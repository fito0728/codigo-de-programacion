#include <iostream>
using namespace std;

int main()
{
    bool a = true;
    bool b = false;
    cout << (a && b) << endl;

    int a_int = 2;
    int b_int = 3;
    int c = 4;
    int d = 10;

    cout << (a_int == b_int && c < d) << endl;
    cout << (!(a_int == b_int) && c > d) << endl;

    return 0;
}