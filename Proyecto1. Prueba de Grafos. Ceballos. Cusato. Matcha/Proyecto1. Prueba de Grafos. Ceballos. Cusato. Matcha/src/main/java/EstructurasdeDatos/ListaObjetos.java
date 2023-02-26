
package EstructurasdeDatos;

import javax.swing.JOptionPane;

public class ListaObjetos {
    private NodoObjeto head;
    private int size;

    /**
     *Constructor de la clase ListaObjetos
     */
    public ListaObjetos() {
        this.head = null;
        this.size = 0;
    }

    /**
     *
     * Getter de la variable head
     */
    public NodoObjeto getHead() {
        return head;
    }

    /**
     *
     * Setter de la variable head
     */
    public void setHead(NodoObjeto head) {
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
     * Método que determina si la lista está vacía
     */
    public boolean isEmpty(){
        return head == null;
    }

    /**
     *
     * Método que se encarga de insertar un nodo al inicio de la lista
     * 
     */
    public NodoObjeto insertBegin(Objeto elemento) {
        NodoObjeto node = new NodoObjeto(elemento);
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
     * Método que se encarga de insertar un nodo al final de la lista
     * 
     */
    public NodoObjeto insertFinal(Objeto elemento){
        NodoObjeto node = new NodoObjeto(elemento);
        if (isEmpty()) {
            setHead(node);
        } else {
            NodoObjeto pointer = getHead();
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
     * Método que se encarga de insertar un nodo dentro de una lista en la posición que se le indica
     * 
     * 
     */
    public NodoObjeto insertInIndex(int index, Objeto elemento) {
        NodoObjeto node = new NodoObjeto(elemento);
        if (isEmpty()) {
            setHead(node);
        } else {
            if (index > getSize()) {
                JOptionPane.showMessageDialog(null, "El índice es mayor que el tamaño");
                return insertFinal(elemento);
            } else {
                NodoObjeto pointer = getHead();
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
    public NodoObjeto deleteBegin(){
        if (!isEmpty()){
            NodoObjeto pointer = getHead();
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
    public NodoObjeto deleteFinal(){
        if (!isEmpty()){
            NodoObjeto pointer = getHead();
            if (getSize() == 1) {
                setHead(null);
                size--;
            } else {
                while (pointer.getNext() != null && pointer.getNext().getNext() != null){
                    pointer = pointer.getNext();
                }
                NodoObjeto nodeReturn = pointer.getNext();
                pointer.setNext(null);
                size--;
                return nodeReturn;
            }
        }
        return null;
    }

    /**
     *
     * Método que se utiliza para eliminar un nodo de una lista en la posición especificada
     * 
     */
    public NodoObjeto deleteInIndex(int index) {
        if (!isEmpty()){
            NodoObjeto pointer = getHead();
            if (index > getSize()) {
                JOptionPane.showMessageDialog(null, "El índice es mayor que el tamaño");
                return deleteFinal();
            } else {
                int cont = 0;
                while (cont < (index -1) && pointer.getNext() != null){
                    pointer = pointer.getNext();
                    cont++;
                }
                NodoObjeto temp = pointer.getNext();
                pointer.setNext(temp.getNext());
                temp.setNext(null);
                size--;
            }
        }
        return null;
    }

    /**
     *
     * Método para obtener la información que se encuentra dentro del nodo que se ubica en la posición dada
     * 
     */
    public Objeto getElement(int index) {
        if (isEmpty()) {
            return null;
        } else {
            NodoObjeto pointer = getHead();
            int cont = 0;
            while (cont < index && pointer.getNext() != null) {
                pointer = pointer.getNext();
                cont++;
            }
            return pointer.getElement();
        }
    }

    /**
     *Procedimiento que se utiliza para imprimir la lista
     */
    public void printList(){
        for (int i = 0; i < getSize(); i++) {
            Objeto elemento = getElement(i);
            JOptionPane.showMessageDialog(null, "Lista:"+elemento.getName()+" "+elemento.getQty());
        }
    }
}
