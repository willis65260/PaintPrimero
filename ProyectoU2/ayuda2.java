// 
// Decompiled by Procyon v0.5.36
// 

package ProyectoU2;

import java.awt.event.ActionEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
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

public class ayuda2 extends JPanel implements ActionListener
{
    private static final long serialVersionUID = 1L;
    JFrame v;
    JPanel contentPane;
    JPanel exterior;
    JPanel interior;
    JPanel izquierda;
    JPanel derecha;
    JLabel titulo;
    JLabel intro;
    JLabel intro2;
    JLabel tmenu;
    JTextArea area1;
    JTextArea area2;
    JButton anterior;
    JButton cerrar;
    ayuda3 ayuda3;
    PrincTrans principal;
    
    public ayuda2() {
        (this.v = new JFrame("Ayuda 3")).setResizable(false);
        this.v.setBounds(100, 100, 500, 727);
        this.v.setLocationRelativeTo(this);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.v.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        (this.exterior = new JPanel()).setBounds(6, 6, 488, 693);
        this.contentPane.add(this.exterior);
        this.exterior.setLayout(null);
        (this.titulo = new JLabel("Ayuda")).setFont(new Font("Chalkboard SE", 0, 16));
        this.titulo.setForeground(Color.BLUE);
        this.titulo.setBounds(202, 6, 72, 16);
        this.exterior.add(this.titulo);
        (this.intro = new JLabel("Esta ventana te ayudar\u00e1 a entender un poco m\u00e1s")).setFont(new Font("Chalkboard SE", 0, 13));
        this.intro.setBounds(78, 23, 303, 16);
        this.exterior.add(this.intro);
        (this.intro2 = new JLabel("  acerca del men\u00fa de herramientas.")).setFont(new Font("Chalkboard SE", 0, 13));
        this.intro2.setBounds(114, 34, 219, 16);
        this.exterior.add(this.intro2);
        (this.tmenu = new JLabel("Men\u00fa de Herramientas")).setFont(new Font("Chalkboard SE", 0, 13));
        this.tmenu.setForeground(Color.RED);
        this.tmenu.setBounds(156, 51, 141, 16);
        this.exterior.add(this.tmenu);
        (this.interior = new JPanel()).setBounds(0, 79, 476, 540);
        this.exterior.add(this.interior);
        this.interior.setLayout(null);
        (this.izquierda = new JPanel()).setBounds(6, 6, 249, 525);
        this.interior.add(this.izquierda);
        this.izquierda.setLayout(null);
        (this.area1 = new JTextArea()).setBackground(Color.PINK);
        this.area1.setFont(new Font("Chalkboard SE", 0, 13));
        this.area1.setEditable(false);
        this.area1.setText("Se encuentra en la parte superior \nde la pantalla. Consta de 4 men\u00fas\n(cada opci\u00f3n tiene una ayuda \nr\u00e1pida con el cursor) que \ndespliegan herramientas.\n  -> Transformaciones. Cada  opci\u00f3n \n   cuenta con pantallas extras para \n   ingresar los datos correspondientes \n   a  excepci\u00f3n de \"Restaurar\".\n Las opciones son:\n   \u2022Restaurar. Restaura la  figura a la \n    forma original.\n   \u2022Escalar. Ventana donde se pone el \n     numero.\n   \u2022Rotaci\u00f3n. Ventana donde  se indica \n     el numero de rotaci\u00f3n y el grado.\n   \u2022Deformar. Ventana donde  te pide \n     los 2 valores a deformar\n   \u2022Reflexi\u00f3n. Ventana donde se indica \n     el tipo de reflexi\u00f3n que  se requiere.\n   \u2022Trasladar. Ventana donde se indica \n     a que coordenadas se debe mover.\n   \u2022Salir. Opci\u00f3n para salir\n     directamente del programa.");
        this.area1.setBounds(6, 6, 243, 517);
        this.izquierda.add(this.area1);
        (this.derecha = new JPanel()).setBounds(254, 6, 216, 525);
        this.interior.add(this.derecha);
        this.derecha.setLayout(null);
        (this.area2 = new JTextArea()).setBackground(Color.CYAN);
        this.area2.setFont(new Font("Chalkboard SE", 0, 13));
        this.area2.setEditable(false);
        this.area2.setText("-> Animaciones. Cada opci\u00f3n te \nmuestra una previsualizaci\u00f3n de \nla figura con la que trabajas. \nMencionar que se encuentra \ntodos las operaciones como \nopci\u00f3n. La ventana principal no\nse habilitar\u00e1 si una ventana de \nanimaci\u00f3n se encuentra \nhabilitada.\n\n-> Figuras. Men\u00fa que te muestra\nlas 2 figuras disponibles. para\naplicarle las operaciones, basta \ncon pulsar cual opci\u00f3n quieres \npara cambiar de figura.\n\n-> Acerca de... \n     \u2022Autores. Ventana donde te \n      muestra los desarrolladores\n      de esta maravillosa \n      aplicaci\u00f3n.\n     \u2022Ayuda. Ventana qeu trata de\n     resolver dudas acerca de como\n     funciona el programa. Contiene\n     un bot\u00f3n que te lleva a la\n     siguiente p\u00e1gina de ayuda.");
        this.area2.setBounds(6, 6, 210, 518);
        this.derecha.add(this.area2);
        (this.anterior = new JButton("Anterior")).setIcon(new ImageIcon(ayuda2.class.getResource("/Unidad2/rec/atras.png")));
        this.anterior.setBounds(28, 631, 117, 54);
        this.exterior.add(this.anterior);
        (this.cerrar = new JButton("Cerrar")).setIcon(new ImageIcon(ayuda2.class.getResource("/Unidad2/rec/cerrar.jpeg")));
        this.cerrar.setBounds(337, 631, 117, 54);
        this.exterior.add(this.cerrar);
        this.anterior.addActionListener(this);
        this.cerrar.addActionListener(this);
        this.v.setVisible(true);
        this.v.setDefaultCloseOperation(3);
    }
    
    @Override
    public void actionPerformed(final ActionEvent e) {
        if (e.getSource() == this.anterior) {
            this.ayuda3 = new ayuda3();
            this.ayuda3.v.setVisible(true);
            this.v.setVisible(false);
        }
        else if (e.getSource() == this.cerrar) {
            this.principal = new PrincTrans();
            this.principal.v.setVisible(true);
            this.v.setVisible(false);
        }
    }
}
