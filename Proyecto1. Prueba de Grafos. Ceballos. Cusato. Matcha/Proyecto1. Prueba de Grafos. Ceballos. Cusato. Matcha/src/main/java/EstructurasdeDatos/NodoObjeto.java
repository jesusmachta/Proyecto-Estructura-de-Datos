
package EstructurasdeDatos;

public class NodoObjeto {
    private Objeto element;
    private NodoObjeto next;

    /**
     *
     * Constructor de la clase NodoObjeto
     */
    public NodoObjeto(Objeto element) {
        this.element = element;
        this.next = null;
    }

    /**
     * Getter de la variable element
     */
    public Objeto getElement() {
        return element;
    }

    /**
     * Setter de la variable element
     */
    public void setElement(Objeto element) {
        this.element = element;
    }

    /**
     * Getter de la variable next
     */
    public NodoObjeto getNext() {
        return next;
    }

    /**
     * Setter de la variable next
     */
    public void setNext(NodoObjeto next) {
        this.next = next;
    }
    
    
}
