
package Grafos;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import java.awt.Container;
import java.awt.FlowLayout;


public class Grafica extends JFrame {
    private int vertice;
    private Container contenedor;
    private FlowLayout layout;
    private int  longitud;
    
    /**
     *Constructor de la clase Gráfica
     */
    public Grafica(){
        super("Grafo generado");
        this.contenedor= getContentPane();
        this.layout= new FlowLayout();
        contenedor.setLayout(layout);
        setSize(1366, 720);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }
   
    /**
     *
     * Procedimiento para pintar los nodos y los caminos del grafo a partir de la librería graphics
     */
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D circulo = (Graphics2D) g;
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(683, 360, 100, 100);
            circulo.drawString("V1", 683, 360);
    }
}
