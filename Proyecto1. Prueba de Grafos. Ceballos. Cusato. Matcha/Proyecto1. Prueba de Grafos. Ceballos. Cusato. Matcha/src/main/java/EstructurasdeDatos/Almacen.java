
package EstructurasdeDatos;

public class Almacen {
    private String name;
    private ListaObjetos inventario;

    /**
     *
     * Constructor de la clase Almacen
     * 
     */
    public Almacen(String name, ListaObjetos inventario) {
        this.name = name;
        this.inventario = inventario;
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
     * Getter de la variable inventario
     */
    public ListaObjetos getInventario() {
        return inventario;
    }

    /**
     * Setter de la variable inventario
     */
    public void setInventario(ListaObjetos inventario) {
        this.inventario = inventario;
    }
    
    
}
