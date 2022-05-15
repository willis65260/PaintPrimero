// 
// Decompiled by Procyon v0.5.36
// 

package ProyectoU2;

import java.net.URL;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.AbstractButton;
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.FlowLayout;
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JDialog;

public class cDialogEscalar extends JDialog
{
    private static final long serialVersionUID = 1L;
    JLabel et1;
    JLabel et2;
    JTextField ct1;
    JRadioButton rb1;
    JRadioButton rb2;
    JRadioButton rb3;
    ButtonGroup bg;
    JButton ba;
    JButton bc;
    datosEsc D;
    
    public cDialogEscalar(final JFrame v, final boolean modal) {
        super(v, modal);
        this.setTitle("Escalar figura");
        this.setSize(550, 75);
        this.D = null;
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(this);
        final URL ruta = this.getClass().getResource("/Unidad2/rec/escala.png");
        this.rb1 = new JRadioButton("X");
        this.rb2 = new JRadioButton("Y");
        this.rb3 = new JRadioButton("XY", true);
        (this.bg = new ButtonGroup()).add(this.rb1);
        this.bg.add(this.rb2);
        this.bg.add(this.rb3);
        this.getContentPane().add(this.rb1);
        this.getContentPane().add(this.rb2);
        this.getContentPane().add(this.rb3);
        this.et1 = new JLabel(new ImageIcon(ruta));
        this.et2 = new JLabel("Cantidad a escalar: ");
        this.ct1 = new JTextField(10);
        this.ba = new JButton("Aceptar");
        this.bc = new JButton("Cancelar");
        this.add(this.et1);
        this.add(this.et2);
        this.add(this.ct1);
        this.add(this.ba);
        this.add(this.bc);
        this.ba.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final String t = cDialogEscalar.this.ct1.getText();
                try {
                    final double valorEsc = Double.parseDouble(t);
                    if (cDialogEscalar.this.rb1.isSelected()) {
                        cDialogEscalar.this.D = new datosEsc(valorEsc, 1.0);
                    }
                    else if (cDialogEscalar.this.rb2.isSelected()) {
                        cDialogEscalar.this.D = new datosEsc(1.0, valorEsc);
                    }
                    else {
                        cDialogEscalar.this.D = new datosEsc(valorEsc, valorEsc);
                    }
                }
                catch (NumberFormatException e2) {
                    cDialogEscalar.this.D = null;
                }
                cDialogEscalar.this.setVisible(false);
                cDialogEscalar.this.dispose();
            }
        });
        this.bc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                cDialogEscalar.this.D = null;
                cDialogEscalar.this.setVisible(false);
                cDialogEscalar.this.dispose();
            }
        });
        this.setDefaultCloseOperation(0);
    }
    
    public datosEsc mostrar() {
        this.setVisible(true);
        return this.D;
    }
}
