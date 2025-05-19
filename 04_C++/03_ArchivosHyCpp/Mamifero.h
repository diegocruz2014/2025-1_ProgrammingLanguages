#ifndef MAMIFERO_H
#define MAMIFERO_H

#include <iostream>
using namespace std;

class Mamifero {
    private:
        string nombre;
    public:
        // Constructor
        Mamifero(string nombre);
        // Getter y Setter
        string getNombre();
        void setNombre(string nombre);
};

#endif