// 
// Decompiled by Procyon v0.5.36
// 

package ProyectoU2;

import java.awt.Font;
import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.Component;
import javax.swing.JTextArea;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class teclas extends JPanel
{
    private static final long serialVersionUID = 1L;
    JFrame v;
    JPanel panel;
    JPanel panel_1;
    JPanel contentPane;
    JTextArea area1;
    
    public teclas() {
        (this.v = new JFrame("Teclas Aceleradoras")).setResizable(false);
        this.v.setBounds(100, 100, 206, 267);
        this.v.setLocationRelativeTo(this);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.v.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        (this.panel = new JPanel()).setBounds(6, 6, 193, 230);
        this.contentPane.add(this.panel);
        this.panel.setLayout(null);
        (this.panel_1 = new JPanel()).setBounds(6, 6, 178, 215);
        this.panel.add(this.panel_1);
        this.panel_1.setLayout(null);
        (this.area1 = new JTextArea()).setEditable(false);
        this.area1.setBackground(Color.GREEN);
        this.area1.setText("     Teclas R\u00e1pidas\n-> Restaurar (Alt+R)\n-> Escalar      (Alt+E)\n-> Rotaci\u00f3n    (Alt+I)\n-> Deformar   (Alt+D)\n-> Reflexi\u00f3n    (Alt+F)\n-> Trasladar    (Alt+T)\n-> Autores       (Alt+A)\n-> Ayuda         (Alt+1)\n-> Cerrar App  (Alt+X)");
        this.area1.setFont(new Font("Chalkboard SE", 0, 13));
        this.area1.setBounds(6, 6, 162, 202);
        this.panel_1.add(this.area1);
        this.v.setVisible(true);
        this.v.setDefaultCloseOperation(2);
    }
    
    public static void main(final String[] args) {
        new teclas();
    }
}
