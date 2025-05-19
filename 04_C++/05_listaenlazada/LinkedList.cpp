#include "LinkedList.h"

// Definir el constructor de la clase
LinkedList::LinkedList() {
    this->first = nullptr;
    this->last = nullptr;
    this->size = 0;
}

// Definir la función para verificar si la lista está vacía
bool LinkedList::isEmpty() {
    return first == nullptr;
}

void LinkedList::insertLast(int data){
    
    // Asignar memoria al nuevo elemento y rellenar el campo de datos
    Node *newNode = new Node(data);
    
    // Verificar si la lista está vacía
    if(isEmpty()){
        // Operación para insertar un nodo en una lista vacía
        setFirst(newNode);
        setLast(newNode);
    }
    else{
        // Operación para insertar un elemento al final de la lista
        last->setNext(newNode);
        setLast(newNode);
    }
    
    // Actualizar el tamaño de la lista
    int size = getSize();
    setSize(++size);
}

// Función para mostrar la lista
void LinkedList::show() {
    
    // Verificar si la lista está vacía
    if(isEmpty()) {
        cout << "La lista está vacía" << endl;
    }
    else {
        // Otorgar a un nodo auxiliar el primer nodo de la lista
        Node *aux = getFirst();
        
        // Recorrer la lista
        while(aux != nullptr) {
            cout << aux->getData() << " "; // Imprimir el dato del nodo
            aux = aux->getNext();
        }
        cout << endl;
    }
}

// Getter y Setter
// first
Node *LinkedList::getFirst() const {
    return first;
}
void LinkedList::setFirst(Node *first) {
    LinkedList::first = first;
}

// last
Node *LinkedList::getLast() const {
    return last;
}
void LinkedList::setLast(Node *last) {
    LinkedList::last = last;
}

// size
int LinkedList::getSize() const {
    return size;
}
void LinkedList::setSize(int size){
    LinkedList::size = size;
}