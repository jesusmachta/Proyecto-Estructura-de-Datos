
package EstructurasdeDatos;


public class Objeto {
    private String name;
    private int qty;

    /**
     *
     * Constructor de la clase Objeto
     * 
     */
    public Objeto(String name, int qty) {
        this.name = name;
        this.qty = qty;
    }

    /**
     * Getter de la variable name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter de la variable name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter de la variable qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * Setter de la variable qty
     */
    public void setQty(int qty) {
        this.qty = qty;
    }
    
    
}
