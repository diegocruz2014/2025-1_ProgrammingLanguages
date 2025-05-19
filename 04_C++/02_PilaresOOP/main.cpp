#include <iostream>
using namespace std;

// Abstracción
class Mamifero {
    
    // Modificador de acceso
    private: // Encapsulamiento
        string nombre, expresion;
    
    public:
        // Constructor de la clase
        Mamifero(string nombre){
            this->nombre = nombre;
            this->expresion = "Por definir";  
        }
        // Constructor por sobrecarga de métodos (Polimorfismo)
        Mamifero() {
            this->nombre = "Por definir";
            this->expresion = "Por definir";
        }
        
        // Getter y Setter
        string getNombre() {
            return nombre;
        }
        void setNombre(string nombre){
            this->nombre = nombre;
        } 
        
        string getExpresion() {
            return expresion;
        }
        void setExpresion(string expresion){
            this->expresion = expresion;
        }
};

// Subclase Persona
// Herencia: Persona hereda de Mamifero.
class Persona : public Mamifero {
    
    private:
        string fechaNacimiento, tipoId;
        char sexoBiologico;
        int numId;
        string setMes(int numMes); // Declaración de un método sin definirlo.
    
    public:
        // Constructor
        Persona(string tipoId, int numId){
            this->tipoId = tipoId;
            this->numId = numId;
        }
        
        // Getter y Setter
        string getFechaNacimiento(){
            return fechaNacimiento;
        }
        void setFechaNacimiento(int day, int month, int year){
            this->fechaNacimiento = to_string(day)
                                    + " de "
                                    + to_string(month)
                                    + " de "
                                    + to_string(year);
        }
        
        // Continuará...

};






class a {
};

class b {
};

// Herencia múltiple: La clase c hereda de las clases a y b.
class c : public a, public b { 
};




// Función principal
int main()
{
    cout<<"Hello World";

    return 0;
}