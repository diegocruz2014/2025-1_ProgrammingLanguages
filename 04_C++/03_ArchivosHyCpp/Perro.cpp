#include "Perro.h"

// Constructor
Perro::Perro(string nombre, int edad) : Mamifero(nombre) {
    this->edad = edad;
}

// Métodos provenientes de la clase Animal
void Perro::expresarse() {
    cout << "Guau" << endl;
}

string Perro::recorridoEnMetrosPorSegundo() {
    return "Recorro dos metros en un segundo";
}

void Perro::alimentarse(string tipo){
    if (tipo == "hogareño") {
        cout << "Vivo en un hogar, me alimento de concentrado" << endl;
    }
    else if (tipo == "callejero") {
        cout << "Me alimento de lo que encuentro en la calle" << endl;
    }
    else {
        cout << "No se ha definido de qué me alimento" << endl;
    }
}

// Getter y Setter
string Perro::getEdad() {
    return to_string(edad) + " años";
}

void Perro::setEdad(int edad) {
    this->edad = edad;
}



