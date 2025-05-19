#include "Animal.h"

// Definición del constructor
Animal::Animal() {}

// Definición de métodos propios de la clase Animal, que se van a sobreescribir
void Animal::expresarse() {
    cout << "Por definir" << endl;
}

string Animal::recorridoEnMetrosPorSegundo() {
    return "Por definir";
}

void Animal::alimentarse(string tipo){
    cout << "Por definir";
}