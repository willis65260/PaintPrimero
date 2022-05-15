// 
// Decompiled by Procyon v0.5.36
// 

package ProyectoU2;

import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.Component;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class autores extends JPanel
{
    private static final long serialVersionUID = 1L;
    JFrame v;
    JPanel contentPane;
    JPanel panel;
    JLabel titulo;
    JTextArea area1;
    JLabel footer;
    
    public autores() {
        (this.v = new JFrame("Desarolladores")).setResizable(false);
        this.v.setBounds(100, 100, 310, 141);
        this.v.setLocationRelativeTo(this);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.v.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        (this.panel = new JPanel()).setBounds(6, 6, 298, 107);
        this.contentPane.add(this.panel);
        this.panel.setLayout(null);
        (this.titulo = new JLabel("Desarrolladores")).setBounds(96, 5, 99, 16);
        this.panel.add(this.titulo);
        (this.area1 = new JTextArea()).setEditable(false);
        this.area1.setText("Jos\u00e9 Eduardo Poo Tap\u00eda\nJuan Pablo Valencia Cortez");
        this.area1.setBounds(51, 33, 195, 41);
        this.panel.add(this.area1);
        (this.footer = new JLabel("©Todos los derechos reservados.")).setBounds(40, 86, 220, 16);
        this.panel.add(this.footer);
        this.v.setVisible(true);
        this.v.setDefaultCloseOperation(2);
    }
    
    public static void main(final String[] args) {
        new autores();
    }
}
