// 
// Decompiled by Procyon v0.5.36
// 

package ProyectoU2;

import java.net.URL;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.FlowLayout;
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JDialog;

public class cDialogoTrasladar extends JDialog
{
    private static final long serialVersionUID = 1L;
    double cantTras1;
    double cantTras2;
    JLabel et1;
    JLabel et2;
    JLabel et3;
    JTextField ct1;
    JTextField ct2;
    JButton aceptar;
    JButton cancelar;
    
    public cDialogoTrasladar(final JFrame v, final boolean modal) {
        super(v, modal);
        this.cantTras1 = 0.0;
        this.cantTras2 = 0.0;
        this.setTitle("Trasladar figura");
        this.setSize(810, 60);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(this);
        final URL ruta = this.getClass().getResource("/Unidad2/rec/mov.png");
        this.et1 = new JLabel(new ImageIcon(ruta));
        this.et2 = new JLabel("Cantidad a trasladar 1: ");
        this.ct1 = new JTextField(10);
        this.et3 = new JLabel("Cantidad a trasladar 2: ");
        this.ct2 = new JTextField(10);
        this.aceptar = new JButton("Aceptar");
        this.cancelar = new JButton("Cancelar");
        this.add(this.et1);
        this.add(this.et2);
        this.add(this.ct1);
        this.add(this.et3);
        this.add(this.ct2);
        this.add(this.aceptar);
        this.add(this.cancelar);
        this.aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final String res = cDialogoTrasladar.this.ct1.getText();
                final String res2 = cDialogoTrasladar.this.ct2.getText();
                try {
                    cDialogoTrasladar.this.cantTras1 = Double.parseDouble(res);
                    cDialogoTrasladar.this.cantTras2 = Double.parseDouble(res2);
                }
                catch (NumberFormatException a) {
                    cDialogoTrasladar.this.cantTras1 = 1.0;
                    cDialogoTrasladar.this.cantTras2 = 1.0;
                }
                cDialogoTrasladar.this.setVisible(false);
                cDialogoTrasladar.this.dispose();
            }
        });
        this.cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                cDialogoTrasladar.this.cantTras1 = 1.0;
                cDialogoTrasladar.this.cantTras2 = 1.0;
                cDialogoTrasladar.this.setVisible(false);
                cDialogoTrasladar.this.dispose();
            }
        });
        this.setDefaultCloseOperation(0);
    }
    
    public double mostrar() {
        this.setVisible(true);
        return this.cantTras1;
    }
}
