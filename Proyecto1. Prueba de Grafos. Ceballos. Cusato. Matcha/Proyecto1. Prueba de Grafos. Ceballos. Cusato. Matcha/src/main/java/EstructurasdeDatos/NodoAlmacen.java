
package EstructurasdeDatos;

public class NodoAlmacen {
    private Almacen element;
    private NodoAlmacen next;

    /**
     *
     * Constructor de la clase NodoAlmacen
     */
    public NodoAlmacen(Almacen element) {
        this.element = element;
        this.next = null;
    }

    /**
     * Getter de la variable element
     */
    public Almacen getElement() {
        return element;
    }

    /**
     * Setter de la variable element
     */
    public void setElement(Almacen element) {
        this.element = element;
    }

    /**
     * Getter de la variable next
     */
    public NodoAlmacen getNext() {
        return next;
    }

    /**
     * Setter de la variable next
     */
    public void setNext(NodoAlmacen next) {
        this.next = next;
    }
    
    
    
}
