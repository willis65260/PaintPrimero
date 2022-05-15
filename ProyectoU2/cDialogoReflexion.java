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
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JDialog;

public class cDialogoReflexion extends JDialog
{
    private static final long serialVersionUID = 1L;
    double[] argRef;
    JLabel et1;
    JLabel et2;
    JLabel et3;
    JRadioButton rb1;
    JRadioButton rb2;
    JRadioButton rb3;
    ButtonGroup bg;
    JButton aceptar;
    JButton cancelar;
    
    public cDialogoReflexion(final JFrame v, final boolean modal) {
        super(v, modal);
        this.setTitle("Reflexiona figuras en X, Y o XY");
        this.setSize(450, 60);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(this);
        URL ruta = this.getClass().getResource("/Unidad2/rec/refx.png");
        this.et1 = new JLabel(new ImageIcon(ruta));
        ruta = this.getClass().getResource("/Unidad2/rec/refy.png");
        this.et2 = new JLabel(new ImageIcon(ruta));
        ruta = this.getClass().getResource("/Unidad2/rec/refxy.png");
        this.et3 = new JLabel(new ImageIcon(ruta));
        this.bg = new ButtonGroup();
        this.rb1 = new JRadioButton("", true);
        this.rb2 = new JRadioButton();
        this.rb3 = new JRadioButton();
        this.bg.add(this.rb1);
        this.bg.add(this.rb2);
        this.bg.add(this.rb3);
        this.aceptar = new JButton("Aceptar");
        this.cancelar = new JButton("Cancelar");
        this.add(this.et1);
        this.add(this.rb1);
        this.add(this.et2);
        this.add(this.rb2);
        this.add(this.et3);
        this.add(this.rb3);
        this.add(this.aceptar);
        this.add(this.cancelar);
        this.aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                cDialogoReflexion.this.argRef = new double[3];
                if (cDialogoReflexion.this.rb1.isSelected()) {
                    cDialogoReflexion.this.argRef[0] = 0.0;
                    cDialogoReflexion.this.argRef[1] = 1.0;
                    cDialogoReflexion.this.argRef[2] = -1.0;
                }
                else if (cDialogoReflexion.this.rb2.isSelected()) {
                    cDialogoReflexion.this.argRef[0] = 1.0;
                    cDialogoReflexion.this.argRef[1] = -1.0;
                    cDialogoReflexion.this.argRef[2] = 1.0;
                }
                else if (cDialogoReflexion.this.rb3.isSelected()) {
                    cDialogoReflexion.this.argRef[0] = 2.0;
                    cDialogoReflexion.this.argRef[1] = -1.0;
                    cDialogoReflexion.this.argRef[2] = -1.0;
                }
                cDialogoReflexion.this.setVisible(false);
                cDialogoReflexion.this.dispose();
            }
        });
        this.cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                cDialogoReflexion.this.argRef = null;
                cDialogoReflexion.this.setVisible(false);
                cDialogoReflexion.this.dispose();
            }
        });
        this.setDefaultCloseOperation(0);
    }
    
    public double[] mostrar() {
        this.setVisible(true);
        return this.argRef;
    }
}
