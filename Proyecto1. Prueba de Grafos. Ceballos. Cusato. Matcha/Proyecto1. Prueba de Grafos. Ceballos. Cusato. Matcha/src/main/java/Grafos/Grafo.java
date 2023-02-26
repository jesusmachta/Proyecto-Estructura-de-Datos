
package Grafos;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import EstructurasdeDatos.ListaAlmacen;
import java.util.Arrays;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;


public class Grafo extends JFrame {
    private int[][] arreglo;
    private int vertices;
    private String dato;
    private ListaAlmacen almacen;
    private ListaAristas arista;
    private int[] colores;
    private int nColores;
    private int nNodos;
    

    /**
     *
     * Constructor de la clase grafo para setearlo
     * 
     * 
     * 
     */
     
    public Grafo(int v, int[][] a, String d, ListaAlmacen almacen, ListaAristas arista) {
        this.vertices = v;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = 0;
            }
        }
        this.arreglo = a;
        this.dato = d;
        this.almacen= almacen;
        this.arista= arista;
    }
    
    

    /**
     *
     * Constructor de la clase grafo para la interfaz gráfica
     * 
     */
    public Grafo(int v, int[][] a) {
        super("Grafo generado");
        setSize(1366, 720);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.vertices = v;
        this.arreglo = a;
    }

    /**
     *
     * Procedimiento para pintar los nodos y los caminos del grafo que se va a mostrar
     */
    public void Paint(Graphics g) {
        super.paint(g);
        Graphics2D circulo = (Graphics2D) g;
        if (vertices == 1) {
            int aleX = NumeroAleatorioX();
            int aleY = NumeroAleatorioY();
            //Circulo 0
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX, aleY, 100, 100);
            circulo.drawString("A", aleX, aleY);
        } else if (vertices == 2) {
            int aleX1 = NumeroAleatorioX();
            int aleY1 = NumeroAleatorioY();
            int aleX2 = NumeroAleatorioX();
            int aleY2 = NumeroAleatorioY();
            //Circulo 0
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX1, aleY1, 100, 100);
            circulo.drawString("A", aleX1, aleY1);
            //Circulo 1
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX2, aleY2, 100, 100);
            circulo.drawString("B", aleX2, aleY2);
            if(arreglo[0][1] == 1 || arreglo[1][0] == 1){
                circulo.drawLine(aleX2+50, aleY2+50, aleX1+50, aleY1+50);
            }
        } else if (vertices == 3) {
            int aleX1 = NumeroAleatorioX();
            int aleY1 = NumeroAleatorioY();
            int aleX2 = NumeroAleatorioX();
            int aleY2 = NumeroAleatorioY();
            int aleX3 = NumeroAleatorioX();
            int aleY3 = NumeroAleatorioY();
            //Circulo 0
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX1, aleY1, 100, 100);
            circulo.drawString("A", aleX1, aleY1);
            //Circulo 1
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX2, aleY2, 100, 100);
            circulo.drawString("B", aleX2, aleY2);
            //Circulo 2
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX3, aleY3, 100, 100);
            circulo.drawString("C", aleX3, aleY3);
            
            if(arreglo[0][1] == 1 || arreglo[1][0] == 1){
                circulo.drawLine(aleX2+50, aleY2+50, aleX1+50, aleY1+50);
            }
            if(arreglo[0][2] == 1 || arreglo[2][0] == 1){
                circulo.drawLine(aleX1+50, aleY1+50, aleX3+50, aleY3+50);
            }
            if(arreglo[1][2] == 1 || arreglo[2][1] == 1){
                circulo.drawLine(aleX2+50, aleY2+50, aleX3+50, aleY3+50);
            }
        } else if (vertices == 4) {
            int aleX1 = NumeroAleatorioX();
            int aleY1 = NumeroAleatorioY();
            int aleX2 = NumeroAleatorioX();
            int aleY2 = NumeroAleatorioY();
            int aleX3 = NumeroAleatorioX();
            int aleY3 = NumeroAleatorioY();
            int aleX4 = NumeroAleatorioX();
            int aleY4 = NumeroAleatorioY();
            //Circulo 0
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX1, aleY1, 100, 100);
            circulo.drawString("A", aleX1, aleY1);
            //Circulo 1
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX2, aleY2, 100, 100);
            circulo.drawString("B", aleX2, aleY2);
            //Circulo 2
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX3, aleY3, 100, 100);
            circulo.drawString("C", aleX3, aleY3);
            //Circulo 3
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX4, aleY4, 100, 100);
            circulo.drawString("D", aleX4, aleY4);
            if(arreglo[0][1] == 1 || arreglo[1][0] == 1){
                circulo.drawLine(aleX2+50, aleY2+50, aleX1+50, aleY1+50);
            }
            if(arreglo[0][2] == 1 || arreglo[2][0] == 1){
                circulo.drawLine(aleX1+50, aleY1+50, aleX3+50, aleY3+50);
            }
            if(arreglo[1][2] == 1 || arreglo[2][1] == 1){
                circulo.drawLine(aleX2+50, aleY2+50, aleX3+50, aleY3+50);
            }
            if(arreglo[0][3] == 1 || arreglo[3][0] == 1){
                circulo.drawLine(aleX1+50, aleY1+50, aleX4+50, aleY4+50);
            }
            if(arreglo[1][3] == 1 || arreglo[3][1] == 1){
                circulo.drawLine(aleX2+50, aleY2+50, aleX4+50, aleY4+50);
            }
            if(arreglo[2][3] == 1 || arreglo[3][2] == 1){
                circulo.drawLine(aleX3+50, aleY3+50, aleX4+50, aleY4+50);
            }
        }else if(vertices==5){
            int aleX1 = NumeroAleatorioX();
            int aleY1 = NumeroAleatorioY();
            int aleX2 = NumeroAleatorioX();
            int aleY2 = NumeroAleatorioY();
            int aleX3 = NumeroAleatorioX();
            int aleY3 = NumeroAleatorioY();
            int aleX4 = NumeroAleatorioX();
            int aleY4 = NumeroAleatorioY();
            int aleX5 = NumeroAleatorioX();
            int aleY5 = NumeroAleatorioY();
            //Circulo 0
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX1, aleY1, 100, 100);
            circulo.drawString("A", aleX1, aleY1);
            //Circulo 1
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX2, aleY2, 100, 100);
            circulo.drawString("B", aleX2, aleY2);
            //Circulo 2
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX3, aleY3, 100, 100);
            circulo.drawString("C", aleX3, aleY3);
            //Circulo 3
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX4, aleY4, 100, 100);
            circulo.drawString("D", aleX4, aleY4);
            //Circulo 4
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX5, aleY5, 100, 100);
            circulo.drawString("E", aleX5, aleY5);
            if(arreglo[0][1] == 1 || arreglo[1][0] == 1){
                circulo.drawLine(aleX2+50, aleY2+50, aleX1+50, aleY1+50);
            }
            if(arreglo[0][2] == 1 || arreglo[2][0] == 1){
                circulo.drawLine(aleX1+50, aleY1+50, aleX3+50, aleY3+50);
            }
            if(arreglo[1][2] == 1 || arreglo[2][1] == 1){
                circulo.drawLine(aleX2+50, aleY2+50, aleX3+50, aleY3+50);
            }
            if(arreglo[0][3] == 1 || arreglo[3][0] == 1){
                circulo.drawLine(aleX1+50, aleY1+50, aleX4+50, aleY4+50);
            }
            if(arreglo[1][3] == 1 || arreglo[3][1] == 1){
                circulo.drawLine(aleX2+50, aleY2+50, aleX4+50, aleY4+50);
            }
            if(arreglo[2][3] == 1 || arreglo[3][2] == 1){
                circulo.drawLine(aleX3+50, aleY3+50, aleX4+50, aleY4+50);
            }
            if(arreglo[4][0] == 1 || arreglo[0][4] == 1){
                circulo.drawLine(aleX5+50, aleY5+50, aleX1+50, aleY1+50);
            }
            if(arreglo[4][1] == 1 || arreglo[1][4] == 1){
                circulo.drawLine(aleX5+50, aleY5+50, aleX2+50, aleY2+50);
            }
            if(arreglo[4][2] == 1 || arreglo[2][4] == 1){
                circulo.drawLine(aleX5+50, aleY5+50, aleX3+50, aleY3+50);
            }
            if(arreglo[4][3] == 1 || arreglo[3][4] == 1){
                circulo.drawLine(aleX5+50, aleY5+50, aleX4+50, aleY4+50);
            }
        }else if(vertices==6){
            int aleX1 = NumeroAleatorioX();
            int aleY1 = NumeroAleatorioY();
            int aleX2 = NumeroAleatorioX();
            int aleY2 = NumeroAleatorioY();
            int aleX3 = NumeroAleatorioX();
            int aleY3 = NumeroAleatorioY();
            int aleX4 = NumeroAleatorioX();
            int aleY4 = NumeroAleatorioY();
            int aleX5 = NumeroAleatorioX();
            int aleY5 = NumeroAleatorioY();
            int aleX6 = NumeroAleatorioX();
            int aleY6 = NumeroAleatorioY();
            //Circulo 0
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX1, aleY1, 100, 100);
            circulo.drawString("A", aleX1, aleY1);
            //Circulo 1
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX2, aleY2, 100, 100);
            circulo.drawString("B", aleX2, aleY2);
            //Circulo 2
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX3, aleY3, 100, 100);
            circulo.drawString("C", aleX3, aleY3);
            //Circulo 3
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX4, aleY4, 100, 100);
            circulo.drawString("D", aleX4, aleY4);
            //Circulo 4
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX5, aleY5, 100, 100);
            circulo.drawString("E", aleX5, aleY5);
            //Circulo 5
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX6, aleY6, 100, 100);
            circulo.drawString("F", aleX6, aleY6);
            if(arreglo[0][1] == 1 || arreglo[1][0] == 1){
                circulo.drawLine(aleX2+50, aleY2+50, aleX1+50, aleY1+50);
            }
            if(arreglo[0][2] == 1 || arreglo[2][0] == 1){
                circulo.drawLine(aleX1+50, aleY1+50, aleX3+50, aleY3+50);
            }
            if(arreglo[1][2] == 1 || arreglo[2][1] == 1){
                circulo.drawLine(aleX2+50, aleY2+50, aleX3+50, aleY3+50);
            }
            if(arreglo[0][3] == 1 || arreglo[3][0] == 1){
                circulo.drawLine(aleX1+50, aleY1+50, aleX4+50, aleY4+50);
            }
            if(arreglo[1][3] == 1 || arreglo[3][1] == 1){
                circulo.drawLine(aleX2+50, aleY2+50, aleX4+50, aleY4+50);
            }
            if(arreglo[2][3] == 1 || arreglo[3][2] == 1){
                circulo.drawLine(aleX3+50, aleY3+50, aleX4+50, aleY4+50);
            }
            if(arreglo[4][0] == 1 || arreglo[0][4] == 1){
                circulo.drawLine(aleX5+50, aleY5+50, aleX1+50, aleY1+50);
            }
            if(arreglo[4][1] == 1 || arreglo[1][4] == 1){
                circulo.drawLine(aleX5+50, aleY5+50, aleX2+50, aleY2+50);
            }
            if(arreglo[4][2] == 1 || arreglo[2][4] == 1){
                circulo.drawLine(aleX5+50, aleY5+50, aleX3+50, aleY3+50);
            }
            if(arreglo[4][3] == 1 || arreglo[3][4] == 1){
                circulo.drawLine(aleX5+50, aleY5+50, aleX4+50, aleY4+50);
            }
            if(arreglo[5][0] == 1 || arreglo[0][5] == 1){
                circulo.drawLine(aleX6+50, aleY6+50, aleX1+50, aleY1+50);
            }
            if(arreglo[5][1] == 1 || arreglo[1][5] == 1){
                circulo.drawLine(aleX6+50, aleY6+50, aleX2+50, aleY2+50);
            }
            if(arreglo[5][2] == 1 || arreglo[2][5] == 1){
                circulo.drawLine(aleX6+50, aleY6+50, aleX3+50, aleY3+50);
            }
            if(arreglo[5][3] == 1 || arreglo[3][5] == 1){
                circulo.drawLine(aleX6+50, aleY6+50, aleX4+50, aleY4+50);
            }
            if(arreglo[5][4] == 1 || arreglo[4][5] == 1){
                circulo.drawLine(aleX6+50, aleY6+50, aleX5+50, aleY5+50);
            }
        }else if(vertices==7){
            int aleX1 = NumeroAleatorioX();
            int aleY1 = NumeroAleatorioY();
            int aleX2 = NumeroAleatorioX();
            int aleY2 = NumeroAleatorioY();
            int aleX3 = NumeroAleatorioX();
            int aleY3 = NumeroAleatorioY();
            int aleX4 = NumeroAleatorioX();
            int aleY4 = NumeroAleatorioY();
            int aleX5 = NumeroAleatorioX();
            int aleY5 = NumeroAleatorioY();
            int aleX6 = NumeroAleatorioX();
            int aleY6 = NumeroAleatorioY();
            int aleX7 = NumeroAleatorioX();
            int aleY7 = NumeroAleatorioY();
            //Circulo 0
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX1, aleY1, 100, 100);
            circulo.drawString("A", aleX1, aleY1);
            //Circulo 1
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX2, aleY2, 100, 100);
            circulo.drawString("B", aleX2, aleY2);
            //Circulo 2
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX3, aleY3, 100, 100);
            circulo.drawString("C", aleX3, aleY3);
            //Circulo 3
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX4, aleY4, 100, 100);
            circulo.drawString("D", aleX4, aleY4);
            //Circulo 4
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX5, aleY5, 100, 100);
            circulo.drawString("E", aleX5, aleY5);
            //Circulo 5
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX6, aleY6, 100, 100);
            circulo.drawString("F", aleX6, aleY6);
            //Circulo 6
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX7, aleY7, 100, 100);
            circulo.drawString("G", aleX7, aleY7);
            if(arreglo[0][1] == 1 || arreglo[1][0] == 1){
                circulo.drawLine(aleX2+50, aleY2+50, aleX1+50, aleY1+50);
            }
            if(arreglo[0][2] == 1 || arreglo[2][0] == 1){
                circulo.drawLine(aleX1+50, aleY1+50, aleX3+50, aleY3+50);
            }
            if(arreglo[1][2] == 1 || arreglo[2][1] == 1){
                circulo.drawLine(aleX2+50, aleY2+50, aleX3+50, aleY3+50);
            }
            if(arreglo[0][3] == 1 || arreglo[3][0] == 1){
                circulo.drawLine(aleX1+50, aleY1+50, aleX4+50, aleY4+50);
            }
            if(arreglo[1][3] == 1 || arreglo[3][1] == 1){
                circulo.drawLine(aleX2+50, aleY2+50, aleX4+50, aleY4+50);
            }
            if(arreglo[2][3] == 1 || arreglo[3][2] == 1){
                circulo.drawLine(aleX3+50, aleY3+50, aleX4+50, aleY4+50);
            }
            if(arreglo[4][0] == 1 || arreglo[0][4] == 1){
                circulo.drawLine(aleX5+50, aleY5+50, aleX1+50, aleY1+50);
            }
            if(arreglo[4][1] == 1 || arreglo[1][4] == 1){
                circulo.drawLine(aleX5+50, aleY5+50, aleX2+50, aleY2+50);
            }
            if(arreglo[4][2] == 1 || arreglo[2][4] == 1){
                circulo.drawLine(aleX5+50, aleY5+50, aleX3+50, aleY3+50);
            }
            if(arreglo[4][3] == 1 || arreglo[3][4] == 1){
                circulo.drawLine(aleX5+50, aleY5+50, aleX4+50, aleY4+50);
            }
            if(arreglo[5][0] == 1 || arreglo[0][5] == 1){
                circulo.drawLine(aleX6+50, aleY6+50, aleX1+50, aleY1+50);
            }
            if(arreglo[5][1] == 1 || arreglo[1][5] == 1){
                circulo.drawLine(aleX6+50, aleY6+50, aleX2+50, aleY2+50);
            }
            if(arreglo[5][2] == 1 || arreglo[2][5] == 1){
                circulo.drawLine(aleX6+50, aleY6+50, aleX3+50, aleY3+50);
            }
            if(arreglo[5][3] == 1 || arreglo[3][5] == 1){
                circulo.drawLine(aleX6+50, aleY6+50, aleX4+50, aleY4+50);
            }
            if(arreglo[5][4] == 1 || arreglo[4][5] == 1){
                circulo.drawLine(aleX6+50, aleY6+50, aleX5+50, aleY5+50);
            }
            if(arreglo[6][0] == 1 || arreglo[0][6] == 1){
                circulo.drawLine(aleX7+50, aleY7+50, aleX1+50, aleY1+50);
            }
            if(arreglo[6][1] == 1 || arreglo[1][6] == 1){
                circulo.drawLine(aleX7+50, aleY7+50, aleX2+50, aleY2+50);
            }
            if(arreglo[6][2] == 1 || arreglo[2][6] == 1){
                circulo.drawLine(aleX7+50, aleY7+50, aleX3+50, aleY3+50);
            }
            if(arreglo[6][3] == 1 || arreglo[3][6] == 1){
                circulo.drawLine(aleX7+50, aleY7+50, aleX4+50, aleY4+50);
            }
            if(arreglo[6][4] == 1 || arreglo[4][6] == 1){
                circulo.drawLine(aleX7+50, aleY7+50, aleX5+50, aleY5+50);
            }
            if(arreglo[6][5] == 1 || arreglo[5][6] == 1){
                circulo.drawLine(aleX7+50, aleY7+50, aleX6+50, aleY6+50);
            }
        }else if(vertices==8){
            int aleX1 = NumeroAleatorioX();
            int aleY1 = NumeroAleatorioY();
            int aleX2 = NumeroAleatorioX();
            int aleY2 = NumeroAleatorioY();
            int aleX3 = NumeroAleatorioX();
            int aleY3 = NumeroAleatorioY();
            int aleX4 = NumeroAleatorioX();
            int aleY4 = NumeroAleatorioY();
            int aleX5 = NumeroAleatorioX();
            int aleY5 = NumeroAleatorioY();
            int aleX6 = NumeroAleatorioX();
            int aleY6 = NumeroAleatorioY();
            int aleX7 = NumeroAleatorioX();
            int aleY7 = NumeroAleatorioY();
            int aleX8 = NumeroAleatorioX();
            int aleY8 = NumeroAleatorioY();
            //Circulo 0
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX1, aleY1, 100, 100);
            circulo.drawString("A", aleX1, aleY1);
            //Circulo 1
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX2, aleY2, 100, 100);
            circulo.drawString("B", aleX2, aleY2);
            //Circulo 2
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX3, aleY3, 100, 100);
            circulo.drawString("C", aleX3, aleY3);
            //Circulo 3
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX4, aleY4, 100, 100);
            circulo.drawString("D", aleX4, aleY4);
            //Circulo 4
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX5, aleY5, 100, 100);
            circulo.drawString("E", aleX5, aleY5);
            //Circulo 5
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX6, aleY6, 100, 100);
            circulo.drawString("F", aleX6, aleY6);
            //Circulo 6
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX7, aleY7, 100, 100);
            circulo.drawString("G", aleX7, aleY7);
            //Circulo 7
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX8, aleY8, 100, 100);
            circulo.drawString("H", aleX8, aleY8);
            
            if(arreglo[0][1] == 1 || arreglo[1][0] == 1){
                circulo.drawLine(aleX2+50, aleY2+50, aleX1+50, aleY1+50);
            }
            if(arreglo[0][2] == 1 || arreglo[2][0] == 1){
                circulo.drawLine(aleX1+50, aleY1+50, aleX3+50, aleY3+50);
            }
            if(arreglo[1][2] == 1 || arreglo[2][1] == 1){
                circulo.drawLine(aleX2+50, aleY2+50, aleX3+50, aleY3+50);
            }
            if(arreglo[0][3] == 1 || arreglo[3][0] == 1){
                circulo.drawLine(aleX1+50, aleY1+50, aleX4+50, aleY4+50);
            }
            if(arreglo[1][3] == 1 || arreglo[3][1] == 1){
                circulo.drawLine(aleX2+50, aleY2+50, aleX4+50, aleY4+50);
            }
            if(arreglo[2][3] == 1 || arreglo[3][2] == 1){
                circulo.drawLine(aleX3+50, aleY3+50, aleX4+50, aleY4+50);
            }
            if(arreglo[4][0] == 1 || arreglo[0][4] == 1){
                circulo.drawLine(aleX5+50, aleY5+50, aleX1+50, aleY1+50);
            }
            if(arreglo[4][1] == 1 || arreglo[1][4] == 1){
                circulo.drawLine(aleX5+50, aleY5+50, aleX2+50, aleY2+50);
            }
            if(arreglo[4][2] == 1 || arreglo[2][4] == 1){
                circulo.drawLine(aleX5+50, aleY5+50, aleX3+50, aleY3+50);
            }
            if(arreglo[4][3] == 1 || arreglo[3][4] == 1){
                circulo.drawLine(aleX5+50, aleY5+50, aleX4+50, aleY4+50);
            }
            if(arreglo[5][0] == 1 || arreglo[0][5] == 1){
                circulo.drawLine(aleX6+50, aleY6+50, aleX1+50, aleY1+50);
            }
            if(arreglo[5][1] == 1 || arreglo[1][5] == 1){
                circulo.drawLine(aleX6+50, aleY6+50, aleX2+50, aleY2+50);
            }
            if(arreglo[5][2] == 1 || arreglo[2][5] == 1){
                circulo.drawLine(aleX6+50, aleY6+50, aleX3+50, aleY3+50);
            }
            if(arreglo[5][3] == 1 || arreglo[3][5] == 1){
                circulo.drawLine(aleX6+50, aleY6+50, aleX4+50, aleY4+50);
            }
            if(arreglo[5][4] == 1 || arreglo[4][5] == 1){
                circulo.drawLine(aleX6+50, aleY6+50, aleX5+50, aleY5+50);
            }
            if(arreglo[6][0] == 1 || arreglo[0][6] == 1){
                circulo.drawLine(aleX7+50, aleY7+50, aleX1+50, aleY1+50);
            }
            if(arreglo[6][1] == 1 || arreglo[1][6] == 1){
                circulo.drawLine(aleX7+50, aleY7+50, aleX2+50, aleY2+50);
            }
            if(arreglo[6][2] == 1 || arreglo[2][6] == 1){
                circulo.drawLine(aleX7+50, aleY7+50, aleX3+50, aleY3+50);
            }
            if(arreglo[6][3] == 1 || arreglo[3][6] == 1){
                circulo.drawLine(aleX7+50, aleY7+50, aleX4+50, aleY4+50);
            }
            if(arreglo[6][4] == 1 || arreglo[4][6] == 1){
                circulo.drawLine(aleX7+50, aleY7+50, aleX5+50, aleY5+50);
            }
            if(arreglo[6][5] == 1 || arreglo[5][6] == 1){
                circulo.drawLine(aleX7+50, aleY7+50, aleX6+50, aleY6+50);
            }
            if(arreglo[7][0] == 1 || arreglo[0][7] == 1){
                circulo.drawLine(aleX8+50, aleY8+50, aleX1+50, aleY1+50);
            }
            if(arreglo[7][1] == 1 || arreglo[1][7] == 1){
                circulo.drawLine(aleX8+50, aleY8+50, aleX2+50, aleY2+50);
            }
            if(arreglo[7][2] == 1 || arreglo[2][7] == 1){
                circulo.drawLine(aleX8+50, aleY8+50, aleX3+50, aleY3+50);
            }
            if(arreglo[7][3] == 1 || arreglo[3][7] == 1){
                circulo.drawLine(aleX8+50, aleY8+50, aleX4+50, aleY4+50);
            }
            if(arreglo[7][4] == 1 || arreglo[4][7] == 1){
                circulo.drawLine(aleX8+50, aleY8+50, aleX5+50, aleY5+50);
            }
            if(arreglo[7][5] == 1 || arreglo[5][7] == 1){
                circulo.drawLine(aleX8+50, aleY8+50, aleX6+50, aleY6+50);
            }
            if(arreglo[7][6] == 1 || arreglo[6][7] == 1){
                circulo.drawLine(aleX8+50, aleY8+50, aleX7+50, aleY7+50);
            }
        }else if(vertices==9){
            int aleX1 = NumeroAleatorioX();
            int aleY1 = NumeroAleatorioY();
            int aleX2 = NumeroAleatorioX();
            int aleY2 = NumeroAleatorioY();
            int aleX3 = NumeroAleatorioX();
            int aleY3 = NumeroAleatorioY();
            int aleX4 = NumeroAleatorioX();
            int aleY4 = NumeroAleatorioY();
            int aleX5 = NumeroAleatorioX();
            int aleY5 = NumeroAleatorioY();
            int aleX6 = NumeroAleatorioX();
            int aleY6 = NumeroAleatorioY();
            int aleX7 = NumeroAleatorioX();
            int aleY7 = NumeroAleatorioY();
            int aleX8 = NumeroAleatorioX();
            int aleY8 = NumeroAleatorioY();
            int aleX9 = NumeroAleatorioX();
            int aleY9 = NumeroAleatorioY();
            //Circulo 0
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX1, aleY1, 100, 100);
            circulo.drawString("A", aleX1, aleY1);
            //Circulo 1
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX2, aleY2, 100, 100);
            circulo.drawString("B", aleX2, aleY2);
            //Circulo 2
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX3, aleY3, 100, 100);
            circulo.drawString("C", aleX3, aleY3);
            //Circulo 3
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX4, aleY4, 100, 100);
            circulo.drawString("D", aleX4, aleY4);
            //Circulo 4
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX5, aleY5, 100, 100);
            circulo.drawString("E", aleX5, aleY5);
            //Circulo 5
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX6, aleY6, 100, 100);
            circulo.drawString("F", aleX6, aleY6);
            //Circulo 6
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX7, aleY7, 100, 100);
            circulo.drawString("G", aleX7, aleY7);
            //Circulo 7
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX8, aleY8, 100, 100);
            circulo.drawString("H", aleX8, aleY8);
            //Circulo 8
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX9, aleY9, 100, 100);
            circulo.drawString("I", aleX9, aleY9);
            if(arreglo[0][1] == 1 || arreglo[1][0] == 1){
                circulo.drawLine(aleX2+50, aleY2+50, aleX1+50, aleY1+50);
            }
            if(arreglo[0][2] == 1 || arreglo[2][0] == 1){
                circulo.drawLine(aleX1+50, aleY1+50, aleX3+50, aleY3+50);
            }
            if(arreglo[1][2] == 1 || arreglo[2][1] == 1){
                circulo.drawLine(aleX2+50, aleY2+50, aleX3+50, aleY3+50);
            }
            if(arreglo[0][3] == 1 || arreglo[3][0] == 1){
                circulo.drawLine(aleX1+50, aleY1+50, aleX4+50, aleY4+50);
            }
            if(arreglo[1][3] == 1 || arreglo[3][1] == 1){
                circulo.drawLine(aleX2+50, aleY2+50, aleX4+50, aleY4+50);
            }
            if(arreglo[2][3] == 1 || arreglo[3][2] == 1){
                circulo.drawLine(aleX3+50, aleY3+50, aleX4+50, aleY4+50);
            }
            if(arreglo[4][0] == 1 || arreglo[0][4] == 1){
                circulo.drawLine(aleX5+50, aleY5+50, aleX1+50, aleY1+50);
            }
            if(arreglo[4][1] == 1 || arreglo[1][4] == 1){
                circulo.drawLine(aleX5+50, aleY5+50, aleX2+50, aleY2+50);
            }
            if(arreglo[4][2] == 1 || arreglo[2][4] == 1){
                circulo.drawLine(aleX5+50, aleY5+50, aleX3+50, aleY3+50);
            }
            if(arreglo[4][3] == 1 || arreglo[3][4] == 1){
                circulo.drawLine(aleX5+50, aleY5+50, aleX4+50, aleY4+50);
            }
            if(arreglo[5][0] == 1 || arreglo[0][5] == 1){
                circulo.drawLine(aleX6+50, aleY6+50, aleX1+50, aleY1+50);
            }
            if(arreglo[5][1] == 1 || arreglo[1][5] == 1){
                circulo.drawLine(aleX6+50, aleY6+50, aleX2+50, aleY2+50);
            }
            if(arreglo[5][2] == 1 || arreglo[2][5] == 1){
                circulo.drawLine(aleX6+50, aleY6+50, aleX3+50, aleY3+50);
            }
            if(arreglo[5][3] == 1 || arreglo[3][5] == 1){
                circulo.drawLine(aleX6+50, aleY6+50, aleX4+50, aleY4+50);
            }
            if(arreglo[5][4] == 1 || arreglo[4][5] == 1){
                circulo.drawLine(aleX6+50, aleY6+50, aleX5+50, aleY5+50);
            }
            if(arreglo[6][0] == 1 || arreglo[0][6] == 1){
                circulo.drawLine(aleX7+50, aleY7+50, aleX1+50, aleY1+50);
            }
            if(arreglo[6][1] == 1 || arreglo[1][6] == 1){
                circulo.drawLine(aleX7+50, aleY7+50, aleX2+50, aleY2+50);
            }
            if(arreglo[6][2] == 1 || arreglo[2][6] == 1){
                circulo.drawLine(aleX7+50, aleY7+50, aleX3+50, aleY3+50);
            }
            if(arreglo[6][3] == 1 || arreglo[3][6] == 1){
                circulo.drawLine(aleX7+50, aleY7+50, aleX4+50, aleY4+50);
            }
            if(arreglo[6][4] == 1 || arreglo[4][6] == 1){
                circulo.drawLine(aleX7+50, aleY7+50, aleX5+50, aleY5+50);
            }
            if(arreglo[6][5] == 1 || arreglo[5][6] == 1){
                circulo.drawLine(aleX7+50, aleY7+50, aleX6+50, aleY6+50);
            }
            if(arreglo[7][0] == 1 || arreglo[0][7] == 1){
                circulo.drawLine(aleX8+50, aleY8+50, aleX1+50, aleY1+50);
            }
            if(arreglo[7][1] == 1 || arreglo[1][7] == 1){
                circulo.drawLine(aleX8+50, aleY8+50, aleX2+50, aleY2+50);
            }
            if(arreglo[7][2] == 1 || arreglo[2][7] == 1){
                circulo.drawLine(aleX8+50, aleY8+50, aleX3+50, aleY3+50);
            }
            if(arreglo[7][3] == 1 || arreglo[3][7] == 1){
                circulo.drawLine(aleX8+50, aleY8+50, aleX4+50, aleY4+50);
            }
            if(arreglo[7][4] == 1 || arreglo[4][7] == 1){
                circulo.drawLine(aleX8+50, aleY8+50, aleX5+50, aleY5+50);
            }
            if(arreglo[7][5] == 1 || arreglo[5][7] == 1){
                circulo.drawLine(aleX8+50, aleY8+50, aleX6+50, aleY6+50);
            }
            if(arreglo[7][6] == 1 || arreglo[6][7] == 1){
                circulo.drawLine(aleX8+50, aleY8+50, aleX7+50, aleY7+50);
            }
            if(arreglo[8][0] == 1 || arreglo[0][8] == 1){
                circulo.drawLine(aleX9+50, aleY9+50, aleX1+50, aleY1+50);
            }
            if(arreglo[8][1] == 1 || arreglo[1][8] == 1){
                circulo.drawLine(aleX9+50, aleY9+50, aleX2+50, aleY2+50);
            }
            if(arreglo[8][2] == 1 || arreglo[2][8] == 1){
                circulo.drawLine(aleX9+50, aleY9+50, aleX3+50, aleY3+50);
            }
            if(arreglo[8][3] == 1 || arreglo[3][8] == 1){
                circulo.drawLine(aleX9+50, aleY9+50, aleX4+50, aleY4+50);
            }
            if(arreglo[8][4] == 1 || arreglo[4][8] == 1){
                circulo.drawLine(aleX9+50, aleY9+50, aleX5+50, aleY5+50);
            }
            if(arreglo[8][5] == 1 || arreglo[5][8] == 1){
                circulo.drawLine(aleX9+50, aleY9+50, aleX6+50, aleY6+50);
            }
            if(arreglo[8][6] == 1 || arreglo[6][8] == 1){
                circulo.drawLine(aleX9+50, aleY9+50, aleX7+50, aleY7+50);
            }
            if(arreglo[8][7] == 1 || arreglo[7][8] == 1){
                circulo.drawLine(aleX9+50, aleY9+50, aleX8+50, aleY8+50);
            }
        }else if(vertices==10){
            int aleX1 = NumeroAleatorioX();
            int aleY1 = NumeroAleatorioY();
            int aleX2 = NumeroAleatorioX();
            int aleY2 = NumeroAleatorioY();
            int aleX3 = NumeroAleatorioX();
            int aleY3 = NumeroAleatorioY();
            int aleX4 = NumeroAleatorioX();
            int aleY4 = NumeroAleatorioY();
            int aleX5 = NumeroAleatorioX();
            int aleY5 = NumeroAleatorioY();
            int aleX6 = NumeroAleatorioX();
            int aleY6 = NumeroAleatorioY();
            int aleX7 = NumeroAleatorioX();
            int aleY7 = NumeroAleatorioY();
            int aleX8 = NumeroAleatorioX();
            int aleY8 = NumeroAleatorioY();
            int aleX9 = NumeroAleatorioX();
            int aleY9 = NumeroAleatorioY();
            int aleX10 = NumeroAleatorioX();
            int aleY10 = NumeroAleatorioY();
            //Circulo 0
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX1, aleY1, 100, 100);
            circulo.drawString("A", aleX1, aleY1);
            //Circulo 1
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX2, aleY2, 100, 100);
            circulo.drawString("B", aleX2, aleY2);
            //Circulo 2
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX3, aleY3, 100, 100);
            circulo.drawString("C", aleX3, aleY3);
            //Circulo 3
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX4, aleY4, 100, 100);
            circulo.drawString("D", aleX4, aleY4);
            //Circulo 4
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX5, aleY5, 100, 100);
            circulo.drawString("E", aleX5, aleY5);
            //Circulo 5
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX6, aleY6, 100, 100);
            circulo.drawString("F", aleX6, aleY6);
            //Circulo 6
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX7, aleY7, 100, 100);
            circulo.drawString("G", aleX7, aleY7);
            //Circulo 7
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX8, aleY8, 100, 100);
            circulo.drawString("H", aleX8, aleY8);
            //Circulo 8
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX9, aleY9, 100, 100);
            circulo.drawString("I", aleX9, aleY9);
            //Circulo 9
            circulo.setStroke(new BasicStroke(3.f));
            circulo.setPaint(Color.BLACK);
            circulo.drawOval(aleX10, aleY10, 100, 100);
            circulo.drawString("J", aleX10, aleY10);
            if(arreglo[0][1] == 1 || arreglo[1][0] == 1){
                circulo.drawLine(aleX2+50, aleY2+50, aleX1+50, aleY1+50);
            }
            if(arreglo[0][2] == 1 || arreglo[2][0] == 1){
                circulo.drawLine(aleX1+50, aleY1+50, aleX3+50, aleY3+50);
            }
            if(arreglo[1][2] == 1 || arreglo[2][1] == 1){
                circulo.drawLine(aleX2+50, aleY2+50, aleX3+50, aleY3+50);
            }
            if(arreglo[0][3] == 1 || arreglo[3][0] == 1){
                circulo.drawLine(aleX1+50, aleY1+50, aleX4+50, aleY4+50);
            }
            if(arreglo[1][3] == 1 || arreglo[3][1] == 1){
                circulo.drawLine(aleX2+50, aleY2+50, aleX4+50, aleY4+50);
            }
            if(arreglo[2][3] == 1 || arreglo[3][2] == 1){
                circulo.drawLine(aleX3+50, aleY3+50, aleX4+50, aleY4+50);
            }
            if(arreglo[4][0] == 1 || arreglo[0][4] == 1){
                circulo.drawLine(aleX5+50, aleY5+50, aleX1+50, aleY1+50);
            }
            if(arreglo[4][1] == 1 || arreglo[1][4] == 1){
                circulo.drawLine(aleX5+50, aleY5+50, aleX2+50, aleY2+50);
            }
            if(arreglo[4][2] == 1 || arreglo[2][4] == 1){
                circulo.drawLine(aleX5+50, aleY5+50, aleX3+50, aleY3+50);
            }
            if(arreglo[4][3] == 1 || arreglo[3][4] == 1){
                circulo.drawLine(aleX5+50, aleY5+50, aleX4+50, aleY4+50);
            }
            if(arreglo[5][0] == 1 || arreglo[0][5] == 1){
                circulo.drawLine(aleX6+50, aleY6+50, aleX1+50, aleY1+50);
            }
            if(arreglo[5][1] == 1 || arreglo[1][5] == 1){
                circulo.drawLine(aleX6+50, aleY6+50, aleX2+50, aleY2+50);
            }
            if(arreglo[5][2] == 1 || arreglo[2][5] == 1){
                circulo.drawLine(aleX6+50, aleY6+50, aleX3+50, aleY3+50);
            }
            if(arreglo[5][3] == 1 || arreglo[3][5] == 1){
                circulo.drawLine(aleX6+50, aleY6+50, aleX4+50, aleY4+50);
            }
            if(arreglo[5][4] == 1 || arreglo[4][5] == 1){
                circulo.drawLine(aleX6+50, aleY6+50, aleX5+50, aleY5+50);
            }
            if(arreglo[6][0] == 1 || arreglo[0][6] == 1){
                circulo.drawLine(aleX7+50, aleY7+50, aleX1+50, aleY1+50);
            }
            if(arreglo[6][1] == 1 || arreglo[1][6] == 1){
                circulo.drawLine(aleX7+50, aleY7+50, aleX2+50, aleY2+50);
            }
            if(arreglo[6][2] == 1 || arreglo[2][6] == 1){
                circulo.drawLine(aleX7+50, aleY7+50, aleX3+50, aleY3+50);
            }
            if(arreglo[6][3] == 1 || arreglo[3][6] == 1){
                circulo.drawLine(aleX7+50, aleY7+50, aleX4+50, aleY4+50);
            }
            if(arreglo[6][4] == 1 || arreglo[4][6] == 1){
                circulo.drawLine(aleX7+50, aleY7+50, aleX5+50, aleY5+50);
            }
            if(arreglo[6][5] == 1 || arreglo[5][6] == 1){
                circulo.drawLine(aleX7+50, aleY7+50, aleX6+50, aleY6+50);
            }
            if(arreglo[7][0] == 1 || arreglo[0][7] == 1){
                circulo.drawLine(aleX8+50, aleY8+50, aleX1+50, aleY1+50);
            }
            if(arreglo[7][1] == 1 || arreglo[1][7] == 1){
                circulo.drawLine(aleX8+50, aleY8+50, aleX2+50, aleY2+50);
            }
            if(arreglo[7][2] == 1 || arreglo[2][7] == 1){
                circulo.drawLine(aleX8+50, aleY8+50, aleX3+50, aleY3+50);
            }
            if(arreglo[7][3] == 1 || arreglo[3][7] == 1){
                circulo.drawLine(aleX8+50, aleY8+50, aleX4+50, aleY4+50);
            }
            if(arreglo[7][4] == 1 || arreglo[4][7] == 1){
                circulo.drawLine(aleX8+50, aleY8+50, aleX5+50, aleY5+50);
            }
            if(arreglo[7][5] == 1 || arreglo[5][7] == 1){
                circulo.drawLine(aleX8+50, aleY8+50, aleX6+50, aleY6+50);
            }
            if(arreglo[7][6] == 1 || arreglo[6][7] == 1){
                circulo.drawLine(aleX8+50, aleY8+50, aleX7+50, aleY7+50);
            }
            if(arreglo[8][0] == 1 || arreglo[0][8] == 1){
                circulo.drawLine(aleX9+50, aleY9+50, aleX1+50, aleY1+50);
            }
            if(arreglo[8][1] == 1 || arreglo[1][8] == 1){
                circulo.drawLine(aleX9+50, aleY9+50, aleX2+50, aleY2+50);
            }
            if(arreglo[8][2] == 1 || arreglo[2][8] == 1){
                circulo.drawLine(aleX9+50, aleY9+50, aleX3+50, aleY3+50);
            }
            if(arreglo[8][3] == 1 || arreglo[3][8] == 1){
                circulo.drawLine(aleX9+50, aleY9+50, aleX4+50, aleY4+50);
            }
            if(arreglo[8][4] == 1 || arreglo[4][8] == 1){
                circulo.drawLine(aleX9+50, aleY9+50, aleX5+50, aleY5+50);
            }
            if(arreglo[8][5] == 1 || arreglo[5][8] == 1){
                circulo.drawLine(aleX9+50, aleY9+50, aleX6+50, aleY6+50);
            }
            if(arreglo[8][6] == 1 || arreglo[6][8] == 1){
                circulo.drawLine(aleX9+50, aleY9+50, aleX7+50, aleY7+50);
            }
            if(arreglo[8][7] == 1 || arreglo[7][8] == 1){
                circulo.drawLine(aleX9+50, aleY9+50, aleX8+50, aleY8+50);
            }
            if(arreglo[9][0] == 1 || arreglo[0][9] == 1){
                circulo.drawLine(aleX10+50, aleY10+50, aleX1+50, aleY1+50);
            }
            if(arreglo[9][1] == 1 || arreglo[1][9] == 1){
                circulo.drawLine(aleX10+50, aleY10+50, aleX2+50, aleY2+50);
            }
            if(arreglo[9][2] == 1 || arreglo[2][9] == 1){
                circulo.drawLine(aleX10+50, aleY10+50, aleX3+50, aleY3+50);
            }
            if(arreglo[9][3] == 1 || arreglo[3][9] == 1){
                circulo.drawLine(aleX10+50, aleY10+50, aleX4+50, aleY4+50);
            }
            if(arreglo[9][4] == 1 || arreglo[4][9] == 1){
                circulo.drawLine(aleX10+50, aleY10+50, aleX5+50, aleY5+50);
            }
            if(arreglo[9][5] == 1 || arreglo[5][9] == 1){
                circulo.drawLine(aleX10+50, aleY10+50, aleX6+50, aleY6+50);
            }
            if(arreglo[9][6] == 1 || arreglo[6][9] == 1){
                circulo.drawLine(aleX10+50, aleY10+50, aleX7+50, aleY7+50);
            }
            if(arreglo[9][7] == 1 || arreglo[7][9] == 1){
                circulo.drawLine(aleX10+50, aleY10+50, aleX8+50, aleY8+50);
            }
            if(arreglo[9][8] == 1 || arreglo[8][9] == 1){
                circulo.drawLine(aleX10+50, aleY10+50, aleX9+50, aleY9+50);
            }
        }
    }
    
    /**
     *Procedimiento para imprimir la matriz de adyacencia generada 
     */
    public void ImprimirMatriz() {
        String resultado= "";
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                resultado += arreglo[i][j];
                resultado += "    ";
            }
            resultado += "\n";
        }
            JOptionPane.showMessageDialog(null, resultado); 
    }

    /**
     *
     * 
     * Procedimiento para crear los caminos entre los almacenes
     * 
     */
    public void LlenarMatriz(int Vertice1, int Vertice2, int valor) {
        arreglo[Vertice1][Vertice2] = valor;
    }

    /**
     *
     * Método para generar un número aleatorio para el proceso que genera el procedimiento paint
     */
    public int NumeroAleatorioX() {
        int ale = 0;
        ale = (int) (Math.random() * 1366);
        return ale;
    }

    /**
     *
     * Método para generar un número aleatorio para el proceso que genera el procedimiento paint
     */
    public int NumeroAleatorioY() {
        int ale = 0;
        ale = (int) (Math.random() * 720);
        return ale;
    }

    /**
     *
     * Getter de la matriz de adyacencia
     */
    public int[][] getArreglo() {
        return arreglo;
    }

    /**
     *
     * Setter de la matriz de adyacencia
     */
    public void setArreglo(int[][] arreglo) {
        this.arreglo = arreglo;
    }

    /**
     *
     * Getter del número de vértices
     */
    public int getVertices() {
        return vertices;
    }

    /**
     *
     * Setter para el número de vértices
     */
    public void setVertices(int vertices) {
        this.vertices = vertices;
    }

    /**
     *
     * Getter del dato
     */
    public String getDato() {
        return dato;
    }

    /**
     *
     * Setter del dato
     */
    public void setDato(String dato) {
        this.dato = dato;
    }

    /**
     *
     * Getter de la lista de almacenes
     */
    public ListaAlmacen getAlmacen() {
        return almacen;
    }

    /**
     *
     * Setter de la lista de almacenes
     */
    public void setAlmacen(ListaAlmacen almacen) {
        this.almacen = almacen;
    }

    /**
     *
     * Getter de la lista de aristas
     */
    public ListaAristas getArista() {
        return arista;
    }

    /**
     *
     * Setter de la lista de aristas
     */
    public void setArista(ListaAristas arista) {
        this.arista = arista;
    }
}
