
package Grafos;


public class NodoArista {
    private Arista element;
    private NodoArista next;

    /**
     *
     * Constructor de la clase NodoArista
     */
    public NodoArista(Arista element) {
        this.element = element;
        this.next = null;
    }

    /**
     * Getter de la variable element
     */
    public Arista getElement() {
        return element;
    }

    /**
     * Setter de la variable element
     */
    public void setElement(Arista element) {
        this.element = element;
    }

    /**
     * Getter de la variable next
     */
    public NodoArista getNext() {
        return next;
    }

    /**
     * Setter de la variable next
     */
    public void setNext(NodoArista next) {
        this.next = next;
    }
    
    
}
