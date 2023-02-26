
package Interfaz;

import javax.swing.JFrame;

public class Main extends JFrame {

    public static void main(String[] args) {
       Ventana ventana = new Ventana();
       ventana.setVisible(true);
       ventana.setLocationRelativeTo(null);
       ventana.setTitle("Quiz de Juan Ceballos");
    }
    
}
