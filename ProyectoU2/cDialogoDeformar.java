// 
// Decompiled by Procyon v0.5.36
// 

package ProyectoU2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Component;
import javax.swing.AbstractButton;
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

public class cDialogoDeformar extends JDialog
{
    private static final long serialVersionUID = 1L;
    JLabel et1;
    JTextField ct1;
    JRadioButton rb1;
    JRadioButton rb2;
    ButtonGroup bg;
    JButton ba;
    JButton bc;
    datosdef D;
    
    public cDialogoDeformar(final JFrame parent, final boolean modal) {
        super(parent, modal);
        this.setSize(580, 75);
        this.setLocation(400, 580);
        this.D = null;
        this.setTitle("Deformacion");
        this.getContentPane().setLayout(new FlowLayout());
        this.rb1 = new JRadioButton("+", true);
        this.rb2 = new JRadioButton("-");
        (this.bg = new ButtonGroup()).add(this.rb1);
        this.bg.add(this.rb2);
        this.getContentPane().add(this.rb1);
        this.getContentPane().add(this.rb2);
        this.et1 = new JLabel("Cantidad a deformar");
        this.getContentPane().add(this.et1);
        this.ct1 = new JTextField(5);
        this.getContentPane().add(this.ct1);
        (this.ba = new JButton("Aceptar")).setBackground(new Color(100, 149, 237));
        (this.bc = new JButton("Cancelar")).setBackground(new Color(100, 149, 237));
        this.getContentPane().add(this.ba);
        this.getContentPane().add(this.bc);
        this.ba.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final String t = cDialogoDeformar.this.ct1.getText();
                try {
                    final double valorEsc = Double.parseDouble(t);
                    if (cDialogoDeformar.this.rb1.isSelected()) {
                        cDialogoDeformar.this.D = new datosdef(valorEsc, 0.5);
                    }
                    else if (cDialogoDeformar.this.rb2.isSelected()) {
                        cDialogoDeformar.this.D = new datosdef(-0.5, valorEsc);
                    }
                    else {
                        cDialogoDeformar.this.D = new datosdef(valorEsc, valorEsc);
                    }
                }
                catch (NumberFormatException e2) {
                    cDialogoDeformar.this.D = null;
                }
                cDialogoDeformar.this.setVisible(false);
                cDialogoDeformar.this.dispose();
            }
        });
        this.bc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                cDialogoDeformar.this.D = null;
                cDialogoDeformar.this.setVisible(false);
                cDialogoDeformar.this.dispose();
            }
        });
        this.ct1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final String t = cDialogoDeformar.this.ct1.getText();
                try {
                    final double valorEsc = Double.parseDouble(t);
                    if (cDialogoDeformar.this.rb1.isSelected()) {
                        cDialogoDeformar.this.D = new datosdef(valorEsc, 1.0);
                    }
                    else if (cDialogoDeformar.this.rb2.isSelected()) {
                        cDialogoDeformar.this.D = new datosdef(1.0, valorEsc);
                    }
                    else {
                        cDialogoDeformar.this.D = new datosdef(valorEsc, valorEsc);
                    }
                }
                catch (NumberFormatException e2) {
                    cDialogoDeformar.this.D = null;
                }
                cDialogoDeformar.this.setVisible(false);
                cDialogoDeformar.this.dispose();
            }
        });
        this.setDefaultCloseOperation(0);
    }
    
    public datosdef mostrar() {
        this.setVisible(true);
        return this.D;
    }
}
