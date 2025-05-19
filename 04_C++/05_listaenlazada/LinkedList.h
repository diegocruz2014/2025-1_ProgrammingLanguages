#include "Node.h"

class LinkedList {
    
    private:
        Node *first; // Almacena la referencia (dirección de memoria) del primer nodo
        Node *last; // Almacena la referencia (dirección de memoria) del último nodo
        int size; // Cantidad de elementos en la lista
        bool isEmpty(); // Función para verificar si la lista está o no vacía
    
    public:
        LinkedList(); // Constructor
        
        void insertLast(int); // Función para insertar un elemento al final de la lista enlazada
        void show(); // Función para mostrar la lista enlazada
        
        // Getter y Setter
        Node *getFirst() const;
        void setFirst(Node *first);
        
        Node *getLast() const;
        void setLast(Node *last);
        
        int getSize() const;
        void setSize(int size);
};