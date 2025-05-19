#include "LinkedList.h"

int main()
{
    // Crear una lista enlazada vacía
    LinkedList lista;
    
    // Adicionar elementos a la lista enlazada creada
    lista.insertLast(7);
    lista.insertLast(2025);
    lista.insertLast(5);
    lista.insertLast(1000);
    
    // Mostrar la lista
    cout << "Los elementos de la lista son: ";
    lista.show();

    cout << "\nCantidad de elementos en la lista: " << lista.getSize();
    
    return 0;
}