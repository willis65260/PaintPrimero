// 
// Decompiled by Procyon v0.5.36
// 

package ProyectoU2;

import java.net.URL;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.FlowLayout;
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JDialog;

public class cDialogoRotacion extends JDialog
{
    private static final long serialVersionUID = 1L;
    double[] argRotar;
    JLabel et1;
    JLabel et2;
    JLabel et3;
    JRadioButton rb1;
    JRadioButton rb2;
    ButtonGroup bg;
    JTextField ct;
    JButton bac;
    JButton bca;
    
    public cDialogoRotacion(final JFrame v, final boolean modal) {
        super(v, modal);
        this.setTitle("Rotar una figura en cualquier sentido");
        this.setSize(550, 60);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(this);
        URL ruta = this.getClass().getResource("/Unidad2/rec/rotari.png");
        this.et1 = new JLabel(new ImageIcon(ruta));
        ruta = this.getClass().getResource("/Unidad2/rec/rotard.png");
        this.et2 = new JLabel(new ImageIcon(ruta));
        this.et3 = new JLabel("Cantidad a rotar");
        this.bg = new ButtonGroup();
        this.rb1 = new JRadioButton("", true);
        this.rb2 = new JRadioButton();
        this.bg.add(this.rb1);
        this.bg.add(this.rb2);
        this.ct = new JTextField(5);
        this.bac = new JButton("Aceptar");
        this.bca = new JButton("Cancelar");
        this.add(this.et1);
        this.add(this.rb1);
        this.add(this.et2);
        this.add(this.rb2);
        this.add(this.et3);
        this.add(this.ct);
        this.add(this.bac);
        this.add(this.bca);
        this.bac.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                cDialogoRotacion.this.argRotar = new double[2];
                if (cDialogoRotacion.this.rb1.isSelected()) {
                    cDialogoRotacion.this.argRotar[0] = 0.0;
                }
                else {
                    cDialogoRotacion.this.argRotar[0] = 1.0;
                }
                final String res = cDialogoRotacion.this.ct.getText();
                try {
                    cDialogoRotacion.this.argRotar[1] = Double.parseDouble(res);
                }
                catch (NumberFormatException a) {
                    cDialogoRotacion.this.argRotar = null;
                }
                cDialogoRotacion.this.setVisible(false);
                cDialogoRotacion.this.dispose();
            }
        });
        this.bca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                cDialogoRotacion.this.argRotar = null;
                cDialogoRotacion.this.setVisible(false);
                cDialogoRotacion.this.dispose();
            }
        });
        this.setDefaultCloseOperation(0);
    }
    
    public double[] mostrar() {
        this.setVisible(true);
        return this.argRotar;
    }
}
