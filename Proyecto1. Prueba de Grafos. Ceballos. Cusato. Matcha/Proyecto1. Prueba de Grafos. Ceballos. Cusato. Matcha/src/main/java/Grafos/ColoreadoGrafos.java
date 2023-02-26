
package Grafos;

import java.util.Arrays;


public class ColoreadoGrafos {
    static int matrizAdyacencia[][];
    static int[] colores;
    static int nColores;
    static int nNodos;
    
    //Método que se encarga de obtener el color del nodo en la gráfica que se va a generar para mostrar el grafo
    private static int getColorNodo(int k) {
        do { 
            colores[k]=colores[k]+1; // asigna el siguiente color
            if (colores[k]==nColores+1) return 0; // si todos los colores han sido probados en el nodo, no lo pinta
            for (int j=1; j<=nNodos; ++j){ // comprueba si algún nodo conectado a este ya tiene este color
                if(matrizAdyacencia[k][j] == 1 && colores[k] == colores[j] && k!=j){ 
                    break;
                }
           
            if (j==nNodos+1)return colores[k];
            }
        }while(true);
    }
    
    /**
     *
     * Procedimiento que se encarga de colorear cada nodo del grafo en la representación gráfica que se va a generar para mostrar el grafo
     */
    public static void mColorear(int k) {
        do { 
            colores[k]=getColorNodo(k); // dota de un color a este nodo
            if (colores[k]==0) return; // si ya se han repartido todos los colores, acaba
            if (k==nNodos) // si se han coloreado todos los nodos correctamente, imprime la solución. Este algoritmo ofrece todas las soluciones posibles
                System.out.println(Arrays.toString(colores));
            else mColorear(k+1); // si todavía no se ha coloreado todo el grafo, entonces continuamos
        }while(true);
    }
}
