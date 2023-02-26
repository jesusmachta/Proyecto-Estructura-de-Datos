
package EstructurasdeDatos;

import javax.swing.JOptionPane;

public class ListaAlmacen {
    private NodoAlmacen first;
    private int size;

    /**
     *Constructor de la clase ListaAlmacen
     */
    public ListaAlmacen() {
        this.first = null;
        this.size = 0;
    }
    
    /**
     *
     * Getter de la variable first
     */
    public NodoAlmacen getFirst() {
        return first;
    }

    /**
     *
     * Setter de la variable first
     */
    public void setFirst(NodoAlmacen first) {
        this.first = first;
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
     * Método para verificar si la lista está vacía
     */
    public boolean isEmpty(){
        return getFirst() == null;
    }

    /**
     *
     * Método que se utiliza para insertar un nodo al inicio de la lista
     * 
     */
    public NodoAlmacen insertBegin(Almacen elemento) {
        NodoAlmacen node = new NodoAlmacen(elemento);
        if (isEmpty()) {
            setFirst(node);
        } else {
            node.setNext(getFirst());
            setFirst(node);
        }
        setSize(getSize() + 1);
        return node;
    }

    /**
     *
     * Método que se utiliza para insertar un nodo al final de la lista
     * 
     */
    public NodoAlmacen insertFinal(Almacen elemento){
        NodoAlmacen node = new NodoAlmacen(elemento);
        if (isEmpty()) {
            setFirst(node);
        } else {
            NodoAlmacen pointer = getFirst();
            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(node);
        }
        setSize(getSize() + 1);
        return node;
    }

    /**
     *
     * Método que se utiliza para insertar un nodo en una lista en la posición que se le indica
     * 
     * 
     */
    public NodoAlmacen insertInIndex(int index, Almacen elemento) {
        NodoAlmacen node = new NodoAlmacen(elemento);
        if (isEmpty()) {
            setFirst(node);
        } else {
            if (index > getSize()) {
                JOptionPane.showMessageDialog(null, "El índice es mayor que el tamaño");
                return insertFinal(elemento);
            } else {
                NodoAlmacen pointer = getFirst();
                int cont = 0;
                while (cont < (index-1) && pointer.getNext() != null) {
                    pointer = pointer.getNext();
                    cont++;
                }
                node.setNext(pointer.getNext());
                pointer.setNext(node);
            }
        }
        setSize(getSize() + 1);
        return node;
    }

    /**
     *
     * Método que se utiliza para eliminar el primer nodo de la lista
     */
    public NodoAlmacen deleteBegin(){
        if (!isEmpty()){
            NodoAlmacen pointer = getFirst();
            setFirst(pointer.getNext());
            pointer.setNext(null);
            setSize(getSize() - 1);
            return pointer;
        }
        return null;
    }

    /**
     *
     * Método que se utiliza para eliminar el último nodo de la lista
     */
    public NodoAlmacen deleteFinal(){
        if (!isEmpty()){
            NodoAlmacen pointer = getFirst();
            if (getSize() == 1) {
                setFirst(null);
                setSize(getSize() - 1);
            } else {
                while (pointer.getNext() != null && pointer.getNext().getNext() != null){
                    pointer = pointer.getNext();
                }
                NodoAlmacen nodeReturn = pointer.getNext();
                pointer.setNext(null);
                setSize(getSize() - 1);
                return nodeReturn;
            }
        }
        return null;
    }

    /**
     *
     * Método que se utiliza para eliminar un nodo de una lista en la posición que se le indica
     * 
     */
    public NodoAlmacen deleteInIndex(int index) {
        if (!isEmpty()){
            NodoAlmacen pointer = getFirst();
            if (index > getSize()) {
                JOptionPane.showMessageDialog(null, "El índice es mayor que el tamaño");
                return deleteFinal();
            } else {
                int cont = 0;
                while (cont < (index -1) && pointer.getNext() != null){
                    pointer = pointer.getNext();
                    cont++;
                }
                NodoAlmacen temp = pointer.getNext();
                pointer.setNext(temp.getNext());
                temp.setNext(null);
                setSize(getSize() - 1);
            }
        }
        return null;
    }

    /**
     *
     * Método que se utiliza para obtener la información que se encuentra dentro de un nodo de la lista en una posición específica
     * 
     */
    public Almacen getElement(int index) {
        if (isEmpty()) {
            return null;
        } else {
            NodoAlmacen pointer = getFirst();
            int cont = 0;
            while (cont < index && pointer.getNext() != null) {
                pointer = pointer.getNext();
                cont++;
            }
            return pointer.getElement();
        }
    }

    /**
     * Procedimiento que se utiliza para imprimir la lista
     */
    public void printList(){
        for (int i = 0; i < getSize(); i++) {
            Almacen elemento = getElement(i);
            JOptionPane.showMessageDialog(null, "Lista:"+elemento.getName()+" "+elemento.getInventario());
        }
    }
}
