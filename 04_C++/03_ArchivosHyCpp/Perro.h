#ifndef PERRO_H
#define PERRO_H

#include "Animal.h"
#include "Mamifero.h"

// Herencia múltiple
class Perro : public Animal, public Mamifero {
    private:
        int edad;
    
    public:
        // Constructor
        Perro(string nombre, int edad);
        
        // Métodos heredados
        void expresarse() override;
        string recorridoEnMetrosPorSegundo() override;
        void alimentarse(string tipo) override;
        
        // Getter y Setter
        string getEdad();
        void setEdad(int edad);
};

#endif