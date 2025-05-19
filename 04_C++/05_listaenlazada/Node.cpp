#include "Node.h"

// Definir el constructor
Node::Node(int data) {
    Node::data = data;
    Node::next = nullptr;
}

// Getter y Setter
// Dato del nodo
int Node::getData() const {
    return data;
}
void Node::setData(int data) {
    Node::data = data;
}

// Puntero al nodo siguiente (que almacena la dirección de memoria del nodo siguiente)
Node *Node::getNext() const {
    return next;
}
void Node::setNext(Node *next){
    Node::next = next;
}