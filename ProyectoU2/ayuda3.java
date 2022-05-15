// 
// Decompiled by Procyon v0.5.36
// 

package ProyectoU2;

import java.awt.event.ActionEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

public class ayuda3 extends JPanel implements ActionListener
{
    private static final long serialVersionUID = 1L;
    JFrame v;
    JPanel panel;
    JPanel contentPane;
    JLabel titulo;
    JLabel ex1;
    JLabel ex2;
    JLabel ex3;
    JTextArea a1;
    JButton bt1;
    JButton bt2;
    ayuda1 ayuda1;
    ayuda2 ayuda2;
    
    public ayuda3() {
        (this.v = new JFrame("Ayuda 2")).setBounds(100, 100, 500, 539);
        this.v.setLocationRelativeTo(this);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.v.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        (this.panel = new JPanel()).setBounds(6, 5, 496, 505);
        this.contentPane.add(this.panel);
        this.panel.setLayout(null);
        (this.titulo = new JLabel("Ayuda")).setForeground(Color.BLUE);
        this.titulo.setFont(new Font("Chalkboard SE", 1, 13));
        this.titulo.setBounds(222, 6, 61, 16);
        this.panel.add(this.titulo);
        (this.ex1 = new JLabel("Ventana d\u00f3nde se explica la barra")).setFont(new Font("Chalkboard SE", 1, 13));
        this.ex1.setBounds(135, 22, 229, 16);
        this.panel.add(this.ex1);
        (this.ex2 = new JLabel("de Herramientas de edici\u00f3n")).setFont(new Font("Chalkboard SE", 1, 13));
        this.ex2.setBounds(155, 34, 177, 16);
        this.panel.add(this.ex2);
        (this.ex3 = new JLabel("de figura")).setFont(new Font("Chalkboard SE", 1, 13));
        this.ex3.setBounds(210, 50, 61, 16);
        this.panel.add(this.ex3);
        (this.a1 = new JTextArea()).setFont(new Font("Chalkboard SE", 0, 13));
        this.a1.setEditable(false);
        this.a1.setText("-> Color solido. Herramienta para seleccionar de una paleta de colores, un\n     color principal para la figura.\n-> Gradiante. Herramienta para seleccionar 2 colores y hacer un gradiante\n     en la figura.\n-> Imagen de fondo. Herramienta para seleccionar una imagen y colocarla\n    de fondo.\n-> Transparencia. Herramienta d\u00f3nde introduces un valor entre 0 y 255 \n     para la transparencia.\n-> Regresa relleno. Bot\u00f3n que quita el contorno y pone relleno.\n-> Quitar relleno. Bot\u00f3n que quita el relleno y deja el contorno.\n-> Relleno con contorno. Combina las 2 anteriores. Deja el contorno\n     y relleno.\n-> Contorno mayor. Aumenta el contorno de la figura.\n-> Contorno menor. Disminuye el contorno de la figura.\n-> Quita esquina. Retira las esquinas externas de la figura.\n-> Puntea esquina. Puntea las esquinas de la figura.\n-> Redondea Esquina. Redondea las esquinas de la figura.\n-> Puntear. Puntear todo el contorno de la imagen.\n-> Color de la linea. Colorea el contorno de la imagen.");
        this.a1.setBounds(6, 72, 482, 372);
        this.panel.add(this.a1);
        (this.bt1 = new JButton("Atras")).setIcon(new ImageIcon(ayuda3.class.getResource("/Unidad2/rec/atras.png")));
        this.bt1.setBounds(31, 456, 117, 44);
        this.panel.add(this.bt1);
        (this.bt2 = new JButton("Siguiente")).setIcon(new ImageIcon(ayuda3.class.getResource("/Unidad2/rec/adelante.png")));
        this.bt2.setBounds(360, 456, 117, 45);
        this.panel.add(this.bt2);
        this.bt1.addActionListener(this);
        this.bt2.addActionListener(this);
        this.v.setDefaultCloseOperation(3);
    }
    
    @Override
    public void actionPerformed(final ActionEvent e) {
        if (e.getSource() == this.bt1) {
            this.ayuda1 = new ayuda1();
            this.v.setVisible(false);
            this.ayuda1.v.setVisible(true);
        }
        else if (e.getSource() == this.bt2) {
            this.ayuda2 = new ayuda2();
            this.v.setVisible(false);
            this.ayuda2.v.setVisible(true);
        }
    }
}
