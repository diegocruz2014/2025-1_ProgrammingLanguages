#include <iostream>
using namespace std;

class Node {
    
    private:
        int data; // Dato del nodo
        Node *next; // Puntero: Almacena la dirección de memoria del otro nodo con el que se enlazará
    
    public:
        Node(int data = 0); // Señalamos el constructor de la clase
        
        // Getter y Setter: Señalamos estas funciones
        int getData() const;
        void setData(int data);
        
        Node *getNext() const;
        void setNext(Node *next);
};