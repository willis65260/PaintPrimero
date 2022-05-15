// 
// Decompiled by Procyon v0.5.36
// 

package ProyectoU2;

import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
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

public class ayuda1 extends JPanel implements ActionListener
{
    private static final long serialVersionUID = 1L;
    JFrame v;
    JPanel panel;
    JPanel contentPane;
    JLabel intro;
    JLabel intro2;
    JTextArea area1;
    JTextArea area2;
    JTextArea area3;
    JLabel titulo;
    JLabel titulo1;
    JButton cerrar;
    JButton siguiente;
    PrincTrans principal;
    ayuda3 ayuda3;
    
    public ayuda1() {
        (this.v = new JFrame("Ayuda 1")).setResizable(false);
        this.v.setBounds(100, 100, 480, 504);
        this.v.setLocationRelativeTo(this);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.v.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        (this.panel = new JPanel()).setBounds(6, 6, 468, 470);
        this.contentPane.add(this.panel);
        this.panel.setLayout(null);
        (this.intro = new JLabel("Esta ventana te ayudar\u00e1 a entender un poco m\u00e1s")).setFont(new Font("Chalkboard SE", 0, 13));
        this.intro.setBounds(90, 34, 310, 16);
        this.panel.add(this.intro);
        (this.intro2 = new JLabel("acerca del entorno de trabajo")).setFont(new Font("Chalkboard SE", 0, 13));
        this.intro2.setBounds(146, 49, 191, 16);
        this.panel.add(this.intro2);
        (this.area1 = new JTextArea()).setEditable(false);
        this.area1.setFont(new Font("Chalkboard SE", 0, 13));
        this.area1.setText("                    Tablero\nEl tablero es el fondo del \nprograma. Cuadriculado\npara la ayuda de un\nadecuado escalonamiento.\n\nSe encuentra una pantalla\ndonde se previsualiza la \nimagen actual. Se actualiza\nen tiempo real.");
        this.area1.setBounds(6, 80, 211, 167);
        this.panel.add(this.area1);
        (this.area2 = new JTextArea()).setEditable(false);
        this.area2.setFont(new Font("Chalkboard SE", 0, 13));
        this.area2.setText("                      Mouse\n\u2022 Click derecho. Puede restaurar\n   la figura si abre el men\u00fa con\n   click derecho en la figura.\n\u2022 Arrastrar. Puede mover la\n   figura si da click derecho en\n   la figura y arrastrar.\n\u2022 Rueda. Con la rueda del rat\u00f3n\n   puede ajustar el tama\u00f1o de la\n   figura. ");
        this.area2.setBounds(6, 254, 211, 167);
        this.panel.add(this.area2);
        (this.area3 = new JTextArea()).setFont(new Font("Chalkboard SE", 0, 13));
        this.area3.setText("       Barra lateral de herrramientas\nUn acceso r\u00e1pido de las herramientas \nque se encuentran en el menu \ndesplegable. La diferencia es que tiene\nvalores definidos. De arriba hacia abajo:\n   \u2022Restaurar. Restaura la figura a la \n     forma original.\n   \u2022Reflexi\u00f3n. Los siguientes 3 son\n     reflexiones. La primera es sobre el \n     eje de las X, la segunda es sobre el \n     eje de las Y y la tercera es sobre el \n     eje XY.\n   \u2022Zoom in y Zoom out. La primera\n     opci\u00f3n incrementa la figura y la \n     segunda la disminuye.\n   \u2022Restauraci\u00f3n. La primera opci\u00f3n gira\n     hacia la izquierda y la segunda gira \n     hacia la derecha la figura.\n   \u2022Cerrar. Cierra el programa por \n     completo.\n  \n");
        this.area3.setEditable(false);
        this.area3.setBounds(229, 77, 233, 344);
        this.panel.add(this.area3);
        (this.titulo1 = new JLabel("Tablero")).setBounds(81, 80, 61, 16);
        this.panel.add(this.titulo1);
        (this.cerrar = new JButton("Cerrar")).setIcon(new ImageIcon(ayuda1.class.getResource("/Unidad2/rec/cerrar.jpeg")));
        this.cerrar.setFont(new Font("Chalkboard SE", 0, 13));
        this.cerrar.setBounds(25, 423, 117, 41);
        this.panel.add(this.cerrar);
        (this.siguiente = new JButton("Siguiente")).setIcon(new ImageIcon(ayuda1.class.getResource("/Unidad2/rec/adelante.png")));
        this.siguiente.setFont(new Font("Chalkboard SE", 0, 13));
        this.siguiente.setBounds(331, 423, 117, 41);
        this.panel.add(this.siguiente);
        (this.titulo = new JLabel("Ayuda")).setFont(new Font("Chalkboard SE", 0, 16));
        this.titulo.setForeground(Color.BLUE);
        this.titulo.setBounds(223, 6, 45, 16);
        this.panel.add(this.titulo);
        this.cerrar.addActionListener(this);
        this.siguiente.addActionListener(this);
        this.v.setVisible(true);
        this.v.setDefaultCloseOperation(3);
    }
    
    @Override
    public void actionPerformed(final ActionEvent e) {
        if (e.getSource() == this.cerrar) {
            this.principal = new PrincTrans();
            this.v.setVisible(false);
            this.principal.v.setVisible(true);
        }
        else if (e.getSource() == this.siguiente) {
            this.ayuda3 = new ayuda3();
            this.v.setVisible(false);
            this.ayuda3.v.setVisible(true);
        }
    }
}
