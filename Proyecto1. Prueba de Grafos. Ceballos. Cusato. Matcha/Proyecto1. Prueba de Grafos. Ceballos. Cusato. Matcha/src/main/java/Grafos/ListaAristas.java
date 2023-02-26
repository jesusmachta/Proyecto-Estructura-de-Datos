
package Grafos;

import javax.swing.JOptionPane;

public class ListaAristas {
    private NodoArista head;
    private int size;

    /**
     *Constructor de la clase ListaAristas
     */
    public ListaAristas() {
        this.head = null;
        this.size = 0;
    }

    /**
     *
     * Getter de la variable head
     */
    public NodoArista getHead() {
        return head;
    }

    /**
     *
     * Setter de la variable head
     */
    public void setHead(NodoArista head) {
        this.head = head;
    }

    /**
     *
     * Getter de la variable size
     */
    public int getSize() {
        return size;
    }

    /**
     *
     * Setter de la variable size
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    /**
     *
     * Método para verificar si una lista está vacía
     */
    public boolean isEmpty(){
        return head == null;
    }

    /**
     *
     * Método que se utiliza para insertar un nodo al inicio de la lista
     * 
     */
    public NodoArista insertBegin(Arista element) {
        NodoArista node = new NodoArista(element);
        if (isEmpty()) {
            setHead(node);
        } else {
            node.setNext(head);
            setHead(node);
        }
        size++;
        return node;
    }

    /**
     *
     * Método que se utiliza para insertar un nodo al final de la lista
     * 
     */
    public NodoArista insertFinal(Arista element){
        NodoArista node = new NodoArista(element);
        if (isEmpty()) {
            setHead(node);
        } else {
            NodoArista pointer = getHead();
            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(node);
        }
        size++;
        return node;
    }

    /**
     *
     * Método que se utiliza para insertar un nodo en una lista en la posición que se le indica
     * 
     * 
     */
    public NodoArista insertInIndex(Arista element, int index) {
        NodoArista node = new NodoArista(element);
        if (isEmpty()) {
            setHead(node);
        } else {
            if (index > getSize()) {
                JOptionPane.showMessageDialog(null, "El índice es mayor que el tamaño");
                return insertFinal(element);
            } else {
                NodoArista pointer = getHead();
                int cont = 0;
                while (cont < (index-1) && pointer.getNext() != null) {
                    pointer = pointer.getNext();
                    cont++;
                }
                node.setNext(pointer.getNext());
                pointer.setNext(node);
            }
        }
        size++;
        return node;
    }

    /**
     *
     * Método que se utiliza para eliminar el primer nodo de la lista
     */
    public NodoArista deleteBegin(){
        if (!isEmpty()){
            NodoArista pointer = getHead();
            setHead(pointer.getNext());
            pointer.setNext(null);
            size--;
            return pointer;
        }
        return null;
    }

    /**
     *
     * Método que se utiliza para eliminar el último nodo de la lista
     */
    public NodoArista deleteFinal(){
        if (!isEmpty()){
            NodoArista pointer = getHead();
            if (getSize() == 1) {
                setHead(null);
                size--;
            } else {
                while (pointer.getNext() != null && pointer.getNext().getNext() != null){
                    pointer = pointer.getNext();
                }
                NodoArista nodeReturn = pointer.getNext();
                pointer.setNext(null);
                size--;
                return nodeReturn;
            }
        }
        return null;
    }

    /**
     *
     * Método que se utiliza para eliminar un nodo de la lista en una detemrinada posición
     * 
     */
    public NodoArista deleteInIndex(int index) {
        if (!isEmpty()){
            NodoArista pointer = getHead();
            if (index > getSize()) {
                JOptionPane.showMessageDialog(null, "El índice es mayor que el tamaño");
                return deleteFinal();
            } else {
                int cont = 0;
                while (cont < (index -1) && pointer.getNext() != null){
                    pointer = pointer.getNext();
                    cont++;
                }
                NodoArista temp = pointer.getNext();
                pointer.setNext(temp.getNext());
                temp.setNext(null);
                size--;
            }
        }
        return null;
    }
}
