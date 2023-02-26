
package Grafos;
import EstructurasdeDatos.Almacen;

public class Arista {
    private Almacen origen;
    private Almacen llegada;
    private int peso;

    /**
     *
     * Constructor de la clase Arista
     * 
     * 
     */
    public Arista(Almacen origen, Almacen llegada, int peso) {
        this.origen = origen;
        this.llegada = llegada;
        this.peso = peso;
    }

    /**
     * Getter de la variable origen
     */
    public Almacen getOrigen() {
        return origen;
    }

    /**
     * Setter de la variable origen
     */
    public void setOrigen(Almacen origen) {
        this.origen = origen;
    }

    /**
     * Getter de la variable llegada
     */
    public Almacen getLlegada() {
        return llegada;
    }

    /**
     * Setter de la variable llegada
     */
    public void setLlegada(Almacen llegada) {
        this.llegada = llegada;
    }

    /**
     * Getter de la variable peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * Setter de la variable peso
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    
}
