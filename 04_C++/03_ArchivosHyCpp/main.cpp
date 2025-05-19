#include "Perro.h"

int main()
{
    Perro toby("Toby", 3);
    cout << "Nombre del perro: " << toby.getNombre() << endl;
    cout << "Edad: " << toby.getEdad() << endl;
    toby.expresarse();
    cout << toby.recorridoEnMetrosPorSegundo() << endl;
    toby.alimentarse("hogareño");

    return 0;
}